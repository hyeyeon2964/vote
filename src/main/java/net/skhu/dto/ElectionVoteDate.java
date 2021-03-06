package net.skhu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class ElectionVoteDate {
    private int idx;

    private LocalDate voteStartDate;

    private LocalDate voteEndDate;

    private int name;

    private int type;


    @Builder
    public ElectionVoteDate(int idx,LocalDate voteStartDate, LocalDate voteEndDate, int name, int type) {
        this.idx =idx;
        this.voteStartDate = voteStartDate;
        this.voteEndDate = voteEndDate;
        this.name = name;
        this.type = type;
    }

}
