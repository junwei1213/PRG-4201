/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producers;

/**
 *
 * @author iuqe1
 */
public class ThreadProducers extends Thread{
    ArrayProducers A = new ArrayProducers();
    int randomvalue;
    
    public ThreadProducers (ArrayProducers a){
        A = a;
        System.out.println(" Producers " + Thread.currentThread().getName() + " are ready ");
    }
    
    public void run(){
        for (int i = 1; i <= 5; i++){
            try{
                randomvalue = (int)(Math.random()*1000);
                Thread.sleep(1500);
                A.addArray(randomvalue);
            }catch (InterruptedException e){
                
            }
        }
    }
}
