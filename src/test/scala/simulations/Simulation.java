package example.tests;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class WebSimulation extends Simulation {

    // Define HTTP protocol configuration
    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://reqres.in")
            .acceptHeader("application/json")
            .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")
            .disableFollowRedirect();

    // Define scenario steps
    ChainBuilder getUsersPage2 = exec(http("GET_Users_Page2")
            .get("/api/users")
            .queryParam("page", "2")
            .check(substring("page").is("2"))
            .check(jsonPath("$.data[0].id").exists())
            .check(status().is(200)));

    ChainBuilder getUser2 = exec(http("GET_User_2")
            .get("/api/users/2")
            .check(jsonPath("$.data.id").is("2"))
            .check(jsonPath("$.data.first_name").exists())
            .check(status().is(200)));

    ChainBuilder getUnknown = exec(http("GET_Unknown")
            .get("/api/unknown")
            .check(jsonPath("$.data").exists())
            .check(status().is(200)));

    ChainBuilder createUser = exec(http("POST_Create_User")
            .post("/api/users")
            .body(RawFileBody("bodies/createUser.json")).asJson()
            .check(jsonPath("$.name").is("morpheus"))
            .check(jsonPath("$.job").is("leader"))
            .check(status().is(201)));

    ChainBuilder updateUser = exec(http("POST_Update_User")
            .post("/api/users/2")
            .body(RawFileBody("bodies/updateUser.json")).asJson()
            .check(jsonPath("$.name").is("morpheus"))
            .check(jsonPath("$.job").is("zion resident"))
            .check(status().is(200)));

    ChainBuilder putUser = exec(http("PUT_Update_User")
            .put("/api/users/2")
            .body(RawFileBody("bodies/updateUser.json")).asJson()
            .check(jsonPath("$.name").is("morpheus"))
            .check(jsonPath("$.job").is("zion resident"))
            .check(status().is(200)));

    // Define scenario
    ScenarioBuilder userScenario = scenario("User_Scenario")
            .exec(getUsersPage2)
            .pause(1)
            .exec(getUser2)
            .pause(1)
            .exec(getUnknown)
            .pause(1)
            .exec(createUser)
            .pause(1)
            .exec(updateUser)
            .pause(1)
            .exec(putUser);

    {
        setUp(
                userScenario.injectOpen(atOnceUsers(1))
        ).protocols(httpProtocol);
    }
}