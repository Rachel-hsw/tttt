package tttt;

public class User {
    private String userid;
    private String username;
    private String userlb;
    private String name;
    private String tel;
    private String password;
    private String openid;
    private String iccard;
    private String email;
    private String userpic;
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserlb() {
        return userlb;
    }
    public void setUserlb(String userlb) {
        this.userlb = userlb;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOpenid() {
        return openid;
    }
    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getIccard() {
        return iccard;
    }
    public void setIccard(String iccard) {
        this.iccard = iccard;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserpic() {
        return userpic;
    }
    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }
    @Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", userlb=" + userlb + ", name=" + name + ", tel="
                + tel + ", password=" + password + ", openid=" + openid + ", iccard=" + iccard + ", email=" + email
                + ", userpic=" + userpic + "]";
    }

}
