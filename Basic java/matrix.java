import java.util.*;
import java.io.*;

public class matrix {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i<n; i++){
            for (int j =0; j<m; j++)
            arr[i][j] = scn.nextInt();
        }

    }

    

public static void display(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;
    for(int i = 0; i<n; i++){
        for (int j =0; j<m; j++)
        System.out.print(arr[i][j] +" ");

    
    System.out.println();
    }
}
public static int maximum(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;
    int max = -(int)1e9;
    for(int i = 0; i<n; i++){
        for (int j =0; j<m; j++) 
        if(arr[i][j]> max ){
            max = arr[i][j];
        }
    }
     return max;   

}
public static int minimum(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;
    int min = (int)1e9;
    for(int i = 0; i<n; i++){
        for (int j =0; j<m; j++) 
        if(arr[i][j]< min ){
            min = arr[i][j];
        }
    }
     return min;      
}
public static boolean find(int[][] arr ,int data){
 int n = arr.length;
 int m = arr[0].length;
 for(int i = 0; i<n; i++){
    for (int j =0; j<m; j++) 
    if (arr[i][j]==data){
        return true;
    }

}
return false;
}
 public static void spiralprint(int [][] arr){
int n = arr.length, m = arr[0].length;
int rmin =0, rmax =n-1;
int cmin = 0, cmax = m-1;
int tne = n*m;
while(tne !=0){
    for (int r = rmin; r<= rmax && tne>0; r++){
        System.out.println(arr[r][cmin]);
        tne--;
    }
    cmin++;
    for (int c = cmin; c<= cmax && tne>0; c++){
        System.out.println(arr[rmax][c]);
        tne--;}
        rmax--;
        for (int r = rmax; r>= rmin && tne>0; r--){
            System.out.println(arr[r][cmax]);
            tne--;}
          cmax--;
          for (int c = cmax; c>=cmin && tne>0; c--){
            System.out.println(arr[rmin][c]);
            tne--;  }
            rmin++;
}
 }
 public static void exitpoint(int[][] arr){
     int n = arr.length, m = arr[0].length;
    int dir =0;
    int i =0, j = 0;
    while(true){
        dir = (dir + arr[i][j])%4;
        if(dir == 0){
j++;
if (j == m){
System.out.println(i + "\n" + (j-1));
break;}
        }
        else if (dir == 1){
            i++;
            if (i == n){
            System.out.println((i-1) + "\n" + (j));
      break;  }
        }
        else if(dir == 2){
            j--;
            if (j == -1){
            System.out.println(i + "\n" + (j+1));
       break; }
        }
        else
        i--;
        {
            if (i == -1){
            System.out.println((i+1) + "\n" + (j));
       break;} }
    } 
 }
 public static void swap(int[][]arr, int i1,int j1,int i2, int j2){
     int temp = arr[i1][j1];
     arr[i1][j1]= arr[i2][j2];
     arr[i2][j2] = temp;
 }
 public static void rotate90(int [][]arr){
     int n = arr.length, m = arr[0].length;
     for ( int i = 0; i< n; i++){
         for ( int j =i; j<m; j++){
             swap(arr, i,j,j,i);
         }
     }
     int si =0, ei = m-1;
     while(si<ei){
         for(int i = 0; i<n; i++){
             swap(arr,i,si,i,ei);
         }

     
     si++;
     ei--;
     
        }
 }
 public static boolean ispalindromic(String str, int si, int ei){
while(si<ei){
if (str.charAt(si) != str.charAt(ei))
return false;
si++;
ei--;
}
return true;
   
    }
    public static void printallpalindromicsubstring(String str){
        int n = str.length();
        for ( int i =0; i< n; i++){
            for (int j = i; j<n; j++){
                if ( ispalindromic(str,i,j)){
                    String str1 = str.substring(i,j+1);
                    System.out.println(str1);
                }

            }
        }

    }
    
     
// public static void compression1(String str){
//     int n = str.length();
//     for ( int i =0; i<n; i++){
//         for (int j =i; j<n; j++){
//             if(str.substring(i,j) == str.substring(i,j+1))
//         }
//     }
// }
public static int counthiwohit(String str){
    int n = str.length();
    int count =0, i =0;
    while(i<n-1){
         
        if(str.charAt(i)== 'h'&& str.charAt(i+1)== 'i'){
            if (i+2<n&& str.charAt(i+2) == 't'){
            
            i+=3;
        }  
        else{
        count++;
        i+=2;}}
        
        else 
        i++;
    }
    return count;
}
public static void removeduplicate(String str){
    int n = str.length();
    String ans = str.charAt(0) + "";
    int i =1;
    int changes =0;
    while(i<n){
        while(i<n && ans.charAt(ans.length()-1)== str.charAt(i))
        i++;
        changes++;
        if(i<n)
        ans += str.charAt(i);
        i++;
    }
    System.out.println(ans);
}
public stat
 
       public static void main(String[] args){
    String str="hhhiii";
    removeduplicate(str);

    
    
}
}  

