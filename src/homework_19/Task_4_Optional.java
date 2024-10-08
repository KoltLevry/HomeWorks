package homework_19;
/*  Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
public class Task_4_Optional {
    public void printMessage(final String message){
        // message = "0"; final делает переменную неизменяемой
        System.out.println(message);
        // message = "0";
    }

    public static void main(String[] args) {
        Task_4_Optional str = new Task_4_Optional();

        str.printMessage("try");
    }
}

