package ai_tasks;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Ви ввели неправильне число! Рік встановлено на 0.");
        }
    }

    public void displayInfo() {
        System.out.println("Назва: \"" + title
                + "\", Автор: " + author
                + ", Рік видання: " + year + ".");
    }
}