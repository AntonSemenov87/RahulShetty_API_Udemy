import files.UserPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Test {
    public static void main(String[] args) {

        RestAssured.baseURI = "";

        String userResponse = given().log().all().body(UserPayload.getUser())
                .when().post("api/v1/user/login")
                .then()//.assertThat().statusCode(200)
                .extract().response().asString();

        System.out.println("Response: " + userResponse);

        JsonPath js = new JsonPath(userResponse);
        String emp_id = js.get("data.employeeID");
        String emp_name = js.get("data.employeeName");

        System.out.println("EmployeeID: " + emp_id + "\nEmployee Name: " + emp_name);


    }
}
