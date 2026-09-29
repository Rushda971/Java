//Employee salary Tracker
//Store employee salary in arraylist
//task:
import java.util.*;
public class Employeee{
ArrayList<Double> empsalary = new ArrayList<Double>(); 
Scanner tracker =new Scanner(System.in);

//add salary
void addSalary(){
    System.out.println("Enter salary to add: ");
    double salary=tracker.nextDouble();
    tracker.nextLine();
    empsalary.add(salary);
    System.out.println("Salary added Successfully" + salary);
}
//find highest salary
void highestSalary(){
    if(empsalary.isEmpty()) {
            System.out.println("No salaries added yet.");
            return;
        }

    double highest = empsalary.get(0);
    for(double i:empsalary){
        if (i>highest){
            highest=i;
            }
        }
        System.out.println("Highest Salary:" + highest);
}
//find average salary
void averageSalary(){
    double total=0;
    for(double salary:empsalary){
        total+=salary;
    }
    double avg=total/empsalary.size();
    System.out.println("Average Salary:" + avg);
}
public static void main(String[] args) {
Employeee obj = new Employeee();
int choice;
    do{
        System.out.println(
            "================= Salary Tracker======================= \n"+
            "1.Add Salary \n"+
            "2.Total Salary \n"+
            "3.Average Salary \n"+
            "4.Exit"
        );
        System.out.println("Enter your choice : ");
        choice = obj.tracker.nextInt();
        switch(choice){
            case 1:
                obj.addSalary();
                break;
            case 2:
                obj.highestSalary();
                break;
            case 3:
                obj.averageSalary();
                break;

            case 4:
                System.out.println("Exiting Program...");
                break;

        default:
            System.out.println("Invalid Choice");
        }
        
    }
    while(choice != 4);
    System.out.println("Exiting Program");
}
}