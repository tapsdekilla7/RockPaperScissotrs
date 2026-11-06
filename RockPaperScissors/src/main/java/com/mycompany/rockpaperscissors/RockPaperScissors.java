/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rockpaperscissors;
import java.util.*;
/**
 *
 * @author tapsd
 */
public class RockPaperScissors {

    public static void main(String[] args) {
    String[] Shape = {"Rock","Paper","Scissors"};
    
    Random chance = new Random();
    Scanner input = new Scanner(System.in);
    
    
   // int points = 0;
   int comNum = chance.nextInt(3);
   String comChoice = Shape[comNum];
   
   System.out.println("Pick your object");
   System.out.println("1)Rock ");
   System.out.println("2)Paper ");
   System.out.println("3)Scissors ");
   System.out.print("Enter Choice: ");
   
   int num = input.nextInt();
   String Choice = "";
   
  switch (num){
      case 1:
     Choice = "Rock";
     break;
     
      case 2:
     Choice = "Paper";
     break;  
     
     case 3:
     Choice = "Scissors";
     break;
     
     default:
     System.out.println("Invalid number");
  }
  
  System.out.println("Your opponent picks: " + comChoice);
  System.out.println("Lets see who wins :) ");
  System.out.println(""); 

if (Choice == "Rock"){
    if (comChoice == "Rock"){
  System.out.println("Draw");  
 }
    if (comChoice == "Paper"){
   System.out.println("You lose, opponent wins");  
 }
    if (comChoice == "Scissors"){
   System.out.println("You win, opponent lost");  
 }
}

if (Choice == "Paper"){
    if (comChoice == "Rock"){
  System.out.println("You win, opponent lost");   
 }
    if (comChoice == "Paper"){
  System.out.println("Draw");   
 }
    if (comChoice == "Scissors"){
  System.out.println("You lose, opponent wins");    
 }
}

if (Choice == "Scissors"){
    if (comChoice == "Rock"){
  System.out.println("You lose, opponent wins");   
 }
    if (comChoice == "Paper"){
   System.out.println("You win, opponent lost");  
 }
    if (comChoice == "Scissors"){
   System.out.println("Draw");  
 }
}

  
    }
}



