package com.application.modal;

public class Cookies {
private String cookieid;
private String cookiename;
private int cookiecost;
private String cookieimport;
public String getCookieid() {
	return cookieid;
}
public void setCookieid(String cookieid) {
	this.cookieid = cookieid;
}
public String getCookiename() {
	return cookiename;
}
public void setCookiename(String cookiename) {
	this.cookiename = cookiename;
}
public int getCookiecost() {
	return cookiecost;
}
public void setCookiecost(int cookiecost) {
	this.cookiecost = cookiecost;
}
public String getCookieimport() {
	return cookieimport;
}
public void setCookieimport(String cookieimport) {
	this.cookieimport = cookieimport;
}
@Override
public String toString() {
	return "Cookies [cookieid=" + cookieid + ", cookiename=" + cookiename + ", cookiecost=" + cookiecost
			+ ", cookieimport=" + cookieimport + "]";
}




}
