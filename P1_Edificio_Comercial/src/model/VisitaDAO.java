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
import javax.swing.JOptionPane;

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
        String sql;
        sql = String.format("INSERT INTO visita VALUES ('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s')", 
                            visita.getNome(), visita.getDocumento(), visita.getEmail(), visita.getTelefone(),
                            visita.getAndar(), visita.getSala(), visita.getHorario());
        
        if(stmt.executeUpdate(sql) > 0){
             JOptionPane.showMessageDialog(null,"Dados da Visita armazenados com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Erro de gravação no banco");
        }
       
    }
    
    public ResultSet buscarVisita(String documento) throws ClassNotFoundException, SQLException
    {
        ResultSet rs = null;
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "SELECT * FROM visita WHERE documento = '"+ documento +"'";
        
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    public void alterarVisita (VisitaAgendada visita, String documento) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        
        sql = String.format("UPDATE visita SET Nome = '%1$s',Documento = '%2$s',Email = '%3$s',telefone = '%4$s',andar = '%5$s', sala = '%6$s',horario = '%7$s'", 
                            visita.getNome(), visita.getDocumento(), visita.getEmail(), visita.getTelefone(),
                            visita.getAndar(), visita.getSala(), visita.getHorario());
        
        if(stmt.executeUpdate(sql) > 0){
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados");
        }
    }
    
    public void excluirVisita (String documento) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        
        sql = "DELETE FROM visita WHERE documento = '"+documento+"'";
        
        if (stmt.executeUpdate(sql) > 0){
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados");
        }
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
         Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PredioComercial","root","root");
         return con;
    }
    
}
