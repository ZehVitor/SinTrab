/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.uteis;

import com.rural.enums.Sexo;
import com.rural.enums.UF;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author diego
 */
public class ConversorPersonalizado {

    static String formato = "dd/MM/yyyy";
    static SimpleDateFormat PTBRDate = new SimpleDateFormat(formato);
    static Date date;

    public static Date convertStringToDate(String textoData) throws ParseException {
        String aux = textoData;
        aux = aux.replaceAll("/", "");
        aux = aux.trim();

        if (aux.equals("")) {
            return null;
        }
        return ConversorPersonalizado.date = new SimpleDateFormat(formato).parse(textoData);
    }

    public static String convertDateToPTBRDate(Date date) {
        return PTBRDate.format(date);
    }

    public String convertNumberToString(Long numero) {

        if (numero.equals("")) {
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

    public static UF convertStringToUF(String texto) {
        return UF.valueOf(texto);
    }

}
