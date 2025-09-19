package com.OOP.AbstractClasses.ExercicesAbstractClasses;

public class TShirtClass extends AbstractClass {


    String article;
    double price;


    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {


        TShirtClass inheritance = new TShirtClass();

        inheritance.setArticle("T-Shirt");
        inheritance.setPrice(10.50);

        System.out.println(inheritance.getArticle());
        System.out.println(inheritance.getPrice());

    }

}



