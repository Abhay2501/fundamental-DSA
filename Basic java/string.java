
import java .util.*;
import java.io.*;
public class string {
    public static void immutablestring(){
        StringBuilder str = new StringBuilder();
        for ( int i =0; i < (int)1e6; i++){
            str.append(i);
        }
        //System.out.println(str);

    }
    // stringbuilder basic function
    public static void stringbuilderbasicfunction(){
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("bcd");//0(m) mis the length of string which i want to append
        System.out.println(sb.toString());
        sb.setCharAt(2,'e');//0(1)
        System.out.println(sb.toString());
        sb.deleteCharAt(2);//0(n)
        System.out.println(sb.toString()); // 0(n)
    }

    public static String toggle(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if( ch>= 'a' && ch <= 'z') sb.append((char) ( ch-'a'+'A' ));
            else
            sb.append((char) ( ch-'A'+'a' ));
        }
        return sb.toString();

    }
    public static String solution(String str){
	    StringBuilder sb = new StringBuilder();
	    sb.append(str.charAt(0));
	    int n = str.length();
	    for ( int i =0; i< n; i++){
	        sb.append(str.charAt(i) - str.charAt(i-1));
	        sb.append(str.charAt(i));
	    }
		// write your code here

		return sb.toString();
	}
public static void main(String[] args){
    
    // long start = System.currentTimeMillis();
    // immutablestring();
    // long end = System.currentTimeMillis();
    // System.out.println(end-start);
    //stringbuilderbasicfunction();
    

    
}
