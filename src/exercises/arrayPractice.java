package exercises;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] intArr = {1, 1, 2, 3, 5, 8};
        for(int x = 0; x< intArr.length; x++){
            if(intArr[x] %2 ==1)
            System.out.println(intArr[x]);
        }

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = greenEggs.split("\\. ");
        System.out.println(Arrays.toString(words));

    }
}
