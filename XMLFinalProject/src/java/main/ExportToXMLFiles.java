/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import business.MainBusiness;
import entity.*;
import parser.Parser;

/**
 *
 * @author frankLX
 */
public class ExportToXMLFiles {
    
    public static void run() {
        Parser parser = new Parser();
        MainBusiness mb = new MainBusiness();
        System.out.println("Ready to export xml files");
        
        parser.marshalling(CountryRegionCurrency.class, 
                mb.getCountryRegionCurrencyList(), "CountryRegionCurrency.xml");
        
//        parser.marshalling(CreditCard.class, 
//                mb.getCreditCardList(), "CreditCard.xml");
//        
//        parser.marshalling(Currency.class, 
//                mb.getCurrencyList(), "Currency.xml");
//        
//        parser.marshalling(CurrencyRate.class, 
//                mb.getCurrencyRateList(), "CurrencyRate.xml");
//        
//        parser.marshalling(Customer.class, 
//                mb.getCustomerList(), "Customer.xml");
//        
//        parser.marshalling(PersonCreditCard.class, 
//                mb.getPersonCreditCardList(), "PersonCreditCard.xml");
//        
//        parser.marshalling(SalesOrderDetail.class, 
//                mb.getSalesOrderDetailList(), "SalesOrderDetail.xml");
//        
//        parser.marshalling(SalesOrderHeader.class, 
//                mb.getSalesOrderHeaderList(), "SalesOrderHeader.xml");
//        
//        parser.marshalling(SalesOrderHeaderSalesReason.class, 
//                mb.getSalesOrderHeaderSalesReasonList(), "SalesOrderHeaderSalesReason.xml");
//        
//        parser.marshalling(SalesPerson.class, 
//                mb.getSalesPerson(), "SalesPerson.xml");
//        
//        parser.marshalling(SalesPersonQuotaHistory.class, 
//                mb.getSalesPersonQuotaHistory(), "SalesPersonQuotaHistory.xml");
//        
//        parser.marshalling(SalesReason.class, 
//                mb.getSalesReasonList(), "SalesReason.xml");
//        
//        parser.marshalling(SalesTaxRate.class, 
//                mb.getSalesTaxRate(), "SalesTaxRate.xml");
//        
//        parser.marshalling(SalesTerritory.class, 
//                mb.getSalesTerritoryList(), "SalesTerritory.xml");
//        
//        parser.marshalling(SalesTerritoryHistory.class, 
//                mb.getSalesTerritoryHistoryList(), "SalesTerritoryHistory.xml");
//        
//        parser.marshalling(ShoppingCartItem.class, 
//                mb.getShoppingCartItemList(), "ShoppingCartItem.xml");
//        
//        parser.marshalling(SpecialOffer.class, 
//                mb.getSpecialOfferList(), "SpecialOffer.xml");
//        
//        parser.marshalling(SpecialOfferProduct.class, 
//                mb.getSpecialOfferProductList(), "SpecialOfferProduct.xml");
//        
//        parser.marshalling(Store.class, 
//                mb.getStoreList(), "Store.xml");
//        
        
        
        
    }
}
