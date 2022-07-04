// Create a custom exception that do not have any stack trace 
import java.util.Scanner;

public class Main {
    static void CheckName(String str) throws invalidNameException{
        if(str.isEmpty()){
            throw new invalidNameException("name cannot be empty");
        }
        else 
            System.out.println("hi "+str);
    }
    public static void main(String[] args) {
        System.out.print("\nCompile by Shubham Singh Rawat");
        Scanner scanner=null;
        try{
            scanner = new Scanner(System.in);
            System.out.print("\nEnter name : ");
            String res = scanner.nextLine();
            CheckName(res);
        }
        catch(invalidNameException e){
                System.out.println("Caugth the exception: "+e);
        }   
        finally{
            if(scanner!=null)
                scanner.close();
        }
    }
}
class invalidNameException extends Exception{
    invalidNameException(String s){
        super(s);
    }
}
