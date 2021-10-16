/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAcc3;

/**
 *
 * @author iuqe1
 */
public class MutualExpenses extends Thread{
    int total;
    public MutualExpenses(){
        System.out.println(" Mutual Expenses calculator is ready");
    }
    
    public void Calculate_Total(int bothexpenses){
        total += bothexpenses;
        System.out.println("___________Total Expenses Together= " + total);
    }
}
