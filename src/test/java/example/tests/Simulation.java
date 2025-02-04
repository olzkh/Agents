package example.tests;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class WebSimulation extends Simulation {

    // HTTP Protocol Configuration
    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://computer-database.gatling.io")
            .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
            .acceptEncodingHeader("gzip, deflate, br, zstd")
            .acceptLanguageHeader("en-US,en;q=0.9,ru;q=0.8")
            .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")
            .disableFollowRedirect();

    // Scenario Definitions
    ChainBuilder searchComputer = exec(http("GET_computers_search")
            .get("/computers")
            .queryParam("f", "HELLO-PC")
            .check(substring("Computers found").exists())
            .check(status().is(200)));

    ChainBuilder newComputerPage = exec(http("GET_new_computer_page")
            .get("/computers/new")
            .check(substring("Add a computer").exists())
            .check(status().is(200)));

    ChainBuilder addComputer = exec(http("POST_add_computer")
            .post("/computers")
            .formParam("name", "New Computer")
            .formParam("introduced", "2023-01-01")
            .formParam("discontinued", "2024-01-01")
            .formParam("company", "1")
            .check(substring("Done! Computer New Computer has been created").exists())
            .check(status().is(200)));

    // Scenario Builder
    ScenarioBuilder userScenario = scenario("User_Scenario")
            .exec(searchComputer)
            .pause(2)
            .exec(newComputerPage)
            .pause(2)
            .exec(addComputer);

    // Load Simulation Setup
    {
        setUp(
                userScenario.injectOpen(rampUsers(10).during(10))
        ).protocols(httpProtocol);
    }
}
