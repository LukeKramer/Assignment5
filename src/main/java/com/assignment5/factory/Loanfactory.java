package com.assignment5.factory;

import com.assignment5.domain.loan.LoanGeneral;
import com.assignment5.domain.loan.LoanOther;
import com.assignment5.domain.loan.LoanPremium;
import com.assignment5.domain.loan.LoanType;

/**
 * Created by student on 2016/03/31.
 */
public class Loanfactory {

    public static String getLoanType(String name,long value){
        LoanType chain = setUpChain();
        return chain.handleRequest(name,value);
    }


    public static LoanType setUpChain()
    {
        LoanType a = new LoanPremium();
        LoanType b = new LoanGeneral();
        LoanType c = new LoanOther();

        a.setNextLoan(b);
        b.setNextLoan(c);
        return a;
    }
}
