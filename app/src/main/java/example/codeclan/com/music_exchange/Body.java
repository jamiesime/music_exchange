package example.codeclan.com.music_exchange;

/**
 * Created by user on 28/10/2017.
 */

public enum Body {

    WOOD("Wood"),
    STEEL("Steel"),
    PLASTIC("Plastic"),
    SOLIDGOLD("Solid GOLD");

    private String body;

    Body(String body){
        this.body = body;
    }

    public String getBody(){
        return body;
    }

}
