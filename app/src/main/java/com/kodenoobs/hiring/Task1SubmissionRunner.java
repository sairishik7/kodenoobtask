package com.kodenoobs.hiring;

import com.google.gson.Gson;
import com.kodenoobs.hiring.judge.InputResponse;
import com.kodenoobs.hiring.judge.RemoteJudge;
import com.kodenoobs.hiring.judge.TestResults;
import com.kodenoobs.hiring.task1.ResultBuilder;
import com.kodenoobs.hiring.task1.students.StudentGroup;

import java.util.List;
import java.util.stream.Collectors;

import static com.kodenoobs.hiring.UserInput.GITHUB_LOGIN_ID;
import static com.kodenoobs.hiring.UserInput.JOB_ID;
import static com.kodenoobs.hiring.judge.task.TASKLIST.JAVA_TASK_1;

public class Task1SubmissionRunner {


    // NOTE: DO NOT CHANGE anything in this file otherwise your submission will fail.
    public static void main(String[] args) throws Exception {
        if(GITHUB_LOGIN_ID == null || GITHUB_LOGIN_ID.trim() == "") {
            throw new RuntimeException("Please enter your personal github id in UserInput class.");
        }

        if(JOB_ID == null || JOB_ID.trim() == "") {
            throw new RuntimeException("Please enter your Job ID id in UserInput class");
        }

        RemoteJudge remoteJudge = new RemoteJudge(GITHUB_LOGIN_ID, JOB_ID);
        InputResponse input = remoteJudge.getInput(JAVA_TASK_1);
        ResultBuilder resultBuilder = new ResultBuilder();

        List<TestResults> testResults = input.getInputs().stream().map(remoteInput -> {
            Gson gson = new Gson();
            StudentGroup studentGroup = gson.fromJson(remoteInput.getInputString(), StudentGroup.class);
            String result = gson.toJson(resultBuilder.buildResult(studentGroup));
            return new TestResults(remoteInput.getInputId(), result);
        }).collect(Collectors.toList());

        remoteJudge.validate(JAVA_TASK_1, testResults);

    }
}
