package thermostatBracelet;


import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    private Predicate trigger;
    private Function display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }




    public String sense(Double temprture, Predicate<Double> trigger, Function<Double, String> display) {
        String msg = String.valueOf(temprture + 273) + "degrees Celsius";
        if (trigger.test(temprture)) {
            msg = display.apply(temprture);
        }
        return msg;
    }
}
