package com.kodenoobs.hiring.task1.students;


import java.util.List;
import java.util.Objects;

public class Students {

    private final String name;
    private final List<SubjectResult> results;

    public Students(String name, List<SubjectResult> results) {
        this.name = name;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public List<SubjectResult> getResults() {
        return results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students candidate = (Students) o;
        return name.equals(candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                '}';
    }
}
