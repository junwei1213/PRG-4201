package G2BankAccount2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iuqe1
 */
public class mainBankAccount2 {
    public static void main(String[] args){
        
        Calculator MainCalculator = new Calculator();
        
        ThreadDeposit TD = new ThreadDeposit(MainCalculator);
        TD.start();
        
        ThreadDeposit TD1 = new ThreadDeposit(MainCalculator);
        TD1.start();
        
        ThreadDeposit TD2 = new ThreadDeposit(MainCalculator);
        TD2.start();
        
    }
}
