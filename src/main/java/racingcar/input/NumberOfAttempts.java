package racingcar.input;

import camp.nextstep.edu.missionutils.Console;

public class NumberOfAttempts {

    private NumberOfAttempts() {

    }

    public static int input() {
        String numberOfAttempts = Console.readLine();
        int numberOfAttemptsToInt = validateNumber(numberOfAttempts);

            return numberOfAttemptsToInt;
    }

    private static int validateNumber(String numberOfAttempts) {
        try {
            int numberOfAttemptsToInt = Integer.parseInt(numberOfAttempts);
            if (numberOfAttemptsToInt > 0) {
                return Integer.parseInt(numberOfAttempts);
            }
            throw new IllegalArgumentException();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        } finally {
            Console.close();
        }
    }
}
