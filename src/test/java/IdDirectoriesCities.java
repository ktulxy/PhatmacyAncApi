import org.testng.annotations.Test;


import static util.Constants.getCity;
import static util.Constants.idCity;

public class IdDirectoriesCities {

    static String url = idCity;

    @Test
    public static void IdCities(){
        Authorization.auth(url);

    }
}
