import static io.restassured.RestAssured.given;
import static util.Constants.TOKEN;

public class Connect {
    public static void auth(String url) {
      Object responce = given().
                when().
                header("Authorization",TOKEN).
                get(url).
                then().extract().response().asString();
              //  assertThat().statusCode(200).
              //  log().all();
        System.out.println("Пишем коннект " + responce);

    }
}
