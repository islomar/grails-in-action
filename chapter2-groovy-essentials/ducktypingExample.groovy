def mkp = new groovy.xml.MarkupBuilder()
def items = ["Oranges", "Bananas", "Cereal", "Milk"]

mkp.shoppingList {
    for (itm in items) {
        item(itm)
    }
}
