/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2arraybq;

/**
 *
 * @author iuqe1
 */
public class WithdrawThread extends Thread{
    private SyncArrayBQ bq2;
    
    public WithdrawThread( SyncArrayBQ w){
        bq2 = w;
    }
    
    public void run(){
        for (int i = 1; i <= 10; i++){
            try{
            int withd = (int)(Math.random()*1000);
            Thread.sleep(1000);
            bq2.withdraw(withd);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
