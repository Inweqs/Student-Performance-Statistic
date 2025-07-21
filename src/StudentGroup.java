import java.util.ArrayList;

public class StudentGroup {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student st) {
        students.add(st);
    }
    public void getAllStudents() {
        for (Student st : students) {
            st.getStudent();
        }
    }

    public void statsOfClass() {
        float sum = 0f;
        int size = students.toArray().length;
        double bestRate = 0;
        String nameOfBest = "";
        for (Student st : students) {
            sum += st.age;
            double temp = st.calculateMean();
            if (temp > bestRate) {
                bestRate = temp;
                nameOfBest = st.name;
            }
        }
        float result = sum / size;
        System.out.println("Average student age: " + result);
        System.out.println("Best student: " + nameOfBest);
    }
}
