package com.assignment5.domain.loan;

import com.assignment5.config.Loan;

/**
 * Created by student on 2016/03/31.
 */
public class LoanPremium extends LoanType {

    LoanImpl loan = new LoanImpl();
    Loan amount = loan.getLoan();


    @Override
    public String handleRequest(String type, long request) {

        if (type.equals("premiumwage")& request <= amount.getMaxAmount() & request >= amount.getMinAmount()) {
            long pay = (long) ((request*0.3)+ request)/12;
            String amount = Long.toString(request);
            String payment = Long.toString(pay);
            return "Loan for R:"+ amount +" Approved!"+"\nMonthly installment for 12months R:"+payment;
        } else {
            if (nextLoan != null) {
                return nextLoan.handleRequest(type,request);
            }
            return "Loan not Approved income Insufficent";

        }
    }
}
