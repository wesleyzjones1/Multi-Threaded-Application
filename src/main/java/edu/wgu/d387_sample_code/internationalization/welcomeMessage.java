package edu.wgu.d387_sample_code.internationalization;

import java.util.ResourceBundle;
import java.util.Locale;

public class welcomeMessage implements Runnable {

    Locale locale;

    // Constructor
    public welcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle b = ResourceBundle.getBundle("translations",locale);
        return b.getString("welcome");
    }

    @Override
    public void run() {
        //Displays which thread each welcome message is on.
        System.out.println(getWelcomeMessage() + ", ThreadID: " + Thread.currentThread().getId() );
    }
}