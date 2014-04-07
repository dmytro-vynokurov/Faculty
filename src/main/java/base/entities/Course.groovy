package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 29.03.14
 * Time: 14:20
 */
@Entity
@Table(name = "COURSE")
class Course {
    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    int courseId

    @ManyToOne(targetEntity = Teacher.class, optional = false)
    @JoinColumn(name = "TEACHER_ID")
    Teacher teacher;

    @Column(name = "COURSE_NAME")
    String courseName

    @Column(name = "COURSE_DESCRIPTION")
    String courseDescription

    @OneToMany(targetEntity = StudentCourse.class)
    @JoinColumn(name = "COURSE_ID")
    List<StudentCourse> courseResults;
}
