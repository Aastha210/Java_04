package Unit3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TreeMap1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for(char c:s.toCharArray()) {
            tm.put(c,tm.getOrDefault(c,0)+1);
        }
        for(Map.Entry m:tm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}