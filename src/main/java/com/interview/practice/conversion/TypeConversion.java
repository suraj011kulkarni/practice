package com.interview.practice.conversion;

import java.math.BigDecimal;

public class TypeConversion {


    public static void main(String[] args) {
        TypeConversion typeConversion = new TypeConversion();
        typeConversion.charToInt();
        typeConversion.intToChar();
        typeConversion.intToOther();
    }

    public void charToInt(){

         char c1 = '1',c2 = '2',c3 = '3';

         int a,b,c = 0;

         a = Character.getNumericValue(c1);
         b = Character.getNumericValue(c2);
         b = Character.getNumericValue(c3);

    }


    public void intToChar(){
        char c1,c2,c3 = 'A';

        int a=1,b=2,c=3;

        c1 = (char)a;
        c2 = (char)b;
        c3 = (char)c;
    }


    public void intToOther(){

        int a = 1;


        double d1 = (double)a;
        float f1 = (float)a;
        char c = (char)a;
        short shortt = (short)a;
        byte byt = (byte)a;
        //boolean b = (boolean)a;  // Not possible

        Double d = Double.valueOf(a);
        Float f = Float.valueOf(a);
        Long l = Long.valueOf(a);
        String s = String.valueOf(a);
        BigDecimal bd = BigDecimal.valueOf(a);


    }

}
