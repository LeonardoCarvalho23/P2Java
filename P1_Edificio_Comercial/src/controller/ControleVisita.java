/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.VisitaAgendada;
import model.VisitaDAO;

/**
 *
 * @author Leonardo
 */
public class ControleVisita {
    
    public void inserirVisita (VisitaAgendada visita) throws ClassNotFoundException, SQLException{
        VisitaDAO visitaDAO = new VisitaDAO();
        
        visitaDAO.inserirVisita(visita);
    }
    
    public void alterarVisita (VisitaAgendada visita, String documento) throws ClassNotFoundException, SQLException{
        VisitaDAO visitaDAO = new VisitaDAO();
        
        visitaDAO.alterarVisita(visita, documento);
    }
    
    public ResultSet buscarVisita (String documento) throws SQLException, ClassNotFoundException{
        VisitaDAO visitaDAO = new VisitaDAO();
        ResultSet rs;
        
        rs = visitaDAO.buscarVisita(documento);
        
        if(!rs.first()){
            JOptionPane.showMessageDialog(null, "Visita não encontrada.");
        }
        
        return rs;
    }
    
    public void excluirVisita (String documento) throws ClassNotFoundException, SQLException{
        VisitaDAO visitaDAO = new VisitaDAO();
        
        visitaDAO.excluirVisita(documento);
        
    }
    
}
