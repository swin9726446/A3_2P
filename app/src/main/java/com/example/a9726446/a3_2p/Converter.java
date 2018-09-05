package com.example.a9726446.a3_2p;

import java.text.DecimalFormat;

/**
 * Created by 9726446 on 29/8/18 @ LB1-MAC-024
 */

class Converter {
    public String Convert(String mi, String ft, String in, boolean isMetres) {
        try{
            //Start with largest unit
            double result = Double.parseDouble(mi);
            //1 mi = 5280"
            result = Double.parseDouble(ft) + (result * 5280);
            //1' = 12"
            result = Double.parseDouble(in) + (result * 12);
            //1" = 2.54cm
            result = result * 2.54;

            /*
            double mile = Double.parseDouble(mi);
            double feet = Double.parseDouble(ft);
            double inch = Double.parseDouble(in);
            //1 mi = 5280"
            feet += mile * 5280;
            //1' = 12"
            inch += feet * 12;
            //1" = 2.54cm
            double centimetre = inch * 2.54;
            */

            if (isMetres){
                result /= 100;
            }

            return new DecimalFormat("##.###").format(result) + (isMetres ? " m" : " cm");
        } catch (NumberFormatException nfe){
            return "ERR";
        }
    }
}
