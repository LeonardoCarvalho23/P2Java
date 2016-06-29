/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.PredioDAO;

/**
 *
 * @author Leonardo
 */
public class ControleAndar {
    
    public ResultSet buscarAndares () throws SQLException, ClassNotFoundException{
        PredioDAO predioDAO = new PredioDAO();
        ResultSet rs;
        rs = predioDAO.buscarAndares();
        
        return rs;
    }
}
