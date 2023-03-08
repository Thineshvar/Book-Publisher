
public class TestBook {

   public static void main(String[] args) {

    System.out.println("\nPublisher Details");
    Publisher pub1 = new Publisher("Pearson", "corpsales@pearsontechgroup.com");
    pub1.setContact("international@pearsoned.com");
    System.out.println(pub1.getContact());
    pub1.showPublisherInfo();

    System.out.println("\nBook Details");
    Book book1 = new Book("978-0672330162","The Object-Oriented Thought Process", 
    "Matt Weisfield",39.99);
    book1.showPublisherInfo(pub1);
    book1.updatePrice(42.99);
    System.out.println("Discount Amount: RM" + book1.countDiscountAmt(0.20));
    book1.showInfo();

    }
        
}
    

