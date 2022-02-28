package com.akib.springOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akib.springOrm.dao.StudentDao;
import com.akib.springOrm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        Student student = new Student(1239,"Nihal Geda","Indore");
        int r=studentDao.insert(student);
        System.out.println("done"+r);
    }
}
