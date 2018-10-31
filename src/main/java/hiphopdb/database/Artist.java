package hiphopdb.database;

import java.util.Date;

public class Artist {
private int id;
private String name;
private String realname;
private Date birthday;
private int activedate;
private String bio;

public Artist(int id, String name, String realname, Date birthday, int activedate, String bio) {
	super();
	this.id = id;
	this.name = name;
	this.realname = realname;
	this.birthday = birthday;
	this.activedate = activedate;
	this.bio = bio;
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

public String getRealname() {
	return realname;
}

public void setRealname(String realname) {
	this.realname = realname;
}

public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}

public int getActivedate() {
	return activedate;
}

public void setActivedate(int activedate) {
	this.activedate = activedate;
}

public String getBio() {
	return bio;
}

public void setBio(String bio) {
	this.bio = bio;
}


}
