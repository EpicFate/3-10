package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${environment}.properties"
//        "file:\\C:\\Users\\bogti\\Desktop\\Api.properties",
//        "system:properties"

})
public interface ApiConfig extends Config {

    @DefaultValue("3")
    @Key("number1")
    String number1();

    @DefaultValue("2")
    @Key("number2")
    String number2();

    @DefaultValue("5")
    @Key("number3")
    String number3();
}
