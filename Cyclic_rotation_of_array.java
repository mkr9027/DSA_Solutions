
import java.util.*;

class Cyclic_rotation_of_array {
    static void rotate(int[] arr) {
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
           arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) 
     {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }
        rotate(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}