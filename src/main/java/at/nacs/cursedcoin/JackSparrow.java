package at.nacs.cursedcoin;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {
    private LegendaryCompass legendaryCompass = new LegendaryCompass();
    private CursedCoin cursedCoin = new CursedCoin();

    public String findCursedCoin() {
        String message="";
        if (legendaryCompass.isCursedCoin(cursedCoin)) {
            message = "I found the CursedCoin!";
        }
        return message;
    }
}
