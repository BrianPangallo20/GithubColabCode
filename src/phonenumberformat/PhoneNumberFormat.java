/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumberformat;

import java.util.Scanner;

/**
 *
 * @author ubryc
 */
public class PhoneNumberFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Please enter a 10 digit phone number for me to format.");
            System.out.println("Type 999 to end.");
            String strInput = input.nextLine();
            String end = "999";
            StringBuilder sb = new StringBuilder(strInput);
            
            if (strInput.length() == 10) {
                sb.replace(0,0,"(");
                sb.replace(4,4,")");
                sb.replace(8,8,"-");
                System.out.println(sb);

                
                System.out.println("Its me Brian");
                
            } else if (strInput.equals(end)) {
                System.out.println("Ending...");
                break;
                
            } else if (strInput.length() > 10) {
                System.out.println("ERROR: Number Too Long");
            } else if (strInput.length() < 10) {
                System.out.println("ERROR: Number Too Short");
            }
        }
    }
    
    
}
