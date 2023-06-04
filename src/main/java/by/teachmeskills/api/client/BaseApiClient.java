package by.teachmeskills.api.client;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseApiClient {


    static final String BASE_URL = "https://api.qase.io";
    static final String TOKEN = "05a3b0b0c242d20c6f54fc765bc5a18f2a9481e31286c893ab1ca1badc89c716";

    public BaseApiClient() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = BASE_URL;
    }

    public  <R> R get(String path, Map<String, ?> parameterNameValuePairs, Class<R> responseClass) {
        return getRequestSpecification()
                .pathParams(parameterNameValuePairs)
                .when()
                .get(path)
                .then()
                .extract()
                .body()
                .as(responseClass);
    }


    protected static RequestSpecification getRequestSpecification() {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Token", TOKEN);
    }
}
