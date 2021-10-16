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
public class G2Dad extends Thread{
    float Dad_deposit, total_Dad;
    public G2Dad(){
        System.out.println("G2 Dad is exist ");
    }
    
    public void run(){
        DecimalFormat f2d = new DecimalFormat();
        f2d.setMaximumFractionDigits(2);
        for (int i = 1; i <= 5; i++){
            Dad_deposit = (float)(Math.random()*1000);
            System.out.println("Dad deposit = RM " + f2d.format(Dad_deposit));
            total_Dad += Dad_deposit;
            System.out.println("Total deposit = RM " + f2d.format(total_Dad));
        }
    }
}
