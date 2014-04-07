package base.entities;

import javax.persistence.*;

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:38
 */
@Entity
@Table(name = "STUDENT_COURSE")
class StudentCourse {
    @Id
    int id;

    @ManyToOne(targetEntity = Course.class, optional = false)
    @JoinColumn(name = "COURSE_ID")
    Course course;

    @ManyToOne(targetEntity = Student.class, optional = false)
    @JoinColumn(name = "STUDENT_ID")
    Student student;

    @Column(name = "MARK")
    int mark;
}
