public class classarray {
    
}
import java.util.*;

public class l004_Arrays {
    public static Scanner scn = new Scanner(System.in);

    public static void test1(int n) {
        // type[] nameOfArray = new type[size]; with default value 0.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void display1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // get
        }
    }

    public static void display2(int[] arr) {

        // forEach loop used for :
        // 1. only for get, if you try to set value ypu get a beutifull error.
        // 2. automatically increment by 1
        // 3. always in forward direction
        // 4. range of loop : [0 , n - 1]

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void input1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); // set
        }
    }

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); // set
        }

        return arr;
    }

    public static int maximum(int[] arr) {
        int maxEle = -(int) 1e9; // Integer.MIN_VALUE;
        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);
        }

        return maxEle;
    }

    public static int maximum2(int[] arr) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;

        int maxEle = arr[0]; // Integer.MIN_VALUE;
        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);
        }

        return maxEle;
    }

    public static int minimum(int[] arr) {
        int minEle = (int) 1e9;
        for (int ele : arr) {
            minEle = Math.min(minEle, ele);
        }

        return minEle;
    }

    // if you found return index, otherwise return -1.
    public static int find(int[] arr, int data) {
        int foundAtIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                foundAtIndex = i;
                break;
            }
        }

        return foundAtIndex;
    }

    public static int find2(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return i;
        }

        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 10,20,30,40,50,60 -> 60,50,40,30,20,10
    public static void reverseOfArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void inverseOfArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = arr[i];
            ans[idx] = i;
            i++;
        }
        display ans;
    }

    public static int spanOfArray(int[] arr) {
        int maxEle = -(int) 1e9;
        int minEle = (int) 1e9;

        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);
            minEle = Math.min(minEle, ele);
        }

        return maxEle - minEle;
    }

    public static int[] rotateOfArray(int[] arr, int r) {
        int n = arr.length;
        r %= n;
        if (r < 0)
            r += n;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = (i + r) % n;
            ans[idx] = arr[i];
        }

        return ans;
    }

    public static void reverseOfArray(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateOfArray2(int[] arr, int r) {
        int n = arr.length;
        r %= n;
        if (r < 0)
            r += n;

        reverseOfArray(arr, 0, n - 1);
        reverseOfArray(arr, 0, r - 1);
        reverseOfArray(arr, r, n - 1);
    }

    public static void sumOfTwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int p = Math.max(n, m) + 1;
        int[] ans = new int[p];

        int i = n - 1, j = m - 1, k = p - 1, carry = 0;
        while (k >= 0) {
            int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
            ans[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < p; idx++) {
            if (idx == 0 && ans[idx] == 0)
                continue;
            System.out.print(ans[idx]);
        }

    }

    // arr1 as number > arr2 as number
    public static void subtractOfTwoArray(int[] arr1, int[] arr2) {

    }
    public static void subtractOfTwoArray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[m];

        int i = n - 1, j = m - 1, k = m - 1;
        int borrow = 0;
        while (k >= 0) {
            int diff = borrow + arr2[j] - (i >= 0 ? arr1[i] : 0);
            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;
        }

        boolean nonZeroFound = false;
        for (int ele : ans) {
            if (ele != 0) {
                nonZeroFound = true;
            }

            if (nonZeroFound)
                System.out.println(ele);
        }

    }
    @@ -0,0 +1,45 @@
import java.util.*;

public class ABTAB {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int anyBaseToDecimal(int n, int b) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;

            ans += rem * pow;
            pow *= b;
        }

        return ans;
    }

    public static int decimalToAnyBase(int n, int b) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % b;
            n /= b;

            ans += rem * pow;
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int decimalNumber = anyBaseToDecimal(n,b1);
        System.out.println(decimalToAnyBase(decimalNumber, b2));
    }

} 
 26  2020/pp-mar 14/lecture_002_BinaryForms/ABTD.java 
@@ -0,0 +1,26 @@
import java.util.*;

public class ABTD {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int anyBaseToDecimal(int n,int b) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;

            ans += rem * pow;
            pow *= b;
        }

        return ans;
    }

    public static void main(String[] args) {

    }

} 
 14  2020/pp-mar 14/lecture_002_BinaryForms/AbAddition.java 
@@ -0,0 +1,14 @@
import java.util.*;

public class AbAddition {
    public static Scanner scn = new Scanner(System.in);

    public static int anyBaseAddition(int n, int b) {

    }

    public static void main(String[] args) {

    }

} 
 10  2020/pp-mar 14/lecture_002_BinaryForms/BTD.java 
@@ -6,7 +6,17 @@
    public static Scanner scn = new Scanner(System.in);

    public static int binaryToDecimal(int n) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;

            ans += rem * pow;
            pow *= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
 28  2020/pp-mar 14/lecture_002_BinaryForms/DTAB.java 
@@ -0,0 +1,28 @@
import java.util.*;

public class DTAB {
    // decimal to Binary

    public static Scanner scn = new Scanner(System.in);

    public static int decimalToAnyBase(int n, int b) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % b;
            n /= b;

            ans += rem * pow;
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(decimalToAnyBase(n, b));
    }

} 
 BIN +791 Bytes 2020/pp-mar 14/lecture_002_BinaryForms/DTB.class 
Binary file not shown.
 13  2020/pp-mar 14/lecture_002_BinaryForms/DTB.java 
@@ -6,11 +6,22 @@
    public static Scanner scn = new Scanner(System.in);

    public static int decimalToBinary(int n) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 2;
            n /= 2;

            ans += rem * pow;
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        System.out.println(decimalToBinary(n));
    }

} 


    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        // input1(arr);
        // int r = scn.nextInt();
        // int[] ans = rotateOfArray(arr, r);
        // display1(ans);
        inverseOfArray2(arr);
    }
}
import java.util.*;

public class q001_digitFreqForQuery {
    public static Scanner scn = new Scanner(System.in);

    public static void digitFreq(int n, int[] query) {
        for (int q : query) {

        }
    }

    public static void main(String[] args) {
        long n = scn.nextLong();
        int[] query = new int[scn.nextInt()];
        for (int i = 0; i < query.length; i++) {
            query[i] = scn.nextInt();
        }
    }

}
public static void printInRange(int[] arr, int si, int ei) {
    while (si <= ei) {
        System.out.print(arr[si] + " ");
        si++;
    }
}

public static void printAllSubArrays(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            printInRange(arr, i, j);
        }
    }
}

public static int binarySearch(int[] arr, int data) {
    int si = 0, ei = arr.length - 1;
    while (si <= ei) {
        int mid = (si + ei) / 2;
        if (arr[mid] == data)
            return mid;
        else if (arr[mid] < data)
            si = mid + 1;
        else
            ei = mid - 1;
    }

    return -1;
}
public static int anyBaseAddition(int n, int b) {

    public static int anyBaseAddition(int n, int m, int b) {
        int pow = 1;
        int ans = 0, carry = 0;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;

            int digit = sum % b;
            carry = sum / b;

            ans += digit * pow;
            pow *= 10;
        }

        return ans;
    }

    // m > n
    public static int anyBaseSubtraction(int n, int m, int b) {
        int pow = 1, res = 0, borrow = 0;
        while (m != 0) {
            int diff = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;

            if (diff < 0) {
                diff += b;
                borrow = -1;
            } else
                borrow = 0;

            res += diff * pow;
            pow *= 10;
        }

        return res;
    }

    public static int multiplyNumberWithDigit(int n, int d, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n != 0 || carry != 0) {
            int prod = carry + (n % 10) * d;
            n /= 10;

            int digit = prod % b;
            carry = prod / b;

            ans += digit * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int anyBaseMultiplication(int n, int m, int b) {
        int ans = 0, pow = 1;
        while (m != 0) {
            int d = m % 10;
            m /= 10;
            int prodRes = multiplyNumberWithDigit(n, d, b) * pow;
            ans = anyBaseAddition(ans, prodRes, b);
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(anyBaseMultiplication(n, m, b));
    }

} 
public static int firstIndex(int[] arr, int data) {
    int si = 0, ei = arr.length - 1;
    while (si <= ei) {
        int mid = (si + ei) / 2;
        if (arr[mid] == data) {
            if (mid - 1 >= 0 && arr[mid - 1] == data)
                ei = mid - 1;
            else
                return mid;
        } else if (data < arr[mid])
            ei = mid - 1;
        else
            si = mid + 1;
    }

    return -1;
}

public static int lastIndex(int[] arr, int data) {
    int n = arr.length;
    int si = 0, ei = n - 1;
    while (si <= ei) {
        int mid = (si + ei) / 2;
        if (arr[mid] == data) {
            if (mid + 1 < n && arr[mid + 1] == data)
                si = mid + 1;
            else
                return mid;
        } else if (data < arr[mid])
            ei = mid - 1;
        else
            si = mid + 1;
    }

    return -1;
}

public static void FirstAndLastIdx(int[] arr, int data) {
    int fi = firstIndex(arr, data);
    if (fi == -1) {
        System.out.println("Data Not Found!");
        return;
    }

    int li = lastIndex(arr, data);

    System.out.println(fi);
    System.out.println(li);
}
import java.util.*;

public class l001 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length; // no of rows
        int m = arr[0].length; // no of colums

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        int n = arr.length; // no of rows
        int m = arr[0].length; // no of colums

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void display2(int[][] arr) {
        for (int[] ar : arr) {
            for (int e : ar) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static int maximum(int[][] arr) {
        int maxValue = -(int) 1e9;
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxValue = Math.max(maxValue, arr[i][j]);
            }
        }

        return maxValue;
    }

    public static int minimum(int[][] arr) {
        int minValue = (int) 1e9;
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                minValue = Math.min(minValue, arr[i][j]);
            }
        }

        return minValue;
    }

    public static boolean find(int[][] arr, int data) {
        boolean res = false;
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res = arr[i][j] == data;
                if (res)
                    return res;
            }
        }

        return res;
    }

    public static void stateOfWakanda(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++)
                    System.out.println(arr[i][j]);
            } else {
                for (int i = n - 1; i >= 0; i--)
                    System.out.println(arr[i][j]);
            }
        }
    }

    public static void stateOfWakanda_FB(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++)
                    System.out.println(arr[i][j]);
            } else {
                for (int j = m - 1; j >= 0; j--)
                    System.out.println(arr[i][j]);
            }
        }
    }

    //stateOfWakanda2
    public static void diagonalPrint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void FulldiagonalPrint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = n-1; gap >= 1; gap--) {
            for (int i = gap, j = 0; i < n && j < m; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
        
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        display(arr);
    }
}
© 2021 GitHub, Inc.
public static Scanner scn = new Scanner(System.in);
@@ -99,7 +99,7 @@ public static void stateOfWakanda_FB(int[][] arr) {
        }
    }

    //stateOfWakanda2
    // stateOfWakanda2
    public static void diagonalPrint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
@@ -111,19 +111,151 @@ public static void diagonalPrint(int[][] arr) {

    public static void FulldiagonalPrint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = n-1; gap >= 1; gap--) {
        for (int gap = n - 1; gap >= 1; gap--) {
            for (int i = gap, j = 0; i < n && j < m; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
        

        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void spiralPrint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m - 1;
        int tnel = n * m;

        while (tnel > 0) {
            for (int r = rmin; r <= rmax && tnel > 0; r++) {
                System.out.println(arr[r][cmin]);
                tnel--;
            }
            cmin++;

            for (int c = cmin; c <= cmax && tnel > 0; c++) {
                System.out.println(arr[rmax][c]);
                tnel--;
            }
            rmax--;

            for (int r = rmax; r >= rmin && tnel > 0; r--) {
                System.out.println(arr[r][cmax]);
                tnel--;
            }
            cmax--;

            for (int c = cmax; c >= cmin && tnel > 0; c--) {
                System.out.println(arr[rmin][c]);
                tnel--;
            }
            rmin++;
        }
    }

    public static void exitPoint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int dir = 0;
        int i = 0, j = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) { // North
                j++;
                if (j == m) {
                    System.out.println(i + "\n" + (j - 1));
                    break;
                }
            } else if (dir == 1) { // East
                i++;
                if (i == n) {
                    System.out.println((i - 1) + "\n" + (j));
                    break;
                }
            } else if (dir == 2) { // South
                j--;
                if (j == -1) {
                    System.out.println((i) + "\n" + (j + 1));
                    break;
                }
            } else { // West
                i--;
                if (i == -1) {
                    System.out.println((i + 1) + "\n" + (j));
                    break;
                }
            }
        }
    }

    public static void swap(int[][] arr, int i1, int j1, int i2, int j2) {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }

    public static void rotate90(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                swap(arr, i, j, j, i);
            }
        }

        // column shifting
        int si = 0, ei = m - 1;
        while (si < ei) {
            for (int i = 0; i < n; i++) {
                swap(arr, i, si, i, ei);
            }
            si++;
            ei--;
        }
    }

    public static int maxInCol(int[][] arr, int c) {
        int maxVal = -(int) 1e9;
        int r = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] > maxVal) {
                maxVal = arr[i][c];
                r = i;
            }
        }

        return r;
    }

    public static void saddlePoint(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            // find min in row
            int minVal = (int) 1e9;
            int c = -1;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                    c = j;
                }
            }

            int r = maxInCol(arr, c);

            if (r == i) {
                System.out.println(arr[r][c]);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("Invalid input");
    }
    public class l001 {
        public static boolean isPlaindrome(String str, int si, int ei) {
            while (si < ei) {
                if (str.charAt(si) != str.charAt(ei))
                    return false;
                si++;
                ei--;
            }
    
            return true;
        }
    
        public static void printAllPalindromicSubString(String str) {
            int n = str.length();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (isPlaindrome(str, i, j)) {
                        String s = str.substring(i, j + 1);
                        System.out.println(s);
                    }
                }
            }
        }
    
        public static void removeDuplicates(String str) {
            if (str.length() == 0)
                return;
    
            int n = str.length();
            String ans = str.charAt(0) + "";
    
            int i = 1;
            int changes = 0;
            while (i < n) {
                while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i))
                    i++;
    
                changes++;
                if (i < n)
                    ans += str.charAt(i);
                i++;
            }
    
            System.out.println(ans);
        }
    
        public static void removeDuplicatesInsertCount(String str) {
            if (str.length() == 0)
                return;
    
            int n = str.length();
            String ans = str.charAt(0) + "";
    
            int i = 1;
            int changes = 0, count = 0;
    
            while (i < n) {
                count = 1;
                while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                    i++;
                    count++;
                }
    
                changes++;
                if (count > 1)
                    ans += count;
                if (i < n)
                    ans += str.charAt(i);
                i++;
            }
    
            System.out.println(ans);
            System.out.println(changes);
        }
    
        public static int countOfHi(String str) {
            int n = str.length();
            int i = 0, count = 0;
            while (i < n - 1) {
                if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                    count++;
                    i += 2;
                } else
                    i++;
            }
            return count;
        }
    
        public static int countHiWithoutHit(String str) {
            int n = str.length();
            int i = 0, count = 0;
            while (i < n - 1) {
                if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                    if (i + 2 < n && str.charAt(i + 2) == 't') {
                        i += 3;
                    } else {
                        count++;
                        i += 2;
                    }
                } else
                    i++;
            }
    
            return count;
    
        }
    
        public static void main(String[] args) {
            // String str = "aaaaaabbbbbbbbccccccdddefghiiiiiiijjjjjk";
            // removeDuplicates(str);
            // removeDuplicatesInsertCount(str);
    
            // System.out.println(countOfHi("hihijhiihihih"));
            System.out.println(countHiWithoutHit("ihihit"));
        }
    
    } 

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
0 comments on commit f15d779

import java.util.Scanner;
import java.util.ArrayList;

public class l002_ArrayList {
    public static Scanner scn = new Scanner(System.in);

    public static void basicFunction() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);
        for (Integer e : arr)
            System.out.println(e);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        arr.remove(1);
        System.out.println(arr);
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void removeData() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int a = scn.nextInt();
            arr.add(a);
        }
        int data = scn.nextInt();

        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == 10) {
                swap(arr, i, arr.size() - 1);
                arr.remove(arr.size() - 1);
            }
            i--;
        }
    }
    public static void removeDuplicates(String str) {
        if (str.length() == 0)
            return;
        int n = str.length();
        String ans = str.charAt(0) + "";
        int i = 1;
        int changes = 0;
        while (i < n) {
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i))
                i++;
            changes++;
            if (i < n)
                ans += str.charAt(i);
            i++;
        }
        System.out.println(ans);
    }
    public static void removeDuplicatesInsertCount(String str) {
        if (str.length() == 0)
            return;
        int n = str.length();
        String ans = str.charAt(0) + "";
        int i = 1;
        int changes = 0, count = 0;
        while (i < n) {
            count = 1;
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            changes++;
            if (count > 1)
                ans += count;
            if (i < n)
                ans += str.charAt(i);
            i++;
        }
        System.out.println(ans);
        System.out.println(changes);
    }
    public static int countOfHi(String str) {
        int n = str.length();
        int i = 0, count = 0;
        while (i < n - 1) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
                i += 2;
            } else
                i++;
        }
        return count;
    }
    public static int countHiWithoutHit(String str) {
        int n = str.length();
        int i = 0, count = 0;
        while (i < n - 1) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                if (i + 2 < n && str.charAt(i + 2) == 't') {
                    i += 3;
                } else {
                    count++;
                    i += 2;
                }
            } else
                i++;
        }

        return count;
    }

