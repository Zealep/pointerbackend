package pe.pss.pointer.pointerbackend.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String convertDateToStringFormatddMMyyyy(Date date){
        try {
            if(date!=null){
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                return sf.format(date);
            }else {
                return null;
            }
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }

        }

        public static String quitarCeros(String numero){
            for(int i=0;i<numero.length();i++){

                //check for the first non-zero character
                if(numero.charAt(i)!='0'){
                    //return the remaining string
                    String res = numero.substring(i);
                    return res;
                }
            }

            return "0";
        }

    public static String convertDateToStringFormatyyyyMMdd(Date date){
        try {
            if(date!=null){
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                return sf.format(date);
            }else {
                return null;
            }
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }

    }
}
