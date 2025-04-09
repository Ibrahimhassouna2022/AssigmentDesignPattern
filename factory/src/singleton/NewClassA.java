package singleton;

public class NewClassA {

    public static void main(String[] args) {

        CountryPhoneCodeSingleton singleton = CountryPhoneCodeSingleton.getInstance();

        System.out.println(singleton);//singleton.CountryPhoneCodeSingleton@15db9742
    }
}
