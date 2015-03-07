/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */


package com.sms.forex.gateway;

import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class G_Gateway {
	static ArrayList<Engine> engines=new ArrayList<Engine>();
	private static int defaultEngine=0;
	
	public static void setDefaultEngine(int defaultEngine) {
		G_Gateway.defaultEngine = defaultEngine;
	}
	public static void setEngine(Engine engine){
		
		engines.add(engine);
		
	}
	public static Engine getEngine(int index){
		if(index>=engines.size())
		    return null;
		
		return engines.get(index);
	}
	
	public static Engine getDefaultEngine(){
		
		return engines.get(defaultEngine);
	}
	public static int getEngineNumber(){
		return engines.size();
	}
	

}
