package org.spandi;

import java.util.Scanner;

public class Bank {

    public String name;
    public int age;
    public String city;

    Bank(){
    }

    public boolean createAccount(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = s.nextLine();

        System.out.println("Enter Age: ");
        age = s.nextInt();

        System.out.println("Enter City: ");
        s.nextLine();  // we should use this if we getting string input after numbers to consume left over \n character
         city = s.nextLine();


        if(age < 19){
            return false;
        }
        return true;
    }



}
