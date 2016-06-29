/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Empresa;
import model.EmpresaDAO;

/**
 *
 * @author Leonardo
 */
public class ControleEmpresa {
    
    public void inserirEmpresa (Empresa empresa) throws ClassNotFoundException, SQLException{
        EmpresaDAO empresaDAO = new EmpresaDAO();
        
            empresaDAO.inserirEmpresa(empresa);
    }
    
    public void alterarEmpresa(Empresa empresa, String cnpj) throws ClassNotFoundException, SQLException{
        EmpresaDAO empresaDAO = new EmpresaDAO();
        
            empresaDAO.alterarEmpresa(empresa, cnpj);
    }
    
    public ResultSet buscarEmpresa(String cnpj) throws SQLException, ClassNotFoundException{
        EmpresaDAO empresaDAO = new EmpresaDAO();
        ResultSet rs;
        
           rs = empresaDAO.buscarEmpresa(cnpj);
           
           if(!rs.first())
            JOptionPane.showMessageDialog(null, "Empresa não encontrada.");
           
           return rs;
    }
    
    public void excluirEmpresa (String cnpj) throws ClassNotFoundException, SQLException{
        EmpresaDAO empresaDAO = new EmpresaDAO();
        
           empresaDAO.excluirEmpresa(cnpj);
    }
    
}
