import java.util.*;
public class class1 {
    public static Scanner scn = new Scanner(System.in);
    // public static void printz(){
    // System.out.println("* * * * *");
    // System.out.println("     * ");
    // System.out.println("   * ");
    // System.out.println(" * ");
    // System.out.println("* * * * *");
    // }
    public static void myfirstprogram(){
        System.out.println("hello ");
        System.out.println("my name is abhay kumar");
    }
    public static void printoddeven(int n){
        if(n%2 == 0)
        System.out.println("even");
        else 
        System.out.println("odd");

    }
    public static void checkprime(int n){
        int count =0;
        for(int i =1; i<n; i++){
            if(n%i ==0)
            count++;
        }
        if(count>1){
            System.out.println("not prime");
        }
        else
            System.out.println(" prime");
        
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        checkprime(n);

        // myfirstprogram();
    }
    
    // public static void 
}
