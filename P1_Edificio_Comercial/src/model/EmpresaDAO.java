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
public class EmpresaDAO {
    Connection conexao;
    Statement stmt;
    
    public void inserirEmpresa(Empresa empresa) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        
        sql = String.format("INSERT INTO empresa VALUES('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s')",
                empresa.getNome(),empresa.getCnpj(),empresa.getCorrespondente(),empresa.getTelefone(),
                empresa.getHorarioInicio(),empresa.getHorarioFim(),empresa.getAndar(),empresa.getSala());
        
        if(stmt.executeUpdate(sql) > 0)
             JOptionPane.showMessageDialog(null,"Dados da Empresa armazenados com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de gravação no banco");
    }
    
    public ResultSet buscarEmpresa (String cnpj) throws ClassNotFoundException, SQLException
    {
        ResultSet rs;
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM empresa WHERE cnpj = '"+cnpj+"'");
        
        return rs;
    }
    
    public void alterarEmpresa (Empresa empresa, String cnpj) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        
        sql = String.format("UPDATE empresa SET Nome = '%1$s', Cnpj = '%2$s', correspondente = '%3$s', telefone = '%4$s',horarioInicio = '%5$s', horarioFim = '%6$s',andar = '%7$s',sala ='%8$s'",
                empresa.getNome(),empresa.getCnpj(),empresa.getCorrespondente(),empresa.getTelefone(),
                empresa.getHorarioInicio(),empresa.getHorarioFim(),empresa.getAndar(),empresa.getSala());
        
        if(stmt.executeUpdate(sql) > 0)
             JOptionPane.showMessageDialog(null,"Dados da Empresa alterados com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de alteração no banco");
    }
    
    public void excluirEmpresa (String cnpj) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        
        sql = "DELETE FROM empresa WHERE cnpj = '"+cnpj+"'";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null,"Dados da Empresa excluidos com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de exclusão no banco");
        
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PredioComercial","root","root");
         return con;
    }

}
