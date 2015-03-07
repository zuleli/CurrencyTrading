/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.gateway;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.sms.forex.core.Intrument;

public class Duka_Engine extends Engine {

	@Override
	public void requestHistory(Intrument intrument,Timestamp dt,int seconds,int bar,DefaultTableModel tableModel) {
		this.tableModel=tableModel;
		
		
	}

	@Override
	public void registerIntruments(ArrayList<Intrument> instruments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerIntrument(Intrument intrument) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestHistory(Intrument intrument, Timestamp dt, int seconds,int bar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

}
