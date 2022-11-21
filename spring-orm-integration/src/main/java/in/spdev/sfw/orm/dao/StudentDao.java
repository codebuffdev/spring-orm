package in.spdev.sfw.orm.dao;

import in.spdev.sfw.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //save Student
    public int insert(Student student){
        Serializable saveId = hibernateTemplate.save(student);
        return (int)saveId;
    }
}
