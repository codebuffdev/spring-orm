package in.spdev.sfw.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "student_id")
    private int sid;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_city")
    private String city;

    public Student(int sid, String studentName, String city) {
        this.sid = sid;
        this.studentName = studentName;
        this.city = city;
    }

    public Student() {
        //no args
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
