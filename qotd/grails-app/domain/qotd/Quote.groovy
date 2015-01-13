package qotd

class Quote {

    String content
    String author
    Date created = new Date()

    static constraints = {
        author(blank: false)
        //Fields with constraint sizes greater than 255 characters are rendered as HTML <textarea> elements
        //rather than <input> fields
        content(maxSize: 1000, blank: false)
    }
}
