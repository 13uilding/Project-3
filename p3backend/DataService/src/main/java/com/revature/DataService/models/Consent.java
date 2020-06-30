package com.revature.DataService.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema = "project3", name = "consent")
public class Consent {

	

  public Consent() {
		super();
		// TODO Auto-generated constructor stub
	}

public Consent(Integer consentId, boolean isApprovedColumn, Integer batchId, Integer trainerId) {
		super();
		this.consentId = consentId;
		this.isApprovedColumn = isApprovedColumn;
		this.batchId = batchId;
		this.trainerId = trainerId;
	}

@Id
  @Column(name = "consent_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer consentId;

  @Column(name = "consent_approved")
  private boolean isApprovedColumn;


  // Changing at Nick's request
//  @JsonIgnoreProperties({"consent", "trainers"})
//  @ManyToOne
//  @JoinColumn(name = "batch_id")
  @Column(name = "batch_id")
  private Integer batchId;

  	// Changing at Nick's request
//  @JsonIgnoreProperties({"consent", "batches"})
//  @ManyToOne
//  @JoinColumn(name = "trainerId")
  @Column(name="trainer_id")
  private Integer trainerId;

public Integer getConsentId() {
	return consentId;
}

public void setConsentId(Integer consentId) {
	this.consentId = consentId;
}

public boolean isApprovedColumn() {
	return isApprovedColumn;
}

public void setApprovedColumn(boolean isApprovedColumn) {
	this.isApprovedColumn = isApprovedColumn;
}

public Integer getBatchId() {
	return batchId;
}

public void setBatchId(Integer batchId) {
	this.batchId = batchId;
}

public Integer getTrainerId() {
	return trainerId;
}

public void setTrainerId(Integer trainerId) {
	this.trainerId = trainerId;
}

@Override
public String toString() {
	return "Consent [consentId=" + consentId + ", isApprovedColumn=" + isApprovedColumn + ", batchId=" + batchId
			+ ", trainerId=" + trainerId + "]";
}


  


}
