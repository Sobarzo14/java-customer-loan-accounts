/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerloanaccounts;

/**
 *
 * @author abela
 */
public class LoanAccount {
    private double principle;
    private double annualInterestRate;
    private int months;

    public LoanAccount(double principle, double annualInterestRate, int months) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }
    
    public double calculateMonthlyPayment() {
        double monthlyInterest = this.annualInterestRate/1200;
        
        double monthlyPayment = principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -1 * months)));
        
        return monthlyPayment;
    
    }
    

    public double getPrinciple() {
        return principle;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "\nPrincipal: $" + String.format("%,.2f", getPrinciple())
                + "\nAnnual Interest Rate: " + String.format("%,.2f", getAnnualInterestRate()) + "%" 
                + "\nTerm of Loan in Months: " + getMonths()
                + "\nMonthly Payment: $" + String.format("%,.2f", calculateMonthlyPayment());
    }
    
}
