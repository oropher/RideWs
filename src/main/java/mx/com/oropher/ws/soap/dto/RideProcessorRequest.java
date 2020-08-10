package mx.com.oropher.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideProcessorRequest {

	@XmlElement(name = "ride", required = true)
	private Ride ride;

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}
	
}
