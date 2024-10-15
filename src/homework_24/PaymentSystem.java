package homework_24;

import java.util.Objects;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();
    void transferMoney(PaymentSystem targetAccount, double amount);
}

class BankAccount implements PaymentSystem{
    private static final String PASSWORD = "123qwerty";
    private static final String USERNAME = "Anna";
    private boolean accessAllowed;
    private final String name;
    private final String password;
    private double depositAmount = 0;

    public BankAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void accessAllowed(){
        if (Objects.equals(password, PASSWORD) && Objects.equals(name, USERNAME)){
            accessAllowed = true;
            System.out.println("Доступ до банку дозволено! Вітаю " + name);
        } else{
            System.out.println("Доступ відхилено! Неправильні дані");
        }
    }

    @Override
    public void withdrawMoney(double amount){
        if (accessAllowed){
            if (amount > 0 && depositAmount > amount){
                depositAmount -= amount;
                System.out.println("Знята з рахунку сума: " + amount + " евро");
            } else if(amount < 0 ){
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            } else{
                System.out.println("Спроба вивести суму: " + amount + " евро. Недостатньо коштів на рахунку");
            }
        }
    }
    @Override
    public void depositTransfer(double amount){
        if (accessAllowed){
            if (amount > 0){
                depositAmount += amount;
                System.out.println("Покладено на рахунок суму: " + amount + " евро");
            } else{
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            }
        }
    }
    @Override
    public void checkBalance(){
        if (accessAllowed) {
            System.out.println("Залишок на рахунку: " + depositAmount + " євро");
        } else {
            System.out.println("Відмовлено! Спочатку потрібно авторизуватися.");
        }
    }
    @Override
    public void transferMoney(PaymentSystem targetAccount, double amount) {
        if (accessAllowed && depositAmount >= amount) {
            withdrawMoney(amount);
            targetAccount.depositTransfer(amount);
            System.out.println("Переведено " + amount + " євро на інший рахунок.");
        } else if (!accessAllowed) {
            System.out.println("Спочатку потрібно авторизуватися.");
        } else {
            System.out.println("Недостатньо коштів для переказу.");
        }
    }
}

class ElectronicWallet implements PaymentSystem{
    private static final String PASSWORD = "123qwerty123";
    private static final String USERNAME = "Anna";
    private boolean accessAllowed;
    private final String name;
    private final String password;
    private double depositAmount = 0;

    public ElectronicWallet(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void accessAllowed(){
        if (Objects.equals(password, PASSWORD) && Objects.equals(name, USERNAME)){
            accessAllowed = true;
            System.out.println("Доступ до електронного гаманця дозволено! Вітаю " + name);
        } else{
            System.out.println("Доступ відхилено! Неправильні дані");
        }
    }

    @Override
    public void withdrawMoney(double amount){
        if (accessAllowed){
            if (amount > 0 && depositAmount > amount){
                depositAmount -= amount;
                System.out.println("Знята з рахунку сума: " + amount + " $");
            } else if(amount < 0 ){
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            } else{
                System.out.println("Спроба вивести суму: " + amount + " $. Недостатньо коштів на рахунку");
            }
        }
    }
    @Override
    public void depositTransfer(double amount){
        if (accessAllowed){
            if (amount > 0){
                depositAmount += amount;
                System.out.println("Покладено на рахунок суму: " + amount + " $");
            } else{
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            }
        }
    }
    @Override
    public void checkBalance(){
        if (accessAllowed) {
            System.out.println("Залишок на рахунку: " + depositAmount + " $");
        } else {
            System.out.println("Відмовлено! Спочатку потрібно авторизуватися.");
        }
    }
    @Override
    public void transferMoney(PaymentSystem targetAccount, double amount) {
        if (accessAllowed && depositAmount >= amount) {
            withdrawMoney(amount);
            targetAccount.depositTransfer(amount);
            System.out.println("Переведено " + amount + " $ на інший рахунок.");
        } else if (!accessAllowed) {
            System.out.println("Спочатку потрібно авторизуватися.");
        } else {
            System.out.println("Недостатньо коштів для переказу.");
        }
    }
}

//class Main{
//    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("Anna", "123qwerty");
//        ElectronicWallet eWallet = new ElectronicWallet("Anna", "123qwerty123");
//
//        // Авторизація
//        bankAccount.accessAllowed();
//        eWallet.accessAllowed();
//
//        // Перевірка балансу
//        bankAccount.checkBalance();
//        eWallet.checkBalance();
//
//        // Операції з рахунками
//        bankAccount.depositTransfer(200);
//        eWallet.depositTransfer(100);
//
//        // Переведення грошей з банківського рахунку на електронний гаманець
//        bankAccount.transferMoney(eWallet, 50);
//
//        // Перевірка балансів після переказу
//        bankAccount.checkBalance();
//        eWallet.checkBalance();
//    }
//}

