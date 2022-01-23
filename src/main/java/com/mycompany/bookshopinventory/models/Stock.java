package com.mycompany.bookshopinventory.models;

public class Stock {

    private int Quantity;    
    private String BookshopItem;
    private double Price;

    public Stock(int Quantity, String BookshopItem, double Price) {
        this.Quantity = Quantity;
        this.BookshopItem = BookshopItem;
        this.Price = Price;
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
