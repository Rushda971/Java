//Interger data type-hardware efficency and network communication

/* byte	8 bits	–128 to 127
short	16 bits	–32,768 to 32,767
int	    32 bits	–2,147,483,648 to 2,147,483,647
long	64 bits	Very large

A byte uses 1 byte
A short uses 2 bytes
An int uses 4 bytes
A long uses 8 bytes */

//byte
//short
//int
//long

class Intdemo {
public static void main(String [] args){
byte num=123;
short num1=12309;
System.out.println("num:"+num+"\n"+"num1:"+num1);
long num2=1676666669;
int num3=879864528;
System.out.println("num2:"+num2+"\n"+"num3"+num3);

//Character 
//Basic question
char value='Q';
char alpha=97;
System.out.println("value:"+value+"\n"+"alpha:"+alpha);
//var-detects automatically
var val=67;
System.out.println("val:"+val);
//widing type casting(Automatically)

//narrowing type casting(narrow)
/* Level 1: Basics
Q1
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.print(i + " ");
}


Question: What is the output?

Q2
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.print(i + " ");
}


Question: What is the output?

🟡 Level 2: Inside loops
Q3
int i = 1;
while (i <= 5) {
    if (i == 4) {
        break;
    }
    System.out.print(i + " ");
    i++;
}


Question: What is printed? Why?

Q4
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.print(i + " ");
}


Question: What is the output?

🟠 Level 3: Nested loops
Q5
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break;
        }
        System.out.print(i + "" + j + " ");
    }
}


Question: What is printed?

Q6
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            continue;
        }
        System.out.print(i + "" + j + " ");
    }
}


Question: How does this differ from Q5?

🔴 Level 4: Tricky / Interview-style
Q7
for (int i = 1; i <= 5; i++) {
    if (i == 3)
        continue;
    System.out.print(i + " ");
}


Question: Why is output different from using break?

Q8
int i = 0;
while (i < 5) {
    i++;
    if (i == 3) {
        continue;
    }
    System.out.print(i + " ");
}


Question: What is the output? Why is i++ placed before continue?

Q9 (Very Important)
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == j) {
            break;
        }
        System.out.print(i + "" + j + " ");
    }
}


Question: Explain the flow for i = 2. */

}
}