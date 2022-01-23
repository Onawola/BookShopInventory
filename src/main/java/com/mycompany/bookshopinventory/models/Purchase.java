package com.mycompany.bookshopinventory.models;

public class Purchase {

    private String Username;
    private int Quantity;    
    private String BookshopItem;
    private double Price;

    public Purchase(String Username, int Quantity, String BookshopItem, double Price) {
        this.Username = Username;
        this.Quantity = Quantity;
        this.BookshopItem = BookshopItem;
        this.Price = Price;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getBookshopItem() {
        return BookshopItem;
    }

    public void setBookshopItem(String BookshopItem) {
        this.BookshopItem = BookshopItem;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }     

  
}
