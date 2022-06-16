package com.kodenoobs.hiring.task1;

import com.google.gson.Gson;
import com.kodenoobs.hiring.task1.students.Students;
import com.kodenoobs.hiring.task1.students.StudentGroup;
import com.kodenoobs.hiring.task1.students.Result;
import com.kodenoobs.hiring.task1.students.SubjectResult;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ResultBuilderTest {

    public static final String SUBJECT_1 = "S1";
    public static final String SUBJECT_2 = "S2";
    public static final String SUBJECT_3 = "S3";
    public static final String SUBJECT_4 = "S4";
    public static final String SUBJECT_5 = "S5";

    @Test
    public void sampleTest() {
        Students candidate1 = new Students("C1", Arrays.asList(
                new SubjectResult(SUBJECT_1, 60), new SubjectResult(SUBJECT_2, 90)
                ,new SubjectResult(SUBJECT_3, 80), new SubjectResult(SUBJECT_4, 70), new SubjectResult(SUBJECT_5, 70)
        ));

        Students candidate2 = new Students("C2", Arrays.asList(
                new SubjectResult(SUBJECT_1, 80), new SubjectResult(SUBJECT_2, 85)
                ,new SubjectResult(SUBJECT_3, 70), new SubjectResult(SUBJECT_4, 85), new SubjectResult(SUBJECT_5, 30)
        ));

        StudentGroup studentGroup = new StudentGroup(Arrays.asList(candidate1, candidate2));
        Result result = new ResultBuilder().buildResult(studentGroup);

        Gson gson = new Gson();
        String sG = gson.toJson(studentGroup);
        System.out.println(sG);

        StudentGroup studentGroup1 = gson.fromJson(sG, StudentGroup.class);


        assertEquals(getExpectedMaximumMap(), result.getStatistics().getMaximum());
        assertEquals(getExpectedMinimumMap(), result.getStatistics().getMinimum());
        assertEquals(getExpectedAverageMap(), result.getStatistics().getAverage());
        assertEquals(new HashSet<>(Arrays.asList(candidate1)), result.getPassedCandidates());
        assertEquals(new HashSet<>(Arrays.asList(candidate2)), result.getFailedCandidates());

    }

    private Map<String, Double> getExpectedAverageMap() {
        Map<String, Double> map = new HashMap<>();
        map.put(SUBJECT_1, 70.0);
        map.put(SUBJECT_2, 87.5);
        map.put(SUBJECT_3, 75.0);
        map.put(SUBJECT_4, 77.5);
        map.put(SUBJECT_5, 50.0);
        return map;
    }

    private Map<String, Integer> getExpectedMaximumMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put(SUBJECT_1, 80);
        map.put(SUBJECT_2, 90);
        map.put(SUBJECT_3, 80);
        map.put(SUBJECT_4, 85);
        map.put(SUBJECT_5, 70);
        return map;
    }

    private Map<String, Integer> getExpectedMinimumMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put(SUBJECT_1, 60);
        map.put(SUBJECT_2, 85);
        map.put(SUBJECT_3, 70);
        map.put(SUBJECT_4, 70);
        map.put(SUBJECT_5, 30);
        return map;
    }


}