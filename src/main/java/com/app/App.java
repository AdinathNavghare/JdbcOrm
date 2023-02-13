package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Dao.StudentDao;
import com.app.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
        Student st=new Student(11,"Adi","pune");
        int res=studentDao.insert(st);
        System.out.println("done=   "+res);
    }
}
