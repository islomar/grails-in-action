package qotd

/**
 * By convention, all the actions over the URLS /qotd/quote would go to this QuoteController.
 */
class QuoteController {

    //index() is the action called when the user omits the action name
    //def index() { }

    static defaultAction = "home"

    //This is an action
    def home() {
        //The render() method sends content directly back to the browser
        render "<h1>Real Programmers do not eat Quiche</h1>"
    }

    def random() {

        def allQuotes = Quote.list()
        def randomQuote
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = new Quote(author: "Anonymous",
                                        content: "Real Programmers don't eat much Quiche")
        }
        [ quote: randomQuote]
    }

}
