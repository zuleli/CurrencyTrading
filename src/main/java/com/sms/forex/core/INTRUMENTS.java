/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.core;

import java.util.ArrayList;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import javax.swing.JComboBox;

@Named("pairs")
@Singleton
@Startup
public class INTRUMENTS {

    static final int USDJPY = 0;
    static final int EURUSD = 1;
    static final int USDCAD = 2;
    static final int EURCHF = 3;
    static final int AUDUSD = 4;
    static final int NZDUSD = 5;
    static final int GBPUSD = 6;
    static final int EURGBP = 7;
    static final int GBPJPY = 8;
    static final int EURCAD = 9;
    static final int CADJPY = 10;
    static final int EURJPY = 11;
    static final int EURAUD = 12;
    static final int AUDJPY = 13;
    static final int EURNZD = 14;
    static final int NZDJPY = 15;
    static final int USDCHF = 16;
    static final int CHFJPY = 17;
    static final int AUDCAD = 18;
    static final int NZDCAD = 19;
    static final int GBPCAD = 20;
    static final int CADCHF = 21;
    static final int GBPAUD = 22;
    static final int GBPNZD = 23;
    static final int GBPCHF = 24;
    static final int AUDNZD = 25;
    static final int AUDCHF = 26;
    static final int NZDCHF = 27;
    static final int USD = 10;
    static final int JPY = 11;
    static final int EUR = 12;
    static final int CAD = 13;
    static final int AUD = 14;
    static final int GBP = 15;
    static final int NZD = 16;
    static final int CHF = 17;
    private ArrayList<Intrument> instruments=new ArrayList<Intrument>();

    public ArrayList<Intrument> getInstruments() {
        return instruments;
    }

    public INTRUMENTS() {
        for(int i=0;i<28;i++){
            
            instruments.add(new Intrument(i));
        }

    }

    public static int getDecimalPosition(int instrumentID) {
        String tem = getPairName(instrumentID).substring(3);
        if (tem.equalsIgnoreCase("JPY")) {
            return 100;
        } else {
            return 10000;
        }
    }

    public static String getCurrencySymbol(int id) {

        switch (id) {
            case JPY:
                return "JPY";
            case USD:
                return "USD";
            case EUR:
                return "EUR";
            case CAD:
                return "CAD";
            case AUD:
                return "AUD";
            case GBP:
                return "GBP";
            case NZD:
                return "NZD";
            case CHF:
                return "CHF";
        }
        return "Currency";
    }

    public static void fillJCombox(JComboBox<String> cbox) {
        cbox.addItem(getPairName(USDJPY));
        cbox.addItem(getPairName(EURUSD));
        cbox.addItem(getPairName(USDCAD));
        cbox.addItem(getPairName(EURCHF));
        cbox.addItem(getPairName(AUDUSD));
        cbox.addItem(getPairName(NZDUSD));
        cbox.addItem(getPairName(GBPUSD));
        cbox.addItem(getPairName(EURGBP));
        cbox.addItem(getPairName(GBPJPY));
        cbox.addItem(getPairName(EURCAD));
        cbox.addItem(getPairName(CADJPY));
        cbox.addItem(getPairName(EURJPY));
        cbox.addItem(getPairName(EURAUD));
        cbox.addItem(getPairName(AUDJPY));
        cbox.addItem(getPairName(EURNZD));
        cbox.addItem(getPairName(NZDJPY));
        cbox.addItem(getPairName(USDCHF));
        cbox.addItem(getPairName(CHFJPY));
        cbox.addItem(getPairName(AUDCAD));
        cbox.addItem(getPairName(NZDCAD));
        cbox.addItem(getPairName(GBPCAD));
        cbox.addItem(getPairName(CADCHF));
        cbox.addItem(getPairName(GBPAUD));
        cbox.addItem(getPairName(GBPNZD));
        cbox.addItem(getPairName(GBPCHF));
        cbox.addItem(getPairName(AUDNZD));
        cbox.addItem(getPairName(AUDCHF));
        cbox.addItem(getPairName(NZDCHF));

    }

    public static String getPairName(int id) {

        switch (id) {
            case USDJPY:
                return "USDJPY";
            case USDCAD:
                return "USDCAD";
            case EURUSD:
                return "EURUSD";
            case AUDCAD:
                return "AUDCAD";
            case AUDCHF:
                return "AUDCHF";
            case AUDJPY:
                return "AUDJPY";
            case AUDNZD:
                return "AUDNZD";
            case AUDUSD:
                return "AUDUSD";
            case CADCHF:
                return "CADCHF";
            case CADJPY:
                return "CADJPY";
            case CHFJPY:
                return "CHFJPY";
            case EURAUD:
                return "EURAUD";
            case EURCAD:
                return "EURCAD";
            case EURCHF:
                return "EURCHF";
            case EURGBP:
                return "EURGBP";
            case EURJPY:
                return "EURJPY";
            case EURNZD:
                return "EURNZD";
            case GBPAUD:
                return "GBPAUD";
            case GBPCAD:
                return "GBPCAD";
            case GBPCHF:
                return "GBPCHF";
            case GBPJPY:
                return "GBPJPY";
            case GBPNZD:
                return "GBPNZD";
            case GBPUSD:
                return "GBPUSD";
            case NZDCAD:
                return "NZDCAD";
            case NZDCHF:
                return "NZDCHF";
            case NZDJPY:
                return "NZDJPY";
            case NZDUSD:
                return "NZDUSD";
            case USDCHF:
                return "USDCHF";

        }
        return "Name";
    }

    public static String getPairSymbol(int id) {

        switch (id) {
            case USDJPY:
                return "USD";
            case USDCAD:
                return "USD";
            case EURUSD:
                return "EUR";
            case AUDCAD:
                return "AUD";
            case AUDCHF:
                return "AUD";
            case AUDJPY:
                return "AUD";
            case AUDNZD:
                return "AUD";
            case AUDUSD:
                return "AUD";
            case CADCHF:
                return "CAD";
            case CADJPY:
                return "CAD";
            case CHFJPY:
                return "CHF";
            case EURAUD:
                return "EUR";
            case EURCAD:
                return "EUR";
            case EURCHF:
                return "EUR";
            case EURGBP:
                return "EUR";
            case EURJPY:
                return "EUR";
            case EURNZD:
                return "EUR";
            case GBPAUD:
                return "GBP";
            case GBPCAD:
                return "GBP";
            case GBPCHF:
                return "GBP";
            case GBPJPY:
                return "GBP";
            case GBPNZD:
                return "GBP";
            case GBPUSD:
                return "GBP";
            case NZDCAD:
                return "NZD";
            case NZDCHF:
                return "NZD";
            case NZDJPY:
                return "NZD";
            case NZDUSD:
                return "NZD";
            case USDCHF:
                return "USD";

        }
        return "Symbol";
    }

    public static String getPairCurrency(int id) {

        switch (id) {
            case USDJPY:
                return "JPY";
            case USDCAD:
                return "CAD";
            case EURUSD:
                return "USD";
            case AUDCAD:
                return "CAD";
            case AUDCHF:
                return "CHF";
            case AUDJPY:
                return "JPY";
            case AUDNZD:
                return "NZD";
            case AUDUSD:
                return "USD";
            case CADCHF:
                return "CHF";
            case CADJPY:
                return "JPY";
            case CHFJPY:
                return "JPY";
            case EURAUD:
                return "AUD";
            case EURCAD:
                return "CAD";
            case EURCHF:
                return "CHF";
            case EURGBP:
                return "GBP";
            case EURJPY:
                return "JPY";
            case EURNZD:
                return "NZD";
            case GBPAUD:
                return "AUD";
            case GBPCAD:
                return "CAD";
            case GBPCHF:
                return "CHF";
            case GBPJPY:
                return "JPY";
            case GBPNZD:
                return "NZD";
            case GBPUSD:
                return "USD";
            case NZDCAD:
                return "CAD";
            case NZDCHF:
                return "CHF";
            case NZDJPY:
                return "JPY";
            case NZDUSD:
                return "USD";
            case USDCHF:
                return "CHF";

        }
        return "Name";
    }

}
