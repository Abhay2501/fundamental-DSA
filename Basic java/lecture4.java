public class lecture4 {
 

public class l003_patterns {
    public static Scanner scn = new Scanner(System.in);

    public static void squarePrint(int n) {
        int nst = n;

        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) // cst is count of star, nst = number of star
                System.out.print("*\t");

            nst = n;
            System.out.println();
        }
    }

    public static void trainglePrint(int n) {
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) // cst is count of star, nst = number of star
                System.out.print("*\t");

            nst++;
            System.out.println();
        }
    }

    public static void invertedTrainglePrint(int n) {
        int nst = n;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) // cst is count of star, nst = number of star
                System.out.print("*\t");

            nst--;
            System.out.println();
        }
    }

    public static void mirrorTraingle(int n) {
        int nst = 1;
        int nsp = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            nst++;
            nsp--;
            System.out.println();
        }
    }

    public static void halfDiamond(int n) {
        int nst = 1, nsp = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp--;
            nst += 2;
            System.out.println();
        }
    }

    public static void fullDiamond(int n) {
        int nst = 1, nsp = n / 2;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        int nst = (n / 2) + 1, nsp = 1;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            if (row <= n / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
            System.out.println();
        }
    }

    public static void numberDiamond(int n) {
        int nst = 1, nsp = n / 2;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            int val = row;
            if (row > n / 2 + 1)
                val = n - row + 1;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                if (cst <= nst / 2)
                    val++;
                else
                    val--;
            }

            if (row <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    // pattern 7
    public static void backwardSlash(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    //pattern 8
    public static void forwardSlash(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        forwardSlash(n);
    }
} 
public static void hillPattern(int n) {
    int nsp = 2 * n - 3;
    int nst = 1;

    for (int row = 1; row <= n; row++) {
        int val = 1;
        for (int cst = 1; cst <= nst; cst++)
            System.out.print(val++ + "\t");

        for (int csp = 1; csp <= nsp; csp++)
            System.out.print("\t");

        if (row == n) {
            nst--;
            val--;
        }

        for (int cst = 1; cst <= nst; cst++) {
            System.out.print(--val + "\t");
        }

        nsp -= 2;
        nst++;

        System.out.println();
    }
}

public static void testContinue(int n) {
    // print all number form 1 to n except 5.
    for (int i = 1; i <= n; i++) {
        if (i == 5)
            break;
        System.out.print(i + " ");

    }

}

public static void main(String[] args) {
    int n = scn.nextInt();
    forwardSlash(n);
    testContinue(n);
}
} 
BIN +1.51 KB 2020/pp-mar 14/lecture_001_Basic/l004_Arrays.class 
Binary file not shown.
48  2020/pp-mar 14/lecture_001_Basic/l004_Arrays.java 
@@ -0,0 +1,48 @@
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

public static void display2(int[] arr) 

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

public static void main(String[] args) {
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println(arr);
    input1(arr);
    display1(arr);
}
} 
17  2020/pp-mar 14/lecture_001_Basic/output.txt 
@@ -1,15 +1,2 @@
                                                    *	
                                                *		
                                            *			
                                        *				
                                    *					
                                *						
                            *							
                        *								
                    *									
                *										
            *											
        *												
    *													
*														
*															
[I@7291c18f
15 12 141 45 75 88 852 46 44 56 
0 comments on commit 9c26a6a
Please sign in to comment.
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About


