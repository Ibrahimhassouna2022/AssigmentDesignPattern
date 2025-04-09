package singleton;

import java.util.HashMap;
import java.util.Map;

public class CountryPhoneCodeSingleton {

    private static CountryPhoneCodeSingleton instance;

    // Step 2: A HashMap to store country phone codes
    private final Map<String, String> countryPhoneCodes;

    // Step 3: Private constructor to prevent instantiation from outside
    private CountryPhoneCodeSingleton() {
        countryPhoneCodes = new HashMap<>();
        // Populate with some example country codes
        countryPhoneCodes.put("USA", "+1");
        countryPhoneCodes.put("Canada", "+1");
        countryPhoneCodes.put("UK", "+44");
    }

    // Step 4: Public static method to provide access to the single instance
    public static CountryPhoneCodeSingleton getInstance() {
        if (instance == null) {
            instance = new CountryPhoneCodeSingleton();
        }
        return instance;
    }

    // Method to get the phone code for a specific country
    public String getPhoneCode(String country) {
        return countryPhoneCodes.get(country);
    }

    // Method to add or update a phone code for a country
    public void addOrUpdatePhoneCode(String country, String code) {
        countryPhoneCodes.put(country, code);
    }

    public static void main(String[] args) {
                CountryPhoneCodeSingleton singleton = CountryPhoneCodeSingleton.getInstance();
         
        
    }

}
