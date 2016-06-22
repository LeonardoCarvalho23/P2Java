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
public class EmpresaDAO {
    Connection conexao;
    Statement stmt;
    
    public void InserirEmpresa(Empresa empresa) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        //TODO insert aqui
    }
    
    public ResultSet BuscarEmpresa (Empresa empresa) throws ClassNotFoundException, SQLException
    {
        ResultSet rs;
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT");
        //TODO busca aqui
        
        return rs;
    }
    
    public void AtualizarEmpresa (Empresa empresa) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        //TODO update aqui
    }
    
    public void ExcluirEmpresa (Empresa empresa) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concessionaria","root","root");
         return con;
    }
}
