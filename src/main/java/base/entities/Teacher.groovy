package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 29.03.14
 * Time: 1:29
 */
@Entity
@Table(name = "TEACHER")
@NamedQuery(name = "getAllTeachers", query = "SELECT t FROM Teacher t")
class Teacher {
    @Id
    @GeneratedValue
    @Column(name = "TEACHER_ID")
    int teacherId;

    @Column(name = "TEACHER_NAME")
    String name;

    @OneToMany(targetEntity = Course.class, mappedBy = "teacher")
    @JoinColumn(name = "TEACHER_ID")
    List<Course> courses;

    @OneToMany(targetEntity = Test.class, mappedBy = "teacher")
    @JoinColumn(name = "TEACHER_ID")
    List<Test> tests;

    @Override
    String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
