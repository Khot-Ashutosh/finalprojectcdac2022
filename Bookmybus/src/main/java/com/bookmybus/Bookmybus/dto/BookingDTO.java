package com.bookmybus.Bookmybus.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.bookmybus.Bookmybus.enity.BookingStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookingDTO {

	//@NotBlank(message = "userid cannot be blank")
	private int userid;
	
	//@NotBlank(message = "Seat number can not be blank")
	private int seatNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateofJourny;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateofBooking;
	
	@Enumerated(EnumType.STRING)
	private BookingStatus bookingstatus;
	
	
	private double fareAmount;
	
	private int busid;
	
	


	public int getBusid() {
		return busid;
	}


	public void setBusid(int busid) {
		this.busid = busid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	
	public BookingStatus getBookingstatus() {
		return bookingstatus;
	}


	public void setBookingstatus(BookingStatus bookingstatus) {
		this.bookingstatus = bookingstatus;
	}


	public double getFareAmount() {
		return fareAmount;
	}


	public void setFareAmount(double fareAmount) {
		this.fareAmount = fareAmount;
	}


	
	
	
}
