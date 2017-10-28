/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import database.DBAccess;
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

    private DBAccess db;

    public MainBusiness() {
        db = new DBAccess();
    }

    public List<Object> getCountryRegionCurrencyList() {
        return db.getCountryRegionCurrencyList();
    }

    public List<Object> getCreditCardList() {
        return db.getCreditCardList();
    }

    public List<Object> getCurrencyList() {
        return db.getCurrencyList();
    }

    public List<Object> getCurrencyRateList() {
        return db.getCurrencyRateList();
    }

    public List<Object> getCustomerList() {
        return db.getCustomerList();
    }

    public List<Object> getPersonCreditCardList() {
        return db.getPersonCreditCardList();
    }

    public List<Object> getSalesOrderDetailList() {
        return db.getSalesOrderDetailList();
    }

    public List<Object> getSalesOrderHeaderList() {
        return db.getSalesOrderHeaderList();
    }

    public List<Object> getSalesOrderHeaderSalesReasonList() {
        return db.getSalesOrderHeaderSalesReasonList();
    }

    public List<Object> getSalesPerson() {
        return db.getSalesPerson();
    }

    public List<Object> getSalesPersonQuotaHistory() {
        return db.getSalesPersonQuotaHistory();
    }

    public List<Object> getSalesReasonList() {
        return db.getSalesReasonList();
    }

    public List<Object> getSalesTaxRate() {
        return db.getSalesTaxRate();
    }

    public List<Object> getSalesTerritoryList() {
        return db.getSalesTerritoryList();
    }

    public List<Object> getSalesTerritoryHistoryList() {
        return db.getSalesTerritoryHistoryList();
    }

    public List<Object> getShoppingCartItemList() {
        return db.getShoppingCartItemList();
    }

    public List<Object> getSpecialOfferList() {
        return db.getSpecialOfferList();
    }

    public List<Object> getSpecialOfferProductList() {
        return db.getSpecialOfferProductList();
    }

    public List<Object> getStoreList() {
        return db.getStoreList();
    }

}
