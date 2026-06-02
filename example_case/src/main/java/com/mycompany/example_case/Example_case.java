/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.example_case;
import java.util.Scanner;
/**
 *
 * @author Nayarith Ruiz
 */
public class Example_case {

    public static void main(String[] args) {
        
        
        Scanner data=new Scanner (System.in);
        /*
        int num1=0;
        String num2="1";
        
        //inputs
        System.out.println("number 1:");
        num1=data.nextInt();
        
        System.out.println("number 2:");
        num2=data.nextLine();
        
        System.out.println(num1+num2);
        */
        
        float num1=0, num2=0, add=0, subs=0, mult=0, div=0;
        int opt;
        
        System.out.println("enter first number: ");
        num1 = data.nextFloat();
        
        num1 = data.nextFloat();
        System.out.println("Enter second number: ");
        num2 = data.nextFloat();
        
        System.out.println("::: MAIN MENU :::\n");
        System.out.println(""
                + "[1]. Addition \n"
                + "[2]. Substraction \n"
                + "[3]. Multiplication \n"
                + "[4]. Division \n"
                + "[5]. All operations \n"
                + ".::: Press an option: ");
        opt = data.nextInt();
        
        // Conditionals 1.
        System.out.println("Conditionals 1.");
        if (opt == 1){
            add = num1 + num2;
            System.out.println("Addition: " + add);
        }
        
        if (opt == 2){
            subs = num1 - num2;
            System.out.println("Substraction: " + subs);
        }
        
        if (opt == 3){
            mult = num1 * num2;
            System.out.println("Multiplication: " + mult);
        }
        
        if (opt == 4){
            div = num1 / num2;
            System.out.println("Division: " + div);
        }
        
        if (opt == 5){
            add = num1 + num2;
            subs = num1 - num2;
            mult = num1 * num2;
            div = num1 / num2;
            System.out.println("Addition: " + add);
            System.out.println("Substraction: " + subs);
            System.out.println("Multiplication: " + mult);
            System.out.println("Division: " + div);
        }
        
        if (opt < 1 || opt > 5)
            System.out.println("Incorrect option !!!");
        
        // Conditionals 2.
        System.out.println("Conditionals 2.");
        if (opt == 1){
            add = num1 + num2;
            System.out.println("Addition: " + add);
        }else{
            if (opt == 2){
                subs = num1 - num2;
                System.out.println("Substraction: " + subs);
            }else{
                if (opt == 3){
                    mult = num1 * num2;
                    System.out.println("Multiplication: " + mult);
                }else{
                    if (opt == 4){
                        div = num1 / num2;
                        System.out.println("Division: " + div);
                    }else{
                        if (opt == 5){
                            add = num1 + num2;
                            subs = num1 - num2;
                            mult = num1 * num2;
                            div = num1 / num2;
                            System.out.println("Addition: " + add);
                            System.out.println("Substraction: " + subs);
                            System.out.println("Multiplication: " + mult);
                            System.out.println("Division: " + div);
                        }else{
                            System.out.println("Incorrect option !!!");
                        }
                    }
                }
            }
        }
        
        // Conditionals 3.
        System.out.println("Conditionals 3.");
        if (opt == 1){
            add = num1 + num2;
            System.out.println("Addition: " + add);
        }else if (opt == 2){
            subs = num1 - num2;
            System.out.println("Substraction: " + subs);
        }else if (opt == 3){
            mult = num1 * num2;
            System.out.println("Multiplication: " + mult);
        }else if (opt == 4){
            div = num1 / num2;
            System.out.println("Division: " + div);
        }else if (opt == 5){
            add = num1 + num2;
            subs = num1 - num2;
            mult = num1 * num2;
            div = num1 / num2;
            System.out.println("Addition: " + add);
            System.out.println("Substraction: " + subs);
            System.out.println("Multiplication: " + mult);
            System.out.println("Division: " + div);
        }else{
            System.out.println("Incorrect option !!!");
        }
        
        // Switch case
        System.out.println("Switch case.");
        switch(opt){
            case 1:
                add = num1 + num2;
                System.out.println("Addition: " + add);
                break;
            case 2:
                subs = num1 - num2;
                System.out.println("Substraction: " + subs);
                break;
            case 3:
                mult = num1 * num2;
                System.out.println("Multiplication: " + mult);
                break;
            case 4:
                div = num1 / num2;
                System.out.println("Division: " + div);
                break;
            case 5:
                add = num1 + num2;
                subs = num1 - num2;
                mult = num1 * num2;
                div = num1 / num2;
                System.out.println("Addition: " + add);
                System.out.println("Substraction: " + subs);
                System.out.println("Multiplication: " + mult);
                System.out.println("Division: " + div);
                break;
            default:
                System.out.println("Incorrect option !!!");
                break;
        }
    }
}
        
        
        
    

