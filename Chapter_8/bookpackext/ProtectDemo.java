package Chapter_8.bookpackext;
import Chapter_8.bookpack.*; // - импорт пакета

class ExtBook extends Book{

    private String publisher;

    ExtBook (String t, String a, int d, String p){
        super(t, a, d);
        publisher = p;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    //Доступ к переменным класса Book возможен из методов
    public String GetTitle() { return title; }
    public String GetAuthor() { return author; }
    public double GetPubDate() { return pubDate; }
    public String GetPublisher() { return publisher; }
}

public class ProtectDemo {
    public static void main(String args[]){

        ExtBook books[] = new ExtBook[2];

        books[0] = new ExtBook("Java: Полное руководство", "Герберт Шилдт", 2018, "Вильямс");

        books[1] = new ExtBook("Искусство программирования на Java", "Герберт Шилдт", 2005,"Диалектика");

        for (ExtBook x : books) {
            if (x.GetAuthor() == "Герберт Шилдт")
                System.out.println(x.GetTitle());
        }

        // books[0].title = "test title";  -  Ошибка, доступ из класса ProtectDemo запрещён!
    }
}
