/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g2class;

/**
 *
 * @author iuqe1
 */
public class G2class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 myT1 = new Thread1();
        myT1.setName(" Tan Jun Wei");
        myT1.start();
        
        Thread2 T2 = new Thread2();
        Thread myT2 = new Thread(T2);
        myT2.setName("_____________Thread 2");
        myT2.start();
    }
    
}
