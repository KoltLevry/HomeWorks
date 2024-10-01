//package homework_16;
//
//public class MagicArray {
//    public int[] array;
//
//    public MagicArray(){
//        array = new int[10];
//    }
//
//    void add(int value){
//        if (cursor == array.length - 1){
//            expandArray();
//        }
//
//        array[cursor] = value;
//        cursor++;
//    }
//
//    void add(int... numbers){
//        System.out.println("Приняли несколько int. А именно: " + numbers.length);
//        System.out.println("Есть индекс у каждого int. А именно: " + numbers.length);
//    }
//
//    public String toString(){
//        String result = "[";
//        for (int i = 0; i < cursor; i++){
//            result = result + array[i] + (i < cursor - 1 ? ", " : "]")
//        }
//        return result;
//    }
//}
