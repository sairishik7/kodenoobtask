package com.kodenoobs.hiring.task1.students;

public class SubjectResult {

    private final String subject;
    private final Integer score;

    public SubjectResult(String subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getScore() {
        return score;
    }


}
