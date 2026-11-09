
// package com.jobparser;

// import java.io.IOException;

// public class App {

//     public static void main(String[] args) {

//         JobFileReader reader = new JobFileReader();

//         try {
//             String content = reader.readJobDescription(
//                 "job-posts/java-developer.txt"
//             );

//             System.out.println(content);

//         } catch (IOException e) {
//             System.out.println("Unable to read job description.");
//             e.printStackTrace();
//         }
//     }
// }


package com.jobparser;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        JobFileReader reader = new JobFileReader();
        JobParser parser = new JobParser();

        try {
            String content = reader.readJobDescription(
                    "job-posts/java-developer.txt"
            );

            String title = parser.extractField(content, "Job Title");
            String company = parser.extractField(content, "Company");
            String location = parser.extractField(content, "Location");

            System.out.println("Job Title: " + title);
            System.out.println("Company: " + company);
            System.out.println("Location: " + location);

        } catch (IOException e) {
            System.out.println("Unable to read job description.");
            e.printStackTrace();
        }
    }
}