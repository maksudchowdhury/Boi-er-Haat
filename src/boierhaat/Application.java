
package boierhaat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Application extends JFrame implements ActionListener {
    
    private int HEIGHT=758,WIDTH=700;
    
    private DefaultTableModel model;
    private JScrollPane scroll;
    private JTable table;
    private Container c;
    private JLabel titleLabel,bookNameLabel,authLabel,isbnLabel,priceLabel,usernameLabel,uidLabel,utypeLabel;
    private JLabel capitalLabel,soldLabel;
    private JTextField bnTf,auTf,isbnTf,priceTf;
    private JButton addButton,sellButton,updateButton,clearButton,searchButton,saveButton,loadButton;
    private String userID;
    private String userType;
    private String name;
    private String capital="0",total="0";
    private Shelf s = new Shelf();
    private Scanner reader;
    private boolean loaderData;
    
    private String[] colums={"Serial","Book name","Author","ISBN","Price"};
    private String[] rows = new String[5];
    
    Application(String name,String uid,String uType){
        this.name=name;
        userID=uid;
        userType=uType;
        loaderData=false;
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.setTitle("BOI er HAAT");
        this.setResizable(false);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
       
        
        Font font = new Font("Calibri",Font.BOLD,20);
        
        soldLabel = new JLabel("Sold: "+total);
        soldLabel.setFont(font);
        soldLabel.setBounds(500,50,150,30);
        c.add(soldLabel);
        
        capitalLabel = new JLabel("Capital: "+capital);
        capitalLabel.setFont(font);
        capitalLabel.setBounds(300,50,150,30);
        c.add(capitalLabel);
        
        
//        uidLabel = new JLabel("ID: "+userID);
//        uidLabel.setFont(font);
//        uidLabel.setBounds(200,50,100,30);
//        c.add(uidLabel);
        
        
        utypeLabel = new JLabel("("+userType+")");
        utypeLabel.setFont(font);
        utypeLabel.setBounds(180,50,100,30);
        c.add(utypeLabel);
        
        usernameLabel = new JLabel("User: "+name);
        usernameLabel.setFont(font);
        usernameLabel.setBounds(20,50,150,30);
        c.add(usernameLabel);

        
        titleLabel = new JLabel("Boi er Haat");
        titleLabel.setFont(font);
        titleLabel.setBounds(300,5,200,50);//x,y,w,h
        c.add(titleLabel);
        
        bookNameLabel = new JLabel("Book name");
        bookNameLabel.setFont(font);
        bookNameLabel.setBounds(20,100,140,30);
        c.add(bookNameLabel);
        
        authLabel = new JLabel("Author");
        authLabel.setFont(font);
        authLabel.setBounds(20,150,140,30);
        c.add(authLabel);
        
        isbnLabel = new JLabel("ISBN");
        isbnLabel.setFont(font);
        isbnLabel.setBounds(20,200,140,30);
        c.add(isbnLabel);
        
        
        priceLabel = new JLabel("price");
        priceLabel.setFont(font);
        priceLabel.setBounds(20,250,140,30);
        c.add(priceLabel);
        
        bnTf= new JTextField();
        bnTf.setBounds(120,100,300,30);
        bnTf.setFont(font);
        c.add(bnTf);
        
        auTf= new JTextField();
        auTf.setBounds(120,150,300,30);
        auTf.setFont(font);
        c.add(auTf);
        
        isbnTf= new JTextField();
        isbnTf.setBounds(120,200,300,30);
        isbnTf.setFont(font);
        c.add(isbnTf);
        
        priceTf= new JTextField();
        priceTf.setBounds(120,250,300,30);
        priceTf.setFont(font);
        c.add(priceTf);
        
        addButton = new JButton("Add");
        addButton.setBounds(450,100,100,30);
        addButton.setFont(font);
        c.add(addButton);
        
        sellButton = new JButton("Sell");
        sellButton.setBounds(450,150,100,30);
        sellButton.setFont(font);
        c.add(sellButton);
        
        searchButton = new JButton("Search");
        searchButton.setBounds(570,125,100,30);
        searchButton.setFont(font);
        c.add(searchButton);
        
        saveButton = new JButton("Save");
        saveButton.setBounds(570,175,100,30);//
        saveButton.setFont(font);
        c.add(saveButton);
        
        
        loadButton = new JButton("Load");
        loadButton.setBounds(570,225,100,30);//
        loadButton.setFont(font);
        c.add(loadButton);
        
        updateButton = new JButton("Update");
        updateButton.setBounds(450,200,100,30);
        updateButton.setFont(font);
        c.add(updateButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(450,250,100,30);
        clearButton.setFont(font);
        c.add(clearButton);
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        table.setModel(model);
        
        table.setFont(font);
         
        table.setSelectionBackground(Color.magenta);
        table.setBackground(Color.white);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table); 
        scroll.setBounds(25,300,650,400);
        c.add(scroll);
        
        addButton.addActionListener(this);
        sellButton.addActionListener(this);
        clearButton.addActionListener(this);
        updateButton.addActionListener(this);
        searchButton.addActionListener(this);
        saveButton.addActionListener(this);
        loadButton.addActionListener(this);
        
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                int selectedRow = table.getSelectedRow();
                String bname = model.getValueAt(selectedRow, 1).toString();
                String aname = model.getValueAt(selectedRow, 2).toString();
                String isbn = model.getValueAt(selectedRow, 3).toString();
                String price = model.getValueAt(selectedRow, 4).toString();
                
                bnTf.setText(bname);
                auTf.setText(aname);
                isbnTf.setText(isbn);
                priceTf.setText(price);
            }
        
        });
    }  
    
    public void actionPerformed(ActionEvent e){
        
        
        if(e.getSource()==addButton){
            if(bnTf.getText().equals("")||auTf.getText().equals("")||isbnTf.getText().equals("")||priceTf.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Fill in the fields");   
            }
            
            else{
                if(s.isNumber(priceTf.getText())){
                    int Inprice = Integer.parseInt(priceTf.getText());
                    if(s.addToSell(bnTf.getText(), auTf.getText(), isbnTf.getText(), Inprice)){
                        int selectedRow = table.getSelectedRow();
                        rows[0]=String.valueOf(model.getRowCount()+1);
                        rows[1]=bnTf.getText();
                        rows[2]=auTf.getText();
                        rows[3]=isbnTf.getText();
                        rows[4]=priceTf.getText();
                        model.addRow(rows);
                        capital=String.valueOf(s.getShelfBalance());
                        capitalLabel.setText("Capital: "+capital);
                        System.out.println(s.getShelfBalance()); 
                    }
                    else{
                        System.out.println("Add Error");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid price"); 
                } 
            }  
        }
        
        if(e.getSource()==sellButton){
            int selectedRow = table.getSelectedRow();
            int Inprice = Integer.parseInt(priceTf.getText());
            if(selectedRow>=0){
                if(s.sellBook(bnTf.getText(),isbnTf.getText(),Inprice)){
                    model.removeRow(selectedRow);
                    total=String.valueOf(s.getTotalSold());
                    soldLabel.setText("Sold: "+total);
                    capital=String.valueOf(s.getShelfBalance());
                    capitalLabel.setText("Capital: "+capital);
                }
                else{
                    System.out.println("Sell Error");
                }
                
            }
            else JOptionPane.showMessageDialog(null,"No Book selected");
            for(int i=0;i<model.getRowCount();i++){
                model.setValueAt(i+1, i, 0);
            }
            
        }
        
        if(e.getSource()==clearButton){
            bnTf.setText("");
            auTf.setText("");
            isbnTf.setText("");
            priceTf.setText("");
        }
        
        if(e.getSource()==updateButton){
            int selectedRow = table.getSelectedRow();
            if(selectedRow>=0){
                String bname = bnTf.getText();
                String auth = auTf.getText();
                String isbn = isbnTf.getText();
                String price = priceTf.getText();
                int Inprice = Integer.parseInt(priceTf.getText());
                if(s.updateBook(selectedRow, bname, auth, isbn, Inprice)){
                    model.setValueAt(bname, selectedRow, 1);
                    model.setValueAt(auth, selectedRow, 2);
                    model.setValueAt(isbn, selectedRow, 3);
                    model.setValueAt(price, selectedRow, 4);
                    capital=String.valueOf(s.getShelfBalance());
                    capitalLabel.setText("Capital: "+capital);
                }
                else{
                    System.out.println("BSDK");
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"No Book selected");
            }
        }
        
        if(e.getSource()==searchButton){
            if(bnTf.getText().equals("")&&isbnTf.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please give Book name or ISBN");
            }
            
            else if(bnTf.getText().equals("")||isbnTf.getText().equals("")){
                if(s.searchBookSingleParmeter(bnTf.getText(), isbnTf.getText())){
                
                    JOptionPane.showMessageDialog(null,"Book available serial: "+s.getAvailableBooks());
                }
                else{
                    JOptionPane.showMessageDialog(null,"No such book available ");
                }
            }
            else if(s.searchBook(bnTf.getText(), isbnTf.getText())){
                JOptionPane.showMessageDialog(null,"Book available serial: "+s.getAvailableBooks());
            }
            else{
                JOptionPane.showMessageDialog(null,"No such book available");
            }

        }
        
        
        if(e.getSource()==saveButton){
            try {
                FileWriter f = new FileWriter("Inventory.txt");
                for(int i=0;i<s.bookIndex;i++){
                    //f.write(String.valueOf(i+1));
                    f.write(s.bookList[i].getBookName());
                    f.write(" "+s.bookList[i].getAuthor());
                    f.write(" "+s.bookList[i].getBookIsbn());
                    f.write(" "+s.bookList[i].getPrice());
                    f.write("\n");
               
                }
                f.close();
                JOptionPane.showMessageDialog(null,"Saved Successfully");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Saving Error");
            }
        }
        
        
        if(e.getSource()==loadButton){
            try {
                if(loaderData==false){
                    loaderData=true;
                reader = new Scanner(new File("Inventory.txt"));
                s.setBookListIndex(0);
                
                
                while(reader.hasNext()){
                String tmpBook = reader.next();
                String tmpAuth = reader.next();
                String tmpIsbn = reader.next();
                String tmpPrice = reader.next();
                int Inprice = Integer.parseInt(tmpPrice);
                System.out.println(tmpBook);
                System.out.println(tmpAuth);
                System.out.println(tmpIsbn);
                System.out.println(tmpPrice);
                s.addToSell(tmpBook, tmpAuth, tmpIsbn, Inprice); 
                model.addRow(rows);
            }
            for(int i=0;i<s.bookIndex;i++){
                String serial = String.valueOf(i+1);
                model.setValueAt(serial, i, 0);
                model.setValueAt(s.bookList[i].getBookName(), i, 1);
                model.setValueAt(s.bookList[i].getAuthor(), i, 2);
                model.setValueAt(s.bookList[i].getBookIsbn(), i, 3);
                String Price = String.valueOf(s.bookList[i].getPrice());
                model.setValueAt(Price, i, 4);
            }
            capital=String.valueOf(s.getShelfBalance());
            capitalLabel.setText("Capital: "+capital);
            JOptionPane.showMessageDialog(null,"Loaded Successfully");
            
            }
                else{
                    JOptionPane.showMessageDialog(null,"Cannot Load twice");
                }
            } catch (Exception c) {
                JOptionPane.showMessageDialog(null,"Loading Error");
            }
            
        }
    }    
        
    }

