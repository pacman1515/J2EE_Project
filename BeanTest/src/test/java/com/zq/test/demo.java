package com.zq.test;

import com.zq.controller.BeanTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class demo {
    @Autowired
    private BeanTest beanTest;

    @Test
    public void demoTest(){
        beanTest.Display();
    }

}
