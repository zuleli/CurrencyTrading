/**
 * Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */
package helper;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class TableModel extends DefaultTableModel {
	   
 
		public TableModel(){
	        super();
	    }
        Class[] types = new Class [] {
            java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false, true
        };
         
   //     public TableModel(Object[][] data, Object[] columnNames){
  //          super.(data,columnNames);
  //      }
        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
        public void setColumnClass(Class[] types){
            this.types=types;
        }
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    }


