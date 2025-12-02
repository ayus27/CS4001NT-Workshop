import java.util.Scanner;
public class Oddoreven{
    public static void main (String[]args){
        Scanner oddeven = new Scanner(System.in); // asking for integer
        System.out.println("-----Enter Integer-----");
        int check = oddeven.nextInt();
        
        if(check%2==0){ //condition for odd or even
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
