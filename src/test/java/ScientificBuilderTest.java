import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificBuilderTest {
    Document document = new Document(null);
    Library library = new Library();
    DocumentBuilder documentBuilder = null;
    ScientificBuilder documentExpect= new ScientificBuilder();

    @Test
    public void buildYear() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1995);
    }

    @Test
    public void buildPages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),45);
    }

    @Test
    public void buildEdition() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"FeriaXXI");
    }

    @Test
    public void buildEditorial() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Scientific");
    }

    @Test
    public void buildTitle() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Discovery");
    }

    @Test
    public void buildAuthors() {
        String[] authors = {"Carlos Alberto"};
        document.authors(authors);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(authors, document.getAuthors());
    }

    @Test
    public void buildFormats() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        Formats[] formats = {Formats.DIGITAL};
        document.formats(formats);
        library.buildDocument();
        assertEquals(formats,document.getFormats());
    }

    @Test
    public void buildLanguages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        Languages[] languages = {Languages.EN};
        document.languages(languages);
        assertEquals(languages, document.getLanguages());
    }

    @Test
    public void operations() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.operations(),"Back to page");
    }

    @Test
    public void categories() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.categories(CategoriesI.ENGINEERING),"The Category is: ENGINEERING");
    }

    @Test
    public void buildIsbn() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"2315");
    }
}