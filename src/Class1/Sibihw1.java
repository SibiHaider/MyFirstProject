package Class1;
import java.lang.invoke.MethodHandle;

public class Sibihw1 {

    public static void main(String[] args) {

        // HW number 1

        byte hoursInDay = 24;
        System.out.println(" There are " + hoursInDay + "hrs in a day.");

        short DaysInYear = 365;
        System.out.println("\n There are " + DaysInYear + " days in a year.");

        int employeesInGoogle = 35000;
        System.out.println("\n There are a total of " +employeesInGoogle + " employees working at google.");

        long PopulationInIndia = 1400000000000L;
        System.out.println("\n The population of india as of 2022 is " +PopulationInIndia + ".");

        float mortgageRate = 4.02f;
        System.out.println("\n " + mortgageRate + "% is the current mortgage rate as of 2022.");

        double BankBalance = 189890.99;
        System.out.println("\n Your current balance is $" + BankBalance);


        boolean doesTheSunRiseFromTheWest = false;
        System.out.println("\n Does the sun rise from the west? : " + doesTheSunRiseFromTheWest);

        char initial1 = 'M';
        char initial2 = 'S';
        char initial3 = 'H';
        System.out.println("\n My initials are: " + initial1 + initial2 + initial3);

        // HomeWork 2
        /** T(°F) = T(°C) × 9/5 + 32
         *  T(K) = T(°C) + 273.15
         *
         *  T(°C) = (T(°F) - 32) × 5/9
         *  T(K) = (T(°F) + 459.67) × 5/9
         *
         *  T(°C) = T(K) - 273.15
         *  T(°F) = T(K) × 9/5 - 459.67
         *
         */

        // Celsius to Fahrenheit (°F) = (°C) × 9/5 + 32
        double cTemp = 25;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n"+ cTemp + "°C = " + fTemp + "°F");

        // Celsius to Kelvin (K) = (°C) + 273.15
        double cTemp1 = 34;
        double kTemp= cTemp1 + 273.15;
        System.out.println("\n" + cTemp1 + "°C = " + kTemp + "K");

        // Fahrenheit to Celsius (°C) = (°F) - 32) × 5/9
        double fTemp1 = 30;
        double cTemp2 = (fTemp1 - 32) * 5/9;
        System.out.println("\n"+ fTemp1 + "°F = " + cTemp2 + "°C");

        // Fahrenheit to Kelvin (K) = (°F) + 459.67) × 5/9
        double fTemp2 = 18f;
        double kTemp1 = (fTemp2 + 459.67) * 5/9;
        System.out.println("\n" + fTemp2 + "°F = " + kTemp1 + "K");
        System.out.println("\n" + fTemp2 + "°F = " + kTemp1 + "K");


    }

}
