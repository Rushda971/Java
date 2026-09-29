/*Create a class called Student

Requirements:
Private variable:
name (String)
age (int)

Create:
Getter and setter for both variables
In main():

Create a Student object
Set name to "Rahul"
Set age to 20

Print both values*/

class Studentcap{
    private String name;
    private int age;
    public String getName(){
        return name;
    }

      public void setName(String name){
        this.name=name;
    }


    public int getAge(){
        return age;
    }

  
     public void setAge(int age){
        this.age=age;
    }
}

class Main{
    public static void main(String[] args){
        Studentcap student=new Studentcap();
        student.setName("Rahul");
        student.setAge(19);
        System.out.println("Name:"+student.getName());
        System.out.println("Age:"+student.getAge());

    }
}