/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customerloanaccounts;
import java.util.ArrayList;

/**
 *
 * @author abela
 */
public class Customer {
    private String firstname;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts = new ArrayList<LoanAccount>();

    public Customer(String firstname, String lastName, String SSN) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    
    public void addLoanAccount(LoanAccount account){
        this.loanAccounts.add(account);
    }
    
    public String printMonthlyReport(){
        String loans = "\nAccount Report for Customer: " + this.getFirstname() + " " + this.getLastName() + " with SSN " + this.getSSN() + "\n";
        for (int i = 0; i < this.loanAccounts.size(); i++){
            loans += this.loanAccounts.get(i);
        }
        return loans;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }
    
    
}
