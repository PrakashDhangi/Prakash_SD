package Assingment10;

public class Main {
    public static void main(String[] args) {
      //using geter seter
        Book b1=new Book();
        b1.setAuthor("dr k m suresh");
        b1.setTitle("Spardha spoorti");
        b1.setPrice(450);
        b1.setPublicationYear(2008);
        System.out.println(b1.getAuthor()+b1.getPrice()+b1.getTitle()+b1.getPublicationYear());
        b1.displayInfo();

         //book
        Book b=new Book("abc","xyz",200,2019);
        b.discountedPrice(10);
        b.displayInfo();


        //EBook
       EBook eb=new EBook();
       eb.setAuthor("abc");
       eb.setPrice(500);
       eb.setPublicationYear(2018);
       eb.setTitle("xyz");
       eb.discountedPrice(20);
       eb.displayInfo();


    }

}
