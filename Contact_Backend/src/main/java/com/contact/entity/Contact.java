package com.contact.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Contact")
public class Contact {
	
	//Auto - generate random value   
	//Identity - 1,2,3
	//Sequence - 301,302,303
	//Table - 1,2,3,4
	//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "Contact_ID")
	private Integer cid;
	
	@NotEmpty(message ="Please Enter Name")
	@Column(name = "Contact_Name")
	private String cname;
	
	@NotEmpty(message ="Please Enter Email")
	@Column(name = "Contact_Email")
	private String cemail;
	
	@NotNull(message ="Please Enter Contact Number")
	@Column(name = "Contact_Number")
	private Long cnumber;
	
	@Column(name = "Contact_Status")
	private String status;
	
	@Column(name = "Local_Date", updatable = false)
	@CreationTimestamp
	private LocalDateTime localDate;
	
	@Column(name = "Update_Date", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Long getCnumber() {
		return cnumber;
	}
	public void setCnumber(Long cnumber) {
		this.cnumber = cnumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cnumber=" + cnumber + ", status="
				+ status + "]";
	}
	//use default constructor or else will give you an error while getting records /
	//use param constructor while setting value 
	public Contact() {
		super();
	}
}
