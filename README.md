

# Introduction

This is Codebase for submitting the Tech Task for hiring.kodenoobs.com platform. 

# Task Details: 

    We need to implement this result builder which takes list of candidates and then generates the result
       Input Details:
           1. This function accepts a list of students.
               - each of student has list of results.
               - Each result specify Name of the Subject and Score.
    
       We need to compute following:
    
       1. Maximum Score for Each subject.
       2. Minimum Score for each subject.
       3. Average score for each subject.
       4. List of Passed Students.
       5. List of failed Students.
    
    
      NOTE: A student is passed if they have scored more than 39 in each of the subjects.
           e.g:
               Student 1 has results [ "Subject 1" ->  55, "Subject 2" -> 40, "Subject 3" ->  95 ] then student is passed
               Student 2 has results [ "Subject 1" ->  55, "Subject 2" -> 39, "Subject 3" ->  95 ] then student is failed
    
      Validation:
       You should be able to pass ResultBuilderTest

# What you would need to do:

1. Install JAVA 8 in your local environment. 
2. Add your GITHUB ID and JOB ID on UserInput class.
3. Implement ResultBuilder.buildResult function. 
4. Make sure all Test in ResultBuilderTest are passing.
        
    Run Test via following command:
    
    On Linux and Mac: ``` ./gradlew clean test```  
    On Windows: ``` ./gradlew.bat clean test```


5. Submit your Solution to portal with following command .

   Run Test via following command:

   On Linux and Mac: ``` ./gradlew clean run```  
   On Windows: ``` ./gradlew.bat clean run```


## In case the submission is Successfull you will see following message
    
        **********************************
        Submitting your Solution.
        **********************************
        Congratulations. Your Submission is Successful.
        **********************************
        Please commit the code to the github repo for review.
        Please visit the Hiring Portal to start the next task.

## In case the submission is Successfull you will see following message

        **********************************
        Submitting your Solution.
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Sorry, Your Submission failed and please make sure your test is passing in the codebase.
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 