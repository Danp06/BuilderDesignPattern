public class ThesisBuilder extends DocumentBuilder implements IOnLine{
    @Override
    public void buildYear() {
        document.year(2018);
    }

    @Override
    public void buildPages() {
        document.pages(35);
    }

    @Override
    public void buildEdition() {
        document.edition("1ra");
    }

    @Override
    public void buildEditorial() {
        document.editorial("University");
    }

    @Override
    public void buildIsbn() {
        document.isbn("0254");
    }

    @Override
    public void buildTitle() {
        document.title("Study of plants");
    }

    @Override
    public void buildAuthors() {
        String[] authors = {"Alberto Muna","Esteban Zapata","Sofia Carson"};
        document.authors(authors);
    }

    @Override
    public void buildFormats() {
        Formats[] formats = {Formats.DIGITAL};
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
