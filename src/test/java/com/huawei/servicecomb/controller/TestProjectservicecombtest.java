package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectservicecombtest {

        ProjectservicecombtestDelegate projectservicecombtestDelegate = new ProjectservicecombtestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectservicecombtestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}