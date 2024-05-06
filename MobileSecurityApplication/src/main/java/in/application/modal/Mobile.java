package in.application.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Mobile {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String mobileName;
	private String mobileImport;
	private String mobileCost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	public String getMobileCost() {
		return mobileCost;
	}
	public void setMobileCost(String mobileCost) {
		this.mobileCost = mobileCost;
	}
	public String getMobileImport() {
		return mobileImport;
	}
	public void setMobileImport(String mobileImport) {
		this.mobileImport = mobileImport;
	}
	public Mobile(int id, String mobileName, String mobileImport, String mobileCost) {
		super();
		this.id = id;
		this.mobileName = mobileName;
		this.mobileImport = mobileImport;
		this.mobileCost = mobileCost;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", mobileImport=" + mobileImport + ", mobileCost="
				+ mobileCost + "]";
	}
	
	
	

}
