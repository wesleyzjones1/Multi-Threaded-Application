package edu.wgu.d387_sample_code.internationalization;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class convertTimeZoneController {

    @GetMapping("/presentation")
    public ResponseEntity announcePresentation() {

        String announcement = "There is a presentation beginning at: " + convertTimeZone.getTime();
        return new ResponseEntity (announcement, HttpStatus.OK);

    }
}
