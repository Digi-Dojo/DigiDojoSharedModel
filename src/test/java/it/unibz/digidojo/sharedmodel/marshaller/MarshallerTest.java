package it.unibz.digidojo.sharedmodel.marshaller;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MarshallerTest {
    private static final String MALFORMED_JSON = "malformedJson";
    private static final String JSON_MESSAGE = "[\"one\",\"two\",\"tree\"]";
    private static final String[] PARSED_MESSAGE = new String[]{"one", "two", "tree"};

    @Mock
    private Object mockedInvalidMessage;
    private final Marshaller marshaller = new Marshaller();

    @Test
    void shouldMarshal() {
        assertEquals(JSON_MESSAGE, marshaller.marshal(PARSED_MESSAGE));
    }

    @Test
    void shouldRaiseAnExceptionWhenMarshalInvalidMessage() {
        assertThrows(ClassCastException.class, () -> marshaller.marshal(mockedInvalidMessage));
    }

    @Test
    void shouldUnmarshal() {
        assertArrayEquals(PARSED_MESSAGE, marshaller.unmarshal(JSON_MESSAGE, String[].class));
    }

    @Test
    void shouldRaiseAnExceptionWhenUnmarshalMalformedMessage() {
        assertThrows(ClassCastException.class, () -> marshaller.unmarshal(MALFORMED_JSON, String.class));
    }

    @Test
    void shouldRaiseAnExceptionWhenUnmarshalWrongClass() {
        assertThrows(ClassCastException.class, () -> marshaller.unmarshal(JSON_MESSAGE, Integer[].class));
    }
}