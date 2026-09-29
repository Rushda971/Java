import java.util.*;
    public class Datastructure{
        public static void main(String[] args){
            
            ArrayList<String> fruits = new ArrayList<String>();
            fruits.add("mango");
            fruits.add("apple");
            fruits.add("banana");
            fruits.add("pineapple");
            //add at a particular index
            fruits.add(0,"greenapple");
            //Change an Element
            //note:if an postion is not there,and you still try to set error:outbound
            fruits.set(3,"custardsapple");
            //Remove an Element
                //fruits.remove(3);
                //System.out.println(fruits);
            //access element
                //System.out.println(fruits.get(0));
                //System.out.println(fruits);
            //clear a list
            //fruits.clear();
            // System.out.println(fruits);
            //Array List--size()
            // System.out.println(fruits.size());
            //for loop
            /*for(int i=0;i<fruits.size();i++){
                System.out.println(fruits.get(i));
            }*/
           //for each loop
           for(String i :fruits){
            System.out.println(i);
           }


            



        }
    }