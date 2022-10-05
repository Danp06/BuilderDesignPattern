public class ConstructBook implements Builder {
    private int anno;
    private String edition, editorial, isbn, tittle;
    private String[] authors;
    private Formats[] formats;
    private Languages[] languages;

    @Override
    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public void setEdition(String edition) {

    }

    @Override
    public void setEditorial(String editorial) {

    }

    @Override
    public void setFormats(Formats[] formats) {

    }

    @Override
    public void setLanguages(Languages[] languages) {

    }

    @Override
    public void setIsbn(String isbn) {

    }

    @Override
    public void setPages(int pages) {

    }

    @Override
    public void setTittle(String tittle) {

    }
}
