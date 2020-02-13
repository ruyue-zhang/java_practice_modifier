public class Teacher {
    private final String name;
    private Student[] student;

    public Teacher(String name, Student[] student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}
