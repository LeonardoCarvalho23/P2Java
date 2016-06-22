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
public class VisitaDAO {
    
    Connection conexao;
    Statement stmt;
    
    public void inserirVisita(VisitaAgendada visita) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
       
    }
    
    public ResultSet buscarVisita(VisitaAgendada visita) throws ClassNotFoundException, SQLException
    {
        ResultSet rs = null;
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        return rs;
    }
    
    public void alterarVisita (VisitaAgendada visita) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
    }
    
    public void excluirVisita (VisitaAgendada visita) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
         Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PredioComercial","root","root");
         return con;
    }
    
}
