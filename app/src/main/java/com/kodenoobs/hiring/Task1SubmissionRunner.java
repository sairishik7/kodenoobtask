package com.kodenoobs.hiring;

import com.kodenoobs.hiring.judge.RemoteJudge;
import com.kodenoobs.hiring.task1.ResultBuilder;
import com.kodenoobs.hiring.task1.students.Result;
import com.kodenoobs.hiring.task1.students.StudentGroup;

import static com.kodenoobs.hiring.judge.task.TASKLIST.JAVA_TASK_1;

public class Task1SubmissionRunner {


    public static void main(String[] args) throws Exception {

        // Enter your personal Github Id:
        String githubId = "";

        // Enter your Job Id:
        String jobId = "";

        if(githubId == null || githubId.trim() == "") {
            throw new RuntimeException("Please enter your personal github id.");
        }

        if(jobId == null || jobId.trim() == "") {
            throw new RuntimeException("Please enter your Job ID id.");
        }


        RemoteJudge remoteJudge = new RemoteJudge<StudentGroup, Result>(StudentGroup.class, githubId, jobId);
        StudentGroup input = (StudentGroup) remoteJudge.getInput(JAVA_TASK_1);
        remoteJudge.validate(JAVA_TASK_1, new ResultBuilder().buildResult(input));

    }
}
