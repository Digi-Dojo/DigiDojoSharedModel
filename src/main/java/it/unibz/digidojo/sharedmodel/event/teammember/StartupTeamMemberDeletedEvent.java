package it.unibz.digidojo.sharedmodel.event.teammember;

import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class StartupTeamMemberDeletedEvent extends BaseEvent {
    private static final String STARTUP_TEAM_MEMBER_DELETED = "STARTUP_TEAM_MEMBER_DELETED";

    private final Long teamMemberId;

    public StartupTeamMemberDeletedEvent(Long teamMemberId) {
        super(STARTUP_TEAM_MEMBER_DELETED);
        this.teamMemberId = teamMemberId;
    }
}
