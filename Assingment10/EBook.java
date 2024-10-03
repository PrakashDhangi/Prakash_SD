package Assingment10;

public class EBook extends Book{
    double fileSize = 10;

    public double discountedPrice(double discountPercentage) {
        double extraDiscount = discountPercentage + 10;
        double discountAmount = (extraDiscount / 100) * price;
        finalprice = price - discountAmount;
        return finalprice;
    }

    public void displayInfo() {
        System.out.println("title of the book is :  " + title);
        System.out.println("author of book is : " + author);
        System.out.println("price of the book is : " + price);
        System.out.println("publicationYear of the book is : " + publicationYear);
        System.out.println("size of Book is :  " + fileSize);
        System.out.println("final price of book is : "+finalprice);
    }
}
