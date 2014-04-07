package base

import base.dao.TeacherDao
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * User: Dmytro Vynokurov
 * Date: 06.04.14
 * Time: 17:23
 */

class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml")
        println(context.getBean(TeacherDao.class).getAllTeachers());
    }
}
