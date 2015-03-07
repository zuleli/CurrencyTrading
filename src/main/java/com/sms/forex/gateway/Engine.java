/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.gateway;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.sms.forex.core.INTRUMENTS;
import com.sms.forex.core.Intrument;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public abstract class Engine {
	protected ArrayList<Intrument> intruments;
	protected DefaultTableModel tableModel;
	public abstract void requestHistory(Intrument intrument,Timestamp dt,int during,int bar,DefaultTableModel tableModel);
	public abstract void requestHistory(Intrument intrument,Timestamp dt,int during,int bar);
	public abstract void registerIntruments(ArrayList<Intrument> instruments);
	public abstract void registerIntrument(Intrument intrument);
	public abstract void connect();
	public abstract void disconnect();
	public abstract boolean isConnected();
	public void setHistoryValue(int intrumentID,String datetime,double openPrice,double high,double low,double closePrice,int count,int volume){
	//System.out.println("E0:"+intrumentID+"   "+datetime+"   "+openPrice+"   "+high+"   "+low+"   "+closePrice+"   "+count+"   "+volume+"  "+datetime.trim().length());
	   
        
               if(datetime.length()>20)
                    return;
         
                String tem=datetime.substring(0, 4);
                       tem=tem+"-"+datetime.substring(4, 6);
                       tem=tem+"-"+datetime.substring(6,8);
                       tem=tem+" "+datetime.substring(9).trim();
                       
               // System.out.println(INTRUMENTS.getPairName(intrumentID)+"      "+datetime+"      "+openPrice+"      "+high+"      "+low+"      "+closePrice+"      "+count+"      "+volume+"   "+(Timestamp.valueOf(tem)).getTime());
                //(Timestamp.valueOf(tem)).getTime());
	//	int row=tableModel.getRowCount();
		
		Object[] newRow=new Object[]{new Intrument(intrumentID),datetime,openPrice,high,low,closePrice,count,volume,Long.valueOf((Timestamp.valueOf(tem)).getTime())};
		
	//	tableModel.setRowCount(row+1);
	//	tableModel.setValueAt(1, row, 0);
	//	tableModel.setValueAt(1, row, 1);
	//	tableModel.setValueAt(1, row, 2);
	//	tableModel.setValueAt(1, row, 3);
	//	tableModel.setValueAt(1, row, 4);
	//	tableModel.setValueAt(1, row, 5);
	//	tableModel.setValueAt(1, row, 6);
		
		tableModel.addRow(newRow);
		//tableModel.fireTableRowsInserted(row, row+1);
		//tableModel.fireTableDataChanged();
		//tableModel.fireTableStructureChanged();
		//System.out.println("Values:"+intrumentID+" "+datetime+" "+openPrice+" ||"+tableModel.getRowCount()+"  "+tableModel.getColumnName(1)+" ");
	}
	
	// set ask price
	public void setIntrumentAskPrice(int intrumentID,double askPrice){
		for(int i=0;i<intruments.size();i++){
			if(intrumentID==intruments.get(i).getID()){
				intruments.get(i).setAskPrice(askPrice);
				return;
			}
		}		
	}
	
	//set bid price
    public void setIntrumentBidPrice(int intrumentID,double bidPrice){
    	for(int i=0;i<intruments.size();i++){
			if(intrumentID==intruments.get(i).getID()){
				intruments.get(i).setAskPrice(bidPrice);
				return;
			}
		}
	}
    
	public Intrument getIntrument(int intrumentID){
		return intruments.get(intrumentID);
	}
	public ArrayList<Intrument> getIntruments() {
		return intruments;
	}
	public void setHistoryTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}
	

}
