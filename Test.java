//Test

/* Student Report Card System*/
import java.util.Scanner;
import jdk.jfr.Percentage;


class StudentGradeCard{
/*
if (percentage>=90){
System.out.println("Score:+A Grade");
}
else if (90<percentage>=80){
System.out.println("Score:A Grade");
}
else if (80<percentage>=70){
System.out.println("Score:B Grade");
}
else if (60<percentage>=50){
System.out.println("Score:Pass Grade");
}
else{
    System.out.println("Score:Fail");
}
*/


}
    

public static void main(String[] args){

Scanner Result =new Scanner(System.in);
System.out.println("Enter Student Name: ");
String studentname=Result.nextLine();

System.out.println("Enter English Score:");
int english = Result.nextInt();

System.out.println("Enter Maths Score:");
int Maths = Result.nextInt();

System.out.println("Enter SocialStudies Score:");
int Socialstudies = Result.nextInt();

System.out.println("Enter Hindi Score:");
int hindi = Result.nextInt();

System.out.println("Enter Science Score:");
int science = Result.nextInt();

int Marks=english+Maths+Socialstudies+hindi+science;
int Average=Marks/500;
float percentage=Average*100;
System.out.println("Student Total Marks:"+Marks);
System.out.println("Percentage:"+percentage);




}
