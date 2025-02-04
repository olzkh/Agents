import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ComputerDatabaseSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://computer-database.gatling.io")
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
    .acceptEncodingHeader("gzip, deflate, br, zstd")
    .acceptLanguageHeader("en-US,en;q=0.9,ru;q=0.8")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")

  val scn = scenario("ComputerDatabaseSimulation")
    .exec(http("Get Computers List")
      .get("/computers?f=HELLO-PC")
      .check(status.is(200)))
    .pause(5)
    .exec(http("Get New Computer Page")
      .get("/computers/new")
      .check(status.is(200)))
    .pause(5)
    .exec(http("Create New Computer")
      .post("/computers")
      .formParam("name", "HELLO-PC")
      .formParam("introduced", "2000-01-01")
      .formParam("discontinued", "2001-01-01")
      .formParam("company", "1")
      .check(status.is(303)))
    .pause(5)
    .exec(http("Get Created Computer")
      .get("/computers/381")
      .check(status.is(200)))
    .pause(5)
    .exec(http("Update Computer")
      .post("/computers/381")
      .formParam("name", "ACE")
      .formParam("introduced", "")
      .formParam("discontinued", "")
      .formParam("company", "")
      .check(status.is(303)))
    .pause(5)
    .exec(http("Get Updated Computer")
      .get("/computers/381")
      .check(status.is(200)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
