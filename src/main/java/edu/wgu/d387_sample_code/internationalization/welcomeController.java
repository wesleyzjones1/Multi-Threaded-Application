package edu.wgu.d387_sample_code.internationalization;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class welcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> displayWelcome (@RequestParam("lang") String lang) {

        //Finds correct language to use and returns the getWelcomeMessage
        Locale loc = Locale.forLanguageTag(lang);

        welcomeMessage welcomeMessage = new welcomeMessage(loc);

        return new ResponseEntity<String> (welcomeMessage.getWelcomeMessage(), HttpStatus.OK);
    }
}