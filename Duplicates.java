import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
       
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr.get(i))){
                mp.put(arr.get(i),1);
            }
            else{
                mp.put(arr.get(i),mp.get(arr.get(i))+1);  
            }
        }
        for(int key:mp.keySet()){
           // System.out.println(key+" "+mp.get(key));
           if(mp.get(key)>1){
            System.out.println(mp.get(key));
           }
        }
    }
}
