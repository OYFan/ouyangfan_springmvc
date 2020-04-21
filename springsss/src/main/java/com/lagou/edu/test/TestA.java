package com.lagou.edu.test;

import com.lagou.edu.dao.ResumeDao;
import com.lagou.edu.pojo.Resume;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Optional;

public class TestA {


    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ResumeDao resumeDao = (ResumeDao)ac.getBean("resumeDao");
        Resume one = resumeDao.findOne(1l);
        System.out.println(one);
    }

}
