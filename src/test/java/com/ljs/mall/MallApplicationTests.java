package com.ljs.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.ljs.mall.dao")
public class MallApplicationTests {

    @Test
    public void contextLoads() {
    }

}
