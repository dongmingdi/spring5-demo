package com.dongmingdi.spring5.collectiontype;

import java.util.List;

public class Book {
    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }

    private List<String> list;
}
