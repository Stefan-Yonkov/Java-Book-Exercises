package lesson_11Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class GSM {
	
	private String model;
	private String producer;
	private String price;
	private String owner;
	private static GSM nokiaN95 = new GSM("Nokia 95");
	private ArrayList<Call> callHistory = new ArrayList<>();
	
	
	public ArrayList<Call> getCallHistory() {
		return callHistory;
	}
	public void setCallHistory(ArrayList<Call> callHistory) {
		this.callHistory = callHistory;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public GSM() {
		this.model = null;
		this.producer = null;
		this.price = null;
		this.owner = null;
	}
	
	public GSM(String model){
		this();
		this.model = model;
	}
	
	public GSM(String model, String producer){
		this(model);
		this.producer = producer;
	}
	
	public GSM(String model, String producer, String price, String owner){
		this(model, producer);
		this.price = price;
		this.owner = owner;
	}
	
	public static void getNokiaInfo(){
		System.out.printf("Model : %s \n"
						+ "Producer: %s	\n"
						+ "Price: %s \n"
						+ "Owner: %s \n",nokiaN95.getModel(),nokiaN95.getProducer(),nokiaN95.getPrice(),nokiaN95.getOwner());
		
	}
	
	public void printInfo(){
		System.out.printf("Model : %s \n"
				+ "Producer: %s	\n"
				+ "Price: %s \n"
				+ "Owner: %s \n",model,producer,price,owner);
	}
	
	public void addCall(Call call){
		callHistory.add(call);
	}
	
	public void removeCall(Call call){
		callHistory.remove(call);
	}
	public void removeLastCall(){
		callHistory.remove(callHistory.size() - 1);
	}
	public void clearCalls(){
		callHistory.clear();
	}
	
	public void printCalls(){
		for (Call call : callHistory) {
			call.getCallInfo(call);
		}
	}
	

}
