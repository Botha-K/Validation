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
    
    /**
     * checks to see if the input email is in a valid format
     * @param email
     * @return true 
     */
    public boolean isValidEmail(String email){
        Pattern checkRegex = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:"
                + "\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\"
                + "x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\"
                + "x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
                + "(?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\"
                + ".){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:["
                + "\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\"
                + "x0b\\x0c\\x0e-\\x7f])+)\\])");
        
        if(email != ""){
            Matcher regexMatcher = checkRegex.matcher(email);
        while(regexMatcher.find()){
            if(regexMatcher.group().length() != 0){
                System.out.println(regexMatcher.group());
                boolean isValid = true;
            }
            else{
                System.out.println("please enter your Email!!");
            }
        }
        
        }
        return isValid;
    }
    /**
     * check if the username formart is valid
     * @param username
     * @return 
     */
    boolean isValidUsername(String username){
        
        if(username != "" && username.length() >= 6){
            charArray = new char[50];
            username.getChars(0, username.length() -1, charArray, 0);
            for(char c : charArray){
                if(!Character.isLetterOrDigit(c)){
                    System.out.println("username can not have a Special Character"); 
                }
                else{
                    System.out.println("username is valid");
                }
            }
        }
        return isValid;
    }
}
