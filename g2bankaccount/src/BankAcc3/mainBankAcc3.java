/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAcc3;

/**
 *
 * @author iuqe1
 */
public class mainBankAcc3 {
    public static void main(String[] args){
       
        MutualExpenses mainMT = new MutualExpenses();
        MomAcc mainMom = new MomAcc(mainMT);
        DadAcc mainDad = new DadAcc(mainMT);
        
        mainMom.start();
        
        try{
            mainMom.join();
        } catch (InterruptedException e){
        }
            mainDad.start();
            
    }
}