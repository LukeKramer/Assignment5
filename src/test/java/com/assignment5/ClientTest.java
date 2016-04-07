package com.assignment5;

import com.assignment5.domain.client.ClientImpl;

import com.assignment5.config.Person;
import com.assignment5.factory.Clientfactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/31.
 */
public class ClientTest {
    @Test
    public void testClientFactory() throws Exception {

        ClientImpl one = new ClientImpl();

        Person  person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");

        person.getIncome();


        String type = Clientfactory.getClientType(person.getIncome());

        System.out.println(type);

        Assert.assertEquals("workingwage",type);



    }

    @Test
    public void testClientUpdate() throws Exception {


        ClientImpl one = new ClientImpl();

        Person  person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");

        System.out.println(person.getFirstName());
        person = new Person.Builder().copy(person).FirstName("Luke").build();
        System.out.println(person.getFirstName());

        Assert.assertSame(person.getFirstName(),"Luke");




    }

    @Test
    public void testClientIncomeUpdate() throws Exception {

        ClientImpl one = new ClientImpl();

        Person  person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");


        System.out.println(person.toString());

        person = new Person.Builder().copy(person).Income(64000).build();
        System.out.println(person.toString());

        Assert.assertEquals(person.getIncome(),64000);



    }
}
