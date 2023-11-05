package it.unibz.digidojo.sharedmodel.event.teammember;

import it.unibz.digidojo.sharedmodel.dto.TeamMemberDTO;
import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class StartupTeamMemberCreatedEvent extends BaseEvent {
    private static final String STARTUP_TEAM_MEMBER_CREATED = "STARTUP_TEAM_MEMBER_CREATED";

    private final TeamMemberDTO teamMember;

    public StartupTeamMemberCreatedEvent(TeamMemberDTO teamMember) {
        super(STARTUP_TEAM_MEMBER_CREATED);
        this.teamMember = teamMember;
    }
}
