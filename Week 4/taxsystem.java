import java.util.Scanner;
public class taxsystem{
    public static void main(String[]args){
        Scanner tx = new Scanner(System.in);
        System.out.print("Yearly taxable income: ");
        int income = tx.nextInt();
        
        if(income < 0){
            System.out.print("Invalid income");
        }
         int remainingincome = income;
         double totaltax;
         totaltax=0;
         
         if(remainingincome > 5000000){
             int taxableincome = remainingincome - 5000000;
             double tax = taxableincome * 0.39;
             totaltax = totaltax + tax;
             remainingincome = 5000000;
         }
        if (remainingincome > 2000000){
            int taxableincome = remainingincome - 2000000;
            double tax = taxableincome * 0.36;
            totaltax += tax;
            remainingincome = 2000000;
        }
        if (remainingincome > 1000000){
            int taxableincome = remainingincome - 1000000;
            double tax = taxableincome * 0.3;
            totaltax += tax;
            remainingincome = 1000000;
        }
        if (remainingincome > 700000){
            int taxableincome = remainingincome - 700000;
            double tax = taxableincome * 0.2;
            totaltax += tax;
            remainingincome = 700000;
        }
        if (remainingincome > 500000){
            int taxableincome = remainingincome - 500000;
            double tax = taxableincome * 0.1;
            totaltax += tax;
            remainingincome = 500000;
        }
        if (remainingincome > 0){
            int taxableincome = remainingincome - 0;
            double tax = taxableincome * 0.01;
            totaltax += tax;
        }
        System.out.println("Total tax: NPR " + totaltax);
    }
}