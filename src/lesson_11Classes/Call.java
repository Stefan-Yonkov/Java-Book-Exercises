package lesson_11Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Call {
	
	private LocalDate callDate;
	private LocalDateTime callStart;
	private long startCall;
	private long endCall;
	private int callLength;
	private static ArrayList<Call> callHistory;
	
	
	public LocalDate getCallDate() {
		return callDate;
	}
	public void setCallDate(LocalDate callDate) {
		this.callDate = callDate;
	}
	public LocalDateTime getCallStart() {
		return callStart;
	}
	public void setCallStart(LocalDateTime callStart) {
		this.callStart = callStart;
	}

	public int getCallLength() {
		return callLength;
	}
	
	public Call() {
		this.callDate = callDate.now();
		this.callStart = callStart.now();
		startCall = System.currentTimeMillis();
		callLength = 0;
//		callHistory.add(this);
	}
	
	public void endCall(){
		endCall = System.currentTimeMillis();
		callLength = (int) ((endCall - startCall) / 1000);
	}
	
	public void getCallInfo(Call call){
		
		System.out.printf("Call date: %s ; Call start time: %s ; Call lenght: %s",call.getCallDate(),call.getCallStart(),call.getCallLength());
		System.out.println();
	}
	
	
}
