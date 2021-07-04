
import java.io.*;
import java.util.*;
public class Array {
     public static Scanner scn = new Scanner(System.in);
    //  public static int[] input(int n) {
    //     int[] arr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = scn.nextInt(); // set
    //     }

    //     return arr;
    // }
    // public static void display(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " "); // get
    //     }
    // }

     public static int maximum(int [] arr){
         int maxele = -(int) 1e9 -1;
         for(int ele : arr){
         maxele = Math.max(maxele , ele);
     }
     return maxele;
    }
    public static int[] rotateOfArray(int[] arr, int r) {
        int n = arr.length;
        r %= n;
        if (r < 0)
            r += n;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = (i + r) % n;
            ans[idx] = arr[i];
        }
         display(ans);

        return ans;
    }
    public static int spanofarray(int arr[]){
    
              
         
         int maxele = -(int)1e9;
         int minele = (int)1e9;
         for(int ele : arr){
             maxele = (int)Math.max(maxele,ele);
             minele = (int)Math.min(minele,ele);
             

         }
         return maxele - minele;
             
         }

      public static int[] input(int n){
        int [] arr = new int [n];
        for ( int i = 0; i< n; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    
  public static void display(int[] arr){
      int n = arr.length;
      for( int i = 0; i< n; i++){
          System.out.print(arr[i] + " ");
      }
  }
  public static void  reverseofarray(int[] arr){
     for ( int i = arr.length -1;i>= 0; i-- ){
         System.out.print(arr[i]+ " ");
     }
    }
    public static void inverseOfArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];


        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            ans[temp] = i;

       }
        display(ans);
        
    }
    public static void sumOfTwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int p = Math.max(n, m) + 1;
        int[] ans = new int[p];

        int i = n - 1, j = m - 1, k = p - 1, carry = 0;
        while (k >= 0) {
            int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
            ans[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < p; idx++) {
            if (idx == 0 && ans[idx] == 0)
                continue;
            System.out.print(ans[idx]);
        }
        

    }
    public static void differenceoftwoarray(int [] arr1, int[]arr2){
        int n = arr1.length;
        int m = arr2.length;
        int [] ans = new int[m];
        int i = n-1, j = m-1, k = m-1, borrow = 0;
        while (k>=0){
            int diff = borrow + arr2[j] - (i>= 0 ? arr1[i] : 0);
            if(diff < 0){
                diff+= 10;
                borrow = -1;

            }
            else 
            {borrow =0;}
            ans[k] = diff;
            i--;
            j--;
            k--;


        }
        boolean nonzerofound = false;
for(int ele : ans){
    if(ele !=0){
        nonzerofound = true;
    }
    if(nonzerofound)  
    System.out.print(ele + "\n" );
}

        

    }
    public static int digitfreq(int n, int d){
        int count = 0;
        while(n != 0){
            int lastdigit = n% 10;
            n/=10;
            if(lastdigit == d) count++;
        }
        return count;
    }

   public static int dtb(int n){
       int pow =1;
       int ans = 0;
       while(n!= 0){
        int rem = n%2;
        n = n/2;
        ans+= rem*pow;
        pow*=10;
       }
       return ans;
   } 
   public static int btd(int n){
    int pow =1;
    int ans = 0;
    while(n!= 0){
     int rem = n%10;
     n = n/10;
     ans+= rem*pow;
     pow*=2;
    }
    return ans;
}
   

       
     
            
    
        
        
    public static int anybasesub(int n, int m, int b){
        int pow =1;
        int ans = 0;
        int borrow = 0;
        while( m!= 0){
            int diff = borrow + m%10 - n%10;
            if(diff<0){
                diff+=b;
                borrow = -1;
            }
            n/=10;
            m/=10;
            int digit = diff;
        
            ans += digit*pow;
            pow*=10;
        }
        return ans;
    }
    public static int anydigitmultiply(int n,int m,int b){
int pow =1;

int ans = 0;
int carry = 0;


    
while(n !=0 || carry !=0){
    int mul = (n%10)*(m);
    n/=10;
    int digit= (carry + mul)%b;
    carry = mul/b;
    
ans += digit*pow;
pow *=10;
}

return ans;
    }
    // public static int anybasemultiply(int n, int m, int b){
    //     int pow = 1;
    //     int ans = 0;
    //     while(m!=0){
    //         int d = m%10;
    //         m/=10;
    //       int  prodres = anydigitmultiply(n,d,b)*pow;
    //       ans = anybaseadd(ans,prodres,b);
    //       pow*=10;



    //     }
    //     return ans;

    // }
    
    public static void subarray(int [] arr){
        
        for(int i =0; i<arr.length; i++){
            for (int k =0; k<= i; k++){
    
            for(int j = k; j<arr.length; j++)
                
            
        System.out.print(arr[j] +" ");
    
        System.out.println();
    
            }  
        }
        
    }
    public static void printInRange(int[] arr, int si, int ei) {
        while (si <= ei) {
            System.out.print(arr[si] + " ");
            si++;
            
        }
    }

    public static void printAllSubArrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                printInRange(arr, i, j);
            }System.out.println();
        }
    }

    public static int binarySearch(int[] arr, int data) {
        int si = 0, ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data)
                return mid;
            else if (arr[mid] < data)
                si = mid + 1;
            else
                ei = mid - 1;
        }

        return -1;
    }

     public static void printinrange(int[] arr,int si, int ei){
         while(si <= ei){
             System.out.println(arr[si] + " ");

             si++;
             
         }
     }
     public static void printallsubarray(int[] arr){
         int n = arr.length;
         for (int i = 0; i <n; i++){
             for(int j = i; j<n; j++){
                 printinrange(arr,i,j);
                 System.out.println();   }
         }
     }
     public static int fI(int arr[] , int data){
         int si =0, ei = arr.length -1;
         while(si <= ei){
             int mid =(si +ei)/2;
             if(arr[mid] == data){
if (mid -1>0&& arr[mid -1] == data)
ei = mid -1;
else 
return mid;
             }
             else if (data < arr[mid]){
                 ei = mid -1;

             }
             else 
             si = mid +1;
         }
         return -1;
     }
     public static int lI(int arr[] , int data){
         int n = arr.length;
        int si =0, ei = n -1;
        while(si <= ei){
            int mid =(si +ei)/2;
            if(arr[mid] == data){
if (mid +1<n&& arr[mid +1] == data)
si = mid +1;
else 
return mid;
            }
            else if (data < arr[mid]){
                ei = mid -1;

            }
            else 
            si = mid +1;
        }
        return -1;
    }
    public static void fIandlI(int [] arr, int data){
        int fi = fI(arr,data);
       
        int li = lI(arr,data);
        System.out.println(fi);
        System.out.println(li);
    }
    public static void stateofwakanda1(int[][]arr){
        int n = arr.length, m = arr[0].length;
        for( int j =0; j<m; j++){
            if( j %2 ==0){
                for (int i =0; i<n; i++){
                    System.out.println(arr[i][j]);
                }

            }
            else{
                for (int i =n-1; i>= 0; i--){
                    System.out.println(arr[i][j]); 
            }
        }
        }
    }
    public static void stateofwakanda2(int[][]arr){
        int n = arr.length, m= arr[0].length; 
        for (int gap = 0; gap < n; gap++){
            for (int i =0,j =gap; i<n && j<m; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    // saddle price
    public static int maxincolumn(int[][] arr,int c){
        int n = arr.length, m = arr[0].length;
        int maxval = -(int)1e9;
        int r = -1;
        for(int i =0; i<n; i++){
            if(arr[i][c] > maxval){
                maxval = arr[i][c];
                r =i;

            }
        }
        return r;
    }
    public static void saddlepoint(int[][] arr){
        int n = arr.length, m = arr[0].length;
        boolean flag = false;
        for(int i =0; i<n; i++){
            int minval = (int)1e9;
            int c = -1;
            for(int j =0; j<m; j++){
                if(arr[i][j] < minval){
                    minval = arr[i][j];
                    c = j;
                }


            }
            int r = maxincolumn(arr,c);
            if(r ==i){
            System.out.println(arr[r][c]);
            flag = true;}
            
        }
        if(!flag)
        System.out.println("Invalid input");


    }

  public static void main(String[] args){
      int n = scn.nextInt();
      
      int [][] arr = new int [n][n];
      for( int i =0; i<n; i++){
          for(int j =0; j<n; j++)
          
          arr[i][j]= scn.nextInt();      
    }
    
       
saddlepoint(arr);

  }
}
    
        
    
    