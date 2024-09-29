package assignment1;

public class MyHealthData {
    //CST8284
    //Assignment 1: MyHealthData.java
    // Ensure to remove the "file" extension on the name of this code file when you load it to your computer.

    //This system maintains important health information about a patient.
    //Note: This class assumes values passed to the set methods are correct.
    // REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
    //Remove unneeded comments when you are done.  Clean code is better code.


    //TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

    //START CODE
    String firstname, lastname, gender, home_address, level_of_education;
    double heightParam, weightParam;
    int year, month, day;
    //END CODE


    // TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
    //START CODE
    public MyHealthData() {
    }

    public MyHealthData(String firstname, String lastname, String gender, String home_address, String level_of_education,
                        double heightParam, double weightParam, int year, int month, int day) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.home_address = home_address;
        this.level_of_education = level_of_education;
        this.heightParam = heightParam;
        this.weightParam = weightParam;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //END CODE

    //TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE.
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	public String getLevel_of_education() {
		return level_of_education;
	}
	public void setLevel_of_education(String level_of_education) {
		this.level_of_education = level_of_education;
	}
	public double getHeightParam() {
		return heightParam;
	}
	public void setHeightParam(double heightParam) {
		this.heightParam = heightParam;
	}
	public double getWeightParam() {
		return weightParam;
	}
	public void setWeightParam(double weightParam) {
		this.weightParam = weightParam;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
    // TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	 public void displayMyHealthData() {
	//TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM. CHECK WELL.

	// START CODE
	        System.out.printf("Patient Name: %s %s%n", firstname, lastname);
	        System.out.printf("Gender: %s%n", gender);
	        System.out.printf("Home Address: %s%n", home_address);
	        System.out.printf("Level of Education: %s%n", level_of_education);
	        System.out.printf("Height: %.2f inches%n", heightParam);
	        System.out.printf("Weight: %.2f pounds%n", weightParam);

	        // Call the static method from MyHealthDataBase.
	        double bmi = MyHealthDataBase.calculateBMI(weightParam, heightParam);
	        System.out.printf("BMI: %.2f%n", bmi);

	        // output birthdate in formatted style
	        System.out.printf("Birthdate: %s%n", MyHealthDataBase.getBirthday(year, month, day));

	        // output age in days
	        int ageDays = MyHealthDataBase.ageInDays(year, month, day);
	        System.out.printf("Age in Days: %d days%n", ageDays);

	        // output maximum heart rate and target heart rate range
	        int maxHeartRate = MyHealthDataBase.MaximumHeartRate(year, month, day);
	        System.out.printf("Maximum Heart Rate: %d bpm%n", maxHeartRate);
	        System.out.printf("%s%n", MyHealthDataBase.Target_heart_rate_range(year, month, day));
	        //END CODE

	        //You do not need to modify this piece of code, it is fine as it is.
	        System.out.println("BMI VALUES");
	        System.out.println("Underweight: less than 18.5");
	        System.out.println("Normal:      between 18.5 and 24.9");
	        System.out.println("Overweight:  between 25 and 29.9");
	        System.out.println("Obese:       30 or greater");
	    }
	}// end class MyHealthData