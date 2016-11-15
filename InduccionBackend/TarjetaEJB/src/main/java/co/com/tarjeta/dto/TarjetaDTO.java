package co.com.tarjeta.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class TarjetaDTO implements Serializable {
	
	private Integer id;
	private String cardNumber;
	private Integer identityCard;
	private String type;
	private Double debt;
	private Double totalAmount;
	private Integer delayDays;
	
	public Double getDebt() {
		return debt;
	}
	public void setDebt(Double debt) {
		this.debt = debt;
	}
	
}
