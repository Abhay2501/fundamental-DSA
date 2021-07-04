import java.util.*;
public class Rev1 {
    public static Scanner scn = new Scanner(System.in);
    public static void printmsg(){
        System.out.println("hello");
        System.out.println("freind");
    
    System.out.println("how");
    }
    public static void printOddEven(int n){
        if(n% 2 == 0)
            System.out.println("even");
            
      else  
            System.out.println("odd");
            
        }
        public static boolean isEvennumber(int n){
            if(n%2 == 0)
            return true;
            else 
            return false;
        }
        public static int isevenno(int n){
            if(n% 2==0)
            return 1;
            else 
            return 0;
        }
        public static void Isprimeno(){
                int n = scn.nextInt(); 
                int count = 0;
                for(int div = 2; div*div <= n; div++){
                    if(n% div == 0){
                        count++ ;
    
                    }
                }
                if (count == 0){
                    System.out.println("prime");
                }
                
                else {
                    System.out.println("not prime");
                }
    
            }
            public static void PrintTable(int n){
                
                for( int i = 1; i<= 10; i++){
                  int multiply = n*i;
                  System.out.println(n + "*" + i + " = " + multiply);
                }
            }
            public static void PrintTableInRange(int a, int b){
                for(int i= a; i<=b; i++){
                   PrintTable(i);
                  System.out.println();
                }
            }
            public static boolean isprime(int n){
                for(int i = 2; i*i <= n; i++){
                    if(n % i == 0)
                    return false;
                
                }
                return true;
    
    
                }
                public static void printPrimenumberinrange(int a , int b){
                    for(int i = a; i<=b ; i++){
                        if(isprime(i)){
                            System.out.println(i);
                        }
                    }
                }
    
    public static boolean isEvenno(int n){
        if(n%2 == 0)
        return true;
    else

    return false;}

    
  
     public static int countdigits(int n){
         int len = 0;
         while(n != 0){
             n /= 10;
             len++;
             
         }
         return len;
     }
     public static int powerequaldigits(int n){
         n /= 10;
         int p = 1;
         while (n != 0 ){
             p *= 10;
             n /= 10;
         } return p;
         

     }
     public static void digitsofanum(int n){
         int p =  powerequaldigits(n);
         while (p != 0){
             int q = n /p;
             n %= p;
             p /= 10;
             System.out.println(q);
         }
     }
     public static int rotateanum(int n, int r){
     int digit = countdigits( n);
     r %= digit;
     if(r <0){
     r += digit;}
     int mul = 1;
     int div = 1;
     for(int i = 1; i <= digit; i++){
         if(i<= r)
         div *= 10;
         else 
         mul *= 10;
     }
     int a = n % div;
     int b = n /div;
     return(a*mul + b);
     } public static void allprime(int a, int b) {
        
    
        for(int i = a; i <= b; i++)
        {
            int count = 0;
            for(int div = 2; div*div<i; div++ )
            {
                if(i % div == 0)
                {
                    count++;
                    break;
                }
            }
        
            if(count == 0)
            {
            
         System.out.println(i);
     
        } 
      }
    }
     
    public static void fibbonicseries(int n){
        
            int a = 0;
            int b = 1;
           for(int i = 0; i<n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    } 
    public static void inverseofanum(int n){
    int inv = 0;
    int op = 1;
    while(n != 0){
        int od = n % 10;
        int id = op;
        int ip = od;
        inv = inv +id * (int)Math.pow(10, ip - 1);
        n = n / 10;
        op++;
    }
System.out.println(inv);

        }


       

  
  public static void main(String[] args){
      int n = scn.nextInt();
      
       inverseofanum( n);
   
  

 }
}
    

