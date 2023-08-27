import java.util.Random;
import java.util.Scanner;

public class findNumber{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name");
       String name= scan.nextLine();
       System.out.println(" hello "+name);

       System.out.println("you want start game");
       System.out.println("/t 1.yes");
       System.out.println("/t 2.no");
       int number= scan.nextInt();
       if(number==1){
              System.out.println("Game start now!!!");
Random num1= new Random();
       int x= num1.nextInt(10)+1; 
       System.out.println("Enter your number");
       int num2= scan.nextInt();
    int time=0;
    while(time<5){
        time++;
if(x==num2){
    System.out.println("congrats you won");
time=5;
}
else if(x>num2){
    System.out.println(" you enter low number");
    num2=scan.nextInt();
}
else if(x<num2){
    System.out.println(" you enter high number");
    num2=scan.nextInt();
}
    }
if(time==5 && x!=num2){
    System.out.println("lost!!!"+ x);
}
       }
       
       
       else if(number==2){
        System.out.println(" Good bye!!!");
        
       }
       
    
    }
}
