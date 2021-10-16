/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producers;

/**
 *
 * @author iuqe1
 */
public class ArrayProducers extends Thread{
    int size = 10;
    int [] arrayP = new int[size];
    int currentpos, nextpos;
    
    public ArrayProducers(){
        System.out.println(" Array is ready");
    }
    
    public synchronized void addArray(int value){
        currentpos = nextpos;
        arrayP [currentpos] = value;
        System.out.println(" Thread " + Thread.currentThread().getName() + " at " + currentpos + " value = " + value);
        nextpos++;
        System.out.println(" Next array position = " + nextpos);
    }
}
