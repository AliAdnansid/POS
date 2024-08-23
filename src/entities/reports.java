/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ali
 */
public class reports {
    public static Map<String, Integer> productReport;
    public static int totalSale;
    public static int totalTransaction;

    public static Map<String, Integer> getProductReport() {
        return productReport;
    }

    public static int getTotalSale() {
        return totalSale;
    }

    public static void setProductReport(Map<String, Integer> productReport) {
        reports.productReport = productReport;
    }

    public static void setTotalSale(int totalSale) {
        reports.totalSale = totalSale;
    }

    public reports() {
        productReport = new  HashMap<>();
        totalSale = 0;
    }
    
    
}
