package Chapter_8.bookpack;

public class Book {

    protected String title;
    protected String author;
    protected int pubDate;

    public Book (String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год публикации : " + pubDate);
        System.out.println();
    }
}
