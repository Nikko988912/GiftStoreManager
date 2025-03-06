package Generic;

class PaperBook extends Book {
    private int pages;

    public PaperBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return "Paper Book: " + title + " by " + author + " (" + pages + " pages)";
    }
}


