
import java.util.*;
public class Arrayr{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input(int n){
        int[]arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int maximum(int[]arr){
        int maxele = -(int) 1e9;
        for(int ele : arr){
            maxele = Math.max(maxele , ele);

        }
        return maxele;

       

    }
    public static int minimum(int[]arr){
        int minele = (int)1e9;
        for(int ele: arr){
            minele = Math.min(minele, ele);
        }
        return minele;

    }
     public static int find(int[]arr, int data){
         
         for(int ele : arr){
            
             
         }
        

     }
    public static void main(String[] args){

        int n = scn.nextInt();
        int[] arr = input(n);
        System.out.println(minimum(arr));

    }

}