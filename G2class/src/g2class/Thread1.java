package g2class;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iuqe1
 */
public class Thread1 extends Thread{
    int randomnumber;
    public Thread1 (){
        System.out.println(Thread.currentThread().getName() + " is created at " + System.currentTimeMillis());
    }
    
    public void run(){
        try{
        for (int i = 1; i <= 10; i++){
            randomnumber = (int)(Math.random()*20);
            Thread.sleep(1500);
        System.out.println(Thread.currentThread().getName() + " is printing " + randomnumber + " at " + System.currentTimeMillis());
        }
    
    } catch (InterruptedException e){
    
}
        }
}
