import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
       
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the x:");
        int x = sc.nextInt();
         int s=0;
         int e=n-1;
         int start=-1,end=-1;
        while(s<e){
            if(start==-1){
                if(arr.get(s)==x){
                    System.out.println("First position: "+s);
                    start=0;
               }
            }
            if(end==-1){
                if(arr.get(e)==x){
                    System.out.println("Last position: "+e);
                    end=0;
                }
            }
            s++;
            e--;
        }
    }
}
