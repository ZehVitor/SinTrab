/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.uteis;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Collection;

/**
 *
 * @author JoseVitor
 */
public  class ValidatorUtil {
    
    public static boolean isNullOrEmpty(String dado){
        if (dado == null) {
            return true;
        }
        if (dado.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public static boolean isNullOrEmpty(Collection dado){
        if (dado == null) {
            return true;
        }
        
        if (dado.isEmpty()) {
            return true;
        }
        
        boolean isNull = true;
        for (Object ob : dado) {
            if (ob != null) {
                isNull = false;
                break;
            }
        }
        
        if (isNull) {
           return true; 
        }
        
        return false;
    }
    
    public static boolean isValidDate(String data){
        if (isNullOrEmpty(data)) {
            return false;
        }
        
        int dia = 0;
        int mes = 0;
        int ano = 0;
        try {
            dia = Integer.parseInt(data.split("/")[0]);
            mes = Integer.parseInt(data.split("/")[1]);
            ano = Integer.parseInt(data.split("/")[2]);
        } catch (Exception e) {
            return false;
        }
        
        if (dia > 31 || dia < 1) {
            return false;
        }
        if (mes > 12 || mes < 1) {
            return false;
        }
        if (ano < 1800) {
            return false;
        }
                
        try
        {
            LocalDate.of(ano, mes, dia);
            return true;
        }
        catch(DateTimeException e)
        {
            return false;
        }
    }
}
