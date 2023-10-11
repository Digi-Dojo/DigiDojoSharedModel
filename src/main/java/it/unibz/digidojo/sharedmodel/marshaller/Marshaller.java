package it.unibz.digidojo.sharedmodel.marshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Marshaller {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public <T> String marshal(T message) {
        try {
            return MAPPER.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            log.error("Could not serialize the message. message={}", message);
            throw new ClassCastException(e.getMessage());
        }
    }

    public <T> T unmarshal(final String message, final Class<T> messageClass) throws ClassCastException {
        try {
            return MAPPER.readValue(message, messageClass);
        } catch (JsonMappingException e) {
            log.error("Could not deserialize the message into the expected class. message={} expectedClass={}", message, messageClass);
            throw new ClassCastException(e.getMessage());
        } catch (JsonProcessingException e) {
            log.error("malformed json. message={}", message);
            throw new ClassCastException(e.getMessage());
        }
    }
}
