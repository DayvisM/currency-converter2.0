

import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        float amount;
        double dollar, pound, code, euro, yen, naira, cfa, rCode;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, welcome to your currency converter!");
        System.out.println("Kindly select your currency");
        System.out.println("1:Dollar \t2:Pound \t3:Euro \t4:Yen \t5:Naira \t6:Cfa");
        code = sc.nextInt();
        System.out.println("How much money do you want to convert?");
        amount = sc.nextFloat();
        System.out.println("Kindly select your currency you want converted to");
        System.out.println("1:Dollar \t2:Pound \t3:Euro \t4:Yen \t5:Naira \t6:Cfa");
        rCode = sc.nextInt();
        if (code == 1 && rCode == 2) {
            pound = amount * 0.8995;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
        } else if (code == 1 && rCode == 3) {
            euro = amount * 1.0218;
            System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
        } else if (code == 1 && rCode == 4) {
            yen = amount * 145.1735;
            System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
        } else if (code == 1 && rCode == 5) {
            naira = amount * 433.72;
            System.out.println("Your " + amount + " Dollar is : " + f.format(naira) + " Naira");
        } else if (code == 1 && rCode == 6) {
            cfa = amount * 669.1663;
            System.out.println("Your " + amount + " Dollar is : " + f.format(cfa) + " Cfa");
        } else if (code == 2 && rCode == 1) {
            dollar = amount * 1.1121;
            System.out.println("Your " + amount + " Pound  is : " + f.format(dollar) + " Dollar");
        } else if (code == 2 && rCode == 3) {
            euro = amount * 1.1363;
            System.out.println("Your " + amount + " Pound  is : " + f.format(euro) + " Euro");
        } else if (code == 2 && rCode == 4) {
            yen = amount * 161.4578;
            System.out.println("Your " + amount + " Pound  is : " + f.format(yen) + " Yen");
        } else if (code == 2 && rCode == 5) {
            naira = amount * 482.3378;
            System.out.println("Your " + amount + " Pound  is : " + f.format(naira) + " Naira");
        } else if (code == 2 && rCode == 6) {
            cfa = amount * 744.1765;
            System.out.println("Your " + amount + " Pound  is : " + f.format(cfa) + " Cfa");
        } else if (code == 3 && rCode == 1) {
            dollar = amount * 0.9778;
            System.out.println("Your " + amount + " Euro  is : " + f.format(dollar) + " Dollar");
        } else if (code == 3 && rCode == 2) {
            pound = amount * 0.8795;
            System.out.println("Your " + amount + " Euro  is : " + f.format(pound) + " Pound");
        } else if (code == 3 && rCode == 4) {
            yen = amount * 141.9860;
            System.out.println("Your " + amount + " Euro  is : " + f.format(yen) + " Yen");
        } else if (code == 3 && rCode == 5) {
            naira = amount * 424.1283;
            System.out.println("Your " + amount + " Euro  is : " + f.format(naira) + " Naira");
        } else if (code == 3 && rCode == 6) {
            cfa = amount * 654.3677;
            System.out.println("Your " + amount + " Euro  is : " + f.format(cfa) + " Cfa");
        } else if (code == 4 && rCode == 1) {
            dollar = amount * 0.0069;
            System.out.println("Your " + amount + " Yen  is : " + f.format(dollar) + " Dollar");
        } else if (code == 4 && rCode == 2) {
            pound = amount * 0.0062;
            System.out.println("Your " + amount + " Yen  is : " + f.format(pound) + " Pound");
        } else if (code == 4 && rCode == 3) {
            euro = amount * 0.0070;
            System.out.println("Your " + amount + " Yen  is : " + f.format(euro) + " Euro");
        } else if (code == 4 && rCode == 5) {
            naira = amount * 2.9862;
            System.out.println("Your " + amount + " Yen  is : " + f.format(naira) + " Naira");
        } else if (code == 4 && rCode == 6) {
            cfa = amount * 4.6072;
            System.out.println("Your " + amount + " Yen  is : " + f.format(cfa) + " Cfa");
        } else if (code == 5 && rCode == 1) {
            dollar = amount * 0.0023;
            System.out.println("Your " + amount + " Naira  is : " + f.format(dollar) + " Dollar");
        } else if (code == 5 && rCode == 2) {
            pound = amount * 0.0021;
            System.out.println("Your " + amount + " Naira  is : " + f.format(pound) + " Pound");
        }else if (code == 5 && rCode == 3) {
            euro = amount * 0.0024;
            System.out.println("Your " + amount + " Naira  is : " + f.format(euro) + " Euro");
        }else if (code == 5 && rCode == 4) {
            yen = amount * 0.3348;
            System.out.println("Your " + amount + " Naira  is : " + f.format(yen) + " Yen");
        }else if (code == 5 && rCode == 6) {
            cfa = amount * 1.5240;
            System.out.println("Your " + amount + " Naira  is : " + f.format(cfa) + " Cfa");
        }else if (code == 6 && rCode == 1) {
            dollar = amount * 0.0015;
            System.out.println("Your " + amount + " Cfa is : " + f.format(dollar) + " Dollar");
        }else if (code == 6 && rCode == 2) {
            pound = amount * 0.0014;
            System.out.println("Your " + amount + " Cfa is : " + f.format(pound) + " Pound");
        }else if (code == 6 && rCode == 3) {
            euro = amount * 0.0015;
            System.out.println("Your " + amount + " Cfa is : " + f.format(euro) + " Euro");
        }else if (code == 6 && rCode == 4) {
            yen = amount * 145.2015;
            System.out.println("Your " + amount + " Cfa is : " + f.format(yen) + " Yen");
        }else if (code == 6 && rCode == 5) {
            naira = amount * 0.6562;
            System.out.println("Your " + amount + " Cfa is : " + f.format(naira) + " Naira");
        }

        else {
            System.out.println("Invalid input");
        }
        System.out.println("Thank you for using this Currency Converter");
    }

}











