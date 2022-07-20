/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Book {
    private String Title;
    private int pages;
    private int year;
    
    public Book(String title, int pages , int year){
        this.Title = title;
        this.pages = pages;
        this.year = year;
               
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getEverything( ){
        return getTitle() + ", " + getPages() + ", " + getYear();
    }
    
    
}
