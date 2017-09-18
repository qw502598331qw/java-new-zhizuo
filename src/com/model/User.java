package com.model;

public class User {
int MemberID;
String LoginName;
String LoginPwd;
String MemberEmail;
int MemberType;
String RegisterTime;
String Isable;

public User(int MemberID,String LoginName,String LoginPwd,String MemberEmail,int MemberType,String RegisterTime,String Isable)
{
	this.MemberID=MemberID;
	this. LoginName=LoginName;
	this. LoginPwd=LoginPwd;
	this.MemberEmail=MemberEmail;
	this.MemberType=MemberType;
	this.RegisterTime=RegisterTime;
	this.Isable=Isable;
}
public User(){
	
}

public int getMemberID() {
	return MemberID;
}
public void setMemberID(int memberID) {
	MemberID = memberID;
}
public String getLoginName() {
	return LoginName;
}
public void setLoginName(String loginName) {
	LoginName = loginName;
}
public String getLoginPwd() {
	return LoginPwd;
}
public void setLoginPwd(String loginPwd) {
	LoginPwd = loginPwd;
}
public String getMemberEmail() {
	return MemberEmail;
}
public void setMemberEmail(String MemberEmail) {
	this.MemberEmail = MemberEmail;
}
public int getMemberType() {
	return MemberType;
}
public void setMemberType(int memberType) {
	MemberType = memberType;
}
public String getRegisterTime() {
	return RegisterTime;
}
public void setRegisterTime(String registerTime) {
	RegisterTime = registerTime;
}
public String getIsable() {
	return Isable;
}
public void setIsable(String Isable) {
	this.Isable = Isable;
}



}
