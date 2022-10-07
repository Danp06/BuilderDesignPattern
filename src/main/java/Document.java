import java.util.Arrays;

public class Document {
    private int year, pages;
    private String edition, editorial, isbn, title;
    private String[] authors;
    private Formats[] formats;
    private Languages[] languages;

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getEdition() {
        return edition;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Formats[] getFormats() {
        return formats;
    }

    public Languages[] getLanguages() {
        return languages;
    }

    public Document(Formats[] formats) {
        this.formats = formats;
    }

    public Document year(int year) {
        this.year = year;
        return this;
    }

    public Document pages(int pages) {
        this.pages = pages;
        return this;
    }

    public Document edition(String edition) {
        this.edition = edition;
        return this;
    }

    public Document editorial(String editorial) {
        this.editorial = editorial;
        return this;
    }

    public Document isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Document title(String title) {
        this.title = title;
        return this;
    }

    public Document authors(String[] authors) {
        this.authors = authors;
        return this;
    }

    public Document formats(Formats[] formats){
        this.formats = formats;
        return this;
    }

    public Document languages(Languages[] languages) {
        this.languages = languages;
        return this;
    }

    @Override
    public String toString() {
        return "Document{" +
                "year=" + year +
                ", pages=" + pages +
                ", edition='" + edition + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", formats=" + Arrays.toString(formats) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }

    public String Categories(CategoriesI categoriesI) {
        return "The Categorie is: " + categoriesI;
    }
}
