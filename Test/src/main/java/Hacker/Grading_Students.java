package Hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grading_Students {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 40) {
                int x = grades.get(i) % 10;
                if (x > 7 && grades.get(i) > 30) {
                    result.add(40);
                    Collections.replaceAll(grades, grades.get(i), 40);
                } else {
                    result.add(grades.get(i));
                }
            } else {
                int x = grades.get(i) % 10;
                int y = grades.get(i) / 10;
                if (x > 7) {
                    y += 1;
                    result.add(y * 10);
                    Collections.replaceAll(grades, grades.get(i), y * 10);
                } else if (x < 5 && x > 2) {
                    x = 5;
                    result.add(y * 10 + x);
                    Collections.replaceAll(grades, grades.get(i), y * 10 + x);
                }else{
                result.add(y * 10 + x);
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }

}
