package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class arrListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9));
    }
        public static Integer sumEven(ArrayList<Integer> intArr){
            int total = 0;
            for(Integer integer: intArr){
                if(integer%2 ==0){
                    total += integer;
                }
            }
            return total;
        }



}
