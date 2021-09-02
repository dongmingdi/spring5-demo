package com.dongmingdi.spring5;

public class Book {


    private String bname;

    private String bauthor;

    private String address;


    public void setAddress(String address) {
        this.address = address;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "bname='" + bname + '\'' +
//                ", bauthor='" + bauthor + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

//    public static void main(String[] args) {
//        Book book = new Book();
//        book.setBname("aaa");
//        System.out.println(book);
//    }
}
