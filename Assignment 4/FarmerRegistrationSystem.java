import java.text.ParseException;
import java.util.Scanner;

public class FarmerRegistrationSystem {
// main method
   public static void main(String[] args) {
       // create scanner to get input from user
       Scanner scan = new Scanner(System.in);
// ask user for first name
       System.out.println("First Name : ");
// get user input - first name
       String firstName = scan.next();
// loop till the name contains any numeric value. if name contains only string then loop will be ended
       while (firstName.matches(".*\\d.*")) {
           // if name contains numeric value print this message
           System.out.println("First Name cannot contain numbers. \nPlease enter a valid First Name !");
           // ask for correct first name
           firstName = scan.next();
       }
//ask user for last name
       System.out.println("Last Name : ");
//get user input - last name
       String lastName = scan.next();
       while ((lastName.matches(".*\\d.*"))) {
           // if name contains numeric value print this message
           System.out.println("Last Name cannot contain numbers. \nPlease enter a valid Last Name !");
           // ask for correct first name
           lastName = scan.next();
       }
       int age = 0;
// ask for date of birth in dd-mm-yyyy format
       System.out.println("Date of Birth(dd-mm-yyyy) : ");
// accept date of birth from user
       String dateOfBirth = scan.next();
       // split date of birth by - , to get date, month and year separate
       String[] dob = dateOfBirth.split("-");
       // take value at index 2 , which is year and parse to integer
       int year = 0;
       try {
           year = Integer.parseInt(dob[2]);
       } catch (Exception e) {
           // print message if any exception occur while parsing
           System.out.println("Invalid Date of Birth");
       }
       // calculate age
       age = 2021 - year;
       while (age < 18) {

           // check if age less than 18

           // print message
           System.out.println("Age is less than 18.\nEnter valid date of birth.");
           dateOfBirth = scan.next();
           // split date of birth by - , to get date, month and year separate
           dob = dateOfBirth.split("-");
           // take value at index 2 , which is year and parse to integer

           try {
               year = Integer.parseInt(dob[2]);
           } catch (Exception e) {
               // print message if any exception occur while parsing
               System.out.println("Invalid Date of Birth");
           }
           // calculate age
           age = 2021 - year;
       }

       // ask user for number of family members above 18 years
       System.out.println("Number of family members above age 18 : ");
       // get user input for number of family members
       String numFamilyAbove = scan.next();
       // parse string to Integer
       int num = 0;
       try {
           num = Integer.parseInt(numFamilyAbove);
       } catch (Exception e) {
           // print message if any exception occur while parsing
           System.out.println("Invalid number of family members.\nNumber of family members above age 18 : ");
           numFamilyAbove = scan.next();
           num = Integer.parseInt(numFamilyAbove);
       }
       while (num > 15) {
           System.out.println("Number of Family members cannot be greater than 15.\nEnter a valid number.");
           numFamilyAbove = scan.next();
           num = Integer.parseInt(numFamilyAbove);
       }

       // ask user for number of family members below 18 years
       System.out.println("Number of family members below age 18 : ");
       // get user input for number of family members below 18
       String numFamilyBelow = scan.next();

       // ask user for average monthly personal income
       System.out.println("Average Monthly Personal Income : ");
       // get user input for average monthly personal income
       String avgMIncome = scan.next();
       // check if input contains non-numeric characters and length greater than 6
       // loop till correct input is given
       while (avgMIncome.matches(".*\\D.*") || avgMIncome.length() > 6) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\nEnter a valid income. ");
           avgMIncome = scan.next();
       }

       // ask user for average monthly family income
       System.out.println("Average Monthly Family Income by : ");
       // get user input for average monthly family income
       String avgMFIncome = scan.next();
       // check if input contains non-numeric characters and length greater than 6
       // loop till correct input is given
       while (avgMFIncome.matches(".*\\D.*") || avgMFIncome.length() > 6) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\nEnter a valid income. ");
           avgMFIncome = scan.next();
       }
       // ask user for average monthly family expense
       System.out.println("Average Monthly family Expanse : ");
       // get user input for average monthly family expense
       String familyExpense = scan.next();
       // check if input contains non-numeric characters and length greater than 6
       // loop till correct input is given
       // covert family income to double
       double familyIn = Double.valueOf(avgMFIncome);
       double familyExp = Double.valueOf(familyExpense);
       while (familyExpense.matches(".*\\D.*") || familyExpense.length() > 6 || familyExp > 25 * familyIn / 100) {
           System.out.println("Income cannot be greater than 6 digits or non-numeric.\nEnter a valid familyexpense. ");
           familyExpense = scan.next();
           // convert family expense to double
           familyExp = Double.valueOf(familyExpense);

       }

       // ask user for average monthly farming expense
       System.out.println("Average Monthly Farming Expense : ");
       // get user input for average monthly farming expense
       String FarmExpense = scan.next();

       // convert farming expense to double
       double farmingExp = Double.valueOf(FarmExpense);
       // check if farming expense greater than 25% of family income
       while (farmingExp > 25 * familyIn / 100) {
           System.out.println(
                   "Family expense cannot be greater tha 25% of family income.\nEnter a valid farming expense.");
           FarmExpense = scan.next();
           farmingExp = Double.valueOf(FarmExpense);
       }
       // ask for any help from government
       System.out.println("If they need any help from the government : ");
       // accept input from user
       String help = scan.next();
       // check if input is boolean value and loop till get boolean value
       while (!(help.equalsIgnoreCase("true") || help.equalsIgnoreCase("false"))) {
           System.out.println("Please enter a valid input(true/false).");
           help = scan.next();
       }
       // ask for amount
       System.out.println("Amount of money they wish to have as stipend from the Govt : ");
       // accept input from user
       String stipend = scan.next();
       // check if it matches non-numeric value and 25% greater than family income,
       // loop till get only numeric value
       double amount = Double.valueOf(stipend);
       while (stipend.matches(".*\\D.*") || amount > 25 * familyIn / 100) {
           // print message
           System.out.println("Enter a valid amount.");
           // get input again
           stipend = scan.next();
           amount = Double.valueOf(stipend);
       }
       // ask for fertilizers in kg
       System.out.println("Fertilizers (in Kg) s/he needs to buy each month : ");
       // accept input from user for fertilizers in kg
       String FertilizerKg = scan.next();
       while (FertilizerKg.matches(".*\\D.*") || FertilizerKg.length() > 2) {
           System.out.println("Enter a valid amount in kg.");
           FertilizerKg = scan.next();
       }
   }

}