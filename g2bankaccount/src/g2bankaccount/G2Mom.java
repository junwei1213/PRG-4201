/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g2bankaccount;
import java.text.DecimalFormat;
/**
 *
 * @author iuqe1
 */
public class G2Mom extends Thread{
    float Mom_deposit, total_Mom;
    public G2Mom(){
        System.out.println(" G2 mom is exist");
    }
    
    public void run(){
        DecimalFormat f2d = new DecimalFormat();
        f2d.setMaximumFractionDigits(2);
        for (int i = 1; i <= 5; i++){
            Mom_deposit = (float)(Math.random()*1000);
            System.out.println("Mom deposit = RM " + f2d.format(Mom_deposit));
            total_Mom += Mom_deposit;
            System.out.println("Total Mom = RM " + f2d.format(total_Mom));
        }
    }
}
