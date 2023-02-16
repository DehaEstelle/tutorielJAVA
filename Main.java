import java.util.Arrays;
import java.util.Collections;                   

public class Main {

    public static void main(String[] args) {
        Integer[] sommes = {8};
        if(sommes.length > 0) {
            Arrays.sort(sommes, Collections.reverseOrder());  
            System.out.println(Arrays.toString(sommes));

            int x = 0;
            int[] arr = new int[sommes.length-1];
            for(int i = 0; i < (sommes.length-1) ; i++) {
                arr[i] = sommes[i] - sommes[i+1];         
                for(int j = 0; j < (arr.length) ; j++) {
                    x += arr[j];         
                }
            }
            // System.out.println(Arrays.toString(arr));
            System.out.println(x);
        } else {
            System.out.println(0);
        }
    }
}