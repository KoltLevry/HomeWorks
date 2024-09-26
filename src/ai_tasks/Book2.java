package ai_tasks;

public class Book2 {
    private String title;
    private String author;
    private int year;

    public Book2(String title, String author, int year){
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
        if (year > 0){
            this.year = year;
        } else {
            year = 0;
        }
    }

    public void openBook(){
        System.out.println("Відкриваю книжку за назвою: " + title +
                ". Автор: " + author + ". Рік: " + year);
    }
}

class FictionalBook extends Book2{
    private String genre;

    public FictionalBook(String title, String author, int year, String genre){
        super(title,author,year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void openFictionaBook(){
        System.out.println("Відкриваю книжку FictionalBook за жанром: " + genre);
    }
    public void closeFictionaBook(){
        System.out.println("Закриваю книжку FictionalBook за жанром: " + genre);
    }
}

class ScienceBook extends Book2{
    private String field;

    public ScienceBook(String title, String author, int year, String field){
        super(title,author,year);
        this.field = field;
    }

    public String getGenre() {
        return field;
    }

    public void setGenre(String genre) {
        this.field = field;
    }

    public void writeBookField(){
        System.out.println("Записую галузь науки книжки ScienceBook: " + field);
    }
    public void readBookField(){
        System.out.println("Читаю галузь науки книжки ScienceBook: " + field);
    }
}

//public static void main(String[] args) {
//
//    FictionalBook fictionalBook = new FictionalBook("Воно", "Стівен Кінг", 1986, "Сучасна література / Жахи / Містика");
//    System.out.println("\t == fictionalBook ==");
//    fictionalBook.openFictionaBook();
//    fictionalBook.closeFictionaBook();
//    fictionalBook.openBook();
//
//    ScienceBook scienceBook = new ScienceBook("Емоційний інтелект", "Деніел Ґоулман", 2023, "Психологія");
//    System.out.println("\n\t == scienceBook ==");
//    scienceBook.readBookField();
//    scienceBook.writeBookField();
//    scienceBook.openBook();
//
//    Book2 book2 = new Book2("Іди туди, де страшно. І матимеш те, про що мрієш", "Джим Ловлесс", -2);
//    System.out.println("\n\t == book2 - Vehicle ==");
//    book2.openBook();
//}