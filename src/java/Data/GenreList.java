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
public class GenreList {
    private ArrayList<Genre> genreList = new ArrayList<>();

    private ArrayList<Genre> getGenre() {
        try {
            Database db = new Database();
            Connection connect = db.getConnection();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from genre");
            while (rs.next()) {
                genreList.add(new Genre(rs.getString("name")));
            }

        } catch (Exception e) {
            System.out.println("ErrGenreList");
        }

        return genreList;
    }

    public ArrayList<Genre> getGenreList() {
        if (!genreList.isEmpty()) {
            return genreList;
        } else {
            return getGenre();
        }
    }
}
