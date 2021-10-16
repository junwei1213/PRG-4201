/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2grainroasting;

/**
 *
 * @author iuqe1
 */
public class Furnace extends Thread{
    int Ff, Gg;
    public Furnace(){
        System.out.println(" FURNACE is ready...");
    }
    
    public void addfurnace(int F, int G){
        Ff = F; Gg = G;
        if (Ff <= Gg){
            System.out.println(" Fuel = " + Ff + " Lt " + " Grain = " + Gg + " Kg ");
            System.out.println("______FURNCE is ON");
    }else{
            System.out.println(" Fuel = " + Ff + " Lt " + " Grain = " + Gg + " Kg ");
            System.out.println(" +++ Lack of Grain.. delaying ");
        }
    }
}