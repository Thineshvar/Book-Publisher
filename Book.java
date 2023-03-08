
public class Book {

    private String isbn;
    private String title;
    private String author;
    private double price;

    Book(String i, String t, String a, double p){

        isbn = i;
        title = t;
        author = a;
        price = p;

    }

    public void showInfo(){

        System.out.println("IBN: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: RM" + price );
        
    }
    
    public void showPublisherInfo(Publisher pub){

        pub.showPublisherInfo();

    }

    public double countDiscountAmt(double rate){

        return price * rate;

    }

    public void updatePrice(double p){

        price = p;

    }
    
}
