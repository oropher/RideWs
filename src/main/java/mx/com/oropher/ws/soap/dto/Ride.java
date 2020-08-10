package mx.com.oropher.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="Ride")
public class Ride {

	private String id;
	private String from;
	private String to;
	private String cost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
