package com.student.record.data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Data {
@Id	
private String sid;
private String name;
private String course;

public Data()
{
	
}

public Data(String sid, String name, String course) {
	super();
	this.sid = sid;
	this.name = name;
	this.course = course;
}

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}


}
