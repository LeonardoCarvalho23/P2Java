/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.PessoaDAO;

/**
 *
 * @author Leonardo
 */
public class ControlePessoa {
    
    public void InserirPessoa(Pessoa pessoa) throws SQLException, ClassNotFoundException
    {
        PessoaDAO pessoaDAO = new PessoaDAO();
        
            pessoa.setCelular(pessoa.getCelular().replace("(", ""));
            pessoa.setCelular(pessoa.getCelular().replace(")", ""));
            pessoa.setCelular(pessoa.getCelular().replace("-", ""));
            pessoa.setRg(pessoa.getRg().replace(".", ""));
            pessoa.setRg(pessoa.getRg().replace("-", ""));
            pessoaDAO.inserirPessoa(pessoa);
          
    }
    
    public void AlterarPessoa(Pessoa pessoa, String antigoCpf) throws ClassNotFoundException, SQLException
    {
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        pessoaDAO.alterarPessoa(pessoa, antigoCpf);
        
    }
    
    public ResultSet BuscarPessoa(String cpf) throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        
        rs = pessoaDAO.buscarPessooa(cpf);
        
        if(!rs.first())
            JOptionPane.showMessageDialog(null, "Pessa não encontrada.");
        
        return rs;
    }
    
    public void ExcluirPessoa(String cpf) throws ClassNotFoundException, SQLException{
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        pessoaDAO.excluirPessoa(cpf);
    }
    
}
