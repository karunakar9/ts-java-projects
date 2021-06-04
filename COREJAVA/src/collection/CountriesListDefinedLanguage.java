package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class CountriesListDefinedLanguage {

    public static void main(String... args){

        // Create a collection of all available countries
        List<Country> countries = new ArrayList<Country>();

        // Map ISO countries to custom country object
        String[] countryCodes = Locale.getISOCountries();
        for (String countryCode : countryCodes){

            Locale locale = new Locale("", countryCode);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry(Locale.ENGLISH);

            countries.add(new Country(iso, code, name));
        }

        // Sort countries
        Collections.sort(countries);

        // Loop over collection of countries and print to console
        countries.forEach(System.out::println);

        // print total number of countries
        System.out.println("found: " + countries.size() + " countries");

    }

}