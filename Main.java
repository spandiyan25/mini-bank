package org.spandi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank b = new Bank();
        BankActivity a = new BankActivity();
        int value = 0;
        while(value != 3) {

            value = Main.wellComeMessage();
            if (value == 1) {

                boolean create = b.createAccount();
                if (!create) {
                    System.out.println("[" + b.name + " Account can't create now, Age Less than 19" + "]");
                } else {
                    System.out.println("[ Account created " + b.name + " ]");

                    int choose = 0;
                    while (choose != 3) {
                        choose = bankWorks(b.name);
                        switch (choose) {
                            case 1:
                                String transfer = a.transferMoney();
                                System.out.println(transfer);
                                break;
                            case 2:
                                int amt = a.viewSaving();
                                System.out.println("Saving: " + amt);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }


    }

    private static int bankWorks(String name) {
        Scanner s= new Scanner(System.in);
        System.out.println("Hi " + name);
        System.out.println("1) Transfer Money");
        System.out.println("2) View balance");
        System.out.println("3) Log Out");
        int n = s.nextInt();
        return n;
    }

    private static boolean validation(String name) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter username: " );
        String username = s.nextLine();
        System.out.print("Password: " );
        String password = s.nextLine();
        return username.equalsIgnoreCase(name) && !password.isBlank();
    }

    public static short wellComeMessage(){
        System.out.println(" || Welcome To SPAN bank || \n");
        System.out.println(" 1) Create Account");
        System.out.println(" 2) Login Account");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Option: ");

        return s.nextShort();
    }
}