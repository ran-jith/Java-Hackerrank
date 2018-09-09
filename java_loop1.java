import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int t=0;
        int mult=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=0;i<10;i++){
            t++;
            mult = N*t;
            System.out.print(N);
            System.out.format(" x ");
            System.out.print(t);
            System.out.print(" = ");
            System.out.println(mult);
        }

        scanner.close();
    }
}
