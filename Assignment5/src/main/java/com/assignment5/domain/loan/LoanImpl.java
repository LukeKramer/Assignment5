package com.assignment5.domain.loan;

import com.assignment5.config.Loan;
import com.assignment5.service.CreateLoan;

/**
 * Created by student on 2016/03/31.
 */
public class LoanImpl implements CreateLoan {

    public Loan getLoan() {

        Loan loan = new Loan.Builder()
                .maxLoanAmount(100000)
                .minLoanAmount(1000)
                .build();
        return loan;
    }
}
