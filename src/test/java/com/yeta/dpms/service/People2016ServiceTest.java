package com.yeta.dpms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017-11-30.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class People2016ServiceTest {

    @Autowired
    private People2016Service people2016Service;

    @Test
    public void findCountByAreaCode() throws Exception {
    }

    @Test
    public void findCountByAreaCodeGroupByGender() throws Exception {
    }

    @Test
    public void findCountByAreaCodeGroupByAgeRange() throws Exception {
    }

    @Test
    public void findCountByAreaCodeGroupByNation() throws Exception {
    }

    @Test
    public void findCountByAreaCodeGroupByLastName() throws Exception {
    }

    @Test
    public void findCountByAreaCodeGroupByProfession() throws Exception {
    }

    @Test
    public void findAllRate() throws Exception {
        people2016Service.findAllRate();
    }

}