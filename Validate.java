/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationtest;

/**
 *
 * @author warl0ck
 */
public class Validate {
    private static String pwd;
    public static int digitCount = 0;
    private boolean isValid = false;
    char[] charArray = new char[50];
    
    public boolean isValidPassword(String password){
        
        pwd = password;
        if(password.length()>=8){
            password.getChars(0, password.length()-1, charArray, 0);
            
            for(int counter = 0; counter<= pwd.length()-1; counter++){
                char c = password.charAt(counter);
                
                if(Character.isLetterOrDigit(c)){
                    
                    if(Character.isDigit(c)){
                        digitCount++;
                        isValid = true;
                    }
                }
            }            
        }
        else{
                    
            System.out.println("Invalid password");
            if(Validate.digitCount <2){
                System.out.println("password must contain at least 2 Numbers");
           
            }
            System.out.println("password must be at least 8 Characters!");
        }
        return isValid;
    }   
}
