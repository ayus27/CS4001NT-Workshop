import java.util.Scanner;
public class scholarshipcheck{
    public static void main (String[]args){
        Scanner gd = new Scanner(System.in); //creating scanner
        
        System.out.println("Enter your GPA: ");
        double gpa = gd.nextDouble();
 
        if (gpa < 0.1 || gpa > 4.0 ){ //using ifelse to check valid gpa
            System.out.println("Invalid GPA, Please input between 0.1 to 4.0");
        }
        
        System.out.println("Enter your Attendance (%): "); // asking for 2nd criteria
        double attendance = gd.nextDouble();
        
        if (attendance < 1 || attendance > 100 ){ // creating condition
            System.out.println("Invalid Attendance %");
        }
        
        
        
        System.out.println("Enter your Attitude Score (1-10): ");
        int as = gd.nextInt();
        if (as < 1 || as > 10 ){ 
            System.out.println("Invalid Attitude Score");
        }
        
        if (gpa >= 3.2){ //making a nested if condition to validate the criteria.
         if (attendance > 80){
                if (as > 5){
                    System.out.println("You're Eligible for Scholarship");
                }
                else{
                    System.out.println("No scholarship");
                }
            }
            else{
            
                System.out.println("No scholarship");
            
            }
        }
        else{
            System.out.println("You're not eligible for Scholarhship");
        }

    }
}
