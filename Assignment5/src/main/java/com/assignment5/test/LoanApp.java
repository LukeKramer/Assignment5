package com.assignment5.test;

import com.assignment5.config.Person;
import com.assignment5.domain.client.ClientImpl;
import com.assignment5.factory.Clientfactory;
import com.assignment5.factory.Loanfactory;

import java.util.Scanner;

/**
 * Created by student on 2016/04/02.
 */
public class LoanApp {

    public static void main( String[] args )
    {
        long id;
        long income;
        String fname;
        String lname;
        String phone;
        String email;
        Scanner scan = new Scanner(System.in);
        System.out.println("Small Loan System\n");

        System.out.println("_______________________\n");
        System.out.println("Pesonal Info");
        System.out.println("_______________________\n");

        System.out.println("Enter your Id number example(12345678):");

        id =scan.nextLong();

        System.out.println("Enter your Salary between(1000 and 100000):");

        income =scan.nextLong();

        System.out.println("Enter your FirstName:");

        fname =scan.next();

        System.out.println("Enter your LastName:");

        lname =scan.next();

        System.out.println("Enter your Phone Number example(021-000 0000):");

        phone =scan.next();

        System.out.println("Enter your Email Address example(hello@gmail.com):");

        email =scan.next();

        ClientImpl one = new ClientImpl();

        Person person = one.getPerson(id,income,fname,lname,phone,email);

        if(id!=0 & income!=0 & fname !="" & lname != "" & phone != "" & email !="")
        {
            System.out.println("Client Information:");



            System.out.println(person.toString());

            String y,n;

            System.out.println("If you would like to edit income enter Y else enter N to continue");
            y =scan.next();
            if("y".equalsIgnoreCase(y))
            {
                System.out.println("Enter your new Salary between(1000 and 100000):");
                long value = scan.nextLong();
                person.editIncome(value);

                System.out.println(person.toString());

                String type = Clientfactory.getClientType(person.getIncome());



                System.out.println("Enter a Loan Amount between(1000 and 100000):");
                long amount = scan.nextLong();
                System.out.println("_________________________________");
                System.out.println(type);

                String result = Loanfactory.getLoanType(type,amount);

                System.out.println(result);

            }
            else
            {

                System.out.println(person.toString());
                String type = Clientfactory.getClientType(person.getIncome());



                System.out.println("Enter a Loan Amount between(1000 and 100000):");
                long amount = scan.nextLong();
                System.out.println("_________________________________");
                System.out.println(type);

                String result = Loanfactory.getLoanType(type,amount);

                System.out.println(result);



            }








        }













    }
}
