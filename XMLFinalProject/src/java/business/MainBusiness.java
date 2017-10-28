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

    private List<Object> getCountryRegionCurrencyList() {
        return db.getCountryRegionCurrencyList();
    }

    private List<Object> getCreditCardList() {
        return db.getCreditCardList();
    }

    private List<Object> getCurrencyList() {
        return db.getCurrencyList();
    }

    private List<Object> getCurrencyRateList() {
        return db.getCurrencyRateList();
    }

    private List<Object> getCustomerList() {
        return db.getCustomerList();
    }

    private List<Object> getPersonCreditCardList() {
        return db.getPersonCreditCardList();
    }

    private List<Object> getSalesOrderDetailList() {
        return db.getSalesOrderDetailList();
    }

    private List<Object> getSalesOrderHeaderList() {
        return db.getSalesOrderHeaderList();
    }

    private List<Object> getSalesOrderHeaderSalesReasonList() {
        return db.getSalesOrderHeaderSalesReasonList();
    }

    private List<Object> getSalesPerson() {
        return db.getSalesPerson();
    }

    private List<Object> getSalesPersonQuotaHistory() {
        return db.getSalesPersonQuotaHistory();
    }

    private List<Object> getSalesReasonList() {
        return db.getSalesReasonList();
    }

    private List<Object> getSalesTaxRate() {
        return db.getSalesTaxRate();
    }

    private List<Object> getSalesTerritoryList() {
        return db.getSalesTerritoryList();
    }

    private List<Object> getSalesTerritoryHistoryList() {
        return db.getSalesTerritoryHistoryList();
    }

    private List<Object> getShoppingCartItemList() {
        return db.getShoppingCartItemList();
    }

    private List<Object> getSpecialOfferList() {
        return db.getSpecialOfferList();
    }

    private List<Object> getSpecialOfferProductList() {
        return db.getSpecialOfferProductList();
    }

    private List<Object> getStoreList() {
        return db.getStoreList();
    }

}
