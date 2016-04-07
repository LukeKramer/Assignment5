package com.assignment5.service;

import com.assignment5.config.Person;

/**
 * Created by student on 2016/03/31.
 */
public interface CreatePerson {

    Person getPerson(long id, long income,String fname,String lname,String phone,String email);
}
