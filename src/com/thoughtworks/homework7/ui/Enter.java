package com.thoughtworks.homework7.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.homework7.util.Translator;

/**
 * user interface
 * @author benny_zhao
 *
 */
public class Enter {

	static final String END_INPUT_IDENTIFIER = "END";	//identifier to stop input
	static List<String> tradeRules ;	//rules on the trade
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initTradeRules();
		System.out.println(Translator.romanToArabic("IlCCDIXMDDVL"));
		

	}
	
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

	

}
