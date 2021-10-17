/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2arraybq;

/**
 *
 * @author iuqe1
 */
public class DepositThread extends Thread{
    private SyncArrayBQ bq1;
    
    public DepositThread( SyncArrayBQ d){
        bq1 = d;
    }
    
    public void run(){
        for (int i = 1; i <= 10; i++){
            try{
            int depo = (int)(Math.random()*1000);
            Thread.sleep(1000);
            bq1.deposit(depo);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
