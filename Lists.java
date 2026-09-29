import java.util.*;
public class Lists{
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        ArrayList<String> phoneno = new ArrayList<>();
        int choice;
        do{
            System.out.println(
            "1.Add Contact \n"+
            "2.Search name \n"+
            "3.Delete name \n"+
            "4.Show All Name \n"+
            "5.Exit");

            System.out.println("Enter your choice: ");
            choice=name.nextInt();
            name.nextLine();
            if(choice==1){
                System.out.println("Enter Name to Search :");

                String contact = name.nextLine();
                System.out.println("Contactname:"+contact);
                phoneno.add(contact);
                System.out.println(phoneno);
            }
            else if(choice==2){
                System.out.println("Enter Name to Search:");
                String contact = name.nextLine();

                if (phoneno.contains(contact)) {
                System.out.println(contact + " Found ");}      
                else {
                System.out.println(contact + " Not Found ");}
                 }
            else if(choice==3){
                System.out.println("Enter Name to Remove:");
                String contact = name.nextLine();
                phoneno.remove(contact);
                }
            
            else if (choice==4){
                Collections.sort(phoneno);
                System.out.println(phoneno);
            }
            
            
        }
        while(choice!=5);
            System.out.println("Program Ended");
            name.close();
        }
    }