package homework_39;

import lists.MyList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static <T> List<T> getCommonElements(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(3,4,5,6,7,8);

        List<Integer> result = Task1.getCommonElements(list1,list2);
        System.out.println(result);
    }
}
