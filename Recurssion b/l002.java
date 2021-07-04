
import java .util.*;
import java.util.function.IntBinaryOperator;

public class l002 {
    // public static Scanner scn = new Scanner(System.in);
    public static void printArray(int[] arr,int idx){
        if(idx == arr.length)
        return;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);

    }
     public static void printReverseArray(int[] arr,int idx){
         int m = arr.length -1;
if(idx <0)
return;
System.out.println(arr[idx]);
printReverseArray(arr,idx-1);
     }
     public static int maximum(int[] arr, int idx){
        if(idx == arr.length)
        return -(int)1e9;

     int recmax= maximum(arr,idx+1);
      
      return Math.max(recmax,arr[idx]);
      

      



     }
      public static int minimum(int[] arr, int idx){
          if(idx == arr.length)
          return (int) 1e9;
int recmin = minimum(arr,idx+1);
return Math.min(recmin,arr[idx]);

     }
    public static boolean finddata(int[] arr, int idx, int data){
        if(idx == arr.length)
        return false;
       
       if(arr[idx]== data)
       return true; 
       return finddata(arr, idx+1,data);
       

     }
     public static boolean finddata1(int[] arr, int idx, int data){
if(idx == arr.length)
return false;
boolean recres = finddata1(arr,idx+1,data);
if(recres)
return true;
return arr[idx] == data;
     }
     public static int firstindex(int [] arr,int idx, int data){
if(idx == arr.length)
return -1;
     
    if( arr[idx]== data)
    return idx;
   return firstindex(arr, idx+1, data);

     }
     public static int lastindex(int[] arr, int idx, int data){
         if(idx == arr.length)
         return -1;
        int recans = lastindex(arr, idx+1,data);
         if(recans !=-1)
         
         return recans;
         return arr[idx] == data? idx: -1;
     }
     public static int[] allindex(int[] arr, int idx, int data,int count){
if(idx == arr.length){
    return new int[count];

}
if(arr[idx]== data)
count++;
int[] recans = allindex(arr,idx+1, data , count);
if(arr[idx] == data)
recans[count-1] = idx;
return recans;
     }
     public static boolean firstandlastindex(int[] arr, int idx, int data, int[] ans){
         if(idx == arr.length)
         return false;
         if(arr[idx] == data)
         ans[0] = idx;
         boolean res = firstandlastindex(arr,idx+1,data,ans);
         if(res)
         return res;
         if(arr[idx] == data){
             ans[1] = idx;
             return true;
         }
         return false;
        return ans;
     }
   
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
     
        
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i =0; i< n; i++){
        arr[i] = scn.nextInt();}
        int data = scn.nextInt();
        int fili =firstandlastindex(arr,0,data,ans);
     System.out.println(fili);

    }
    
}

 