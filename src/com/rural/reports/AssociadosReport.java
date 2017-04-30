/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.reports;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author JoseVitor
 */
public class AssociadosReport {

    private static String path;

    public static void buildRelatorio(String nomeRelatorio, String title, Map<String, Object> filtro) {
        Connection conn = null;

        try {
            //path = System.getProperty("user.dir") + "\\" + nomeRelatorio + ".jasper";
            
            path = "C:\\Rural\\" + nomeRelatorio + ".jasper";

            String dbUrl = "jdbc:mysql://localhost:3306/rural";
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbUser = "root";
            String dbPwd = "123456";

            try {
                Class.forName(dbDriver);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }

            try {
                Properties props = new Properties();
                props.put("user", "root");
                conn = DriverManager
                        .getConnection(dbUrl, dbUser, dbPwd);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            }

            if (conn == null) {
                return;
            }
            
                JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(path, filtro, conn);
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
            viewer.setExtendedState(Frame.MAXIMIZED_BOTH);
            viewer.setTitle(title);
        } catch (NoClassDefFoundError ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getCause().getMessage());
            System.out.println(ex.getMessage());
            throw ex;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            System.out.println(e.getCause().getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getCause().getMessage());
                }
            }
        }
    }
}
