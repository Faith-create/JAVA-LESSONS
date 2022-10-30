import java.util.Scanner;
public class Debtratio {
  public static void main(String arg[]) {
    System.out.println("INCOME DEBT RATIO CALCULATOR");
    int i;
    for(i=1;i<=40;i++);
try (Scanner myObj = new Scanner(System.in)) {
System.out.println("ENTER Name,house debt,car debt,credit card debt,monthly salary");
String name = myObj.nextLine();
double housedebt = myObj.nextDouble();
double cardebt= myObj.nextDouble();
double creditcarddebt = myObj.nextDouble();
double monthlysalary = myObj.nextDouble();

System.out.println("Name:"+ name);
System.out.println("Mortgage debt:"+ housedebt);
System.out.println("Automobile debt:"+ cardebt);
System.out.println("Credit Card Debt:"+creditcarddebt );
System.out.println("Monthly Income:"+monthlysalary);

double debt = housedebt + cardebt + creditcarddebt;
System.out.println("Total Debt is:"+ debt);
double ratio = monthlysalary/debt;
System.out.println("The ratio is:" + ratio);
}
 }   
}
