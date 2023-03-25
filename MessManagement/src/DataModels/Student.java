package DataModels;

public class Student {
    String name;
    String course;
    String hostelRollNo;

    public Student() {
    }

    public Student(String name, String course, String hostelRollNo) {
        this.name = name;
        this.course = course;
        this.hostelRollNo = hostelRollNo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getHostelRollNo() {
        return hostelRollNo;
    }

    public void setHostelRollNo(String hostelRollNo) {
        this.hostelRollNo = hostelRollNo;
    }
}
