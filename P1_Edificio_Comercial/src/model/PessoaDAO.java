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
public class PessoaDAO {
    
    Connection conexao;
    Statement stmt;
    
    
    public void inserirPessoa (Pessoa pessoa) throws SQLException, ClassNotFoundException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "INSERT INTO pessoa VALUES ('"
                + pessoa.getNome() + "','"
                + pessoa.getEmail() + "','"
                + pessoa.getRg()+ "','"
                + pessoa.getCelular()+ "','"
                + pessoa.getTipoPessoa() + "','"
                + pessoa.getCartao() + "','"
                + pessoa.getAndar() + "','"
                + pessoa.getSala() + "','"
                + pessoa.getHorario() + "');";
        
        if(stmt.executeUpdate(sql) > 0)
             JOptionPane.showMessageDialog(null,"Dados da Pessoa armazenados com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de gravação no banco");
    }
    
    public ResultSet buscarPessooa (String cpf) throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "SELECT * FROM pessoa WHERE cpf = '" + cpf + "'";
        rs = stmt.executeQuery(sql);
        
        return rs;
        
    }
    
    public void alterarPessoa (Pessoa pessoa, String antigoCpf) throws ClassNotFoundException, SQLException
    {
       conexao = getConnection();
       stmt = conexao.createStatement(); 
       String sql;
       sql = String.format("UPDATE pessoa SET Nome = '%1$s', email = '%2$s', cpf = '%3$s', celular = '%4$s', tipoPessoa = '%5$s', cartao = '%6$s', andar = '%7$s', sala = '%8$s', horario = '%9$s' WHERE cpf = '%10$s'",
                                    pessoa.getNome(),pessoa.getEmail(),pessoa.getRg(),pessoa.getCelular(), pessoa.getTipoPessoa(), pessoa.getCartao(), pessoa.getAndar(), pessoa.getSala(),pessoa.getHorario(), antigoCpf);
        if(stmt.executeUpdate(sql) > 0)
             JOptionPane.showMessageDialog(null,"Dados da Pessoa alterados com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de gravação no banco");
    }
    
    public void excluirPessoa (String cpf) throws ClassNotFoundException, SQLException
    {
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = String.format("DELETE FROM pessoa WHERE cpf = '%1$s'", cpf);
        if(stmt.executeUpdate(sql) > 0)
             JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso");
        else
            JOptionPane.showMessageDialog(null,"Erro de exclusão no banco");
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
         Connection con;
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PredioComercial","root","root");
         return con;
    }
}
