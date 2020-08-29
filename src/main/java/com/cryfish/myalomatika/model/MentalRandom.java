package com.cryfish.myalomatika.model;

import com.cryfish.myalomatika.Constants;
import com.cryfish.myalomatika.list.Level;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

public class MentalRandom implements Constants {

    private static final Logger log = LogManager.getLogger(MentalRandom.class);

    private static Random random = new Random();
    public static final Integer[] ALL_DIGITS_AVAILABLE = new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int prevColor = 0;

    public static int nextInt(int i) {
        return random.nextInt(i);
    }

    public static String getRandomColor(int i) {
        int randomValue = random.nextInt(i);

        while (prevColor == randomValue) {
            randomValue = random.nextInt(i);
        }
        prevColor = randomValue;
        return colors.get(randomValue);
    }

    public static int getRandomValue(boolean isCombo, int level, int difficulty, int result) {

        int randomValue = 0;

        StringBuilder rangeStr = new StringBuilder();
        for (int i = 0; i < difficulty; i++) {
            rangeStr.append(9);
        }
        int range = Integer.parseInt(rangeStr.toString());


        while (randomValue == 0
                || (result + randomValue < 0)
                || !isValidValue(randomValue, isCombo, level, difficulty, result)) {
            randomValue = random.nextInt(range * 2 + 1) - range;
        }
        return randomValue;

    }

    private static boolean isValidValue(int value, boolean isCombo, int level, int difficulty, int result) {

        log.debug("random value: " + value);

        String strResult = Integer.toString(result);
        String strAbsValue = Integer.toString(Math.abs(value));
        char[] digitResults = StringUtils.leftPad(strResult, strAbsValue.length(), '0').toCharArray();


        boolean isValid = true;

        switch (level) {
            /*
              Просто
             */
            case 1:

                /*
                  Сумма рандомного числа и текущего результата не должна превышать 4,44,444,4444 в зависимости от выбранного разряда в настройках игры.
                 */

                StringBuilder resultLimitStr = new StringBuilder();
                for (int i = 0; i < difficulty; i++) {
                    resultLimitStr.append(4);
                }
                int resultLimit = Integer.parseInt(resultLimitStr.toString());
                if (result + value > resultLimit) {
                    return false;
                }

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:

            /*
              Брат
             */
            case 7:
            case 8:
            case 9:
            case 10:

                /*
                  Разряд рандомного числа должен соответствовать заданному рязряду в настройке игры.
                  Правило не расспростроняется, если выбран режим "Комбинирование".
                 */
                if (!isCombo && strAbsValue.length() != difficulty) {
                    return false;
                }

                /*
                  Проверка достпуных цифр для каждого разряда рандомного числа в зависимости от цифр в разрядах текущего результата.
                 */
                for (int i = 0; i < strAbsValue.length(); i++) {
                    isValid &= checkDigit(level, digitResults[i], strAbsValue.charAt(i), value);
                }
                log.debug("isValid: " + isValid);
                return isValid;
            default:
                /*
                  Free Game. Подходит любое число
                 */
                return true;
        }
    }

    private static boolean checkDigit(int level, int digitResult, char chDigit, int randomValue) {
        Integer[] validDigits = Level.valueOf(level).getValidDigits(Character.digit(digitResult, 10));

        log.debug(Arrays.toString(validDigits));
        int absDigitValue = Character.digit(chDigit, 10);
        Integer digitValue = (randomValue < 0) ? absDigitValue * -1 : absDigitValue;
        return ArrayUtils.contains(validDigits, digitValue);
    }


}
