package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:36
 */
@Entity
@Table(name = "STUDENT")
class Student {
    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    int studentId;

    @Column(name = "STUDENT_NAME")
    String studentName;

    @OneToMany(targetEntity = StudentCourse.class, mappedBy = "student")
    @JoinColumn(name = "STUDENT_ID")
    List<StudentCourse> courseResults;

    @OneToMany(targetEntity = Answer.class, mappedBy = "student")
    @JoinColumn(name = "STUDENT_ID")
    List<Answer> answers

}
