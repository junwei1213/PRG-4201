/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Producers;

/**
 *
 * @author iuqe1
 */
public class Producers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayProducers mainArray = new ArrayProducers();
        ThreadProducers mainP1 = new ThreadProducers(mainArray);
        ThreadProducers mainP2 = new ThreadProducers(mainArray);
        mainP1.setName("T-1");
        mainP2.setName("T-2");
        mainP1.start();
        mainP2.start();
    }
    
}
