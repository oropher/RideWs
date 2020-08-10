package mx.com.oropher.ws.soap;

import mx.com.oropher.ws.soap.dto.RideProcessorRequest;
import mx.com.oropher.ws.soap.dto.RideProcessorResponse;

public class RideProcessorImpl implements RideProcessor {

	@Override
	public RideProcessorResponse processRide(RideProcessorRequest paymentProcessorRequest) {
		RideProcessorResponse rideProcessorResponse = new RideProcessorResponse();
		rideProcessorResponse.setResult(true);
		return rideProcessorResponse;
	}

}
