package com.model;

import java.time.LocalTime;

public class Model {
private int id;
private String name;
private LocalTime duration;
private String active;
private String content;



public Model(int id, String name, LocalTime duration, String active, String content) {
	
	this.id = id;
	this.name = name;
	this.duration = duration;
	this.active = active;
	this.content = content;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalTime getDuration() {
	return duration;
}
public void setDuration(LocalTime duration) {
	this.duration = duration;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "model [id=" + id + ", name=" + name + ", duration=" + duration + ", active=" + active + ", content="
			+ content + "]";
}

	
	}
