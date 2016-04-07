package com.assignment5.domain.client;

import com.assignment5.config.Person;
import com.assignment5.factory.Clientfactory;
import com.assignment5.service.CreatePerson;

/**
 * Created by student on 2016/03/31.
 */
public class ClientImpl implements CreatePerson {

    public Person getPerson(long id, long income,String fname,String lname,String phone,String email) {

        Person person = new Person.Builder()
                .Id(id)
                .Income(income)
                .FirstName(fname)
                .LastName(lname)
                .PhoneNumber(phone)
                .Email(email)
                .build();


        return person;
    }
}
