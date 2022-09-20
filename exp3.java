/*WAP to generate user defined exception using “throw” and “throws” keyword. */

class Uexcep extends Exception{
    public Uexcep(String s){
        super(s);
    }
}
public class exp3 {
    public static void main(String[] args) throws Uexcep {
        try{
            throw new Uexcep("My exception!!!"); 
        }
        catch(Uexcep e){
            System.out.println(e.getMessage());
        }
    }
}
