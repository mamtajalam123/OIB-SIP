package com.project;
import java.util.Random;
import java.util.Scanner;

class Game
{
    int computer;
    public Game()
    {
        Random rand = new Random();
        computer = rand.nextInt( 100);
        System.out.println("Guess the number from 1 to 100");
    }
    public int computerNo()
    {return computer;}

}
public class numberguess
{
    static int TakeUserInput()
    {
        int user;
        System.out.println("Enter ");
        Scanner sc =new Scanner(System.in);
        user = sc.nextInt();
        return user ;
    }
    static void IsCorrectNumber(int i,int j)
    {
        if(i==j){
            System.out.println("Correct number guess");
        }
        else if (i>j)
        {
            System.out.println("Your no.is bigger than computer no");
        }
        else{
            System.out.println("Your no. is smaller than computer no");
        }

    }

    public static void main(String[] args)
    {
        int user=0, computer=0,itteration=0;
        Game sd= new Game();
        do{
            user= TakeUserInput();
            computer = sd.computerNo();
            IsCorrectNumber(user,computer);
            itteration ++;
        }while(user!=computer);
        System.out.println("You guess no In"+itteration+"ITERATIONS");
    }
}