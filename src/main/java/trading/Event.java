package trading;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.sms.forex.core.Intrument;
import com.sms.forex.strategy.Tracking;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class Event {
	private ArrayList<Intrument> targets=new ArrayList<Intrument>(); //Pairs affected by this event
	private int eventID=-1;
	private String eventName="Event";
	private Timestamp eventDateTime; //When this event happens
	private String eventWebsite="";   //web site for specific event
	private int priority=10;          //0 is highest,10 is lowest
	private ArrayList<Tracking> trackings=new ArrayList<Tracking>();  //The ways to track this event
	private String[] aimNames=null;  // The names of values to be watched
	private double[] expectedValues;   // Market projection values
	private double[] previousValues;   // values in previous event
	private double[] actualValues;     // This values to be updated after event is over
	private int eventInterval=30;     // used to determine if the current values can be used to represent previousValues
	
	public void addPair(Intrument pair){
		targets.add(pair);
	}
	@Override
	public String toString() {
		return eventName;
	}
	public Intrument getPair(int index){
		return targets.get(index);
	}
	
	public void addTracking(Tracking tracking){
		trackings.add(tracking);
	}
	public Tracking getTracking(int index){
		return trackings.get(index);
	}
	
	
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Timestamp getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(Timestamp eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	public String getEventWebsite() {
		return eventWebsite;
	}
	public void setEventWebsite(String eventWebsite) {
		this.eventWebsite = eventWebsite;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public ArrayList<Tracking> getTrackings() {
		return trackings;
	}
	public ArrayList<Intrument> getTargets() {
		return targets;
	}
	public void setTargets(ArrayList<Intrument> targets) {
		this.targets = targets;
	}
	public void setTrackings(ArrayList<Tracking> trackings) {
		this.trackings = trackings;
	}
}
