/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.uteis;

import com.rural.enums.Sexo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author diego
 */
public class ConversorPersonalizado {

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate convertStringToLocalDate(String textoData) {
        String aux = textoData;
        aux = aux.replaceAll("/", "");
        aux = aux.trim();

        if (aux.equals("")) {
            return null;
        }
        return LocalDate.parse(textoData, dtf);
    }

    public static String convertLocalDateToPTBRDate(LocalDate date) {
        return date.format(dtf);
    }

    public static String convertNumberToString(Long numero) {
      
        if(numero.equals("")){
            return null;
        }
               
        return String.valueOf(numero);
    }

    public static String convertNumberToString(Integer numero) {
        return String.valueOf(numero);
    }

    public static Sexo convertStringToSexo(String texto) {
        return Sexo.valueOf(texto);
    }
}
