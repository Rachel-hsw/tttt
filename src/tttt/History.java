package tttt;

import java.util.List;

public class History {
	private int ret;

	private String msg;

	private List<HistoryDetail> data ;

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
	public void setData(List<HistoryDetail> data){
	this.data = data;
	}
	public List<HistoryDetail> getData(){
	return this.data;
	}
}
