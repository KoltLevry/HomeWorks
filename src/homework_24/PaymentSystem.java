package homework_24;

import java.util.Objects;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();
    void transferMoney(PaymentSystem targetAccount, double amount);
}

abstract class BaseAccount implements PaymentSystem{
    protected boolean accessAllowed;
    protected double depositAmount;
    private final String username;
    private final String password;
    private final String correctUsername;
    private final String correctPassword;

    public BaseAccount(String username, String password, String correctUsername, String correctPassword) {
        this.username = username;
        this.password = password;
        this.correctUsername = correctUsername;
        this.correctPassword = correctPassword;
    }

    public void accessAllowed(){
        if (Objects.equals(password, correctPassword) && Objects.equals(username, correctUsername)){
            accessAllowed = true;
            System.out.println("Доступ дозволено! Вітаю, " + username);
        } else {
            System.out.println("Доступ відхилено! Неправильні дані.");
        }
    }
    @Override
    public void withdrawMoney(double amount){
        if (accessAllowed){
            if (amount <= 0) {
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            } else if (depositAmount >= amount) {
                depositAmount -= amount;
                System.out.println("Знята сума: " + amount + " $");
            } else{
                System.out.println("Недостатньо коштів на рахунку.");
            }
        } else {
            System.out.println("Спочатку потрібно авторизуватися.");
        }
    }

    @Override
    public void depositTransfer(double amount){
        if (accessAllowed){
            if (amount > 0){
                depositAmount += amount;
                System.out.println("Покладено на рахунок суму: " + amount + " €");
            } else{
                System.out.println("Неможливо проводити операції з від'ємними сумами!");
            }
        } else {
            System.out.println("Спочатку потрібно авторизуватися.");
        }
    }

    @Override
    public void checkBalance(){
        if (accessAllowed) {
            System.out.println("Залишок на рахунку: " + depositAmount + " €");
        } else {
            System.out.println("Спочатку потрібно авторизуватися.");
        }
    }

    @Override
    public void transferMoney(PaymentSystem targetAccount, double amount) {
        if (accessAllowed && depositAmount >= amount) {
            withdrawMoney(amount);
            targetAccount.depositTransfer(amount);
            System.out.println("Переведено " + amount + " € на інший рахунок.");
        } else if (!accessAllowed) {
            System.out.println("Спочатку потрібно авторизуватися.");
        } else {
            System.out.println("Недостатньо коштів для переказу.");
        }
    }
}

class BankAccount extends BaseAccount{
    private static final String PASSWORD = "123qwerty";
    private static final String USERNAME = "Anna";

    public BankAccount(String name, String password) {
        super(name, password, USERNAME, PASSWORD);
    }
}

class ElectronicWallet extends BaseAccount{
    private static final String PASSWORD = "123qwerty123";
    private static final String USERNAME = "Anna";

    public ElectronicWallet(String name, String password) {
        super(name, password, USERNAME, PASSWORD);
    }
}

class dispMainInfoMoneyTransfer{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anna", "123qwerty");
        ElectronicWallet eWallet = new ElectronicWallet("Anna", "123qwerty123");

        // Авторизація
        bankAccount.accessAllowed();
        eWallet.accessAllowed();

        // Перевірка балансу
        bankAccount.checkBalance();
        eWallet.checkBalance();

        // Операції з рахунками
        bankAccount.depositTransfer(200);
        eWallet.depositTransfer(100);

        // Переведення грошей з банківського рахунку на електронний гаманець
        bankAccount.transferMoney(eWallet, 50);

        // Перевірка балансів після переказу
        bankAccount.checkBalance();
        eWallet.checkBalance();
    }
}

