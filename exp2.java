import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {  
        try  
        { 
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int value=5/b;   
        System.out.println(value);
        int[] a={1,2,3};
        int i=sc.nextInt();
        System.out.println(a[i]); 
        }          
        catch(ArithmeticException e)  
        {  
         System.out.println(e);  
        } 
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        finally{
        System.out.println("finally block!!!");  
        }
    }  
                       
}  

