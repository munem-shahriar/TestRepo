package com.ruhul.main;

import edu.duke.*;
import org.apache.commons.csv.*;


public class WhichCountriesExport {

	String countryInfo(CSVParser parser, String country){
		
		for (CSVRecord record : parser) {
			
			String export = record.get("Exports");
			String country = record.get("Country");
			System.out.println(country);
			
		String countryInformation = NULL;
		return ""; 
	}
	
	String listExportersTwoProducts(CSVParser parser, String exporItem1, String exportItem2 ){
		
		return "";
	}
	
	int numberOfExporters(CSVParser parser, String exporItem){
		int NumberOfOccurings;
		return NumberOfOccurings;
	}
	
	String bigExporters(CSVParser parser, String amount){
		return ""; 
	}
	
}

