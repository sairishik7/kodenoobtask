package com.kodenoobs.hiring.task1.students;

import java.util.Set;


public class Result {

    private final ResultStatistics statistics;
    private final Set<Students> passedCandidates;
    private final Set<Students> failedCandidates;

    public Result(ResultStatistics statistics, Set<Students> passedCandidates, Set<Students> failedCandidates) {
        this.statistics = statistics;
        this.passedCandidates = passedCandidates;
        this.failedCandidates = failedCandidates;
    }

    public ResultStatistics getStatistics() {
        return statistics;
    }

    public Set<Students> getPassedCandidates() {
        return passedCandidates;
    }

    public Set<Students> getFailedCandidates() {
        return failedCandidates;
    }
}
