/*WAP to show the try - catch block to catch the different types of exception. */

public class TryCatch {  
  
    public static void main(String[] args) {  
        try  
        {  
        int value=5/0;   
        System.out.println(value);
        }  
             
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        } 
        System.out.println("exit");  
    }  
                       
}  