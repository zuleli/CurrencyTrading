/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.gateway;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.ib.client.CommissionReport;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EClientSocket;
import com.ib.client.EWrapper;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.TickType;
import com.ib.client.UnderComp;
import com.ib.controller.Instrument;
import com.sms.forex.core.Intrument;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class IB_Engine extends Engine implements EWrapper {
    private ArrayList<Intrument> pairs;
    private int port = 7933; // connection port number
    private String description = "This is IB API";


   // public boolean m_bIsFAAccount = false;

    private boolean m_disconnectInProgress = false;

    public void connect() {
     //   m_bIsFAAccount = false;
        m_disconnectInProgress = false;
        if (!m_client.isConnected()) {

            m_client.eConnect("", port, 1); //connection host,port number,clientID
            if (m_client.isConnected()) {

                System.out.println("Connected to Tws server version " + m_client.serverVersion() + " at " +
                                   m_client.TwsConnectionTime());
            } else {
                System.out.println("connection problem,port=" + port);
                return;
            }

            // m_client.reqAccountUpdates(true,null);//?
            // m_client.reqIds(1);//? new API no this one
        }

    }

    public void disconnect() {

        m_client.eDisconnect();

    }

    public ArrayList<Intrument> getPairs() {
        return pairs;
    }

    public void setPairs(ArrayList<Intrument> pairs) {
        this.pairs = pairs;
    }

    //********IB Broker API***********//
    private EClientSocket m_client = new EClientSocket(this);

    public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {
        // received price tick
        if (TickType.ASK == field) {
            setIntrumentAskPrice(tickerId, price);
        } else if (TickType.BID == field) {
            setIntrumentBidPrice(tickerId, price);
        }

    }

    public void error(Exception e) {
        // TODO Auto-generated method stub

    }

    public void error(String str) {
        // TODO Auto-generated method stub

    }

    public void error(int id, int errorCode, String errorMsg) {
        // TODO Auto-generated method stub


    }

    public void connectionClosed() {
        // TODO Auto-generated method stub

    }

    public void tickSize(int tickerId, int field, int size) {
        // TODO Auto-generated method stub


    }

    
    public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta, double optPrice,
                                      double pvDividend, double gamma, double vega, double theta, double undPrice) {
        // TODO Auto-generated method stub


    }

    
    public void tickGeneric(int tickerId, int tickType, double value) {
        // TODO Auto-generated method stub


    }

    
    public void tickString(int tickerId, int tickType, String value) {
        // TODO Auto-generated method stub


    }

    
    public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
                        double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
                        double dividendsToExpiry) {
        // TODO Auto-generated method stub


    }

    
    public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice, int permId,
                            int parentId, double lastFillPrice, int clientId, String whyHeld) {
        // TODO Auto-generated method stub


    }

    
    public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {
        // TODO Auto-generated method stub


    }

    
    public void openOrderEnd() {
        // TODO Auto-generated method stub

    }

    
    public void updateAccountValue(String key, String value, String currency, String accountName) {
        // TODO Auto-generated method stub


    }

    
    public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
                                double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {
        // TODO Auto-generated method stub


    }

    
    public void updateAccountTime(String timeStamp) {
        // TODO Auto-generated method stub

    }

    
    public void accountDownloadEnd(String accountName) {
        // TODO Auto-generated method stub

    }

    
    public void nextValidId(int orderId) {
        // TODO Auto-generated method stub

    }

    
    public void contractDetails(int reqId, ContractDetails contractDetails) {
        // TODO Auto-generated method stub


    }

    
    public void bondContractDetails(int reqId, ContractDetails contractDetails) {
        // TODO Auto-generated method stub


    }

    
    public void contractDetailsEnd(int reqId) {
        // TODO Auto-generated method stub

    }

    
    public void execDetails(int reqId, Contract contract, Execution execution) {
        // TODO Auto-generated method stub


    }

    
    public void execDetailsEnd(int reqId) {
        // TODO Auto-generated method stub

    }

    
    public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {
        // TODO Auto-generated method stub


    }

    
    public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side, double price,
                                 int size) {
        // TODO Auto-generated method stub


    }

    
    public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {
        // TODO Auto-generated method stub


    }

    
    public void managedAccounts(String accountsList) {
        // TODO Auto-generated method stub

    }

    
    public void receiveFA(int faDataType, String xml) {
        // TODO Auto-generated method stub


    }

    
    public void historicalData(int reqId, String date, double open, double high, double low, double close, int volume,
                               int count, double WAP, boolean hasGaps) {
        //System.out.println("History data coming");
        this.setHistoryValue(reqId, date, open, high, low, close, volume, count);

    }

    
    public void scannerParameters(String xml) {
        // TODO Auto-generated method stub

    }

    
    public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance, String benchmark,
                            String projection, String legsStr) {
        // TODO Auto-generated method stub


    }

    
    public void scannerDataEnd(int reqId) {
        // TODO Auto-generated method stub

    }

    
    public void realtimeBar(int reqId, long time, double open, double high, double low, double close, long volume,
                            double wap, int count) {
        // TODO Auto-generated method stub


    }

    
    public void currentTime(long time) {
        // TODO Auto-generated method stub

    }

    
    public void fundamentalData(int reqId, String data) {
        // TODO Auto-generated method stub


    }

    
    public void deltaNeutralValidation(int reqId, UnderComp underComp) {
        // TODO Auto-generated method stub


    }

    
    public void tickSnapshotEnd(int reqId) {
        // TODO Auto-generated method stub

    }

    
    public void marketDataType(int reqId, int marketDataType) {
        // TODO Auto-generated method stub


    }

    
    public void commissionReport(CommissionReport commissionReport) {
        // TODO Auto-generated method stub

    }

    
    public void position(String account, Contract contract, int pos, double avgCost) {
        // TODO Auto-generated method stub


    }

    
    public void positionEnd() {
        // TODO Auto-generated method stub

    }

    
    public void accountSummary(int reqId, String account, String tag, String value, String currency) {
        // TODO Auto-generated method stub


    }

    
    public void accountSummaryEnd(int reqId) {
        // TODO Auto-generated method stub

    }

    
    public void verifyMessageAPI(String apiData) {
        // TODO Auto-generated method stub

    }

    
    public void verifyCompleted(boolean isSuccessful, String errorText) {
        // TODO Auto-generated method stub


    }

    
    public void displayGroupList(int reqId, String groups) {
        // TODO Auto-generated method stub


    }

    
    public void displayGroupUpdated(int reqId, String contractInfo) {
        // TODO Auto-generated method stub


    }
    //****************End of IB Broker API**********//


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public void requestHistory(Intrument intrument, Timestamp dt, int during, int bar, DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        this.requestHistory(intrument, dt, during, bar);

    }

    public void requestHistory(Intrument intrument, Timestamp dt, int during, int bar) {
        Contract c = new Contract();
        c.m_symbol = intrument.getSymbol();
        c.m_currency = intrument.getCurrency();
        c.m_exchange = "IDEALPRO";
        c.m_secType = "CASH";
        
        Timestamp dt2=new Timestamp(dt.getTime()+during*1000); // m_client requires ending time,this is transition from ending time to start time,dt becomes start time
        
        System.out.println(dt.toString()+"   "+during+"  "+bar);
        m_client.reqHistoricalData(intrument.getID(), c, dt2.toString().replace("-", "").substring(0, 17) + " EST",
                                   during + " S", bar + " secs", "BID_ASK", 0, 1, null);


    }

    
    public void registerIntruments(ArrayList<Intrument> instruments) {
        // TODO Auto-generated method stub

    }

    
    public void registerIntrument(Intrument intrument) {
        // TODO Auto-generated method stub

    }

    
    public boolean isConnected() {
        // TODO Auto-generated method stub
        return m_client.isConnected();
    }


}
