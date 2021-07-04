import java.util.*;
public class l004 {
    // recursion way up
    public static void subsequence(String ques,  String ans){
        if(ques.length() ==0){
             System.out.println(ans);
            return ;
        }
char ch = ques.charAt(0);
String roq =  ques.substring(1);

  
subsequence(roq,ans +ch);
subsequence(roq,ans);
// System.out.println(ans);

    }
//     public static void subsequence1(String ques,  String ans,ArrayList<String> res){
//         if(ques.length() ==0){
//             res.add(ans);
//             return ;
//         }
// char ch = ques.charAt(0);
// String roq =  ques.substring(1);
//   subsequence(roq,ans,res);
// subsequence(roq,ans +ch,res);


//     }
//     public static int subsequence2(String ques,  String ans){
//         if(ques.length() ==0){
//             System.out.println(ans);
//             return 1;
//         }
// char ch = ques.charAt(0);
// String roq =  ques.substring(1);
// int count =0;
//  count += subsequence(roq,ans);
//  count +=subsequence(roq,ans +ch);
//  return count;

    // }
//     public static int subsequence(String ques,  String ans,ArrayList<String> res){
//         if(ques.length() ==0){
//             res.add(ans);
//             return 1 ;
//         }
// char ch = ques.charAt(0);
// String roq =  ques.substring(1);
// int count =0;
//  count += subsequence(roq,ans,res);
//  count +=subsequence(roq,ans +ch,res);

// return count;
//     }
    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static int nokiakeypad(String str, String ans){
        if(str.length() ==0){
            System.out.println(ans);
            return 1;
        }
        char ch = str.charAt(0);
        int idx = ch -'0';
        String word = nokiaKeys[idx];
        int count =0;
        for ( int i =0; i< word.length(); i++)
       count += nokiakeypad(str.substring(1), ans + word.charAt(i));
       return count;
    }
    public static int stairpath(int n,String ans){
        if(n ==0){
            System.out.println(ans);
            return 1;
        }
        int count =0;
        for(int jump =1; jump<=3 && n-jump>=0; jump++){
            count += stairpath(n-jump, ans +jump);

        }
        return count;
    }
    public static int boardpath(int n,String ans){
        if(n ==0){
            System.out.println(ans);
            return 1; 
        }

        int count =0;
        for(int dice =1; dice<= 6&& n -dice>=0; dice++){
  count +=  boardpath(n- dice,ans + dice);  

        }
        return count;
    }
    public static int boardpath1(int sp, int ep,String ans){
        if(sp == ep){
            System.out.println(ans);
            return 1; 
        }

        int count =0;
        for(int dice =1; dice<= 6&& sp+dice <= ep; dice++){
  count +=  boardpath1(sp + dice, ep, ans + dice);  

        }
        return count;
    }
    public static int boardpath2(int [] arr, int n,String ans){
        if(n ==0){
            System.out.println(ans);
            return 1; 
        }

        int count =0;
        for(int jump : arr){
            if( n- jump >= 0)

        
        // for(int dice =1; dice<= 6&& n -dice>=0; dice++){
  count +=  boardpath(n- jump,ans + jump);  

        }
        return count;
    }
    public static int mazepath(int sr, int sc, int er, int ec,String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }
int count =0;
if(sc+1 <= ec){
count += mazepath(sr, sc+1, er, ec, ans + "h");}
if(sr +1 <= er){
count += mazepath(sr +1, sc, er, ec, ans + "d");}
if(sr +1 <= er && sc +1 <= ec){
count += mazepath(sr +1, sc +1, er, ec, ans + "v");}

return count;
    }
    public static int mazepathwithjump(int sr, int sc, int er, int ec,String ans ){
    if(sr == er && sc == ec){
        System.out.println(ans);
        return 1;
    }
int count =0;
for(int jump = 1; sc + jump <= ec; jump++)
{
count += mazepathwithjump(sr, sc+jump, er, ec, ans + "h" +jump);}
for(int jump = 1; sr + jump <= er; jump++)
{
count += mazepathwithjump(sr +jump, sc, er, ec, ans + "d" +jump);}
for(int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
{
count += mazepathwithjump(sr +jump, sc +jump, er, ec, ans + "v" +jump);}

return count;
}
public static int permutation(String ques, String ans){
    if(ques.length() == 0){
        System.out.println(ans);
        return 1;
    }
    int count =0;
    for(int i =0; i< ques.length(); i++){
        String ros = ques.substring(0,i) + ques.substring(i+1);
        count += permutation(ros, ans + ques.charAt(i));
    }
    return count;

}


   
    public static void main(String [] args){
        // Scanner scn = new Scanner(System.in);
        // String str = scn.next();
        // // ArrayList<String> ans = new ArrayList<>();
        // subsequence(str,"");

        // System.out.println(ans);
        // int [] arr = {2,5,3,1};
      System.out.println(permutation("abc",""));
    }
    
}
