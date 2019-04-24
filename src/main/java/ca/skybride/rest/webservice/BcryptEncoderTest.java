package ca.skybride.rest.webservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		for(int i=1; i<=10; i++){
			String encodedString = encoder.encode("meow");
			System.out.println(encodedString);
		}
		

	}

}
