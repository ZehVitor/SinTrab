/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.uteis;

import com.rural.enums.EstadoCivil;
import com.rural.enums.RegimeAtividade;
import com.rural.enums.Sexo;
import com.rural.enums.UF;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diego
 */
public class ConversorPersonalizado {

    static final String formato = "dd/MM/yyyy";
    static final String formatoBD = "yyyy-MM-dd";
    static final SimpleDateFormat PTBRDate = new SimpleDateFormat(formato);
    static final SimpleDateFormat BDDate = new SimpleDateFormat(formatoBD);
    static Date date;

    public static Date convertStringToDate(String textoData) throws ParseException {
        if (textoData == null) {
            return null;
        }

        String aux = textoData;
        aux = aux.replaceAll("/", "");
        aux = aux.trim();

        if (aux.equals("")) {
            return null;
        }
        return ConversorPersonalizado.date = new SimpleDateFormat(formato).parse(textoData);
    }

    public static String convertDateToPTBRDate(Date date) {
        if (date == null) {
            return null;
        }
        return PTBRDate.format(date);
    }
    
    public static String convertDateToDateBD(Date date) {
        if (date == null) {
            return null;
        }
        return BDDate.format(date);
    }

    public String convertNumberToString(Long numero) {

        if (numero == null || numero.equals("")) {
            return null;
        }

        return String.valueOf(numero);
    }

    public static String convertNumberToString(Integer numero) {
        if (numero == null || numero == 0) {
            return "";
        }

        return String.valueOf(numero);
    }

    public static Sexo convertStringToSexo(String texto) {
        if (ValidatorUtil.isNullOrEmpty(texto)) {
            return null;
        }
        return Sexo.valueOf(texto);
    }

    public static UF convertStringToUF(String texto) {
        if (ValidatorUtil.isNullOrEmpty(texto)) {
            return null;
        }

        return UF.valueOf(texto);
    }

    public static RegimeAtividade convertStringToRegimeAtividade(String texto) {
        if (ValidatorUtil.isNullOrEmpty(texto)) {
            return null;
        }

        texto = texto.replace(" ", "_");
        return RegimeAtividade.valueOf(texto);
    }

    public static EstadoCivil convertStringToEstadoCivil(String texto) {
        if (ValidatorUtil.isNullOrEmpty(texto)) {
            return null;
        }

        return EstadoCivil.valueOf(texto);
    }

}
