public class Book {
    protected String name;
    protected String author;
    protected int numberOfPages;

//    ========== CONSTRUCTOR ===========
    public Book(String name, String author, int numberOfPages){
        this.name = name;
        this.author = author;

        if(numberOfPages < 0)
            this.numberOfPages = 1;
        else
            this.numberOfPages = numberOfPages;
    }

//    ========== GETTERS ==========
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

//    ========== toString() METHOD ==========
    @Override
    public String toString(){
        return name + " by " + author + ", " + numberOfPages + " pages.";
    }
}
