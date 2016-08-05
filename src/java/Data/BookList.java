/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import DataBase.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Руслан
 */
public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    private ArrayList<Book> getBook() {
        try {
            Database db = new Database();
            Connection connect = db.getConnection();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from book");
            while (rs.next()) {
                bookList.add(new Book(rs.getString("name"),rs.getInt("page_count"),rs.getString("isbn"),
                rs.getDate("publish_year")));
            }

        } catch (Exception e) {
            System.out.println("ErrBookList");
        }

        return bookList;
    }

    public ArrayList<Book> getBookList() {
        if (!bookList.isEmpty()) {
            return bookList;
        } else {
            return getBook();
        }
    }
}
