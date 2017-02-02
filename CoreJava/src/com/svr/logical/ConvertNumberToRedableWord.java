package com.svr.logical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Venkata Saripella
 *
 */
public class ConvertNumberToRedableWord {

   static Map<Integer, String> num = new HashMap<Integer,String>();
   static {
       num.put(0, "zero");
       num.put(2, "two");
       num.put(3, "three");
       num.put(4, "four");
       num.put(5, "five");
       num.put(6, "six");
       num.put(7, "seven");
       num.put(8, "eight");
       num.put(9, "nine");
       num.put(10, "Ten");
       num.put(11, "eleven");
       num.put(12, "twelve");
       num.put(13, "thirteen");
       num.put(14, "fourteen");
       num.put(15, "fifteen");
       num.put(16, "sixteen");
       num.put(17, "seventeen");
       num.put(18, "eithteen");
       num.put(19, "nineteen");
       num.put(20, "Twenty");
       num.put(30, "Thirty");
       num.put(40, "Forty");
       num.put(50, "Fifty");
       num.put(60, "Sixty");
       num.put(70, "Seventy");
       num.put(80, "Eighty");
       num.put(90, "Ninety");
       num.put(100, "Hundred");
       num.put(200, "TwoHundred");
       num.put(300, "ThreeHundred");
       num.put(400, "FourHundred");
       num.put(500, "FiveHundred");
       num.put(600, "SixHundred");
       num.put(700, "SevenHundred");
       num.put(800, "EightHundred");
       num.put(900, "NineHundred");
       num.put(1000, "OneThousand");
       num.put(2000, "TwoThousand");
       num.put(3000, "ThreeThousand");
       num.put(4000, "FourThousand");
       num.put(5000, "FiveThousand");
       num.put(6000, "SixThousand");
       num.put(7000, "SevenThousand");
       num.put(8000, "EightThousand");
       num.put(9000, "NineThousand");
       num.put(10000, "TenThousand");
       num.put(20000, "TwentyThousand");
       num.put(30000, "ThirtyThousand");
       num.put(40000, "FourtyThousand");
       num.put(50000, "FiftyThousand");
       num.put(60000, "SixtyThousand");
       num.put(70000, "SeventyThousand");
       num.put(80000, "EightyThousand");
       num.put(90000, "NintyThousand");
       num.put(100000, "Lack");
       num.put(200000, "TwoLack");
       num.put(300000, "ThreeLack");
       num.put(400000, "FourLack");
       num.put(500000, "FiveLack");
       num.put(600000, "SixLack");
       num.put(700000, "SevenLack");
       num.put(800000, "EightLack");
       num.put(900000, "NineLack");
       num.put(1000000, "Million");
       num.put(2000000, "TwoMillion");
       num.put(3000000, "ThreeMillion");
       num.put(4000000, "FourMillion");
       num.put(5000000, "FiveMillion");
       num.put(6000000, "SixMillion");
       num.put(7000000, "SevenMillion");
       num.put(8000000, "EightMillion");
       num.put(9000000, "NineMillion");
       num.put(10000000, "Crore");
       num.put(20000000, "TwoCrore");
       num.put(30000000, "ThreeCrore");
       num.put(40000000, "FourCrore");
       num.put(50000000, "FiveCrore");
       num.put(60000000, "SixCrore");
       num.put(70000000, "SevenCrore");
       num.put(80000000, "EightCrore");
       num.put(90000000, "NineCrore");
       
   }
    /**
     * @param args
     */
    public static void convertNumToEquWord(String[] args) {
       
        Integer   number        = 222;
        Integer   unitPosition  = 1;
        Integer   len           = number.toString().length();
        Integer   length        = len - 1;
        String[]  result        = new String[len];
        StringBuffer sb         = new StringBuffer();
        while(number > 0){
            result[length --]   = convertNumberToText(number % 10, unitPosition);
            unitPosition       *= 10;
            number              = number/10;
        }
        for(String res : result){
            sb.append(res);
        }
        System.out.println(sb);
    }

    public static String convertNumberToText(Integer remainder, Integer unitPlace){
        
        return num.get(remainder * unitPlace);
    }
    
}
