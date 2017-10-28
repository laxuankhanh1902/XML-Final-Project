/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import business.MainBusiness;
import entity.CountryRegionCurrency;
import entity.CountryRegionCurrencyPK;
import entity.CreditCard;
import entity.Currency;
import entity.CurrencyRate;
import entity.Customer;
import entity.PersonCreditCard;
import entity.PersonCreditCardPK;
import entity.SalesOrderDetail;
import entity.SalesOrderDetailPK;
import entity.SalesOrderHeader;
import entity.SalesOrderHeaderSalesReason;
import entity.SalesOrderHeaderSalesReasonPK;
import entity.SalesPerson;
import entity.SalesPersonQuotaHistory;
import entity.SalesPersonQuotaHistoryPK;
import entity.SalesReason;
import entity.SalesTaxRate;
import entity.SalesTerritory;
import entity.SalesTerritoryHistory;
import entity.SalesTerritoryHistoryPK;
import entity.ShoppingCartItem;
import entity.SpecialOffer;
import entity.SpecialOfferProduct;
import entity.SpecialOfferProductPK;
import entity.Store;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frankLX
 */
public class SQLConnection {

    public static Connection getSQLServerConnection()
            throws SQLException, ClassNotFoundException {
        
        String hostName = "localhost";
        String sqlInstanceName = "SQLEXPRESS";
        String database = "AdventureWorks2012";
        String userName = "sa";
        String password = "123456";

        return getSQLServerConnection(hostName, sqlInstanceName,
                database, userName, password);
    }

    public static Connection getSQLServerConnection(String hostName,
            String sqlInstanceName, String database, String userName,
            String password) throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + database;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }

    private List<Object> getCountryRegionCurrencyList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.CountryRegionCurrency";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    String countryRegionCode = rs.getString(1);
                    String currencyCode = rs.getString(2);
                    Date modifiedDate = rs.getDate(3);
                    
                    CountryRegionCurrency crc
                            = new CountryRegionCurrency(
                                    new CountryRegionCurrencyPK(countryRegionCode,
                                            currencyCode), modifiedDate);
                    
                    list.add(crc);
                }

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

    private List<Object> getCreditCardList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.CreditCard";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int creditCardID = rs.getInt(1);
                    String cardType = rs.getString(2);
                    String cardNumber = rs.getString(3);
                    short expMonth = rs.getShort(4);
                    short expYear = rs.getShort(5);
                    Date modifiedDate = rs.getDate(6);
                    
                    CreditCard cc = new CreditCard(creditCardID, cardType,
                            cardNumber, expMonth, expYear, modifiedDate);
                    
                    list.add(cc);
                }

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

    private List<Object> getCurrencyList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.Currency";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    String currencyCode = rs.getString(1);
                    String name = rs.getString(2);
                    Date modifiedDate = rs.getDate(3);
                    
                    Currency c = new Currency(currencyCode, name, modifiedDate);
                    
                    list.add(c);
                }

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

    private List<Object> getCurrencyRateList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.CurrencyRate";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int currencyRateID = rs.getInt(1);
                    Date currencyRateDate = rs.getDate(2);
                    BigDecimal averageRate = rs.getBigDecimal(5);
                    BigDecimal endOfDayRate = rs.getBigDecimal(6);
                    Date modifiedDate = rs.getDate(7);
                    
                    CurrencyRate cr = new CurrencyRate(currencyRateID,
                            currencyRateDate, averageRate, endOfDayRate, modifiedDate);
                    
                    list.add(cr);
                }

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

    private List<Object> getCustomerList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.Customer";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int customerID = rs.getInt(1);
                    String accountNumber = rs.getString(5);
                    String rowguid = rs.getString(6);
                    Date modifiedDate = rs.getDate(7);
                    
                    Customer c = new Customer(customerID, accountNumber,
                            rowguid, modifiedDate);

                    list.add(c);
                }

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

    private List<Object> getPersonCreditCardList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.PersonCreditCard";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int businessEntityID = rs.getInt(1);
                    int creditCardID = rs.getInt(2);
                    Date modifiedDate = rs.getDate(3);
                    
                    PersonCreditCard pcc = new PersonCreditCard(
                            new PersonCreditCardPK(businessEntityID,
                                    creditCardID), modifiedDate);
                    
                    list.add(pcc);
                }

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

    private List<Object> getSalesOrderDetailList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesOrderDetail";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int salesOrderID = rs.getInt(1);
                    int salesOrderDetailID = rs.getInt(2);
                    short orderQty = rs.getShort(4);
                    BigDecimal unitPrice = rs.getBigDecimal(7);
                    BigDecimal unitPriceDiscount = rs.getBigDecimal(8);
                    BigDecimal lineTotal = rs.getBigDecimal(9);
                    String rowguid = rs.getString(10);
                    Date modifiedDate = rs.getDate(11);
                    
                    SalesOrderDetail sod = new SalesOrderDetail(
                            new SalesOrderDetailPK(salesOrderID, salesOrderDetailID),
                            orderQty, unitPrice, unitPriceDiscount, lineTotal,
                            rowguid, modifiedDate);
                    
                    list.add(sod);
                }

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

    private List<Object> getSalesOrderHeaderList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesOrderHeader";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int salesOrderID = rs.getInt(1);
                    short revisionNumber = rs.getShort(2);
                    Date orderDate = rs.getDate(3);
                    Date dueDate = rs.getDate(4);
                    short status = rs.getShort(6);
                    boolean onlineOrderFlag = rs.getBoolean(7);
                    String salesOrderNumber = rs.getString(8);
                    int billToAddressID = rs.getInt(14);
                    int shipToAddressID = rs.getInt(15);
                    int shipMethodID = rs.getInt(16);
                    BigDecimal subTotal = rs.getBigDecimal(20);
                    BigDecimal taxAmt = rs.getBigDecimal(21);
                    BigDecimal freight = rs.getBigDecimal(22);
                    BigDecimal totalDue = rs.getBigDecimal(23);
                    String rowguid = rs.getString(25);
                    Date modifiedDate = rs.getDate(26);
                    SalesOrderHeader soh = new SalesOrderHeader(
                            salesOrderID, revisionNumber, orderDate, dueDate,
                            status, onlineOrderFlag, salesOrderNumber,
                            billToAddressID, shipToAddressID, shipMethodID,
                            subTotal, taxAmt, freight, totalDue,
                            rowguid, modifiedDate);
                    list.add(soh);
                }

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

    private List<Object> getSalesOrderHeaderSalesReasonList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesOrderHeaderSalesReason";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int salesOrderID = rs.getInt(1);
                    int salesReasonID = rs.getInt(2);
                    Date modifiedDate = rs.getDate(3);
                    SalesOrderHeaderSalesReason sohsr
                            = new SalesOrderHeaderSalesReason(
                                    new SalesOrderHeaderSalesReasonPK(salesOrderID,
                                            salesReasonID), modifiedDate);
                    list.add(sohsr);
                }

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

    private List<Object> getSalesPerson() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesPerson";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int businessEntityID = rs.getInt(1);
                    BigDecimal bonus = rs.getBigDecimal(4);
                    BigDecimal commissionPct = rs.getBigDecimal(5);
                    BigDecimal salesYTD = rs.getBigDecimal(6);
                    BigDecimal salesLastYear = rs.getBigDecimal(7);
                    String rowguid = rs.getString(8);
                    Date modifiedDate = rs.getDate(9);
                    SalesPerson sp = new SalesPerson(businessEntityID, bonus,
                            commissionPct, salesYTD, salesLastYear, rowguid, modifiedDate);
                    list.add(sp);
                }

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

    private List<Object> getSalesPersonQuotaHistory() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesPersonQuotaHistory";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int businessEntityID = rs.getInt(1);
                    Date quotaDate = rs.getDate(2);
                    BigDecimal salesQuota = rs.getBigDecimal(3);
                    String rowguid = rs.getString(4);
                    Date modifiedDate = rs.getDate(5);

                    SalesPersonQuotaHistory spqh = new SalesPersonQuotaHistory(
                            new SalesPersonQuotaHistoryPK(businessEntityID, quotaDate),
                            salesQuota, rowguid, modifiedDate);

                    list.add(spqh);
                }

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

    private List<Object> getSalesReasonList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesReason";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int salesReasonID = rs.getInt(1);
                    String name = rs.getString(2);
                    String reasonType = rs.getString(3);
                    Date modifiedDate = rs.getDate(4);

                    SalesReason sr = new SalesReason(salesReasonID, name, reasonType, modifiedDate);

                    list.add(sr);
                }

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

    private List<Object> getSalesTaxRate() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesTaxRate";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int salesTaxRateID = rs.getInt(1);
                    int stateProvinceID = rs.getInt(2);
                    short taxType = rs.getShort(3);
                    BigDecimal taxRate = rs.getBigDecimal(4);
                    String name = rs.getString(5);
                    String rowguid = rs.getString(6);
                    Date modifiedDate = rs.getDate(7);

                    SalesTaxRate str = new SalesTaxRate(salesTaxRateID,
                            stateProvinceID, taxType, taxRate, name, rowguid, modifiedDate);

                    list.add(str);
                }

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

    private List<Object> getSalesTerritoryList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesTerritory";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int territoryID = rs.getInt(1);
                    String name = rs.getString(2);
                    String countryRegionCode = rs.getString(3);
                    String group = rs.getString(4);
                    BigDecimal salesYTD = rs.getBigDecimal(5);
                    BigDecimal salesLastYear = rs.getBigDecimal(6);
                    BigDecimal costYTD = rs.getBigDecimal(7);
                    BigDecimal costLastYear = rs.getBigDecimal(8);
                    String rowguid = rs.getString(9);
                    Date modifiedDate = rs.getDate(10);

                    SalesTerritory st = new SalesTerritory(territoryID, name,
                            countryRegionCode, group, salesYTD, salesLastYear,
                            costYTD, costLastYear, rowguid, modifiedDate);

                    list.add(st);
                }

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

    private List<Object> getSalesTerritoryHistoryList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SalesTerritoryHistory";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int businessEntityID = rs.getInt(1);
                    int territoryID = rs.getInt(2);
                    Date startDate = rs.getDate(3);
                    String rowguid = rs.getString(5);
                    Date modifiedDate = rs.getDate(6);

                    SalesTerritoryHistory sth = new SalesTerritoryHistory(
                            new SalesTerritoryHistoryPK(businessEntityID, territoryID, startDate),
                            rowguid, modifiedDate);

                    list.add(sth);
                }

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

    private List<Object> getShoppingCartItemList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.ShoppingCartItem";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int shoppingCartItemID = rs.getInt(1);
                    String shoppingCartID = rs.getString(2);
                    int quantity = rs.getInt(3);
                    int productID = rs.getInt(4);
                    Date dateCreated = rs.getDate(5);
                    Date modifiedDate = rs.getDate(6);
                    
                    ShoppingCartItem sci = new ShoppingCartItem(shoppingCartItemID, 
                            shoppingCartID, quantity, productID, dateCreated, modifiedDate);
                    
                    list.add(sci);
                }

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

    private List<Object> getSpecialOfferList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SpecialOffer";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int specialOfferID = rs.getInt(1);
                    String description = rs.getString(2);
                    BigDecimal discountPct = rs.getBigDecimal(3);
                    String type = rs.getString(4);
                    String category = rs.getString(5);
                    Date startDate = rs.getDate(6);
                    Date endDate = rs.getDate(7);
                    int minQty = rs.getInt(8);
                    String rowguid = rs.getString(10);
                    Date modifiedDate = rs.getDate(11);
                    
                    SpecialOffer so = new SpecialOffer(specialOfferID, description, 
                            discountPct, type, category, startDate, endDate, minQty, 
                            rowguid, modifiedDate);
                    
                    list.add(so);
                }

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

    private List<Object> getSpecialOfferProductList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.SpecialOfferProduct";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int specialOfferID = rs.getInt(1);
                    int productID = rs.getInt(2);
                    String rowguid = rs.getString(3);
                    Date modifiedDate = rs.getDate(4);
                    
                    SpecialOfferProduct sop = new SpecialOfferProduct(
                            new SpecialOfferProductPK(specialOfferID, productID), 
                            rowguid, modifiedDate);
                    
                    list.add(sop);
                }

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

    private List<Object> getStoreList() {
        try {
            Connection connection = SQLConnection.getSQLServerConnection();
            List<Object> list = new ArrayList<Object>();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM Sales.Store";
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int businessEntityID = rs.getInt(1);
                    String name = rs.getString(2);
                    String rowguid = rs.getString(5);
                    Date modifiedDate = rs.getDate(6);
                    
                    Store s = new Store(businessEntityID, name, rowguid, modifiedDate);
                    
                    list.add(s);
                }

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
