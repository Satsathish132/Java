//Write a program to remove duplicate elements from an ArrayList using HashSet
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> lists=new ArrayList<>();
        System.out.println("number of element :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("enter the elements:");
            int a=sc.nextInt();
            lists.add(a);
        }
        System.out.println("array :"+lists);

        Set<Integer> list=new HashSet<>(lists);
        List<Integer> lis=new ArrayList<>(list);
      
        System.out.println("removed duplicate :"+lis);
    }
}
