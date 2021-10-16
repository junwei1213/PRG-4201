/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2grainroasting;

/**
 *
 * @author iuqe1
 */
public class ThreadFuelGrain extends Thread {
    int Fuel, Grain;
    Furnace F = new Furnace();
    
    public ThreadFuelGrain(){
        System.out.println(" Fuel and Grain is ready...");
    }
    
    public void run(){
        for(int i = 1; i <= 10; i++){
            try{
                System.out.println(" i = " + i);
                Fuel = (int)(Math.random()*1000);
                Grain = (int)(Math.random()*1000);
                Thread.sleep(1500);
                F.addfurnace(Fuel, Grain);
            } catch (InterruptedException e){
                
            }
                
        }
    }
}
