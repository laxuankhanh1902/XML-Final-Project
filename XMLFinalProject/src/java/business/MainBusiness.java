/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import database.SQLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
      
    }
    
    private List<Object> countryRegionCurrencyList(){
        try {
            connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;
            try {
                statement = connection.createStatement();
                String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
                
                
                return list;
            } catch (SQLException ex) {
                Logger.getLogger(MainBusiness.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.close();
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(MainBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
