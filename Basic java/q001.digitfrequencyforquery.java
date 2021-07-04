
import java.util.*;

public class q001.digitsfrequencyforquery {
    public static Scanner scn = new Scanner(System.in);

    public static void digitFreq(int n, int[] query) {
        int [] freq = new int[10];
        while(n !=){
            long d = n%10;
            n/10;
            freq[(int) d]++;
        }
        for (int q : query) {
            System.out.print(freq [q]);
            

            }

        }
    }

    public static void main(String[] args) {
        long n = scn.nextLong();
        int[] query = new int[scn.nextInt()];
        for (int i = 0; i < query.length; i++) {
            query[i] = scn.nextInt();
        } digitFreq(n, query);
    }

} 
