package Assingment10;

public class Book {
    String title;
    String author;
    double price;
    int publicationYear;
    double finalprice;

    Book() {}
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    Book(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public double discountedPrice(double discountPercentage){
        double discountAmt=(discountPercentage/100)*price;
        finalprice=price-discountAmt;
        return finalprice;
    }
    public void displayInfo(){
        System.out.println("title of the book is :  "+title);
        System.out.println("author of book is : "+author);
        System.out.println("price of the book is : "+price);
        System.out.println("publicationYear of the book is : "+publicationYear);
        System.out.println("after appling discount :"+finalprice);
    }
}
