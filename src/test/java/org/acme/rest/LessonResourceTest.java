package org.acme.rest;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.acme.domain.Lesson;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
public class LessonResourceTest {

    @Test
    void addAndRemove() {
        Lesson lesson = given()
                .when()
                .contentType(ContentType.JSON)
                .body(new Lesson("Test subject", "Test teacher", "test studentGroup"))
                .post("/lessons")
                .then()
                .statusCode(201)
                .extract().as(Lesson.class);

        given()
                .when()
                .delete("/lessons/{id}", lesson.getId())
                .then()
                .statusCode(204);
    }
}
