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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("glob is I");
		System.out.println("prok is V");
		System.out.println("pish is X");
		System.out.println("tegj is L");
		System.out.println("glob glob Silver is 34 Credits");
		System.out.println("glob prok Gold is 57800 Credits");
		System.out.println("pish pish Iron is 3910 Credits");
		System.out.println("how much is pish tegj glob glob ?");
		System.out.println("how many Credits is glob prok Silver ?");
		System.out.println("how many Credits is glob prok Gold ?");
		System.out.println("how many Credits is glob prok Iron ?");
		System.out.println("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
		System.out.println("");	
		System.out.println("caculating , wait a moment...");
		System.out.println(".............................");
		System.out.println("ahha , got it.");
		System.out.println("");
		System.out.println("pish tegj glob glob is "+Translator.romanToArabic(Translator.analyzeTradeRules("pish+tegj+glob+glob")));
		System.out.println("glob prok Silver is "+Translator.romanToArabic(Translator.analyzeTradeRules("(glob+prok)/(glob+glob)*34"))+"Credits");
		System.out.println("glob prok Gold is "+Translator.romanToArabic(Translator.analyzeTradeRules("(glob+proc)/(glob+prok)*57800"))+"Credits");
		System.out.println("glob prok Iron is "+Translator.romanToArabic(Translator.analyzeTradeRules("(glob+prok)/(pish+pish)*3910"))+"Credits");
		System.out.println("I have no idea what you are talking about");;

	}
	


	

}
