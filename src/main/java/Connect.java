import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static util.Constants.TOKEN;

public class Connect {
    public static void auth(String url) {
      Object resp = given().
                when().
                header("Authorization",TOKEN).
                get(url).

               then().extract().response().asString();
      System.out.println("Пишем коннект " + resp);
              //  assertThat().statusCode(200).
              //  log().all();

        String str = (String) resp;
        JSONObject obj = new JSONObject(str);
        String n = obj.getString("name");

        System.out.println(n);
    }
}

