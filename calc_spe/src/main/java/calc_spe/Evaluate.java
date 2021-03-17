package calc_spe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;
import java.math.BigInteger;

public class Evaluate {
	private static final Logger logger = LogManager.getLogger(calc_spe.Evaluate.class);
	public static BigInteger factorial(BigInteger number) {
	    BigInteger result = BigInteger.valueOf(1);

	    for (long factor = 2; factor <= number.longValue(); factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }

	    return result;
	}

	public static double evaluate(String text) {
		if(text.charAt(0) == '√') {
			logger.info("Computing square root of " +Double.parseDouble(text.substring(1,text.length())));
			return Math.sqrt(Double.parseDouble(text.substring(1,text.length())));
		} 
		
		else if(text.charAt(0) == 'l') {
			logger.info("Computing Log of " +text.substring(2,text.length()));
			return Math.log(Double.parseDouble(text.substring(2,text.length())));
		}
		
		else {
			int i = 0;
			while(i < text.length()) {
                String sbuf = "";
				if (((text.charAt(i) >= '0' && text.charAt(i) <= '9') || text.charAt(i) == '.') && text.charAt(i) != '!'){
                    sbuf += text.charAt(i);
                }

				else if(text.charAt(i) == '^' ) {
					logger.info("Computing " +text.substring(0, i) + "raised to the power of" +Double.parseDouble(text.substring(i+1)));
					return Math.pow(Double.parseDouble(text.substring(0, i)), Double.parseDouble(text.substring(i+1)));
				}
				
				else if(text.charAt(i) == '!') {
			
			        BigInteger bigIntegerStr=new BigInteger(text.substring(0,i));
					logger.info("Computing factorial of " +bigIntegerStr.doubleValue());
 					return factorial(bigIntegerStr).doubleValue();
				}
				
				i++;
				
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}
}
