import java.util.Scanner;
public class positiveornegative{
    public static void main (String[]args){
        Scanner pn = new Scanner(System.in); // asking for integer
        System.out.println("-----Enter Integer-----");
        int check = pn.nextInt();
        
        if(check > 0){ // condition for postitive
            System.out.println("postive integer");
        }
        else if (check<0){ // negative
            System.out.println("negative integer");            
        }
        else{ // zero
            System.out.println("Zero");
        }
    }
}