import static io.restassured.RestAssured.given;
import static util.Constants.TOKEN;

public class Connect {
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
