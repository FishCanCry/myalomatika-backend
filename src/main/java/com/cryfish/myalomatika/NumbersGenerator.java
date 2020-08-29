package com.cryfish.myalomatika;

import com.cryfish.myalomatika.model.MentalNumber;
import com.cryfish.myalomatika.model.MentalRandom;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class NumbersGenerator implements Constants{
    private static final Logger log = Logger.getLogger(NumbersGenerator.class);

    public static ArrayList<MentalNumber> generate (int level, int digit, int count, boolean combo) {
        ArrayList<MentalNumber> numbers = new ArrayList<>();

        int result = 0;

        for (int i = 1; i <= count; i++) {

            log.debug("");
            log.debug("iterator: " + i);
            log.debug("result: " + result);


            int randomValue = MentalRandom.getRandomValue(combo, level, digit, result);
            String randomColor = MentalRandom.getRandomColor(colors.size());

            result += randomValue;

            String value = (randomValue > 0) ? "+" + randomValue : Integer.toString(randomValue);

            log.debug("value: " + value);
            log.debug("color: " + randomColor);

            numbers.add(new MentalNumber(
                    value,
                    randomColor
            ));
        }

        return numbers;
    }

    public static String[] generateJson (int level, int digit, int count, boolean combo) {
      return generate(level, digit, count, combo).stream().map(MentalNumber::toJson).toArray(String[]::new);
    }
}
