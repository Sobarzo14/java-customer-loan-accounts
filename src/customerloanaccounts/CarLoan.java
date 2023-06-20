/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerloanaccounts;

/**
 *
 * @author abela
 */
public class CarLoan extends LoanAccount {
    private String vehicleVIN;

    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }

    @Override
    public String toString() {
        return "\nCar Loan with:"
               + super.toString()+
                "\nVehicle VIN: " + this.vehicleVIN
                + "\n";
    }
    
    
}
