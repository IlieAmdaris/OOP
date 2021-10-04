import java.util.List;

public class University {
    private String name;
    private List<Student> students;
    private int foundationYear;

    public University(String name, List<Student> students, int foundationYear) {
        this.name = name;
        this.students = students;
        this.foundationYear = foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
    public University(String name, List<Student> studentList) {
        this.name = name;
        students = studentList;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void printStudents(){
        for(Student student : students){
            System.out.println(student.getName());
        }
    }
    public float getAverage(){
        float sum = 0;
        for(Student student:students){
            sum += student.getMark();
        }
        return sum/students.size();
    }
}
