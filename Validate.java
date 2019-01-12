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
    
    
    public static int digitCount = 0;
    private boolean isValid = false;
    char[] charArray = new char[50];
    
    /**
     * validate password input of not more than 50 characters
     * @param password the password to be tested.
     * @return true if and only if:
     * if the length is at least 8 characters long
     * if it contains letters and digits(no symbols)
     * and lastly if it contains at least 2 digits all in this sequence
     */
    public boolean isValidPassword(String password){
        //check length and convert individual String characters into char[]
        if(password.length()>=8){
            password.getChars(0, password.length()-1, charArray, 0);
            
            for(int counter = 0; counter<= password.length()-1; counter++){
                char c = password.charAt(counter);
                
                 
                if(Character.isLetterOrDigit(c) ){
                    
                    if(Character.isDigit(c)){
                        digitCount++;
                        isValid = true;
                    }
                }
                //else break for loop if it is not a letter or digit(i.e symbol)
                else{
                    isValid = false;
                    System.out.println("it contains Symbols");
                    break;
                }
                
            }            
        }
        else{
                    isValid=false;
            System.out.println("Invalid password");
            if(Validate.digitCount <2){
                System.out.println("password must contain at least 2 Numbers");
           
            }
            
            System.out.println("password must be at least 8 Characters!");
        }
        return isValid;
    }   
}
