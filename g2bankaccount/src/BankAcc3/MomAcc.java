/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAcc3;

/**
 *
 * @author iuqe1
 */
public class MomAcc extends Thread{
    MutualExpenses MomMT = new MutualExpenses ();
    int personal_amount, mutual_amount;
    
    public MomAcc(MutualExpenses mt){
        MomMT = mt;
        System.out.println("");
    }
    
    public void run(){
        for (int month = 1; month <= 6; month++){
            personal_amount = (int)(Math.random()*1000);
            mutual_amount = (int)(Math.random()*700);
            System.out.println("Personal Amount for Dad = RM " + personal_amount);
            System.out.println(" &&&&&&&& Mutual Amount Dad sent = RM " + mutual_amount);
            MomMT.Calculate_Total(mutual_amount);
        }
    }
}
