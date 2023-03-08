
public class Publisher {
    
    private String publisherName;
    private String contact;

    Publisher(String n, String c){

        publisherName = n;
        contact = c;
        
    }

    public String getContact(){

        return contact;

    }

    public void setContact(String contact){

        this.contact = contact;

    } 

    public void showPublisherInfo(){

        System.out.println("Publisher name: " + publisherName + "\nContact: " + contact);

    }
    
}
