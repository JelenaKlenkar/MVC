/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klenkar.summertask;

import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class Helper {

    public static String enterString(String message) {
        String s;
        while (true) {
            s = JOptionPane.showInputDialog(message);

            if (s.trim().length() == 0) {
                JOptionPane.showConfirmDialog(null, "Required field");
                continue;
            }
            return s;
        }
    }

    public static int enterInteger(String message) {
        int i;
        while (true) {
            try {
                i = Integer.parseInt(JOptionPane.showInputDialog(message));
                if (i <= 0) {
                    JOptionPane.showConfirmDialog(null, "Number needs to be bigger then zero");
                    continue;
                }
                return i;
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Input of number is required");
            }
        }
    }
}
