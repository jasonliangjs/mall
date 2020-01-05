package com.ljs.mall.dao;

import com.alibaba.fastjson.JSON;
import com.ljs.mall.MallApplicationTests;
import com.ljs.mall.pojo.Category;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(JSON.toJSONString(category.toString(),true));
    }

    @Test
    public void queryById() {
        Category category = categoryMapper.queryById(100001);
        System.out.println(JSON.toJSONString(category.toString(),true));
    }
}