package base.dao

import base.entities.Teacher
import org.hibernate.Query
import org.springframework.stereotype.Repository

/**
 * User: Dmytro Vynokurov
 * Date: 29.03.14
 * Time: 0:49
 */
@Repository("teacherDao")
public class TeacherDao extends BaseDao {

    public List<Teacher> getAllTeachers() {
        Query query = getSession().getNamedQuery("getAllTeachers");
        return query.list();
    }
}
