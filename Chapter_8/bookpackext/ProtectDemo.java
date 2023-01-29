package Chapter_8.bookpackext;
import Chapter_8.bookpack.*; // - ������ ������

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

    //������ � ���������� ������ Book �������� �� �������
    public String GetTitle() { return title; }
    public String GetAuthor() { return author; }
    public double GetPubDate() { return pubDate; }
    public String GetPublisher() { return publisher; }
}

public class ProtectDemo {
    public static void main(String args[]){

        ExtBook books[] = new ExtBook[2];

        books[0] = new ExtBook("Java: ������ �����������", "������� �����", 2018, "�������");

        books[1] = new ExtBook("��������� ���������������� �� Java", "������� �����", 2005,"����������");

        for (ExtBook x : books) {
            if (x.GetAuthor() == "������� �����")
                System.out.println(x.GetTitle());
        }

        // books[0].title = "test title";  -  ������, ������ �� ������ ProtectDemo ��������!
    }
}
