package com.cws.util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommonUtils {

	private CommonUtils() {
		// avoid initialisation
	}
	
	public static Date convertStringToDate(final String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(dateStr, formatter);
		return Date.valueOf(localDate);
	}
	
}
