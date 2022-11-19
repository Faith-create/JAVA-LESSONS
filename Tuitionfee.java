import java.util.Scanner;
public class Tuitionfee {
 public static void main(String arg[]){
 int students = 0;
while(students<100){
Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the number of hours");
    double hours= myObj.nextDouble();
    double totalfees=0;
     if (hours<=15) {
    totalfees = hours*500;
     }
    else{
        totalfees = hours*445;
    }
    System.out.println(" Total fee ="+totalfees);

    students++;

}   
     
}
}

