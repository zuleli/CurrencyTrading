/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.strategy;

import java.util.ArrayList;

import trading.Event;

public abstract class Tracking implements Runnable {
	protected Event event;
	private int trackingID;
	private int eventID;
	protected boolean stopcontroller=false;  // To controll tracking loop
	protected int interval=100;              // To controll loop time interval
	
    public Tracking(){
		
	}
	public Tracking(Event event){
		this.event=event;
		
	}
	
	public void setInterval(int interval) {
		this.interval = interval;
	}	
	public int getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(int trackingID) {
		this.trackingID = trackingID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public void setEvent(Event event){
		this.event=event;
	}
    public Event getEvent() {
		return event;
	}
	//	public abstract void op();
	public abstract void feedBack();
	

}
