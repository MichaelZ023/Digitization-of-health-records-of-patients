package assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
* In this portion of the assignment, you must ensure that you have the appropriate Javadoc headers and comments.
* Do NOT include the word "file" in the name of this file when you upload it to start your work.
*MyHealthDataBase is a base class to be extended for the digital Health Records System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Michael Zhang
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData，MyHealthDataTest
* @see java.time.LocalDate
* @see #getDaySuffix(int)
* @see java.time.temporal.ChronoUnit
* @see java.time.format.DateTimeFormatter
*/


public class MyHealthDataBase {
    /** 
     * This method returns the calculated patient's age in days from data provided.
     * @param year of the patient birth year.
     * @param month of the patient birth month.
     * @param day of the patient birth day.
     */
    public static int ageInDays(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(birthDate, currentDate);
    }
    /** 
     * This method returns the calculated Maximum Heart Rate from data provided.
     * @param year of the patient birth year.
     * @param month of the patient birth month.
     * @param day of the patient birth day.
     */
    public static int MaximumHeartRate(int year, int month, int day) {
        return 220 - ageInDays(year, month, day) / 365;
    }
    /** 
     * This method returns the calculated Target heart rate range from data provided.
     * @param year of the patient birth year.
     * @param month of the patient birth month.
     * @param day of the patient birth day.
     */
    public static String Target_heart_rate_range(int year, int month, int day) {
        double minimum_target_heart_rate = 0.5 * MaximumHeartRate(year, month, day);
        double maximum_target_heart_rate = 0.85 * MaximumHeartRate(year, month, day);
        return "The target heart rate range is from " + minimum_target_heart_rate +
                " to " + maximum_target_heart_rate;
    }
    /** 
     * This method returns the calculated Body Mass Index (BMI) from data provided.
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     */
    public static double calculateBMI(double weightParam, double heightParam) {
        return weightParam * 703 / (heightParam * heightParam);
    }
    /** 
     * This method returns the patient's formatted birthday.
     * @param year of the patient birth year.
     * @param month of the patient birth month.
     * @param day of the patient birth day.
     */
    public static String getBirthday(int year, int month, int day) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM d");
        String formattedDate = birthDate.format(formatter);
        String daySuffix = getDaySuffix(birthDate.getDayOfMonth());
        return formattedDate + daySuffix;
    }
    /** 
     * This method get the right day suffix of the patient's formatted birthday.
     * @param day of the patient birth day.
     */
    private static String getDaySuffix(int day) {
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
