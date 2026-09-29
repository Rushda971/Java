
class This {

    public static void main(String[] args) {
        //this is used to refer current object in a class,constructor parameter 
        // "current"-value updation 
        //this -java should know which var to update thats why current
        //this is used to solve ambiguity

        /*Why Java can’t guess automatically
            Because:
            Methods belong to the class
            Objects are created at runtime
            One method = many objects
            So Java needs a runtime reference → that’s this.*/

        /*One-line killer explanation (great for exams/interviews)
            this refers to the current object because the same method is shared by multiple objects, 
            and Java needs a way to know which object is invoking the method at runtime  */

            /*this cannot be used in a static context because static members belong to the class,
             and this refers to the current object, which does not exist in a static context.*/

             //static -Is loaded before any object is created

             //So Java asks:
             //“Current object? Which one? There isn’t any.
             
             //explain why main() is static

//abstract
//transient
//volatile

//The get method returns the variable value, and the set method sets the value.

// get or set, followed by the name of the variable, with the first letter in upper case:

    }
}
