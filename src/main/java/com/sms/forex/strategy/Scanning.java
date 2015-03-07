/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.strategy;

import java.util.ArrayList;

import com.sms.forex.core.Intrument;

import trading.Event;

public class Scanning extends Tracking {
	ArrayList<Intrument> intruments=event.getTargets();
	private double[] pricedif;
	private double[] previousPrice;
	

	@Override
	public String toString() {
		return "Scanning";
	}

	@Override
	public void setInterval(int interval) {
		// TODO Auto-generated method stub
		super.setInterval(interval);
	}
    public Scanning(){
    	super();
    }
	public Scanning(Event event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void feedBack() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		while(!stopcontroller){
			for(int i=0;i<intruments.size();i++){
				
			}
			
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
