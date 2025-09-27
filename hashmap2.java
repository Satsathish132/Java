//Write a program to sort a HashMap by keys.
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class hashmap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> ha=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            String b=sc.next();
            ha.put(i, b);
        }System.out.println("Successfully inserted");
        TreeMap<Integer,String> sa=new TreeMap<>(ha);
        System.out.println(sa);
    }
}
