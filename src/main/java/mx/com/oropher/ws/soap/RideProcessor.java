package mx.com.oropher.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.com.oropher.ws.soap.dto.RideProcessorRequest;
import mx.com.oropher.ws.soap.dto.RideProcessorResponse;

@WebService(name = "RideProcessor")
public interface RideProcessor {
	
	@WebMethod
	public @WebResult(name = "response") RideProcessorResponse processRide(
			@WebParam(name = "paymentProcessorRequest") RideProcessorRequest paymentProcessorRequest);
	
	
}
