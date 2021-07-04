
import java.util.*;
public class Basic 
{
   public static Scanner scn = new Scanner (System.in);
   public static void allprime(int a, int b) {
        
    
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
    public static int firstid(int[] arr, int data) {
        int n = arr.length;
        int si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data){
                if ( mid -1 <= 0 &&arr[mid -1] == data){
                    ei = mid -1;
                }
                else 

                return mid;
            }
                
            else if (arr[mid] < data)
                si = mid + 1;
            else
                ei = mid - 1;
        }
    
        return -1;
    }

    
    
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i< n; i++){
            arr[i]  = scn.nextInt();
        }
        int data = scn.nextInt();
System.out.print(firstid(arr,data));
}

}


 