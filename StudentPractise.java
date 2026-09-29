/*1️⃣ Student Class

Create a Student class with:

private String name
private int age
private double marks

Requirements:

Age cannot be negative
Marks must be between 0–100
Create getters and setters with validation*/


class StudentPractise{
    private String name;
    private int age;
    private double marks;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //constructor
    public StudentPractise(){
        this.name=name;
        this.age=age;
        this.marks=marks;

    }



}
    
