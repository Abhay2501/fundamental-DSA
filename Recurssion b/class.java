public class class {
    public static ArrayList<String> getStairPath(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 1; i <= 3 && n - i >= 0; i++) {
            ArrayList<String> recAns = getStairPath(n - i);
            for (String s : recAns) {
                myAns.add(i + s);
            }
        }

        return myAns;
    }

    public static ArrayList<String> boardPath(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            ArrayList<String> recAns = boardPath(n - dice);
            for (String s : recAns) {
                myAns.add(dice + s);
            }
        }

        return myAns;
    }

    public static ArrayList<String> boardPathOnArray(int n, int[] move) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 0; i < move.length && n - move[i] >= 0; i++) {
            ArrayList<String> recAns = boardPathOnArray(n - move[i], move);
            for (String s : recAns) {
                myAns.add(move[i] + s);
            }
        }

        return myAns;
    }

    public static ArrayList<String> mazePath_HV(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazePath_HV(sr, sc + 1, er, ec);
            for (String s : horizontal)
                myAns.add("H" + s); // CPP : string(1,'H') + s;
        }

        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazePath_HV(sr + 1, sc, er, ec);
            for (String s : vertical)
                myAns.add("V" + s);
        }

        return myAns;
    }

    public static ArrayList<String> mazePath_HDV(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazePath_HDV(sr, sc + 1, er, ec);
            for (String s : horizontal)
                myAns.add("H" + s); // CPP : string(1,'H') + s;
        }

        if (sr + 1 <= er && sc + 1 <= ec) {
            ArrayList<String> diagonal = mazePath_HDV(sr + 1, sc + 1, er, ec);
            for (String s : diagonal)
                myAns.add("D" + s);
        }

        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazePath_HDV(sr + 1, sc, er, ec);
            for (String s : vertical)
                myAns.add("V" + s);
        }

        return myAns;
    }

    public static ArrayList<String> mazePath_MultiHDV(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int jump = 1; sc + jump <= ec; jump++) {
            ArrayList<String> horizontal = mazePath_MultiHDV(sr, sc + jump, er, ec);
            for (String s : horizontal)
                myAns.add("H" + jump + s);
        }

        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++) {
            ArrayList<String> diagonal = mazePath_MultiHDV(sr + jump, sc + jump, er, ec);
            for (String s : diagonal)
                myAns.add("D" + jump + s);
        }

        for (int jump = 1; sr + jump <= er; jump++) {
            ArrayList<String> vertical = mazePath_MultiHDV(sr + jump, sc, er, ec);
            for (String s : vertical)
                myAns.add("V" + jump + s); // "V" + to_string(jump) + s
        }

        return myAns;
    }

    
}
import java.util.*;

// Recursion Way up
public class l004RWU {
    public static int subsequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence(roq, ans);
        count += subsequence(roq, ans + ch);

        return count;
    }

    public static int subsequence(String ques, String ans, ArrayList<String> res) {
        if (ques.length() == 0) {
            res.add(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence(roq, ans, res);
        count += subsequence(roq, ans + ch, res);

        return count;
    }

    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static int nokiaKeyPad(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        char ch = str.charAt(0);
        int idx = ch - '0';
        String word = nokiaKeys[idx];
        int count = 0;

        for (int i = 0; i < word.length(); i++)
            count += nokiaKeyPad(str.substring(1), ans + word.charAt(i));

        return count;
    }

    public static int stairPath(int n, String ans) {
        if (n == 0) {
            // System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump = 1; jump <= 3 && n - jump >= 0; jump++) {
            count += stairPath(n - jump, ans + jump);
        }

        return count;
    }

    public static int boardPath(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            count += boardPath(n - dice, ans + dice);
        }

        return count;
    }

    public static int boardPath(int sp, int ep, String ans) {
        if (sp == ep) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
            count += boardPath(sp + dice, ep, ans + dice);
        }

        return count;
    }

    public static int boardPath(int[] arr, int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump : arr) {
            if (n - jump >= 0)
                count += boardPath(n - jump, n, ans + jump);
        }

        return count;
    }

    public static int mazePath_HVD(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if (sc + 1 <= ec && sr + 0 <= er)
            count += mazePath_HVD(sr + 0, sc + 1, er, ec, ans + "H");
        if (sc + 1 <= ec && sr + 1 <= er)
            count += mazePath_HVD(sr + 1, sc + 1, er, ec, ans + "D");
        if (sr + 1 <= er)
            count += mazePath_HVD(sr + 1, sc + 0, er, ec, ans + "V");

        return count;
    }

    public static int mazePath_MultiHVD(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump = 1; sc + jump <= ec; jump++)
            count += mazePath_MultiHVD(sr, sc + jump, er, ec, ans + "H" + jump);
        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc + jump, er, ec, ans + "D" + jump);
        for (int jump = 1; sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc, er, ec, ans + "V" + jump);

        return count;
    }

    public static int permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i + 1);
            count += permutation(ros, ans + str.charAt(i));
        }

        return count;
    }

    public static int permutationWithoutDuplicate(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        char prev = '$';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                String ros = str.substring(0, i) + str.substring(i + 1);
                count += permutationWithoutDuplicate(ros, ans + str.charAt(i));
            }
            prev = str.charAt(i);
        }

        return count;

    }

    public static void permutationWithoutDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }

        // System.out.println(sb);
        System.out.println(permutationWithoutDuplicate(sb.toString(), ""));
    }

    public static int decodeWays(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        char ch = str.charAt(0);
        if (ch == '0')
            return 0;

        count += decodeWays(str.substring(1), ans + (char) ('a' + ch - '1'));
        if (str.length() > 1) {
            int num = (ch - '0') * 10 + (str.charAt(1) - '0');
            if (num <= 26)
                count += decodeWays(str.substring(2), ans + (char) ('a' + num - 1));
        }

        return count;
    }

    public void permute(int[] nums,int count,List<List<Integer>> res,List<Integer> ans) {
        if(count == nums.length){
            List<Integer> base = new ArrayList<>();
            for(int ele : ans) base.add(ele);
            res.add(base);
            return; 
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>= -10 && nums[i] <= 10){
                int val = nums[i];
                
                nums[i] = -11;
                ans.add(val);
                
                permute(nums,count + 1,res,ans);
                
                ans.remove(ans.size() - 1);
                nums[i] = val;
            }
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        permute(nums,0,res,ans);
        
        return res;
    }


    public static void main(String[] args) {
        // ArrayList<String> ans = new ArrayList<>();
        // System.out.println(subsequence("abc", "", ans));
        // System.out.println(ans);

        // int[] arr = { 2, 5, 3, 1 };
        // System.out.println(boardPath(arr, 10, ""));

        // System.out.println(mazePath_MultiHVD(0, 0, 2, 2, ""));

        // System.out.println(permutation("aba", ""));
        // permutationWithoutDuplicate("abab");
        System.out.println(decodeWays("112403",""));

    }

}
ublic class l005Backtracking {

    public static int mazePath(int sr, int sc, int er, int ec, String ans, int[][] dir, String[] dirS) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r <= er && c <= ec) {
                count += mazePath(r, c, er, ec, ans + dirS[d], dir, dirS);
            }
        }

        return count;
    }

    // Mark
    // for all unvisited Nbr's
    // ---->call dfs for Nbr's
    // unMark

    public static int floodFill(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 1;
        }

        board[sr][sc] = 1;

        int count = 0;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0)
                    count += floodFill(r, c, board, ans + dirS[d], dir, dirS);
            }
        }

        board[sr][sc] = 0;
        return count;

    }

    // 0 -> empty cell, 1 -> blocked cell
    public static int floodFill_Jump(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS,
            int Radius) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return 1;
        }

        board[sr][sc] = 1;

        int count = 0;

        for (int d = 0; d < dir.length; d++) {
            for (int rad = 1; rad <= Radius; rad++) {
                int r = sr + rad * dir[d][0];
                int c = sc + rad * dir[d][1];

                if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                    if (board[r][c] == 0)
                        count += floodFill_Jump(r, c, board, ans + rad + dirS[d], dir, dirS, Radius);
                } else
                    break;
            }
        }

        board[sr][sc] = 0;
        return count;
    }

    public static boolean floodFill_2(int sr, int sc, int[][] board, String ans, int[][] dir, String[] dirS) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            System.out.println(ans);
            return true;
        }

        board[sr][sc] = 1;

        boolean res = false;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0)
                    res = res || floodFill_2(r, c, board, ans + dirS[d], dir, dirS);
            }
        }

        board[sr][sc] = 0;
        return res;
    }

    public static int floodFill_longestLen(int sr, int sc, int[][] board, int[][] dir) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            return 0;
        }

        board[sr][sc] = 1;

        int longestLen = -1;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0) {
                    int recAns = floodFill_longestLen(r, c, board, dir);
                    if (recAns != -1 && recAns + 1 > longestLen) {
                        longestLen = recAns + 1;
                    }
                }
            }
        }

        board[sr][sc] = 0;
        return longestLen;
    }

    public static int floodFill_shortestLen(int sr, int sc, int[][] board, int[][] dir) {
        int n = board.length, m = board[0].length;
        if (sr == n - 1 && sc == m - 1) {
            return 0;
        }

        board[sr][sc] = 1;

        int shortestLen = (int) 1e9;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == 0) {
                    int recAns = floodFill_shortestLen(r, c, board, dir);
                    if (recAns != (int) 1e9 && recAns + 1 < shortestLen) {
                        shortestLen = recAns + 1;
                    }
                }
            }
        }

        board[sr][sc] = 0;
        return shortestLen;
    }

    // Knight Tour
    public static boolean knightTour(int sr, int sc, int[][] board, int move, int[] dirX, int[] dirY) {
        board[sr][sc] = move; // block

        if (move == 63) {
            return true;
        }

        boolean res = false;
        for (int d = 0; d < 8; d++) {
            int r = sr + dirX[d];
            int c = sc + dirY[d];

            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == -1) {
                res = res || knightTour(r, c, board, move + 1, dirX, dirY);
                if (res)
                    return res;

            }
        }

        board[sr][sc] = -1; // free
        return res;
    }

    public static void knightTour() {
        int n = 8;
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = -1;

        int[] dirX = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] dirY = { 1, 2, 2, 1, -1, -2, -2, -1 };
        knightTour(0, 0, board, 0, dirX, dirY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // int[][] dir4 = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        // String[] dir4S = { "t", "r", "d", "l" };

        // int[][] board = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 0 } };

        // int[][] dir8 = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, -1 }, { 1,
        // -1 }, { 1, 1 }, { -1, 1 } };
        // String[] dir8S = { "u", "r", "d", "l", "n", "w", "s", "e" };

        // int n = 3, m = 3;
        // System.out.println(floodFill_2(0, 0, board, "", dir4, dir4S));
        // System.out.println(floodFill_longestLen(0, 0, board, dir4));

        knightTour();
    }

}
public class questions {
    // 46
    public void permute(int[] nums, int count, List<List<Integer>> res, List<Integer> ans) {
        if (count == nums.length) {
            List<Integer> base = new ArrayList<>();
            for (int ele : ans)
                base.add(ele);
            res.add(base);
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= -10 && nums[i] <= 10) {
                int val = nums[i];

                nums[i] = -11;
                ans.add(val);

                permute(nums, count + 1, res, ans);

                ans.remove(ans.size() - 1);
                nums[i] = val;
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        permute(nums, 0, res, ans);

        return res;
    }

    // 47

    // https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#
    public static int floodFill(int sr, int sc, int[][] arr, String ans, int[][] dir, String[] dirS,
            ArrayList<String> res) {

        int n = arr.length, m = arr[0].length;
        if (sr == n - 1 && sc == m - 1) {
            res.add(ans);
            return 1;
        }

        arr[sr][sc] = 0; // block
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < n && c < m && arr[r][c] == 1) {
                count += floodFill(r, c, arr, ans + dirS[d], dir, dirS, res);
            }
        }

        arr[sr][sc] = 1; // free
        return count;
    }

    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> res = new ArrayList<>();
        if (n == 0 || arr[n - 1][n - 1] == 0 || arr[0][0] == 0)
            return res;

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        String[] dirS = { "D", "U", "R", "L" };

        int count = floodFill(0, 0, arr, "", dir, dirS, res);

        Collections.sort(res);

        return res;
    }

    // https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/
    int mod = 1e9 + 7;
    public int floodFill(int sr, int sc, int[][] arr, int[][] dir) {

        int n = arr.length, m = arr[0].length;
        if (sr == n - 1 && sc == m - 1) {
            return 1;
        }

        arr[sr][sc] = 1; // block
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < n && c < m && arr[r][c] == 0) {
                count = (count % mod + floodFill(r, c, arr, dir) % mod) % mod;
            }
        }

        arr[sr][sc] = 0; // free
        return count;
    }

    public int FindWays(int n, int m, int[][] blocked_cells) {
        int[][] arr = new int[n][m];
        for (int[] cell : blocked_cells) {
            int i = cell[0] - 1;
            int j = cell[1] - 1;

            arr[i][j] = 1;
        }

        if (arr[n - 1][m - 1] == 1 || arr[0][0] == 1)
            return 0;

        int[][] dir = { { 0, 1 }, { 1, 0 } };
        int count = floodFill(0, 0, arr, dir);
        return count;
    }

}

