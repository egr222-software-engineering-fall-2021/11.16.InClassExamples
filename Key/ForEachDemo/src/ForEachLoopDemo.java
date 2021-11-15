import java.util.*;

public class ForEachLoopDemo {
    public static void main(String[] args) {
//        Set<String> words = new HashSet<String>(); // arbitrary order
        Set<Double> grades = new TreeSet<>();   // "natural" order
        grades.add(90.5);
        grades.add(85.4);
        grades.add(100.0);
        grades.add(72.5);

        System.out.println(grades.size() + " unique words.");
        for (double grade : grades) {
            System.out.println("Student's grade: " + grade);
        }
        System.out.println(grades);
    }
}