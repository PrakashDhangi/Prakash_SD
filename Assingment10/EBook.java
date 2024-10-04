package Assingment10;

public class EBook extends Book implements Readable {
    double fileSize;


    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    EBook(String title, String author, double price, int publicationYear, double fileSize) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
        this.fileSize = fileSize;
    }

        public double discountedPrice ( double discountPercentage){
            double extraDiscount = discountPercentage + 10;
            double discountAmt=(extraDiscount/100)*price;
            finalprice=price-discountAmt;
            return finalprice;
        }

        public void displayInfo () {
            System.out.println("title of the book is :  " + title);
            System.out.println("author of book is : " + author);
            System.out.println("price of the book is : " + price);
            System.out.println("publicationYear of the book is : " + publicationYear);
            System.out.println("after appling discount :"+finalprice);
            System.out.println("size of Book is :  " + fileSize);

        }

    @Override
    public void read() {
        System.out.println("Reading the book:  "+title);
    }

    @Override
    public String getSummary() {
        return title;
    }
}

