/**
 * Name: Session.java
 * Date: 14 January 2025
 * Author: KHEANG Ann
 * Modified: 14 January 2025
 * Description: Lab 05
 * Functions:
 * -getSessionName(): Session
 * -setSessionName(): Session
 * -getStartTIme(): Session
 * -getEndTime(): Session
 * Variables:
 * sessionName
 * startTime
 * endTime
 */
public class Session {

    private String sessionName;
    private int startTime;
    private int endTime;

    public Session(String sessionName, int startTime, int endTime){
        this.sessionName = sessionName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getSessionName(){
        return sessionName;
    }

    public void setSessionName(String sessionName){
        this.sessionName = sessionName;
    }

    public int getStartTIme(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public static void main(String[] args) {

    }
}