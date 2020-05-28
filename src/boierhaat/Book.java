
package boierhaat;

public class Book {
    
    private String bookName;
    private String author;
    private String bookIsbn;
    private int price;
    
    

    public Book(String bookName,String author,String bookIsbn,int price) {
        
        this.bookName = bookName;
        this.author = author;
        this.bookIsbn = bookIsbn;
        this.price=price;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }
    
    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Book name: "+bookName+"\nBook ISBN :"+bookIsbn;
    }
    
}