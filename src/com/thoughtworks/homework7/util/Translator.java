package com.thoughtworks.homework7.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * translate everything in the galaxy
 * @author benny_zhao
 *
 */
public class Translator {
	
	static final String END_INPUT_IDENTIFIER = "END";	//identifier to stop input
	static List<String> tradeRules ;	//rules on the trade

	/**
	 * initialize trade rules 
	 */
	public static void initTradeRules() {

		// press enter to end the line
		tradeRules = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String str = null;
			System.out.println("tell me the rules to make a deal:");
			for (int i = 1; i > 0; i++) {
				str = br.readLine();
				if(str.toUpperCase().equals(END_INPUT_IDENTIFIER)){
					break;
				}else{
					tradeRules.add(str);
				}
			}
			System.out.println(tradeRules.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * analyze the rules
	 * short:unable to find the number-char mixed string
	 * solution:get the first char which can be parsed to number and recursion
	 * @param rule 
	 */
	public static String analyzeTradeRules(String rule){
		
		// press enter to end the line
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String str = null;
			System.out.println("tell me the rules to make a deal:");
			for (int i = 1; i > 0; i++) {
				str = br.readLine();
				if(str.toUpperCase().equals(END_INPUT_IDENTIFIER)){
					break;
				}else{
					tradeRules.add(str);
				}
			}
			System.out.println(tradeRules.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rule;
		
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
		return dirtyStr.replaceAll("[ |��]", " ").trim();
	}

	
}
