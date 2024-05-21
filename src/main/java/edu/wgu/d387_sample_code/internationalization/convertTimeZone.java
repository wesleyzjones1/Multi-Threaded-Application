package edu.wgu.d387_sample_code.internationalization;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.format.DateTimeFormatter;
import java.time.*;

public class convertTimeZone {

    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");


        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String formattedTime = ET.format(formatTime) + "ET, " + MT.format(formatTime) + "MT, " + UTC.format(formatTime) + "UTC";

        return formattedTime;
    }
}

