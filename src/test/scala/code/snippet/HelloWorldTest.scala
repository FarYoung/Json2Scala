package code.snippet


class TempClassWithNoMeaning() {}

//TODO: Rewrite for specs2
//class HelloWorldTestSpecsAsTest extends JUnit4(HelloWorldTestSpecs)
//object HelloWorldTestSpecsRunner extends ConsoleRunner(HelloWorldTestSpecs)
//
//object HelloWorldTestSpecs extends Specification {
//  val session = new LiftSession("", randomString(20), Empty)
//  val stableTime = now
//
//  override def executeExpectations(ex: Examples, t: =>Any): Any = {
//    S.initIfUninitted(session) {
//      DependencyFactory.time.doWith(stableTime) {
//        super.executeExpectations(ex, t)
//      }
//    }
//  }
//
//  "HelloWorld Snippet" should {
//    "Put the time in the node" in {
//      val hello = new HelloWorld
//      Thread.sleep(1000) // make sure the time changes
//
//      val str = hello.howdy(<span>Welcome to your Lift app at <span id="time">Time goes here</span></span>).toString
//
//      str.indexOf(stableTime.toString) must be >= 0
//      str.indexOf("Welcome to") must be >= 0
//    }
//  }
//}
