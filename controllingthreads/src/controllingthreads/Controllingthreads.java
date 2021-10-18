/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controllingthreads;

/**
 *
 * @author iuqe1
 */
public class Controllingthreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mutex mainM = new Mutex();
        Thread T1 = new ThreadOne (mainM);
        Thread T2 = new ThreadTwo (mainM);
        T1.start();
        T2.start();
    }
    
}
