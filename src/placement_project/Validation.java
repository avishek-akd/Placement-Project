/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author avishekdas
 */
public class Validation {
    
    public static boolean validate_Regd_No(String regd_no)
    {
       boolean status = false;
        
        final String REGD_NO_REGEX = "^[1]\\d{9}$";
        final Pattern pattern = Pattern.compile(REGD_NO_REGEX);
        final Matcher matcher = pattern.matcher(regd_no);
        
        if(matcher.matches())
        {
            status = true;
        }
        else{
            status = false;
        }
        
        
        return status;
        
    }
    
    public static boolean validate_Email(String email)
    {
        boolean status = false;
        
        final String EMAIL_REGEX = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);
        final Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches())
        {
            status = true;
        }
        else{
            status = false;
        }
        
        
        return status;
        
    }
    
    public static boolean validate_Mob(String mob)
    {
        boolean status = false;
        
        final String PHONE_REGEX = "^[789]\\d{9}$";
        final Pattern pattern = Pattern.compile(PHONE_REGEX);
        final Matcher matcher = pattern.matcher(mob);
        
        if(matcher.matches())
        {
            status = true;
        }
        else{
            status = false;
        }
        
        
        return status;
        
    }
}
