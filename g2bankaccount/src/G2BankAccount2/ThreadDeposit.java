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
public class ThreadDeposit extends Thread{
    Calculator T_Calculator = new Calculator();
    float deposit, total;
    public ThreadDeposit(Calculator c){
        T_Calculator = c;
        System.out.println(" T-deposit is exist ");
    }
    
    public void run(){
        DecimalFormat f2d = new DecimalFormat();
        f2d.setMaximumFractionDigits(2);
        
            deposit = (float)(Math.random()*10);
            System.out.println("______Deposit = RM " + f2d.format(deposit));
            
            T_Calculator.count_total(deposit);
    }
    
}
