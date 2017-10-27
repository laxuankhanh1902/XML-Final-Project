/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import database.SQLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frankLX
 */
public class MainBusiness {

    private Connection connection;
    public MainBusiness() {
        try {
            connection = SQLConnection.getSQLServerConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MainBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Object> countryRegionCurrencyList(){
        List<Object> list = new ArrayList<Object>();
        return list;
    }
    
}
