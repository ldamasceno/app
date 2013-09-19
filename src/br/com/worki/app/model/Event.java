package br.com.worki.app.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Event {

	private long id;
	private String name;
	private String description;
	private Calendar startDate;
	private Calendar endDate;
	private String image;
	private String purchaseTicket;
	private ArrayList<Ticket> tickets;

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPurchaseTicket() {
		return purchaseTicket;
	}

	public void setPurchaseTicket(String purchaseTicket) {
		this.purchaseTicket = purchaseTicket;
	}

}
