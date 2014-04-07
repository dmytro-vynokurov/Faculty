package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:37
 */
@Entity
@Table(name = "ANSWER")
class Answer {
    @Id
    int id

    @Column(name = "POSITIVE")
    boolean positive

    @ManyToOne(targetEntity = Student.class, optional = false)
    @JoinColumn(name = "STUDENT_ID")
    Student student

    @ManyToOne(targetEntity = Question.class, optional = false)
    @JoinColumn(name = "QUESTION_ID")
    Student question

}
