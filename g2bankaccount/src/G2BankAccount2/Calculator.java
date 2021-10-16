/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G2BankAccount2;
import java.text.DecimalFormat;
/**
 *
 * @author iuqe1
 */
public class Calculator {
    float total;
    public Calculator(){
        System.out.println(" Calculator is exist");
    }
    
    public void count_total(float deposit_){
        DecimalFormat f2d = new DecimalFormat();
        f2d.setMaximumFractionDigits(2);
        total += deposit_;
        System.out.println("______Grand Total = RM " + f2d.format(total));
    }
}
