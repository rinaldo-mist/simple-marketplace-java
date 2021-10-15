/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import Service.PublicVariables;

/**
 *
 * @author MSI
 */
public class CartOperations {
    
    
    public String addOrRemoveItems(String qtyIn, String mode){
        
        int qtyOut = Integer.parseInt(qtyIn);
        if(mode == PublicVariables.ADD_BUTTON){
            qtyOut += 1;
        } else {
            if (qtyOut <= 0){
                qtyOut = 0;
            } else {
                qtyOut -= 1;
            }
        }
        return ""+qtyOut;
    }
    
    public String grandTotal (HashMap<String, String> qty) {
        
        int totalHolder = 0;
        
        for (Map.Entry<String, String> entry : qty.entrySet()) {
            int price = Integer.parseInt(entry.getKey());
            int qtyNeed = Integer.parseInt(entry.getValue());
            
            totalHolder += (price*qtyNeed);
        }
        
        return ""+totalHolder;
    }
}
