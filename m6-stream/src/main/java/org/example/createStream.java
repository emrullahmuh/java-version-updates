package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class createStream {
    public static void main(String[] args) {
        //creating stream from array
        String[] courses = {"java", "spring", "agile"};

        Stream<String> coursesStream = Arrays.stream(courses);
//create stream from collections
        List<String> courseList = Arrays.asList("java", "spring", "agil");
        Stream<String> courseStream = courseList.stream();

        List<Course> mycourse = Arrays.asList(
                new Course("java", 12),
                new Course("ds", 13),
                new Course("ns", 23)
        );
        Stream<Course> myCourseStream = mycourse.stream();
//creating stream values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }
}