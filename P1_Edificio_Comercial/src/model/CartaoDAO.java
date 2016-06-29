/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Leonardo
 */
public class CartaoDAO {
     Connection conexao;
    Statement stmt;
    
    public ResultSet buscarCartoes() throws SQLException, ClassNotFoundException{
        ResultSet rs = null;
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "SELECT * FROM cartao where status = 'ativo'";
        
        rs = stmt.executeQuery(sql);
        return rs;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PredioComercial","root","root");
         return con;
    }
}
