/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g2bankaccount;

/**
 *
 * @author iuqe1
 */
public class G2bankaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        G2Mom myMom = new G2Mom();
        G2Dad myDad = new G2Dad();
        
        myMom.start();
        System.out.println("___________________Waiting Mom to Finish");
        try{
            Thread.sleep(1000);
            myMom.join();
        }catch (InterruptedException e){
            
        }
        
        myDad.start();
    }
}
