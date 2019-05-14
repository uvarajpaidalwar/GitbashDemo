package com.ap.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="paymenttab")
public class PaymentInfo {
	@Id
	@Column(name="pid")
	private int pmtId;
	@Column(name="pmode")
	private String pmtMode;
	
	 @ElementCollection
	 @CollectionTable(name="pofferstab",joinColumns = @JoinColumn(name="pofid"))
	private Set<String>poffers=new HashSet<String>();
	 
	public PaymentInfo() {
		super();
	}

	public int getPmtId() {
		return pmtId;
	}

	public void setPmtId(int pmtId) {
		this.pmtId = pmtId;
	}

	public String getPmtMode() {
		return pmtMode;
	}

	public void setPmtMode(String pmtMode) {
		this.pmtMode = pmtMode;
	}

	public Set<String> getPoffers() {
		return poffers;
	}

	public void setPoffers(Set<String> poffers) {
		this.poffers = poffers;
	}

	@Override
	public String toString() {
		return "PaymentInfo [pmtId=" + pmtId + ", pmtMode=" + pmtMode + ", poffers=" + poffers + "]";
	}

	 
	
}
