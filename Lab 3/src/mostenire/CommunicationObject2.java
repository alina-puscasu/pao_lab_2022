package mostenire;

// Composition and aggregation are 2 forms of association - relationship between 2 classes.
// Composition: restricted form of Aggregation where two entities are highly dependent on each other
// -> the composed object cannot exist without the other entity

public class CommunicationObject2 {
    public static void main(String[] args) {
        Sale sale = new Sale(2);
        Sale sale2 = new Sale(1);
        sale.addArticles("Article1");
        sale.addArticles("Article2");
        sale.addArticles("Article3");
        System.out.println(sale.getCurrentNumber());
    }
}

class Sale {
    private Article[] articles;
    private int noOfArticles;
    private int currentNumber;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public Sale(int noOfArticles) {
        this.articles = new Article[noOfArticles];
        this.noOfArticles = noOfArticles;
    }

    public void addArticles(String name) {
        if (currentNumber < noOfArticles) {
            this.articles[currentNumber++] = new Article(name);
            System.out.println("Article " + currentNumber);
        } else {
            System.out.println("Capacity is reached");
        }
    }
}

class Article {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Article(String name) {
        this.name = name;
    }
}