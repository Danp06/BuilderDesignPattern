public class MagazineBuilder extends DocumentBuilder implements IOnLine{
    @Override
    public void buildYear() {
        document.year(2015);
    }

    @Override
    public void buildPages() {
        document.pages(12);
    }

    @Override
    public void buildEdition() {
        document.edition("Sports");
    }

    @Override
    public void buildEditorial() {
        document.editorial("Ford");
    }

    @Override
    public void buildIsbn() {
        document.isbn("12332");
    }

    @Override
    public void buildTitle() {
        document.title("Cars");
    }

    @Override
    public void buildAuthors() {
        String[] authors = {"Alex Flores"};
        document.authors(authors);
    }

    @Override
    public String toString() {
        return "MagazineBuilder{" +
                "document=" + document +
                '}';
    }

    @Override
    public void buildFormats() {
        Formats[] formats = {Formats.PRINTED,Formats.DIGITAL};
        document.formats(formats);
    }

    @Override
    public void buildLanguages() {
        Languages[] languages = {Languages.ES};
        document.languages(languages);
    }

    @Override
    public String categories(CategoriesI categoriesI) {
        return "The Category is: " + categoriesI;
    }
}
