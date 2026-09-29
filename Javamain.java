import java.util.Scanner;
class Javamain{
    public static void main(String[] args){
        //Arithmetic operator 
        int a ,b;
        a=5;
        b=3;
        int add=a+b;
        int sub=a-b;
        int div=a/b;
        int rem=a%b;
       
        
        
        System.out.println("add:"+add +"\n"+"sub:"+sub+ "\n"+"div:"+div+ "\n"+"rem:"+rem);

        Scanner cal=new Scanner(System.in);
        System.out.print("Enter a number to calculate :");
        int num=cal.nextInt();
        System.out.println("Number is"+num);
        
    }
}