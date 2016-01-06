package com.thoughtworks.homework7.util;

/**
 * translate everything in the galaxy
 * @author benny_zhao
 *
 */
public class Translator {

	
	
	/**
	 * analyze the rules
	 * short:unable to find the number-char mixed string
	 * solution:get the first char which can be parsed to number and recursion
	 */
	public static void analyzeTradeRules(){
		
		
		
	}
	
	/**
	 * trans roman symbol to aribic number
	 */
	public static int romanToArabic(String romanStr){
		
		int arabicValue = 0;
		String[] romanSymbols = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int[] arabicNumber = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String romanStrModified = trimAll(romanStr).toUpperCase();
		for(int i=0; i<romanStrModified.length(); i++){
			String charOne = String.valueOf(romanStrModified.charAt(i));
			if (!(charOne.equals("I") || charOne.equals("V")
					|| charOne.equals("X") || charOne.equals("L")
					|| charOne.equals("C") || charOne.equals("D")
					|| charOne.equals("M"))){
				System.out.println("input error: Roman number limits 'I','V','X','L','C','D','M'");
				arabicValue = 0;
				break;
			}
			boolean strTwoFlag = false;
			if(i<romanStrModified.length()-1){
				String strTwo = romanStrModified.substring(i, i+2);
				for(int j=0; j<romanSymbols.length; j++){
					if(strTwo.equals(romanSymbols[j])){
						strTwoFlag = true;
						arabicValue = arabicValue+arabicNumber[j];
						i++;
						break;
					}
				}
			}
			if(!strTwoFlag){
				for(int k=0; k<romanSymbols.length; k++){
					if(charOne.equals(romanSymbols[k])){
						arabicValue = arabicValue+arabicNumber[k];
						break;
					}
				}
			}
		}
		return arabicValue;
		
	}
	
	/**
	 * get rid of the spaces include the IME space at both sides of the input string ones
	 * @param dirtyStr
	 * @return
	 */
	public static String trimAll(String dirtyStr){
		return dirtyStr.replaceAll("[ |¡¡]", " ").trim();
	}

	
}
