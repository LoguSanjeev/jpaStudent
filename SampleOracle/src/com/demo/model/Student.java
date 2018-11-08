package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int Sid;
private String Sname;
private int Age;
private String c_Class;

@Override
public String toString() {
	return "Student [sid=" + Sid + ", sname=" + Sname + ", age=" + Age + ", Class=" + c_Class + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int sid,String sname,int age,String class1) {
	super();
	Sid=sid;
	Sname=sname;
	Age= age;
	c_Class=class1;
}
public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		this.Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		this.Sname = sname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getc_Class() {
		return c_Class;
	}

	public void setc_Class(String class1) {
		c_Class = class1;
	}


}
