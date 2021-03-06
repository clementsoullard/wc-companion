package com.clement.eventtracker.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * This class is representing on event.
 * 
 * @author Clement_Soullard
 *
 */
public class Event {

	public String getIdr() {
		return id;
	}

	public void setIdr(String id) {
		this.id = id;
	}

	@Id
	private String id;
	/**
	 * Name of the event
	 */
	private String name;

	/**
	 * The temporary image Id of the event
	 */
	private String tmpImgId;

	/**
	 * The temporary image Id of the event
	 */
	private String imgId;
	/**
	 * If the event is active
	 */
	private Boolean active = true;
	/**
	 * If the event is for employee only
	 */
	private Boolean forEmployeeOnly = false;
	/**
	 * If the event needs the veg info
	 */
	private Boolean needVegetarianInfo = false;
	/**
	 * If the event need the info weither the child are welcome.
	 */
	private Boolean needChildInfo = false;

	/**
	 * If the event need the info weither the child are welcome.
	 */
	private Boolean payingEvent = false;

	/**
	 * If the event need the info weither the child are welcome.
	 */
	private String childInfo;
	/**
	 * The description of the event
	 */
	private String description;
	/**
	 * The date of the event
	 */
	private Date date;

	/**
	 * The maximum date before registration of the event
	 */
	private Date dateMaxRegistration;

	/**
	 * The maximum date before registration of the event
	 */
	private Integer maxParticipant;

	/**
	 * If a user is red flagged because he registered too late, or if the number
	 * of participants is exceeded.
	 */
	private Boolean redFlagged;

	/**
	 * A list of questions
	 */
	private List<Question> additionalQuestions;

	public List<Question> getAdditionalQuestions() {
		if (additionalQuestions == null) {
			additionalQuestions = new ArrayList<Question>();
		}
		additionalQuestions.remove(null);
		return additionalQuestions;
	}

	public void setAdditionalQuestions(List<Question> additionalQuestions) {
		this.additionalQuestions = additionalQuestions;
	}

	public String getChildInfo() {
		return childInfo;
	}

	public Boolean getPayingEvent() {
		return payingEvent;
	}

	public void setPayingEvent(Boolean payingEvent) {
		this.payingEvent = payingEvent;
	}

	public void setChildInfo(String childInfo) {
		this.childInfo = childInfo;
	}

	public Date getDateMaxRegistration() {
		return dateMaxRegistration;
	}

	public void setDateMaxRegistration(Date dateMaxRegistration) {
		this.dateMaxRegistration = dateMaxRegistration;
	}

	public Integer getMaxParticipant() {
		return maxParticipant;
	}

	public void setMaxParticipant(Integer maxParticipant) {
		this.maxParticipant = maxParticipant;
	}

	public Boolean getRedFlagged() {
		return redFlagged;
	}

	public void setRedFlagged(Boolean redFlagged) {
		this.redFlagged = redFlagged;
	}

	/**
	 * The list of participants to the event
	 */
	private List<Participation> participations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}

	public void addParticipation(Participation participation) {
		if (participations == null) {
			participations = new ArrayList<Participation>();
		}
		participations.add(participation);
	}

	public Boolean getForEmployeeOnly() {
		return forEmployeeOnly;
	}

	public void setForEmployeeOnly(Boolean forEmployeeOnly) {
		this.forEmployeeOnly = forEmployeeOnly;
	}

	public Boolean getNeedVegetarianInfo() {
		return needVegetarianInfo;
	}

	public void setNeedVegetarianInfo(Boolean needVegetarianInfo) {
		this.needVegetarianInfo = needVegetarianInfo;
	}

	public Boolean getNeedChildInfo() {
		return needChildInfo;
	}

	public void setNeedChildInfo(Boolean needChildInfo) {
		this.needChildInfo = needChildInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTmpImgId(String tmpImgId) {
		this.tmpImgId = tmpImgId;
	}

	public String getTmpImgId() {
		return tmpImgId;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

}
