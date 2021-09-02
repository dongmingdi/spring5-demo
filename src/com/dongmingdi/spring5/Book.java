package com.dongmingdi.spring5;

public class Book {


    private String bname;

    private String bauthor;

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        Book book = new Book();
//        book.setBname("aaa");
//        System.out.println(book);
//    }
}
