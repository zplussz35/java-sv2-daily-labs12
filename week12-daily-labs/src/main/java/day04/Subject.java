package day04;

public class Subject {
    private String teacherName;
    private String subjectName;
    private String classroom;
    private int classInWeek;

    public Subject(String teacherName, String subjectName, String classroom, int classInWeek) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
        this.classroom = classroom;
        this.classInWeek = classInWeek;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getClassInWeek() {
        return classInWeek;
    }
}
