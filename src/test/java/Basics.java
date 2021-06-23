import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {

    public static void main(String[] args) {
        // !!! Validate if ADD PLACE API is working

        // given - all input details
        // when - submit the API
        // then - validate response

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(Payload.AddPlace())
                .when().post("maps/api/place/add/json")
                .then().assertThat()
                        .statusCode(200)
                        .body("scope", equalTo("APP"))
                        .header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
                        .extract().response().asString();

        System.out.println(response);

        JsonPath js = new JsonPath(response); // for parsing JSON

        String place_id = js.get("place_id");
        System.out.println("PlaceID: " + place_id);
        String reference = js.get("reference");
        System.out.println("Reference: " + reference);


        // ADD place --> UPDATE place with New Address --> GET place to validate new address is resent in response



    }
}
