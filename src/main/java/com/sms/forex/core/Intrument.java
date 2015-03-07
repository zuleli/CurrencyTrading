/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */


package com.sms.forex.core;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class Intrument {
	private int ID=-1;
	private double bidPrice=0;
	private double askPrice=0;
	private String name="InstrumentName";
	private String intrmentSymbol="intrmentSymbol";
	private String intrumentCurrency="intrumentCurrency";
	
	public Intrument(){
	}
	public Intrument(int id){
		ID=id;
	}
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public  String getName() {
		return INTRUMENTS.getPairName(ID);
	}
	public double getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	public double getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}
	public  String getSymbol() {
		return INTRUMENTS.getPairSymbol(ID);
	}
	public  String getCurrency() {
		return INTRUMENTS.getPairCurrency(ID);
	}
	@Override
	public String toString(){
		return this.getName();
	}
	

}
