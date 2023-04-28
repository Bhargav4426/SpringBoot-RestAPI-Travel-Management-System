package com.travelmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TravelManagementSystem")
public class Travels
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="customer_gen")
    @SequenceGenerator(name="customer_gen",sequenceName="customer_seq",initialValue=10000000,allocationSize=1)
	private Long customerId;
    @Column(length=80)
	private String packagename;
    @Column(precision = 8, scale = 2)
	private Double price;
	@Column(length=60)
	private String guestOneName;
	@Column(length=20)
	private String guestOneDob;
	@Column(length=60)
	private String guestTwoName;
	@Column(length=20)
	private String guestTwoDob;
	@Column(length=60)
	private String guestThreeName;
	@Column(length=20)
	private String guestThreeDob;
	@Column(length=40)
	private String city;
	private String address;
	@Column(length=15)
	private String mobile;
	@Column(length=40)
	private String email;
	@Column(precision = 8, scale = 3)
	private double total;
	@Column(precision = 8, scale = 3)
	private double discount;
	@Column(precision = 8, scale = 3)
	private double gst_amt;
	@Column(precision = 8, scale = 3)
	private double invoice_bill;
	private Integer noOfTravellers;
	public Travels() {
		super();
	}
	public Travels(Long customerId, String packagename, Double price, String guestOneName, String guestOneDob,
			String guestTwoName, String guestTwoDob, String guestThreeName, String guestThreeDob, String city,
			String address, String mobile, String email, double total, double discount, double gst_amt,
			double invoice_bill, Integer noOfTravellers) {
		super();
		this.customerId = customerId;
		this.packagename = packagename;
		this.price = price;
		this.guestOneName = guestOneName;
		this.guestOneDob = guestOneDob;
		this.guestTwoName = guestTwoName;
		this.guestTwoDob = guestTwoDob;
		this.guestThreeName = guestThreeName;
		this.guestThreeDob = guestThreeDob;
		this.city = city;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.total = total;
		this.discount = discount;
		this.gst_amt = gst_amt;
		this.invoice_bill = invoice_bill;
		this.noOfTravellers = noOfTravellers;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = Math.round(price * 100.0) / 100.0;
	}
	public String getGuestOneName() {
		return guestOneName;
	}
	public void setGuestOneName(String guestOneName) {
		this.guestOneName = guestOneName;
	}
	public String getGuestOneDob() {
		return guestOneDob;
	}
	public void setGuestOneDob(String guestOneDob) {
		this.guestOneDob = guestOneDob;
	}
	public String getGuestTwoName() {
		return guestTwoName;
	}
	public void setGuestTwoName(String guestTwoName) {
		this.guestTwoName = guestTwoName;
	}
	public String getGuestTwoDob() {
		return guestTwoDob;
	}
	public void setGuestTwoDob(String guestTwoDob) {
		this.guestTwoDob = guestTwoDob;
	}
	public String getGuestThreeName() {
		return guestThreeName;
	}
	public void setGuestThreeName(String guestThreeName) {
		this.guestThreeName = guestThreeName;
	}
	public String getGuestThreeDob() {
		return guestThreeDob;
	}
	public void setGuestThreeDob(String guestThreeDob) {
		this.guestThreeDob = guestThreeDob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = Math.round(total * 100.0) / 100.0;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = Math.round(discount * 100.0) / 100.0;
	}
	public double getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(double gst_amt) {
		this.gst_amt = Math.round(gst_amt * 100.0) / 100.0;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = Math.round(invoice_bill * 100.0) / 100.0;
	}
	public Integer getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(Integer noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	@Override
	public String toString() {
		return "Travels [customerId=" + customerId + ", packagename=" + packagename + ", price=" + price
				+ ", guestOneName=" + guestOneName + ", guestOneDob=" + guestOneDob + ", guestTwoName=" + guestTwoName
				+ ", guestTwoDob=" + guestTwoDob + ", guestThreeName=" + guestThreeName + ", guestThreeDob="
				+ guestThreeDob + ", city=" + city + ", address=" + address + ", mobile=" + mobile + ", email=" + email
				+ ", total=" + total + ", discount=" + discount + ", gst_amt=" + gst_amt + ", invoice_bill="
				+ invoice_bill + ", noOfTravellers=" + noOfTravellers + "]";
	}
	
}
