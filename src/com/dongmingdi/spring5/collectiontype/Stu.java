package com.dongmingdi.spring5.collectiontype;

import com.dongmingdi.spring5.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] courses;

    private List<String> list;

    private Map<String, String> maps;

    private Set<String> sets;

    private List<Course> courseList;

    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                ", bookList=" + bookList +
                '}';
    }
}
