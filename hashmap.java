//Implement a frequency counter for words in a given sentence using HashMap
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("number of element :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("enter the elements "+i+":");
            String a=sc.next();
            map.put(i,a);
        }int count=1;
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                if(map.get(i).equals(map.get(j))){
                    int c=1;
                    c+=1;
                    System.out.println("Frequency"+i+" :"+c);
                }else{
                    System.out.println("Frequency"+i+" :"+count);
                }
        }
    }
    }    
}
