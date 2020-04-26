package com.av8242n.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStudents {

    public static void main(String[] args) {
        Student s1 = new Student("cs011", "Lennon", 3.1f);
        Student s2 = new Student("cs021", "McCartney", 3.4f);
        Student s3 = new Student("cs012", "Harrison", 2.7f);
        Student s4 = new Student("cs022", "Starr", 3.7f);

        List<Student> students = Arrays.asList(new Student[]{s1,s2,s3,s4});

        Comparator<Student> compareById = Comparator.comparing(Student::getId);
        Comparator<Student> compareByName = Comparator.comparing(Student::getName);
        Comparator<Student> compareByScore = Comparator.comparing(Student::getCgpa);

        Comparator<Student> compareByIdThenNameThenScore = compareById.thenComparing(compareByName.thenComparing(compareByScore));

        students.stream()
                .sorted(compareByIdThenNameThenScore)
                .forEach(System.out::println);

    }
}
