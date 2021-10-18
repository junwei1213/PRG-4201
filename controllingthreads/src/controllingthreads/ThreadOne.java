/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllingthreads;

/**
 *
 * @author iuqe1
 */
public class ThreadOne extends Thread{
    Mutex mOne = new Mutex();
    public ThreadOne (Mutex one){
        mOne = one;
        System.out.println(" Thread ONE is ready");
    }
    
    public void run(){
        try{
            mOne.One();
        } catch (InterruptedException e){
            
        }
    }
}
