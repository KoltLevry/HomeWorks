package homework_38.task_2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        // #1
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer int1, Integer int2) {
//                boolean isFirstEven = int1 % 2 == 0;
//                boolean isSecondEven = int2 % 2 == 0;
//
//                if (isFirstEven && !isSecondEven) {
//                    return -1;
//                } else if (!isFirstEven && isSecondEven) {
//                    return 1;
//                } else {
//                    return Integer.compare(int1, int2);
//                }
//            }
//        };
//        Arrays.sort(integers, comparator);
//        System.out.println(Arrays.toString(integers));

        // #2
        Comparator<Integer> comparator = (int1, int2) ->
                (int1 % 2 == 0 && int2 % 2 != 0) ? -1 :
                (int1 % 2 != 0 && int2 % 2 == 0) ? 1 :
                Integer.compare(int1,int2);
        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));

    }
}
