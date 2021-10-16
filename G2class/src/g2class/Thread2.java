/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2class;

/**
 *
 * @author iuqe1
 */
public class Thread2 implements Runnable{
    int randomnumber2;
    public Thread2(){
        System.out.println(Thread.currentThread().getName() + " is created at " + System.currentTimeMillis());
    }
    
    public void run(){
        try{
        for (int i = 1; i <= 10; i++){
            randomnumber2 = (int)(Math.random()*20);
            Thread.sleep(1500);
        System.out.println(Thread.currentThread().getName() + " is printing " + randomnumber2 + " at " + System.currentTimeMillis());
        }
    
    } catch (InterruptedException e){
    
}
    }
        
}
