package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:37
 */
@Entity
@Table(name = "TEST")
class Test {
    @Id
    @GeneratedValue
    @Column(name = "TEST_ID")
    int testId

    @Column(name = "SUBJECT")
    String subject

    @Column(name = "TEST_NAME")
    String name

    @Column(name = "DESCRIPTION")
    String description

    @OneToMany(targetEntity = Question.class, mappedBy = "question")
    List<Question> questions

    @ManyToOne(targetEntity = Teacher.class, optional = false)
    @JoinColumn(name = "TEACHER_ID")
    Teacher teacher
}
