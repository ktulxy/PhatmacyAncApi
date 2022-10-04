import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DirectoriesCities {

    @Test
        public void city(){
        given().
        when().
        header("Authorization","Basic aW5nbzpTYzR4OGozMTJERDc=").
        get("https://insur-api.anctm.biz/api/cities").
        then().
        assertThat().statusCode(200).
        log().all();


}
}
