/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.strategy;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.sms.forex.core.Intrument;
import com.sms.forex.gateway.G_Gateway;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import trading.Event;

@Named
@ApplicationScoped
public class History extends Tracking {
	//public ArrayList<Intrument> intruments=event.getTargets();//not allowed!!
	private DefaultTableModel tableModel;	
	private int during=90;
    private int barwidth=1;

    public History(){
    	super();
        
    }
	public History(Event event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		
        tableModel.setRowCount(0); //Clear table content
		G_Gateway.getDefaultEngine().setHistoryTableModel(tableModel);
		
	    	
		for(int i=0;i<getEvent().getTargets().size();i++){
			G_Gateway.getDefaultEngine().requestHistory(getEvent().getTargets().get(i), getEvent().getEventDateTime(), during,barwidth);  //Register intrument to Server
			
		}
		
	}


	public void setDuring(int during) {
		this.during = during;
	}
    public void setBarwidth(int bar){
        this.barwidth=bar;
    }
	@Override
	public void feedBack() {
		// TODO Auto-generated method stub
		
	}
	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}
	@Override
	public String toString() {
		return "History";
	}
	 
	


}

