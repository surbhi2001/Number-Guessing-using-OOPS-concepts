package com.Java;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    Game(){
        Random rd = new Random();
        this.number = rd.nextInt(100);
    }
    void takeUserinput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.println("Yes you guessed it right, it was " + number + "\nYou Guessed it in " + noOfGuesses + " attemps");
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Number is Too Small.....");
        }
        else if(inputNumber > number){
            System.out.println("Number is Too Large.....");
        }
        return false;
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}
public class Number_Guessing_withOOPS {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserinput();
            b = g.isCorrectNumber();
        }


    }
}
