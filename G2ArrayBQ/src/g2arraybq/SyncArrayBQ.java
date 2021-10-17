/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2arraybq;
import java.util.concurrent.ArrayBlockingQueue;
/**
 *
 * @author iuqe1
 */
public class SyncArrayBQ {
    private final ArrayBlockingQueue<Integer> b;
    private int checkBalance = 0;
    private int balance = 0;
    
    public SyncArrayBQ(){
        b = new ArrayBlockingQueue <Integer> (1);
    }
    
    public void deposit(int money)throws InterruptedException {
        try{
            Thread.sleep(1000);
            b.put(money);
            System.out.println(Thread.currentThread().getName() + " deposit " + money);
            balance += money;
            System.out.println(" Current Balance after deposit = " + balance);
        } catch(InterruptedException e){
            
        }
    }
    
    public int withdraw (int money)throws InterruptedException {
        try{
            checkBalance = balance - money;
            //Successfully transaction
            if (checkBalance > 0 ||  (money < checkBalance)){
                Thread.sleep(1000);
                b.take();
                System.out.println(Thread.currentThread().getName() + " withdraw " + money);
                balance -= money;
                System.out.println(" Current Balance after withdrawal = " + balance);
            }
            //fail transaction due to no balance
            else if(balance == 0){
                System.out.println(" [denied]....no balance");
                money = 0;
                b.take();
            }
            //fail due to insufficient balance
            else {
                System.out.println(" [denied]....insufficient balance");
                money = 0;
                b.take();
            }
        }catch(InterruptedException e){
            
        }
        return balance;
    }
}
