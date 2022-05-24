package com.cts.portal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessPensionInput {

	private long aadharNumber;
	private double pensionAmount;
	private double bankCharge;
	public ProcessPensionInput() {
		
	}
	public ProcessPensionInput(long aadharNumber, double pensionAmount, double bankCharge) {
		this.aadharNumber = aadharNumber;
		this.pensionAmount = pensionAmount;
		this.bankCharge = bankCharge;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(double bankCharge) {
		this.bankCharge = bankCharge;
	}
	
	
	
}
