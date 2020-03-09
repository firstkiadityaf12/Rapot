/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapot;

import java.util.Scanner;

/**
 *
 * @author WINDOW S 10
 */
public class Rapot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner adit = new Scanner(System.in);
        
        Super ad = new Super();
        Super adi = new Subs();
        
        
        ad.tampilan();
        adi.tampilan();
    }
    
}
