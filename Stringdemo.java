class Stringdemo{
    public static void main(String[]args){
        //String Creation
        String alpha="letters";
        //length
        String a="words";
        String b="GRAMMER";
        System.out.println("Length of String:"+a.length());
        //toUpperCase
        System.out.println("Upper case:"+a.toUpperCase());
        //toLowerCase
        System.out.println("Lower case"+b.toLowerCase());
        //position/indexing
        //yeh position batata hai
        System.out.println("Indexing:"+b.indexOf("R"));
        String lines ="Currently .I m doing Java";
        System.out.println("Indexing:"+lines.indexOf("Java"));
        //yeh particular position per kiya hai woh batata hai:charAt()
        System.out.println("Position:"+lines.charAt(5));

        //Concatenation
        String name="Riya";
        String surname="Sharma";
        System.out.println("Name of Student:"+name+""+surname);
        System.out.println("Concatenation:"+name.concat(surname));
        //equals()
        System.out.println("Compare:"+a.equals(b));
        //substring()=>yeh string ke ander ke particular value deta hai
        System.out.println("Substring:"+lines.substring(12));
        //split()
        System.out.println("Replace:"+b.replace("GRAMMER","grammer"));
        // replace()
        //System.out.println("Splitting:"+)
        //Conversion Methods
                //valueOf(anyType) → converts to String       
        /*  
            
           
           
            
            
            Checking Empty or Blank
                isEmpty() → checks length == 0    
            Splitting & Joining
                split(String regex)            
        */




    }
}