/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
 import java.util.Scanner;
//import java.sql.*;
/**
 *
 * @author Ankita Sinha
 */

public class Mavenproject2 {

 


    public static void main(String[] args) {
        String username = "admin";
        String password = "password";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();
        
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
            // redirect to Reservation System module
        } else {
            System.out.println("Invalid username or password.");
            // prompt user to enter valid credentials
        }
    }
}


    



 



    