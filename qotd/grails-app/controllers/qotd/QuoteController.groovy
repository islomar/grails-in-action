package qotd

/**
 * By convention, all the actions over the URLS /qotd/quote would go to this QuoteController.
 */
class QuoteController {

    // When Grails sees a controller marked as scaffold=true, it creates controller actions
    // and GSP views on the fly. Check it under http://localhost:8080/qod/quote/index
    static scaffold = true

    //index() is the action called when the user omits the action name
    //def index() { }

    // By default, the user will be redirected to "home"; e.g. URL /qotd/quote/
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
