package steps

import cucumber.runtime.{ScalaDsl, EN}

class TestStep extends ScalaDsl with EN {

  When("""^I add (\d+) and (\d+)$""") { (arg1: Double, arg2: Double) =>
    println("In JAR!")
    println("Got 1   >" + arg1 )
    println("Got 2   >" + arg2)
    println("Got 1+2 >" + (arg1 + arg2))
  }

  Then("^the result is (\\d+)$") { expected: Double =>
    println("result >" + expected )
  }

  Before("@foo"){
    println("Runs before scenarios tagged with @foo")
  }
}