
public class Group {

    private String name;
    private int course;
    private Student student;
    private Teacher teacher;

    public void setStudent(Student newstudent) {
        student = newstudent;
    }
    public void setTeacher(Teacher newteacher) {
        teacher = newteacher;
    }


    public Group(String name, int course, Student student, Teacher teacher) {

        this.name = name;
        this.course = course;
        this.student = student;
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return name + " " + course + "\n" + student + "\n " + teacher;

    }





}
