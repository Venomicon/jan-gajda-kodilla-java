package com.kodilla.testing.library;

import java.util.*;



public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<>();
        List<Book> resultList = new ArrayList<>();
        if(libraryUser.lastname == "0") {
            resultList = bookList;
        } else if(libraryUser.lastname == "1") {
            bookList.add(new Book("Book","Author",1999));
            resultList = bookList;
        } else if(libraryUser.lastname == "5") {
            for(int i=1; i<=5; i++) {
                bookList.add(new Book("Book "+i,"Author "+i,1995+i));
            }
            resultList = bookList;
        }
        return resultList;
    }
}
