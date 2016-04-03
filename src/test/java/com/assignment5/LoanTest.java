package com.assignment5;

import com.assignment5.config.Loan;
import com.assignment5.config.Person;
import com.assignment5.domain.client.ClientImpl;
import com.assignment5.domain.loan.LoanImpl;
import com.assignment5.factory.Clientfactory;
import com.assignment5.factory.Loanfactory;
import com.sun.org.apache.xpath.internal.SourceTree;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/31.
 */
public class LoanTest {

    @Test
    public void testLoanApprovel() throws Exception {

        ClientImpl one = new ClientImpl();

        Person  person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");

        person.getIncome();

        String type = Clientfactory.getClientType(person.getIncome());

        String result = Loanfactory.getLoanType(type,50000);

        System.out.println(result);

        Assert.assertNotNull(result);

    }


    @Test
    public void testLoanfactory() throws Exception {


        ClientImpl one = new ClientImpl();

        Person  person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");

        person.getIncome();

        person.editIncome(70000);

        String type = Clientfactory.getClientType(person.getIncome());

        System.out.println(type);

        String result = Loanfactory.getLoanType(type,50000);

        System.out.println(result);

        Assert.assertSame(type,"premiumwage");



    }


    @Test
    public void testLoanMaxAmountEdit() throws Exception {


        LoanImpl one = new LoanImpl();

        Loan loan = one.getLoan();

        System.out.println(loan.getMaxAmount());

        loan.editMaxAmount(500000);

        System.out.println(loan.getMaxAmount());

        Assert.assertEquals(loan.getMaxAmount(),500000);




    }
}
