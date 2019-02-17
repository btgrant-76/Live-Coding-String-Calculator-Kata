# Intro
This project supports the live coding portion of my talk, "Test-Driven Development or: How I Learned to Stop Worrying and Love Testing my Code". `master` includes a single class and corresponding test suite that covers the various tasks described in the [String Calculator Kata](http://osherove.com/tdd-kata-1/). Each task has a unit test which, from the start, will be skipped. 

Working from the top of the test file:

1. Remove or comment out the `@Disabled` annotation on a test. 
1. Run the tests; the newly-enabled test will typically fail. 
1. Use [The Three Rules of TDD](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd) to get the newly-failing test passing. 
1. Rinse and repeat.

# Using Gradle
This project is set up using [Gradle](https://gradle.org/). The Gradle binaries are included in the project, so all you need to do is clone the project and go! Running the tests directly from your IDE should be easy enough, but if you want to use Gradle instead: 

* `./gradlew test` Runs all tests
* `./gradlew test --continuous` Runs all tests each time a code change is made. This can be a really fun way to do TDD!
* `./gradlew test jacocoTestReport` Runs all tests and generates a test coverage report. The coverage report can be found in `./build/test-coverage/index.html`

# Notes
* This project generally follows [the Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
