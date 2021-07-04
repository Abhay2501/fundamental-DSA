import java.util.*;
 
public class l001 {
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + j + " and index " + i);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

    public static void display(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + ""); // get
            }
        }
    public static int[] mergeWithNoSpace(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i =0,j = 0, k =0;
        int [] ans = new int[n+m];
        while(i<n && j<m){
            if(i ==n)
            ans[k++] = arr2[j++];
            else if(j ==m)
            ans [k++] = arr1[i++];
else if(arr1[i] < arr2[j])
ans[k++] = arr1[i++];
else 
ans[k++] = arr2[j++];

        }
        return ans;
     //Write your code here
    }
    
//     public static void selectionSort(int[] arr) {
//         int n = arr.length ;
//         for(int i =0; i< n-1; i++){
//             int min =i;
//             for( int j =i+1; j< n; j++){
               
//                   if(  isSmaller(arr,j,min))
//                       min =j;
                   
                    
                
                
//             }
//             swap(arr,i,min);
//         }
//       //write your code here
      
//     }
  
//     // used for swapping ith and jth elements of array
//     public static void swap(int[] arr, int i, int j) {
//       System.out.println("Swapping " + arr[i] + " and " + arr[j]);
//       int temp = arr[i];
//       arr[i] = arr[j];
//       arr[j] = temp;
//     }
  
//     // return true if ith element is smaller than jth element
//     public static boolean isSmaller(int[] arr, int i, int j) {
//       System.out.println("Comparing " + arr[i] + " and " + arr[j]);
//       if (arr[i] < arr[j]) {
//         return true;
//       } else {
//         return false;
//       }
//     }
  
//     public static void print(int[] arr) {
//       for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//       }
//     }
  
//     public static void main(String[] args) throws Exception {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int[] arr = new int[n];
//       for (int i = 0; i < n; i++) {
//         arr[i] = scn.nextInt();
//       }
//       selectionSort(arr);
//       print(arr);
//     }
  
//   }
public static void insertionsort(int [] arr){
    int n = arr.length;
    for(int i =1; i<n; i++){
        for(j = i; j> 0; j--){
            if(arr[j] > arr[i]){
                swap(arr,j,j-1);
            }
            else 
            break;
        }
    }
}
public static void partitionAnarray(int[] arr,int data){
    int n = arr.length;
    int idx =0, i =0;
    while(i<n){
        if(arr[i] <= data)
            swap(arr,i,++idx);
            
        
         
        i++;

    }

}
public static void partitionarray2(int[],int data){
    int n = arr.length, p =n-1, itr =0;

    while(itr <= p){
        if(arr[itr] <= data)
        itr++;
        else 
        swap(arr,p--,itr);
        
    }
}
public static void partitionoverpivot(int [] arr,int pivotidx){

}
 public static void display(int[] arr){
     for(int ele : arr)
     System.out.println(ele + "");
     System.out.println();
 }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int{} arr ={7,-2,4,1,3};
        int data =7;
        System.out.println(partition of array2(arr,data));
        display(arr);
        // int[] arr = new int[sc.nextInt()];
        // // int[] B = new int[sc.nextInt()];
        // for (int i = 0; i < A.length; i++) {
        //     A[i] = sc.nextInt();
        // }
        // for (int i = 0; i < B.length; i++) {
            // B[i] = sc.nextInt();
        // }
    
    //   int[] ans =  mergeWithNoSpace(A, B);
    
    //    display(ans);

    }
    
}