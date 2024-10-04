package Assingment10;

public class Main {
    public static void main(String[] args) {
        //using geter seter
        Book b1 = new Book();
        b1.setAuthor("james");
        b1.setTitle("java");
        b1.setPrice(450);
        b1.setPublicationYear(1990);
        b1.discountedPrice(30);
      //  System.out.println(b1.getAuthor() + b1.getPrice() + b1.getTitle() + b1.getPublicationYear());
        b1.displayInfo();
        b1.read();
        b1.getSummary();

        //book
        Book b = new Book("abc", "xyz", 200, 2019);
        b.discountedPrice(10);
        b.displayInfo();
        b.read();
        b.getSummary();


        //EBook
        EBook eb = new EBook("abc", "xyz", 200, 2019, 10);
        //System.out.println(b1.getAuthor() + b1.getPrice() + b1.getTitle() + b1.getPublicationYear() + eb.getFileSize());
        eb.discountedPrice(20);
        eb.displayInfo();
        eb.read();
        eb.getSummary();
    }
}
