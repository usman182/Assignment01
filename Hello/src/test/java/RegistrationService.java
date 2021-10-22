import java.util.Arrays;
import java.util.List;
import .EmailNotUniqueException;

public class RegistrationService {
	
	List<String> registeredEmails = Arrays.asList("abc@gmail.com", "xyz@gmail.com");
	
	public void validateEmail(String email) throws EmailNotUniqueException
	{
		if (registeredEmails.contains(email))
		{
			throw new EmailNotUniqueException("Email Alrrady Registered");
		}
	}

}
