/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;


/**
 *
 * @author Scott
 */
public class TestUserProfile {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter your name: ");
        
        String name = in.nextLine();
        
        System.out.println("Enter you favourite genre from this list: \n"
                + "Comedy Drama Action Mystery");
        
        String genre = in.nextLine();
        
        UserProfile user = new UserProfile(name, genre);
        
        System.out.println("Your userProfile was created");
        
        
        
        
        
    }
    
}
