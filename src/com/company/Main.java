package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args)
//    {
//        System.out.println("Hello world!");
//    }
//}

//class BD{
//    public static void main(String[] args) {
//
//        double a = 0.012d;
//        double aSum = a+a+a;
//        System.out.println(aSum);
//        String stringValue = Double.toString(a);
//        BigDecimal bd = new BigDecimal(stringValue);
//        System.out.println(bd.add(bd).add(bd));
//    }
//}

//class Mathematics{
//    public static void main(String[] args) {
//        int a = 23;
//        int b = 19;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//    }
//}

//class Arrays{
//    public static void main(String[] args) {
//        char ch = 'h';
//
//        char[] crs = {'J', 'A', 'V', 'A'};
//
//        System.out.println(crs[0]);
//
//        String str = new String(crs);
//        System.out.println(str);
//    }
//
//
//}

//class PlayWithString{
//    public static void main(String[] args) {
//        String userID = "731243";
//        String password = "Admin@123";
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter User ID");
//        String userInput= sc.next();
//
//        if (userInput.equals(userID)){
//            System.out.println("User ID is correct ✔");
//        }else{
//            System.out.println("User ID doesn't match ❌ re-enter User ID");
//            String userInput2= sc.next();
//            System.out.println("User ID is correct ✔");
//        }
//        System.out.println("Enter your Password");
//        String userInput3= sc.next();
//        if (userInput3.equals(password)){
//            System.out.println("Password is correct ✔");
//        }else {
//        System.out.println("Password doesn't match ❌ re-enter Password");
//            String userInput4= sc.next();
//            System.out.println("Password is correct ✔");
//        }
//        System.out.println("Dashboard");
//        System.out.print("Children 0-6 months"+" ");
//        System.out.print("Children 1-5 years"+" ");
//        System.out.print("Children with malnutrition"+" ");
//        System.out.print("Pregnant Mothers"+" ");
//        System.out.print("Lactating Mothers");
//    }
//}

//class IfThenExample{
//    public static void main(String[] args) {
//        int number = 0;
//        String message = (number >= 0) ? "Positive" : "Non-positive";
//        System.out.println(message);
//
//    }
//}

class StringBuilderExample{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append("to");
        sb.append("Rangamati");
        System.out.println(sb);

    }
}