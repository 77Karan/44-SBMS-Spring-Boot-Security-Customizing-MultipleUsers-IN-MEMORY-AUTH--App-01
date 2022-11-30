package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController
{
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Asho IT Bank";
	}
	
	@GetMapping("/balance")
	public String getBalance()
	{
		return "Balance is 4000";
	}
	
	@GetMapping("/statment")
	public String getStatment()
	{
		return "Statment to sent to Email";
	}
	
	@GetMapping("/loan")
	public String getLoanDtls()
	{
		return "Very Good you have no dues";
	}
	
	@GetMapping("/contact")
	public String getContactDtls()
	{
		return "Contact 12345";
	}
	
	

}
