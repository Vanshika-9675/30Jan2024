/**
 * Occurences
 */
import java.util.*;
public class Occurences {
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
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==x){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}