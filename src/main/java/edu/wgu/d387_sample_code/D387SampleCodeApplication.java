package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.internationalization.welcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		//creates US welcome message in new thread
		welcomeMessage WelcomeEnglish = new welcomeMessage(Locale.US);
		Thread englishWelcome = new Thread(WelcomeEnglish);
		englishWelcome.start();

		//creates French welcome message in new thread
		welcomeMessage WelcomeFrench = new welcomeMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcome = new Thread(WelcomeFrench);
		frenchWelcome.start();

	}

}