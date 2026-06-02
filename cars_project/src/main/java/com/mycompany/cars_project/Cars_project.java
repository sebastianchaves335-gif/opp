/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cars_project;
import java.util.Scanner;
/**
 *
 * @author Nayarith Ruiz
 */

public class Cars_project {
    
    public static void main (String[] args) {
        System.out.println("hello world");
        Scanner data = new Scanner (System.in);
    
     /*
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.print("First name: ");
        String firstname = sc.nextLine();

        System.out.print("Last name: ");
        String lastname = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.print("Phone number: ");
        String phone = sc.nextLine();

        System.out.print("Identification number: ");
        String ident = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Birth date (DD-MM-AAAA): ");
        String birthDate = sc.nextLine();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Nombre: " + firstname + " " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + phone);
        System.out.println("ID: " + ident);
        System.out.println("Edad: " + age);
        System.out.println("Fecha de nacimiento: " + birthDate);
        */
     /*
            int age, i=0;
            age=0;
            i=1;
            while (i<10) {
                  System.out.println(i);
                 i+=1;
           }*/
       /*
           int k=1;
           boolean status=true;
           status=true;
           while(status){
               System.out.println(k);
               k+=1;
            if(k>10)
            break;
           }
     */
       
       
       
       String first_name,last_name,email,password,phone_number,ident_number,birth_date,res;
       int age,i=0;
       boolean status;
       boolean status_res;
       status=true;
       status_res=true;
        while(status){
           System.out.println("FirstName: ");
           first_name=data.nextLine();
           System.out.println("LastName: ");
           last_name=data.nextLine();
           System.out.println("email: ");
           email=data.nextLine();
           System.out.println("password: ");
           password=data.nextLine();
           System.out.println("phone_number: ");
           phone_number=data.nextLine();
           System.out.println("ident_number: ");
           ident_number=data.nextLine();
           System.out.println("birth_date: ");
           birth_date=data.nextLine();
           
           
           i+=1;
            System.out.println("/nTotal users:" +1);
            
           status_res = true;
           while(status_res){
                System.out.println("do you want to register other user(Y/y/N/n): ");
                res=data.nextLine();
                
                //validate if res is not Y,y,N,n
                if(!res.equals("Y") && !res.equals("y") && !res.equals("N") && !res.equals("n")) {
                    System.out.println("Invalid option. Try again !!!");
                }else{
                    if(res.equals("N") || res.equals("n")){
                        status_res=false;
                        status=false;
                        //break;
                    }else{
                        status_res=false;
        
     
                      }
                 }     
             }
        }
    }
}

        
    
    
    

