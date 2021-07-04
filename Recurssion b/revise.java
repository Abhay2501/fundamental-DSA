import java.util.*;
public class revise {
    public static int firstindex(int [] arr,int idx, int data){
        if(idx == arr.length)
        return -1;
             
            if( arr[idx]== data)
            return idx;
           return firstindex(arr, idx+1, data);
        
             }
             public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                int[] arr = {2,3,4,56,78,98,-1,3,-23,-456,4758,3};
            //    int n = scn.nextInt();
            //     int [] ans = new int [n];
            //     for(int i =0; i< n; i++){
            //     arr[i] = scn.nextInt();
            //     }
            //    firstandlastindex(arr,0,3,ans);
                
            int n = scn.nextInt();
            int [] arr = new int[n];
            for(int i =0; i< n; i++){
                arr[i] = scn.nextInt();}
                int data = scn.nextInt();
                int fi =firstindex(arr,0,data);
             System.out.println(fi);
        
            }
            
        }
        
         
    

