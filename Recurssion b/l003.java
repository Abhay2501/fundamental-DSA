import java.util.*;
public class l003 {
    public static Scanner scn = new Scanner(System.in);
    public static ArrayList<String>subseq(String str){
 if(str.length() == 0){
     ArrayList<String> base = new ArrayList<>();
     base.add("");
     return base;
 }   
 char ch = str.charAt(0);
 ArrayList<String> recans = subseq(str.substring(1));
 ArrayList<String> myans = new ArrayList<>(recans);
 for(String s : recans){
    //  myans.add(s);
     myans.add(ch+s);
 }
 return myans;
    }
    public static String[] Nokiakeys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getkpc(String str){
        if(str.length() ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String code = Nokiakeys[ch -'0'];
        ArrayList<String> recans = getkpc(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();
        for(int i =0; i<code.length(); i++){
            for(String s: recans)
            myAns.add(code.charAt(i) +s);
        }
        return myAns;
        
    }
    //11283 11023 0, 11341011
    public static ArrayList<String> decodeways(String str){
        if(str.length() ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
       if(str.charAt(0) == '0') return new ArrayList<>();
       char ch1 =str.charAt(0);
        ArrayList<String> myans = new ArrayList<>();
        ArrayList<String> recans1 = decodeways(str.substring(1));
        for(String s : recans1){
            myans.add((char)('a' + ch1 - '1') +s);

        }
        if(str.length() >1){
            int num = (ch1 -'0')* 10 + (str.charAt(1) -'0');
            if(num <= 26){
                ArrayList<String> recans2 = decodeways(str.substring(2));
                for(String s : recans2){
                    myans.add((char)('a'+ num -1) + s);
                }
            }
        }
        return myans;
            
    }
    // public static ArrayList<String> decodeways2(String str){
    //     if(str.length() ==0){
    //         ArrayList<String> ans = new ArrayList<>();
    //         ans.add("");
    //         return ans;

    //     }
    //     char ch1 =str.charAt(0);
    //     String word = Nokiakeys[ch1 -'0'];
    //     ArrayList<String> myans = new ArrayList<>();
    //     ArrayList<String> recans = decodeways2 (str.substring(1));
    //     for(int i =0; i<word.length(); i++){
    //     for(String s : recans){
    //         myans.add(word.charAt(i)+ s);
    //     }
    // }
    // if(str.length() > 1){
    //     char ch2 = str.charAt(1);
    //     int num = (ch1 -'0')* 10 + (ch2 -'0');
    //     if(num == 10 || num == 11){
    //         ArrayList<String> recans2 = decodeways(str.substring(2));
    //         word = Nokiyakeys[num];
    //         for(int i =0; i< word.length(); i++){
    //             for(String s : recans2){
    //                 myans.add(word.charAt(i) +s);

    //             }
    //         }
    //     }


    // }
    // return myans;


    
    public static ArrayList<String> getstairpath(int n){
        if(n ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans = new ArrayList<>();
        
        for(int i =1; i<=3 && n-i >= 0; i++){
            ArrayList<String> recans = getstairpath(n-i);
            for(String s : recans){
                myans.add(i+s);

            }

         }
         return myans;

    }
    public static ArrayList<String> boardpath(int n){
        if(n ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans = new ArrayList<>();
        
        for(int d =1; d<=6 && n-d >= 0; d++){
            ArrayList<String> recans = boardpath(n-d);
            for(String s : recans){
                myans.add(d+s);

            }

         }
         return myans;

    }
    public static ArrayList<String> boardpathonarray(int n, int [] move){
        if(n ==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans = new ArrayList<>();
        
        for(int i =0; i< move.length  && n- move[i]>= 0; i++){
            ArrayList<String> recans = boardpathonarray(n- move[i] ,move);
            for(String s : recans){
                myans.add(move[i]+s);

            }

         }
         return myans;

    }
    public static ArrayList<String> mazepathHV(int sr, int sc, int er, int ec){
        if(sr == er && sc == ec){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;}
            ArrayList<String> myans = new ArrayList<>();
            if(sc+1<= ec){

                ArrayList<String> horizontal = mazepathHV(sr,sc+1,er,ec);
                for(String s : horizontal)
                myans.add("H" +s);



            }
            if(sr+1<= er){

                ArrayList<String> vertical = mazepathHV(sr +1,sc,er,ec);
                for(String s : vertical)
                myans.add("V" +s);
                
    }
    return myans;
}
public static ArrayList<String> mazepathHDV(int sr, int sc, int er, int ec){
    if(sr == er && sc == ec){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;}
        ArrayList<String> myans = new ArrayList<>();
        if(sc+1<= ec){

            ArrayList<String> horizontal = mazepathHDV(sr,sc+1,er,ec);
            for(String s : horizontal)
            myans.add("H" +s);



        }
        if(sr+1<= er && sc +1 <= ec){

            ArrayList<String> diagonal = mazepathHDV(sr +1,sc+1,er,ec);
            for(String s : diagonal)
            myans.add("D" +s);



        }
        if(sr+1<= er){

            ArrayList<String> vertical = mazepathHDV(sr +1,sc,er,ec);
            for(String s : vertical)
            myans.add("V" +s);
            
}
return myans;
}
public static ArrayList<String> mazePathHDVjump(int sr,int sc,int er,int ec){
    if(sr == er && sc == ec){
    
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;}
        ArrayList<String> myans = new ArrayList<>();
        for(int i =1;  sc +i<= ec; i++){

            ArrayList<String> horizontal = mazePathHDVjump(sr,sc+i,er,ec);
            for(String s : horizontal)
            myans.add("h"+ i +s);



        }
        for(int i =1; sc +i<= ec && sr + i<= er; i++){

            ArrayList<String> diagonal = mazePathHDVjump(sr +i,sc+i,er,ec);
            for(String s : diagonal)
            myans.add("d"+i +s);



        }

        for(int i =1; sr + i <= er; i++){
            ArrayList<String> vertical = mazePathHDVjump(sr +i,sc,er,ec);
            for(String s : vertical)
            myans.add("v" +i +s);
            
}
return myans;

}
 
  







    public static void main(String[] args){
        
        // System.out.println(subseq("abcd"));
        // String str = scn.next();
    // ArrayList<String> s = decodeways(n);

 System.out.println(mazePathHDVjump(0,0,1,1));    
    
}
}

