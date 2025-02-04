import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Simulation extends Simulation {

    HttpProtocolBuilder httpProtocol = http
        .baseUrl("https://example.com")
        .inferHtmlResources();

    ScenarioBuilder scn = scenario("BasicSimulation")
        .exec(
            http("request_1")
                .get("/")
        );

    {
        setUp(
            scn.injectOpen(atOnceUsers(1))
        ).protocols(httpProtocol);
    }
}
