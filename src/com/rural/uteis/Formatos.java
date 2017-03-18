/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.uteis;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author diego
 */
public class Formatos {

    public MaskFormatter getFormatoDataSimples() throws ParseException {
        MaskFormatter m = new MaskFormatter("##/##/####");
        return m;
    }

    public MaskFormatter getFormatoCPF() throws ParseException {
        MaskFormatter m = new MaskFormatter("###.###.###-##");
        return m;
    }

}
