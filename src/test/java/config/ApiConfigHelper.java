package config;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigHelper {

    public static String getnumber1() { return getConfig().number1(); }

    public static String getnumber2() { return getConfig().number2(); }

    public static String getnumber3() { return getConfig().number3(); }

    private static ApiConfig getConfig() {
        return ConfigFactory.newInstance().create(ApiConfig.class, System.getProperties());
    }

}
