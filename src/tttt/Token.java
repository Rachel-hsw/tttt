package tttt;

public class Token {
private String access_token;
private Integer expires_in;
private Integer ret;
private String msg;

public Token() {
	
}
public Token(String access_token, Integer expires_in, Integer ret, String msg) {
	this.access_token = access_token;
	this.expires_in = expires_in;
	this.ret = ret;
	this.msg = msg;
}
public String getAccess_token() {
	return access_token;
}
public void setAccess_token(String access_token) {
	this.access_token = access_token;
}
public Integer getExpires_in() {
	return expires_in;
}
public void setExpires_in(Integer expires_in) {
	this.expires_in = expires_in;
}
public Integer getRet() {
	return ret;
}
public void setRet(Integer ret) {
	this.ret = ret;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}
