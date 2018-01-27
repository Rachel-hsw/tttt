package tttt;

public class HistoryDetail {
	private double lng;

	private double lat;

	private int gps_time;

	private int course;

	private int speed;

	private int sysTime;

	private int sequenceNo;

	public void setLng(double lng){
	this.lng = lng;
	}
	public double getLng(){
	return this.lng;
	}
	public void setLat(double lat){
	this.lat = lat;
	}
	public double getLat(){
	return this.lat;
	}
	public void setGps_time(int gps_time){
	this.gps_time = gps_time;
	}
	public int getGps_time(){
	return this.gps_time;
	}
	public void setCourse(int course){
	this.course = course;
	}
	public int getCourse(){
	return this.course;
	}
	public void setSpeed(int speed){
	this.speed = speed;
	}
	public int getSpeed(){
	return this.speed;
	}
	public void setSysTime(int sysTime){
	this.sysTime = sysTime;
	}
	public int getSysTime(){
	return this.sysTime;
	}
	public void setSequenceNo(int sequenceNo){
	this.sequenceNo = sequenceNo;
	}
	public int getSequenceNo(){
	return this.sequenceNo;
	}
}
