package com.assignment5.config;

import java.io.Serializable;

/**
 * Created by student on 2016/03/31.
 */
public class Loan implements Serializable{

    private long maxAmount;
    private long minAmount;

    private Loan(){}

    public long getMaxAmount() {
        return maxAmount;
    }

    public long getMinAmount() {
        return minAmount;
    }

    public void editMaxAmount(long value)
    {
        this.maxAmount = value;
    }
    public void editMinAmount(long value)
    {
        this.minAmount = value;
    }

    public Loan(Builder Build)
    {
        this.maxAmount = Build.maxAmount;
        this.minAmount = Build.minAmount;

    }

    public static class Builder
    {
        private long maxAmount;
        private long minAmount;

        public Builder maxLoanAmount(long value)
        {
            this.maxAmount = value;
            return this;
        }

        public Builder minLoanAmount(long value)
        {
            this.minAmount = value;
            return this;
        }

        public Builder copy(Loan value)
        {
            this.maxAmount = value.maxAmount;
            this.minAmount = value.minAmount;

            return this;
        }

        public Loan build()
        {
            return new Loan(this);
        }





    }
}
