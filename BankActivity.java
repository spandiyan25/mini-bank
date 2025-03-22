package org.spandi;

import java.util.Scanner;

public class BankActivity {
    public static int amount = 5000;
    public int amt;
    public String transferMoney() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Receiver Acc. No.: ");
        int acc = s.nextInt();
        System.out.print("Enter Amount to send: ");
        amt = s.nextInt();

        if (amt > 5000) {
            return "Insufficient balance";
        }

        return " Amount "+amt + "Transferred to "+ acc;
    }

    public int viewSaving() {
        return amt = amount - amt;
    }
}
