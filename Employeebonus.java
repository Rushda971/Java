class Employee{
    String empName="Riya";
    double empSalary=10000;
    int empExp=2;
}

class Calculatebonus{
    static double bonus(double empSalary,int empExp){
        if (empExp<5){
            return 0.20*empSalary;
        }
        else if(empExp<=3){
            return 0.10*empSalary;
        }
        else if(empExp!=0){
            return 0.05*empSalary;
            }
            return 0;
        }
    }


class Employeebonus{
    public static void main(String[] args){
        Employee emp=new Employee();
    double empBonus=Calculatebonus.bonus(emp.empExp,emp.empSalary);
    System.out.println("Employee Bonus:"+empBonus);
    }
}