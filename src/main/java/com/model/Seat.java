package com.model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Seat {
		
		@Id
		@GeneratedValue
		private int sId;
		private int seatNo;
		
		//@Enumerated(EnumType.STRING)
		private boolean checkStatus;
		public int getsId() {
			return sId;
		}
		
		public Seat() {
			
		}
		
		public Seat(int seatNo, boolean checkStatus) {
			super();
			this.seatNo = seatNo;
			this.checkStatus = checkStatus;
		}

		public void setsId(int sId) {
			this.sId = sId;
		}
		public int getSeatNo() {
			return seatNo;
		}
		public void setSeatNo(int seatNo) {
			this.seatNo = seatNo;
		}
		public boolean isCheckStatus() {
			return checkStatus;
		}
		public void setCheckStatus(boolean checkStatus) {
			this.checkStatus = checkStatus;
		}
		
		
		

	}
