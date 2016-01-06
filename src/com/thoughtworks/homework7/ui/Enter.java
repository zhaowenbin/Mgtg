package com.thoughtworks.homework7.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * user interface
 * @author benny_zhao
 *
 */
public class Enter {

	static List<String> tradeRules ;//rules on the trade
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//press enter to end the line
		tradeRules = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String str = null; 
            System.out.println("Enter your value:"); 
            str = br.readLine(); 
            System.out.println("your value is :"+str); 

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void addTradeRule(){
		
	}

}
