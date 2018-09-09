import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner str = new Scanner(System.in);
    int num = 1;    
    
    while (str.hasNextLine() == true) {
    if (str.hasNext() == true) {
        System.out.println(num + " " + str.nextLine());
        num++;
    }
    }
    
    }
}
