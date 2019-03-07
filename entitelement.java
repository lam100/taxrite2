/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxapp;



/**
 *
 * @author x18114245
 */
public class entitelement extends tax {
    
  Double weeklyexpenses;
  int age;

    public entitelement(Double weeklyexpenses, int age, Double hours, Double rate, Double PRSI, Double gross, Double pay, Double usc, Double netpay, String firstname, String surname, String dob, String id, String address, String ppsnumber, Double taxCredit, Double taxablePay, Double overTime, Double healthInsurance, Double unionSubs) {
        super(hours, rate, PRSI, gross, pay, usc, netpay, firstname, surname, dob, id, address, ppsnumber, taxCredit, taxablePay, overTime, healthInsurance, unionSubs);
        this.weeklyexpenses = weeklyexpenses;
        this.age = age;
    }

    

    public entitelement() {
        this.weeklyexpenses = 0.0;
        this.age = 0;
    }

    

    public void setWeeklyexpenses(Double weeklyexpenses) {
        this.weeklyexpenses = weeklyexpenses;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeeklyexpenses() {
        return weeklyexpenses;
    }

    public int getAge() {
        return age;
    }
  
  
}
