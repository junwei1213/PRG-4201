/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g2arraybq;

/**
 *
 * @author iuqe1
 */
public class G2ArrayBQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SyncArrayBQ abq = new SyncArrayBQ();
        DepositThread depo = new DepositThread(abq);
        WithdrawThread wd = new WithdrawThread(abq);
        depo.setName(" Dad ");
        wd.setName(" Mom ");
        depo.start();
        wd.start();
    }
    
}
