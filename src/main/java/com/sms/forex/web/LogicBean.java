/**
 * Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */
package com.sms.forex.web;

import com.sms.forex.core.INTRUMENTS;
import com.sms.forex.core.Intrument;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("logic")
@ApplicationScoped
public class LogicBean {
    
    @Inject InitBean initbean;
    @Inject INTRUMENTS intruments;
    
    

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Intrument> getSelectedInstruments() {
        ArrayList<String> values=initbean.getSelections();
       
        for(int i=0;i<values.size();i++){
            int tem=Integer.parseInt(values.get(i));
           selectedInstruments.add(intruments.getInstruments().get(tem));
        }
        return selectedInstruments;
    }

    public void setSelectedInstruments(ArrayList<Intrument> instruments) {
        this.selectedInstruments = instruments;
    }

    private int size = 0;
    private ArrayList<Intrument> selectedInstruments=new ArrayList<Intrument>();

    public LogicBean() {

    }

}
