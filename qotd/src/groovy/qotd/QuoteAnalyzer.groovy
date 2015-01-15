package qotd
/**
 *
 */
class QuoteAnalyzer {

    private final List<Quote> quotes

    QuoteAnalyzer(List<Quote> quotes) {
        this.quotes = new ArrayList(quotes)
    }

    int getQuoteCount() {
        return this.quotes.size()
    }

    Map<String, Integer> getQuoteCountPerAuthor() {

        def result = [:]

        for (Quote quote in quotes) {
            if (result.containsKey(quote.author)) {
                result[quote.author] = result[quote.author] + 1
            } else {
                result[quote.author] = 1
            }
        }

        return result
    }
}
