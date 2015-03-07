/**
 * Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */
package com.sms.forex.web;

import com.sms.forex.core.Intrument;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.FacesException;
import javax.inject.Named;

@Named
@ApplicationScoped
public class InitBean {

    public ArrayList getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList instruments) {
        this.instruments = instruments;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    private ArrayList<Intrument> instruments;
    private int size = 13;
    private ArrayList<String> selections;

    public ArrayList<String> getSelections() {
        return selections;
    }

    public void setSelections(ArrayList<String> selections) {
        this.selections = selections;
    }

    public InitBean() {

    }
}
