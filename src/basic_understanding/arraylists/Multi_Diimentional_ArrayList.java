package basic_understanding.arraylists;

import java.util.Arrays;
import java.util.ArrayList;

public class Multi_Diimentional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Integer[][] arr = {
                {1, 2, 4,  5},
                {7, 8, 9, 11, 344, 456, 23},
                {4, 67, 2, 84, 213}
        };
        for(int i = 0; i < arr.length; i++){
            list.add(new ArrayList<Integer>(Arrays.asList(arr[i])));
        }
        /*
        for(int i = 0; i < 3; i++)
        for(int j = 0; j < list.get(i).size(); j++)
            list.get(i).add(sc.nextInt());
         */
    }
}
