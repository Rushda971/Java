/*
Employee Salary
Create a class Employee with:
Variable :empid ,name,BasicSalary
HRA=20% of basic
DA=10% of basic
Return total Salary
 */

//Employee Salary

class Employee{
    int empId=1392;
    String empName="Riya Sharma";
    double empSalary=200000;
}
//HRA and DA
class SalaryIncre{
    static double totalSalary(double empSalary){ 
double hra=0.20 * empSalary;
double da=0.10* empSalary;
return empSalary+hra+da;
}
}
class EmployeeMain{
public static void main(String[] args){
    //object:class name varible=new class name
    //sop varible.class variable
Employee emp = new Employee();

System.out.println("Employee Details:"+emp.empId);
System.out.println("Employee Details:"+emp.empName);
System.out.println("Employee Details:"+emp.empSalary);

//total Salary
double total = SalaryIncre.totalSalary(emp.empSalary);


System.out.println("Employee Details After HRA and DA:"+total);
}
}