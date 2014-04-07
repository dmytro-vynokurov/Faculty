package base.entities

import javax.persistence.*

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:36
 */
@Entity
@Table(name = "QUESTION")
class Question {
    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID")
    int questionId

    @Column(name = "QUESTION_TEXT")
    String text

    @Column(name = "IS_CORRECT")
    boolean isCorrect

    @OneToMany(targetEntity = Answer.class, mappedBy = "answer")
    @JoinColumn(name = "QUESTION_ID")
    List<Answer> answers

    @ManyToOne(targetEntity = Test.class, optional = false)
    @JoinColumn(name = "TEST_ID")
    Test test
}
