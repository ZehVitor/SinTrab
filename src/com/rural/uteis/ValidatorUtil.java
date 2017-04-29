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
    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    
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
    
    private static int calcularDigito(String str, int[] peso) {
      int soma = 0;
      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
         digito = Integer.parseInt(str.substring(indice,indice+1));
         soma += digito*peso[peso.length-str.length()+indice];
      }
      soma = 11 - soma % 11;
      return soma > 9 ? 0 : soma;
   }

   public static boolean isValidCPF(String cpf) {
      if ((cpf==null) || (cpf.length()!=11)) return false;

      Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
      Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
      return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
   }

   public static boolean isValidCNPJ(String cnpj) {
      if ((cnpj==null)||(cnpj.length()!=14)) return false;

      Integer digito1 = calcularDigito(cnpj.substring(0,12), pesoCNPJ);
      Integer digito2 = calcularDigito(cnpj.substring(0,12) + digito1, pesoCNPJ);
      return cnpj.equals(cnpj.substring(0,12) + digito1.toString() + digito2.toString());
   }
}
