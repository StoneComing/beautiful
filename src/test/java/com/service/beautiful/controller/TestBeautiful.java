package com.service.beautiful.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBeautiful {

        BeautifulDelegate beautifulDelegate = new BeautifulDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = beautifulDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}