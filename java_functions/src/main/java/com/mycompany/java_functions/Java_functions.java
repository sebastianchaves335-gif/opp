/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_functions;

/**
 *
 * @author Nayarith Ruiz
 */
public class Java_functions {
    
    
    //funtions
    public static void hello(){
        System.out.println("Hello everyone. Welcome !!!");
    }
     
    public static void add1(){
         int num1, num2;
         num1= 10;
         num2= 20;
         System.out.println("addition whith f1 is: " + (num1 + num2) );
    }

    public static void add2 (int x, int y){
        System.out.println("addition whith f2 is: " + (x+y));
    }
    
    public static int add3 (int z, int w){
        return z + w;
    }
    
    
    
    public static void main(String[] args) {
        
        int n1, n2, data;
        
        n1= 50;
        n2= 20;
        
        int number1 = 1;
        int number2 = 2;
        
        //call hello funtion
        hello();
        // call add1 funtion
        add1();
        
        // call add2 funtion
        add2(n1, n2);
        
        // call add2 funtion
        data = add3(number1 , number2);
        System.out.println("addition with F3 is: " + data);
    }
}
