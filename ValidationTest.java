/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationtest;

import java.util.Scanner;

/**
 *
 * @author warl0ck
 */
public class ValidationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Validate validate = new Validate();
        System.out.printf("%s!! \n%s, \n%s, \n%s \n",
                "plese input password here",
                "Note password must be at least 8 characters",
                "consist only of letters and digits",
                "it must contain at least 2 digits.");
        String pwd = input.nextLine();
        boolean result = validate.isValidPassword(pwd);
        if(result == true){
            System.out.println("Valid Password");
        }
        
    }
    
}
