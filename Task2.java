import java.util.*;
class Task2Demo {
    private int guess;
    private int n;
    protected static int random_no;
    
    int count=0;
    int points=0;
    public void calMethod(int x){
        guess=x;
        Random obj=new Random();
        random_no=obj.nextInt(100);
        
               
        if(guess==random_no){
            System.out.println("guess matched...");
            count++;
            points=points+20;
            System.out.println("----------------------------------");
            System.out.println("\tTotal points = "+points);
            System.out.println("----------------------------------");
        }
        else{        
            System.out.println("match not found !!!!!!");
            if(random_no<guess){
                System.out.println("Guessed number is greater than computer generated number");
            }
            else{
                System.out.println("Guessed number is smaller than computer generated number");
            }
        }
        
    }
   
    
}
public class Task2 extends Task2Demo{
    public static void main(String args[]) {
        int g;
        Scanner sc= new Scanner(System.in);
        Task2Demo obj=new Task2Demo();
        System.out.println("***** WELCOME TO THE NUMBER GUESSING GAME *****");
        for(int i=1;i<=5;i++){
            System.out.print("Guess the number in between 1-100 : ");
            g=sc.nextInt();
            obj.calMethod(g);
        }
        System.out.println("Random no generated is : "+random_no);
        System.out.println("Keep playing and enjoy the game....");

    }
}