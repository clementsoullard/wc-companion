package com.clement.eventtracker.object;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * This is return by the web service to give the TV status.
 * 
 * @author cleme
 *
 */
public class TVStatus {

	NumberFormat nf = new DecimalFormat("00");
	/** Gives the status of the relay */
	private Boolean relayStatus;

	private Integer remainingSecond;

	private TVData data;

	public Integer getRemainingSecond() {
		return remainingSecond;
	}

	public String getRemainingTime() {
		if (remainingSecond == null) {
			return "Statut Non défini";
		} else if (remainingSecond == -2) {
			return "Télé activée sans limite de temps";
		} else if (remainingSecond <= 0) {
			return "Plus de temps restant";
		}
		Integer second = remainingSecond % 60;
		Integer minutes = remainingSecond / 60;
		Integer hours = minutes / 60;
		minutes = minutes % 60;
		return "Il reste " + nf.format(hours) + ":" + nf.format(minutes) + ":" + nf.format(second);
	}

	public void setRemainingSecond(Integer remaininingSecond) {
		this.remainingSecond = remaininingSecond;
	}

	public TVData getData() {
		return data;
	}

	public void setData(TVData data) {
		this.data = data;
	}

	public Boolean getRelayStatus() {
		return relayStatus;
	}

	public void setRelayStatus(Boolean relayStatus) {
		this.relayStatus = relayStatus;
	}

}
