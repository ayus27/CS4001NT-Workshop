import java.util.Scanner;
public class gradetogpa{
    public static void main (String[]args){
        Scanner gd = new Scanner(System.in);
        System.out.println ("Enter your GPA");
        double gpa = gd.nextDouble();
        
        if(gpa>4 || gpa<0.5){
            System.out.println("Invalid GPA");
        }
        
        if (gpa>3.6){
            System.out.println("A");
        }
        if(gpa>3.2 && gpa<3.6){
            System.out.println("B");
        }
        if(gpa>2.7 && gpa<3.2){
            System.out.println("C");
        }
        if(gpa>2.0 && gpa<2.7){
            System.out.println("D");
        }
        
        
        
    }
}