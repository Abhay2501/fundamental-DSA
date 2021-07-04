

import java.util.*; 
public class pattern1 {
    public static Scanner scn = new Scanner(System.in);
    
    
    
    public static void printtriangle(int n){
        int nst = 1;
        for(int row = 1; row<= n; row++){
            for(int cst = 1; cst<= nst; cst++) System.out.print("*\t");
            nst++;
            System.out.println();
        }
    }
public static void printinvtriangle(int n){
    int nst = n;
    for(int row = 1; row<= n; row++){
        for(int cst = 1; cst<= nst; cst++) System.out.print("*\t");
        nst--;
        System.out.println();
        
    }
    
}

    public static void halfdiamond(int n){
        int nst = 1;
        int nsc = n/2;
        for (int row = 1; row <= n/2; row++){
             for(int csc = 1; csc<= nsc; csc++) System.out.print("\t");
            for(int cst = 1; cst<= nst; cst++) System.out.print("*\t");
            
            nsc--;
            nst+=2;
            System.out.println();
            
        }    }
        public static void diamond(int n){
            int nst = 1;
            int nsc = n/2;
            for (int row = 1; row <= n; row++){
                 for(int csc = 1; csc<= nsc; csc++) System.out.print("\t");
                for(int cst = 1; cst<= nst; cst++) System.out.print("*\t");
                if(row<=n/2){
                nsc--;
                nst+=2;}
                    else{
                    nsc++;
                    nst-=2;
                
            }
                System.out.println();
                
            }    }
        public static void star(int n){
            int nst = 1;
            int nsc = n-1;
            for (int row = 1; row <= n; row++){
                 for(int csc = 1; csc<= nsc; csc++) System.out.print("\t");
                for(int cst = 1; cst<= nst; cst++) System.out.print("*\t");
                
                nsc--;
                nst ++;
                System.out.println();
                
            }    }
             public static void invstar(int n){
                 int nst1 = n/2;
                 int nsc = 1;
                 int nst2 = n/2;
                 for(int row = 1; row <= n; row ++){
                for (int cst1 = 1; cst1 <= nst1; cst1++)System.out.print("*\t");
                for (int csc = 1; csc <= nsc; csc++)System.out.print("\t");
                for (int cst2 = 1; cst2 <= nst2; cst2++)System.out.print("*\t");
                if(row<=n/2){
                nst1--;
                nsc+=2;
                nst2--;}
                else{
                    nst1++;
                    nsc-=2;
                    nst2++;
                }
                System.out.println();
                 }
             }
             public static void backwardslash(int n){
                for(int i = 1; i<= n; i++){
                    for(int j =1; j<= i; j++)
                    if (i == j){
                        System.out.print("*\t");
                   
                   }
                   else{
                       System.out.print("\t");
                   }
                   System.out.println();
                }
            }
            public static void forwardslash(int n){
                for(int i = 1; i<= n; i++){
                    for(int j = 1; j<= n; j++)
                    if (i+j == n+1){
                        System.out.print("*\t");
                   
                   }
                   else{
                       System.out.print("\t");
                   }
                   System.out.println();
                }
            }
            public static void cross(int n){
                for(int i = 1; i<= n; i++){
                    for(int j = 1; j<= n; j++)
                    if (    i==j||i+j == n+1){
                        System.out.print("*\t");
                   
                   }
                   else{
                       System.out.print("\t");
                   }
                   System.out.println();
                }
            }
           
                   
                   
            public static void numtriangle(int n){
                int nst = 1;
                int num = 1;
                for(int row = 1; row<= n; row++){
                    
                    
                    for(int cst = 1; cst<= nst; cst++) {
                        
                    
                    System.out.print( num+"\t");
                if(cst<=nst)
                
                
                    num++;
                }
            
                    nst++;
                    
                    
                    System.out.println();
   }   }
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

public static void linediamondp10(int n){
    int nspo=n/2;
    int nspi = -1;

    for(int row = 1; row<= n; row++){
        for(int cspo = 1; cspo<= nspo; cspo++)
        System.out.print("\t");
        System.out.print("*\t");
        for(int cspi = 1; cspi<= nspi; cspi++)
          System.out.print("\t");
            if(nspi != -1)
            System.out.print("*\t");
            if(row<= n/2){
                nspo--;
                nspi+=2;}
                else {
                    nspo++;
                    nspi -=2;
                }
            
 System.out.println();
    }

} 
public static void puppletriangle(int n){
    
     

    
    for(int row = 0; row< n; row++){
        
        int ans = 1;
        for(int cst = 0; cst<=row; cst++){
        System.out.print(ans +"\t");


      int ans1= (ans*(row-cst))/(cst+1 );
        
        ans = ans1;
    }

  
        System.out.println();
}   }  
public static void fibonnictriangle(int n){
    int a = 0; int b = 1;

    for(int i = 1; i<= n; i++){
        for(int cst = 1; cst<=i; cst++){
        System.out.print(a + "\t");
        int ans = a + b;
        a = b;
        b = ans;}
    
    
    System.out.println();
}
}
public static void booleanpattern(int n){
    
    for (int i = 0; i< n; i++){
        int ncr = 1;
        for(int j = 0; j<= i; j++){
            System.out.print(ncr+ "\t");
         int   ncr1 = (ncr*(i-j))/(j+1);
            ncr = ncr1;
        }
        System.out.println();
    }
}
public static void hillpattern(int n) {
    int nsp = 2 * n - 3;
    int nst = 1;

    for (int row = 1; row <= n; row++) {
        int val = 1;
        for (int cst = 1; cst <= nst; cst++)
            System.out.print(val++ + "\t");

        for (int csp = 1; csp <= nsp; csp++)
            System.out.print("\t");

        if (row == n) {
            nst--;
            val--;
        }

        for (int cst = 1; cst <= nst; cst++) {
            System.out.print(--val + "\t");
        }

        nsp -= 2;
        nst++;

        System.out.println();
    }
}

 
        
        
        


public static void pattern17(int n){
    int nsp1 = n/2;
    int nst = 1;
    
    for(int row = 1; row <= n; row++){
        
        
        for(int csp1 = 1; csp1<= nsp1; csp1++)
        if (row == n/2 +1){
            System.out.print("*\t");
        }
        else {
        System.out.print("\t");}
        
        for(int cst = 1; cst<= nst; cst++)
        System.out.print("*\t");
        
        if(row<=n/2){
            nst++;
        }
else {nst--;
}
 

        
      System.out.println();  
    }
}
public static void pattern18(int n){
    
    for(int i = 1; i<= n/2; i++){
        for(int j = 1; j<= n; j++)
    if(i == j || i + j ==n+1 || i == 1){
            System.out.print("*\t");
    }
    else {
        System.out.print("\t");}
        
        System.out.println();
    } int nsp = n/2;
        int nst = 1;
    for(int i = n/2 +1; i<= n; i++){
       
        for ( int csp = 1; csp<= nsp; csp++)
        System.out.print("\t");
        for(int cst = 1; cst<= nst; cst++){
        System.out.print("*\t");}
        nst+=2;
        nsp--;
        System.out.println();

    }
}
public static void pattern19(int n){
    for(int i = 1; i<= n; i++){
        for(int j = 1; j<= n; j++){
            if (i == 1){
                if ( j == n|| j<= n/2 + 1)
                System.out.print("*\t");
                else 
                System.out.print("\t");

            }
            else if (i <= n/2){
                if ( j == n|| j== n/2 + 1)
                System.out.print("*\t");
                else 
                System.out.print("\t");

            }
            else if (i == n/2 + 1){
                
                System.out.print("*\t");
                

            }
            else if (i < n){
                if ( j == 1|| j== n/2 + 1)
                System.out.print("*\t");
                else 
                System.out.print("\t");

            }
            else{
                if ( j == 1|| j>= n/2 + 1)
                System.out.print("*\t");
                else 
                System.out.print("\t");

            }

            
        
    
        
        }
        System.out.println();
    }
}
    
            
    
    
    
    





   
        


             
             
            
        



