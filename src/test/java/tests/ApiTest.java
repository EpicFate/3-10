package tests;

import config.ApiConfigHelper;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest  {
    @Test
    @DisplayName("Api Test")
    @Owner("EpicFate")
    void apiTest() {

        String number1 = ApiConfigHelper.getnumber1();
        String number2 = ApiConfigHelper.getnumber2();
        String number3 = ApiConfigHelper.getnumber3();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        
        assertEquals(num1 + num2, num3);
    }

}
