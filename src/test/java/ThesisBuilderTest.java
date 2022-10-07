import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThesisBuilderTest {
    Document document = new Document(null);
    Library library = new Library();
    DocumentBuilder documentBuilder = null;
    ThesisBuilder documentExpect= new ThesisBuilder();

    @Test
    public void buildYear() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),2018);
    }

    @Test
    public void buildPages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),35);
    }

    @Test
    public void buildEdition() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"1ra");
    }

    @Test
    public void buildEditorial() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"University");
    }

    @Test
    public void buildTitle() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Study of plants");
    }

    @Test
    public void buildAuthors() {
        String[] authors = {"Alberto Muna","Esteban Zapata","Sofia Carson"};
        document.authors(authors);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(document.getAuthors(), authors);
    }

    @Test
    public void buildFormats() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        Formats[] formats = {Formats.DIGITAL};
        document.formats(formats);
        assertEquals(formats,document.getFormats());
    }

    @Test
    public void buildLanguages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        Languages[] languages = {Languages.ES};
        document.languages(languages);
        assertEquals(languages, document.getLanguages());
    }

    @Test
    public void categories() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        document.categories(CategoriesI.CHEMISTRY);
        assertEquals(documentExpect.categories(CategoriesI.CHEMISTRY),"The Category is: CHEMISTRY");
    }

    @Test
    public void buildIsbn() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"0254");
    }
}
