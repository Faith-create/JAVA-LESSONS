import java.util.Scanner;
public class Meanscore {
public static void main(String[] args) {
    int i;
    for(i=1;i<=40;i++){
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER name,mathematics,english,kiswahili,biology,chemistry,cre,history,physics");
    String name=input.nextLine();
    double mathematics=input.nextDouble();
    double english=input.nextDouble();
    double kiswahili=input.nextDouble();
    double biology=input.nextDouble();
    double chemistry=input.nextDouble();
    double cre=input.nextDouble();
    double history =input.nextDouble();
    double physics=input.nextDouble();

    System.out.println("Name:"+ name);
    System.out.println("Mathemaics:"+ mathematics);
    System.out.println("English:"+ english);
    System.out.println("Kiswahili"+ kiswahili);
    System.out.println("Biology:"+ biology);
    System.out.println("Chemistry:"+ chemistry);
    System.out.println("CRE:"+cre);
    System.out.println("History:"+ history);
    System.out.println("Physics:"+ physics);
    double marks= mathematics+english+kiswahili+biology+chemistry+cre+history+physics;
    double mean=marks/8;
    System.out.println("The mean is:"+mean);

    if(mean>=80){
    System.out.println("Grade A");
    }
     else if (mean>=70) {
     System.out.println("Grade B");   
    }
    else if (mean>=60) {
      System.out.println("Grdae C");  
    }
    else if (mean>=50) {
        System.out.println("Grdae D");    
    }
    else if (mean>=40) {
        System.out.println("Grdae E");    
    }
    else{
System.out.println("Fail");
    }
}
   
}
    
}
