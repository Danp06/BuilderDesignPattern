public class BookBuilder extends DocumentBuilder implements IPdf {

    @Override
    public void buildYear() {
        document.year(1999);
    }

    @Override
    public void buildPages() {
        document.pages(150);
    }

    @Override
    public void buildEdition() {
        document.edition("4ta");
    }

    @Override
    public void buildEditorial() {
        document.editorial("Debolsillo");
    }

    @Override
    public void buildIsbn() {
        document.isbn("1352");
    }

    @Override
    public void buildTitle() {
        document.title("The little Prince");
    }

    @Override
    public void buildAuthors() {
        String[] authors = {"Antoine de Saint-Exupery"};
        document.authors(authors);
    }

    @Override
    public void buildFormats() {
        Formats[] formats = {Formats.PRINTED};
        document.formats(formats);
    }

    @Override
    public void buildLanguages() {
        Languages[] languages = {Languages.ES, Languages.FR};
        document.languages(languages);
    }

    @Override
    public String operations() {
        return "Turning the page";
    }

    @Override
    public String categories(CategoriesI categoriesI) {
        return "The Category is: " + categoriesI;
    }
}
