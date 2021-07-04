
    import java.io.*;
    import java.util.*;
    
    public class l005 {
    
      public static void sort01(int[] arr){
           int p =-1, itr =0;
            while(itr < arr.length){
                if(arr[itr] == 0)
                swap(arr, ++p, itr);
                itr++;
            }
        //write your code here
        
      }
      public static void sort012(int[] arr){
        int p1 =-1, p2 = arr.length-1, itr =0;
         while(itr < p2){
             if(arr[itr] == 0){
             swap(arr, ++p1, itr++);}
             
             else if(arr[itr] == 2){
                 

                 swap(arr,p2--,itr);
                
             }
             else 
             itr++;
         }
     //write your code here
     
   }
   public static int[] mergetwosortedarrays(int[] arr1,int[] arr2){
       int n = arr1.length;
       int m = arr2.length;
       
       int i =0, j =0, k =0;
       int [] ans = new int[n+m];

       
       while(i < n && j< m){
           if(arr1[i] < arr2[j])
           ans[k++] = arr1[i++];
           else 
           ans[k++] = arr2[j++];
            

           }
           while(i<n){
               ans[k++] = arr1[i++];

           }
           while(j< m){
               ans[k++] = arr2[j++];

           }
           return ans;
           
           

   }
   public static int[] mergetwosortedarrays(int[] arr1,int[] arr2){
    int n = arr1.length;
    int m = arr2.length;
    
    int i =0, j =0, k =0;
    int [] ans = new int[n+m];

    
    while(i < n && j< m){
        if(i == n)
        ans[k++] == arr2[j++];
        else if(j == m)
        ans[k++] == arr1[i++];


       else if(arr1[i] < arr2[j])
        ans[k++] = arr1[i++];
        else 
        ans[k++] = arr2[j++];
         

        }
        
        return ans;
        
        

}
public static void bubblesort(int[] arr){
    int n = arr.length;
while(li != 0){
    for(int li = n-1; li>= 0; li-- )
    for(int i =1; i<li; i++)
        if(arr[i-1] > arr[i])
            swap(arr,i,i-1);

        }
}
public static void bubblesort_optimize(int[] arr){
    int n = arr.length;
while(li != 0){
    for(int li = n-1; li>= 0; li-- ){
        boolean isswapdone = false;

    for(int i =1; i<li; i++){
        if(arr[i-1] > arr[i]){
            swap(arr,i,i-1);
            isswapdone = true;

        }
    }
    if(!isswapdone)
    break;
}
}
    
}



    
      // used for swapping ith and jth elements of array
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + j + " and index " + i);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    
      public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }
      }
      public static void main(String[] args) throws Exception {
        // // Scanner scn = new Scanner(System.in);
        // // int n = scn.nextInt();
        // // int[] arr1 = new int[n];
        // // for(int i = 0 ;i < n; i++){
        // //   arr[i] = scn.nextInt();
        // // }
        // sort012(arr);
        // print(arr);
        Scanner sc = new Scanner(System.in);
        int[] A = new int[sc.nextInt()];
        int[] B = new int[sc.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
       System.out.println(mergetwosortedarrays(A, B));
    }
      }
    
    