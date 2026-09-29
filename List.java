//List
import java.util.*;
public class List{
    public static void main(String[] args) {

        while (true){
            System.out.println(
            "1.Add Contact \n"+
            "2.Search name \n"+
            "3.Delete name \n"+
            "4.Show All Name \n"+
            "5.Exit"
             );
           int choice= System.out.println("Enter your choice:");
           int contact = sc.nextInt();
        sc.nextLine();

        ArrayList<String> phoneno =new ArrayList<String>();
        //add contact name
         if (choice==1){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Name to Search :");

        String contact = name.nextLine();
        System.out.println("Contactname:"+contact);

        phoneno.add(contact);
        System.out.println(phoneno);
         }
       else if(choice ==2){
        //Search name
         if (phoneno.contains(contact)) {
            System.out.println(contact + " Found ");
        } else {
            System.out.println(contact + " Not Found ");
        }
        }
        
        else if(choice ==3){
        //delect contact
        phoneno.remove(contact);
        }
        else if(choice==4){
        //Search Contact
        Collections.sort(phoneno);
        System.out.println(phoneno);
        name.close();
        }
        else{
            break();
        }
        }
    }
}