
package boierhaat;

public class Shelf {
    Book[] bookList;
    //private Book[] newBookList;
    private int shelfBalance=0;
    private int totalSold=0;
    private int temp=0;
    private int availableBooksSerial=0;
   
    public Shelf(){
        bookList = new Book[100];
        //newBookList = new Book[100];
      
        for (int i = 0; i < 100; i++) {
            bookList[i]= new Book("","","",0);
        }
    }
    int bookIndex=0;

    public boolean addToSell(String bookName,String author,String bookIsbn,int price){
       
        bookList[bookIndex].setBookName(bookName);
        bookList[bookIndex].setAuthor(author);
        bookList[bookIndex].setBookIsbn(bookIsbn);
        bookList[bookIndex].setPrice(price);
        shelfBalance+=bookList[bookIndex].getPrice();
        bookIndex++;
        return true;
    }
    public boolean searchBookSingleParmeter(String name,String isbn){
        availableBooksSerial=0;
        for (int i = 0; i < bookIndex; i++) {
            if(bookList[i].getBookName() .equals(name) || bookList[i].getBookIsbn().equals(isbn)){
                availableBooksSerial=i+1;
                return true;
            }  
        }
        return false;
    }
    public boolean searchBook(String name,String isbn){
        
        for (int i = 0; i < bookIndex; i++) {
            
            if(bookList[i].getBookName() .equals(name) && bookList[i].getBookIsbn().equals(isbn)){
                availableBooksSerial=i+1;
                return true;
            }
            
        }
       
        return false;
    }
   
    
    public boolean sellBook(String Iname ,String Iisbn,int Iprice){
       int flag=0;
        for (int i = 0; i < bookIndex; i++) {
            if(bookList[i].getBookName().equals(Iname) && bookList[i].getBookIsbn().equals(Iisbn)&& bookList[i].getPrice()==(Iprice)){
                
                flag=1;
                shelfBalance-=bookList[i].getPrice();
                totalSold+=bookList[i].getPrice();
                
                System.out.println("sold "+this.getTotalSold()+"\nshelf "+this.getShelfBalance());
                for (int j = i; j <bookIndex; j++) {
                    bookList[j]=bookList[j+1];   
                } 
                bookIndex--;
                break;
            }
            
        }
        for(int i=0;i<bookIndex;i++){
            System.out.println("\n"+bookList[i].getBookName());
        }
        if(flag==0){
            System.out.println("Book not found");
            return false;
        }
        
        return true;
    }
    
    public boolean updateBook(int index,String bookName,String authName,String isbn,int price){
        this.bookList[index].setBookName(bookName);
        this.bookList[index].setAuthor(authName);
        this.bookList[index].setBookIsbn(isbn);
        this.bookList[index].setPrice(price);
        return true;
    }
    public boolean isNumber(String str){
        if(str.equals(null)) return false;
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public int getShelfBalance() {
        temp=0;
        for(int i=0;i<bookIndex;i++){
            temp+=bookList[i].getPrice();
        }
        shelfBalance=temp;
        return shelfBalance;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public int getAvailableBooks() {
        return availableBooksSerial;
    }
    public void setBookListIndex(int i){
        this.bookIndex=i;
    }
}
