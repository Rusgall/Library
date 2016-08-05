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
public class AuthorList {

    private ArrayList<Author> authorList = new ArrayList<>();

    private ArrayList<Author> getAuthor() {
        try {
            Database db = new Database();
            Connection connect = db.getConnection();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from author");
            while (rs.next()) {
                authorList.add(new Author(rs.getString("fio")));
            }

        } catch (Exception e) {
            System.out.println("ErrAuthorList");
        }

        return authorList;
    }

    public ArrayList<Author> getAuthorList() {
        if (!authorList.isEmpty()) {
            return authorList;
        } else {
            return getAuthor();
        }
    }

}
