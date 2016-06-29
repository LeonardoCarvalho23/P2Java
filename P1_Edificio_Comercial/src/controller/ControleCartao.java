/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.CartaoDAO;


/**
 *
 * @author Leonardo
 */
public class ControleCartao {
    
    
    public ResultSet buscarCartoes () throws SQLException, ClassNotFoundException{
        CartaoDAO cartaoDAO = new CartaoDAO();
        ResultSet rs;
        rs = cartaoDAO.buscarCartoes();
        
        return rs;
    }
    
}
