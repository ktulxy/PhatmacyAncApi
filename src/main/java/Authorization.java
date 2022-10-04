import util.Constants;

import static io.restassured.RestAssured.given;
import static util.Constants.*;

public class Authorization {



    public static void auth(String url) {
        given().
                when().
                header("Authorization",TOKEN).
                get(url).
                then().
                assertThat().statusCode(200).
                log().all();

    }
}
