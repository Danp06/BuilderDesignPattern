public class ScientificBuilder extends DocumentBuilder implements IPdf, IOnLine{
    @Override
    public void buildYear() {
        document.year(1995);
    }

    @Override
    public void buildPages() {
        document.pages(45);
    }

    @Override
    public void buildEdition() {
        document.edition("FeriaXXI");
    }

    @Override
    public void buildEditorial() {
        document.editorial("Scientific");
    }

    @Override
    public void buildIsbn() {
        document.isbn("2315");
    }

    @Override
    public void buildTitle() {
        document.title("Descubrimiento");
    }

    @Override
    public void buildAuthors() {
        String authors[] = {"Carlos"};
        document.authors(authors);
    }

    @Override
    public void buildFormats() {
        Formats formats[] = {Formats.PRINTED,Formats.DIGITAL,Formats.AUDIO};
        document.formats(formats);
    }

    @Override
    public void buildLanguages() {
        Languages languages[] = {Languages.ES,Languages.EN,Languages.IT};
        document.languages(languages);
    }

    @Override
    public String Operaciones() {
        return "Back to page";
    }

    @Override
    public String Categories(CategoriesI categoriesI) {
        return "The Categorie is: " + categoriesI;
    }
}
