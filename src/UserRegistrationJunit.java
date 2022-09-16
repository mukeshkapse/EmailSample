import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJunit {
    Scanner sc = new Scanner(System.in);

    // method to check username Valid or Invalid
    public boolean validateUsername(String userName) {
        // regex pattern for username
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(userName);
        boolean result = matcher.matches();
        if(result)
            return true;
        else
            return false;
    }

    // method to check LastName Valid or Invalid
    public boolean validateLastname(String lastName) {
        // regex pattern for Lastname
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(lastName);
        boolean result = matcher.matches();
        if(result)
            return true;
        else
            return false;
    }

    // method to check Email Valid or Invalid
    public boolean validateEmail(String email) {
        /*
         * regex pattern for email 1)must contain character before @ 2)must contain @
         * symbol after char 3)must contain char after @ 4)must contain "." symbol
         * before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);
        boolean result = matcher.matches();

        if(result)
            return true;
        else
            return false;
    }

    // method to check Phoneno Valid or Invalid
    public boolean validateMobileNo(String mobileno) {
        // regex pattern for email
        String regex = "^[1-9]{2}[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(mobileno);
        boolean result = matcher.matches();
        if(result)
            return true;
        else
            return false;
    }

    // method to check password Valid or Invalid
    public boolean validatePassword(String password) {
        /*
         * regex pattern for password: 1)must contain atleast 8 characters 2)must
         * contain one UpperCase 3)should have 1 numericno 4)has contain Exactily one
         * specialSymbol.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{5,}[@$^]{1}[1-9]{1}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();
        if(result)
            return true;
        else
            return false;


    }
    static Pattern pattern = Pattern.compile("^[A-Z]{3,}");

    static Pattern pattern2 = Pattern.compile("^[A-Z]{3,}");
    static Pattern ForEmail = Pattern.compile(("^[a-z]{3,}[.]+[a-z]{3,}?[@]+[a-z]{2,}[.]+[a-z]{2,}[.]+[a-z]{2}$"));
    static  Pattern ForMobile = Pattern.compile("^[6-9]{1}[0-9]{1}[0-9]{10}");
    static Pattern ForPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$).{8,}$");

    public static void emailValidate(String[] emails) {
        for(int i = 0; i< emails.length; i++ ){
            System.out.print(Pattern.matches("^[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", emails[i]) + " ");
        }
    }

    public static void main(String[] args) {



        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        System.out.println();
        System.out.println("Enter Last Name");
        Matcher matcher1 = pattern2.matcher(Sc.nextLine());
        // System.out.println("Enter Email");
        //Matcher matcher3 = ForEmail.matcher(Sc.nextLine());
        System.out.println("Enter Mobile Number");
        Matcher matcher4 = ForMobile.matcher(Sc.nextLine());
        System.out.println("Enter Password");
        Matcher matcher5 = ForPassword.matcher((Sc.nextLine()));

        UserRegistrationJunit m = new UserRegistrationJunit();

    }
}
