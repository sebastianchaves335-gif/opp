/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Nayarith Ruiz
 */
public class RollDices {
    
    public static int rollDices(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        int Lives=5, dice1, dice2; 
        int totalPares=0;
        int totalImpares=0;
        int totalIguales=0;
        int consecutivosIguales=0;
        int contadorLanzamientos=0;
        
        String player_name, key;
        
        System.out.println("::: WELCOME TO ROLL DICES :::");
        System.out.println("Your player name: ");
        
        player_name = data.nextLine();
        
        System.out.println("press any key to start the game !!!");
        data.nextLine();
        
        while (true){
           
            System.out.println("press enter to roll the dices ");
            data.nextLine();
        
            contadorLanzamientos++;
            
            dice1 = rollDices();
            dice2 = rollDices();
            
            int suma = dice1 +dice2;
            
            System.out.println("Launches # " + contadorLanzamientos);
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            
            //dados iguales
            if (dice1 == dice2){
                totalIguales++;
                consecutivosIguales++;
                
                if (consecutivosIguales == 3){
                    System.out.println("..:: you win ::..");
                    break;
                }
            }else{
               consecutivosIguales = 0; 
            }
            
            if (dice1 ==  6 && dice2 == 6){
                Lives++;
                System.out.println("..Double six + one life..");
            }
            
            if (suma % 2 == 0){
                totalPares++;
                System.out.println(".even sum. ");
            }else{
               totalImpares++;
               Lives--;
                System.out.println("Odd sum - one life");
            }
            
            System.out.println("LIVES:" + Lives);
            
            if(Lives <= 0){
                System.out.println("::.GAME OVER.::");
                break;
            }
        }
        
        System.out.println("::. FINAL REPORT .::");
        System.out.println("player name: " + player_name);
        System.out.println("player lives: " + Lives);
        System.out.println("Total launches: " + contadorLanzamientos);
        System.out.println("Even sums: " + totalPares);
        System.out.println("Odd sums: " + totalImpares);
        System.out.println("Equals dice: " + totalIguales);
        
    }
}
