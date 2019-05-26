package net.skhu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class Election {

    private long name;

    private LocalDateTime voteStartDate;

    private LocalDateTime voteEndDate;

    private int type;

    private LocalDateTime regStartDate;

    private LocalDateTime regEndDate;

    @Builder
    public Election(long name, LocalDateTime voteStartDate, LocalDateTime voteEndDate, int type, LocalDateTime regStartDate, LocalDateTime regEndDate) {
        this.name = name;
        this.voteStartDate = voteStartDate;
        this.voteEndDate = voteEndDate;
        this.type = type;
        this.regStartDate = regStartDate;
        this.regEndDate = regEndDate;
    }
}
