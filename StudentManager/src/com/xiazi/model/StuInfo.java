package com.xiazi.model;

public class StuInfo {
	
	private int id;
	private String nicheng;
	private String truename;
	private byte  gender;
	private String birth;
	private String major;
	private String[] course = { "" };
	private String courses = "";
	private String[] hobby = { "" };
	private String hobbys = "";
	private String bz;
//默认构造方法	
	public StuInfo() {
		super();
	}
//setter and getter 方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNicheng() {
		return nicheng;
	}

	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
 
	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String getCourses() {
		if(course!=null){
			for(int i=0;i<course.length;i++){
				courses=courses+course[i]+" ";
			}
		}
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getHobbys() {
		if(hobby!=null){
			for(int i=0;i<hobby.length;i++){
				hobbys=hobbys+hobby[i]+" ";
			}
		}
		
		return hobbys;
	}

	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
}
