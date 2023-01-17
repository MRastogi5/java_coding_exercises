package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exercise004 {

	LocalDateTime dateTime = null;

	public Exercise004(LocalDate date) {
		this(LocalDateTime.of(date, LocalTime.of(0, 0, 0)));
	}

	public Exercise004(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public LocalDateTime getDateTime() {

		LocalDateTime date = null;
		long sec = 1000000000; // A gigasecond
		date = dateTime.plusSeconds(sec);

		return date;
	}
}
