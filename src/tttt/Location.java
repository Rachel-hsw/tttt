package tttt;

import java.util.List;


public class Location {
	private int ret;

	private String msg;

	private List<LocationDetail> data ;

	public void setRet(int ret){
	this.ret = ret;
	}
	public int getRet(){
	return this.ret;
	}
	public void setMsg(String msg){
	this.msg = msg;
	}
	public String getMsg(){
	return this.msg;
	}
	public void setData(List<LocationDetail> data){
	this.data = data;
	}
	public List<LocationDetail> getData(){
	return this.data;
	}
}
