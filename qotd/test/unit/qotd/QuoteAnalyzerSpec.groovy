package qotd

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class QuoteAnalyzerSpec extends Specification {

    @Shared quotes = [
        new Quote(author: "Peter Ledbrook",
                  content: "Time waits for no man"),
        new Quote(author: "Glen Smith",
                  content: "Groovy solves all problems")
    ]

    //@Unroll reports each data set as a separate test (highly recommended)
    @Unroll
    void "Total number of quotes"() {

        given: "An analyzer initialized with known quotes"
            def analyzer = new QuoteAnalyzer(inputQuotes)

        when: "I ask for the quote count"
            def quoteCount = analyzer.quoteCountPerAuthor

        then: "The number of quotes in the test list is returned"
        quoteCount == expected

        where:
        inputQuotes     |   expected
            []          |   [:]
            quotes      |   ["Peter Ledbrook": 1, "Glen Smith": 1]
    }
}
