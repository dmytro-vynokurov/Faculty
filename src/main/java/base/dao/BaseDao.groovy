package base.dao

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.springframework.stereotype.Repository

import javax.annotation.Resource

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 20:25
 */
@Repository
class BaseDao {
    @Resource(name = "sessionFactory")
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.openSession();
    }
}
