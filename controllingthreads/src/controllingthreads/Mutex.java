/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllingthreads;

/**
 *
 * @author iuqe1
 */
public class Mutex {
    boolean turnOne = true;
    public synchronized void One () throws InterruptedException{
        while(!turnOne){
            System.out.println(" Thread One is waiting");
            wait();
        }
        ForThreadOne();
        Thread.sleep(1500);
        turnOne = false;
        notify();
    }
    
    public synchronized void Two() throws InterruptedException{
        while(turnOne){
            System.out.println(" Thread two is waiting");
            wait();
        }
        ForThreadTwo();
        Thread.sleep(1500);
        turnOne = true;
        notify();
    }
    
    public void ForThreadOne(){
        System.out.println("__________Thread ONE is doing the job, no longer blocked");
        for (int i = 1; i <= 10; i++){
            System.out.println(" T1 printing " + i);
        }
    }
    
    public void ForThreadTwo(){
        System.out.println(" *** Thread TWO is doing the job, no longer blocked");
        for (int i = 1; i <= 10; i++){
        System.out.println(" T2 printing " + i);
        }
    }
}
