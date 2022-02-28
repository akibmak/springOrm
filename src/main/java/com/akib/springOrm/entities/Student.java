package com.akib.springOrm.entities;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
//	@Column(name="student_id")
	private int studentId;
//	@Column(name="student_name")
	private String studentName;
//	@Column(name="student_city")
	private String studenrCity;
	public Student(int studentId, String studentName, String studenrCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studenrCity = studenrCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudenrCity() {
		return studenrCity;
	}
	public void setStudenrCity(String studenrCity) {
		this.studenrCity = studenrCity;
	}
	
	

}
