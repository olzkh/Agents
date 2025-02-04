import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Simulation extends Simulation {

    HttpProtocolBuilder httpProtocol = http
        .baseUrl("http://example.com") // Here is the root for all relative URLs
        .acceptHeader("text/html"); // Here are the common headers

    ScenarioBuilder scn = scenario("BasicSimulation") // A scenario is a chain of requests and pauses
        .exec(http("request_1")
        .get("/"))
        .pause(5); // Note that Gatling has recorder real time pauses

    {
        setUp(
            scn.injectOpen(atOnceUsers(1))
        ).protocols(httpProtocol);
    }
}
