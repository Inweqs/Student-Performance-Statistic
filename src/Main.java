import java.util.*;

public class Main {
    public static double randomRate() {
        Random rand = new Random();
        return (double) rand.nextInt(20, 51) / 10;
    }
    public static Map<String, Double> generateRatings() {
        Map<String, Double> tempRatings = new HashMap<>();

        tempRatings.put("Math", randomRate());
        tempRatings.put("Computer Science", randomRate());
        tempRatings.put("English", randomRate());
        tempRatings.put("Information Security", randomRate());
        tempRatings.put("Time management", randomRate());

        return tempRatings;
    }
    public static void main(String[] args) {
        StudentGroup c2103 = new StudentGroup();
        c2103.addStudent(new Student("Alex", 20, generateRatings()));
        c2103.addStudent(new Student("Jhon", 21, generateRatings()));
        c2103.addStudent(new Student("Maks", 20, generateRatings()));
        c2103.addStudent(new Student("Julie", 22, generateRatings()));
        c2103.addStudent(new Student("Yuri", 20, generateRatings()));

        c2103.getAllStudents();
        c2103.statsOfClass();
    }
}
