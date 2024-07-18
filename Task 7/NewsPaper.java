public class NewsPaper {
     String title;
     String publisher;
     String publicationDate;
     int numberOfPages;

    public NewsPaper(String title, String publisher, String publicationDate, int numberOfPages) {
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
    }

    public void read() {
        System.out.println("Reading " + title + " published by " + publisher + " on " + publicationDate + ".");
    }
}
