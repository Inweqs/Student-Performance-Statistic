import java.util.HashMap;
import java.util.Map;

public class Student {
    protected String name;
    protected int age;
    protected Map<String, Double> ratings = new HashMap<String, Double>();

    Student(String name, int age, Map<String, Double> ratings) {
        this.name = name;
        if (age > 18 && age < 100) this.age = age;
        if (!ratings.isEmpty()) this.ratings = ratings;
    }

    public float calculateMean() {
        double sum = 0;
        for (double d : ratings.values()) {
            sum += d;
        }
        return Math.round((sum / ratings.size()) * 100f) / 100f;
    }

    public String studentPerformance() {
        Double[] arr = ratings.values().toArray(new Double[0]);

        for (Double d : arr) {
            if (Double.compare(d, 2.0) == 0) return "Failing student";
        }
        if (calculateMean() >= 4.0) return "Excellent student";
        else return "Normal Student";
    }

    public void getStudent() {
        System.out.println("STUDENT: " + this.name.toUpperCase());
        System.out.println("Age: " + this.age);
        System.out.println("Average rate: " + calculateMean());
        System.out.println("Status: " + studentPerformance() + "\n");
    }
}
