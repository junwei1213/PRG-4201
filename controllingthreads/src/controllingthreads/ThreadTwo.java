/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllingthreads;

/**
 *
 * @author iuqe1
 */
public class ThreadTwo extends Thread{
    Mutex mTwo = new Mutex();
    public ThreadTwo (Mutex two){
        mTwo = two;
        System.out.println(" Thread two is ready");
    }
    
    public void run(){
        try{
            mTwo.Two();
        } catch (InterruptedException e){
            
        }
    }
}
