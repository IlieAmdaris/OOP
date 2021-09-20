public class Student {
    private String name;
    private float mark;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }
    public Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }
}
