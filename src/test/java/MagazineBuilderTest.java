import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MagazineBuilderTest {
    Document document = new Document(null);
    Library library = new Library();
    DocumentBuilder documentBuilder = null;
    MagazineBuilder documentExpect= new MagazineBuilder();

    @Test
    public void buildYear() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),2015);
    }

    @Test
    public void buildPages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),12);
    }

    @Test
    public void buildEdition() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"Sports");
    }

    @Test
    public void buildEditorial() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Ford");
    }

    @Test
    public void buildTitle() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Cars");
    }

    @Test
    public void buildAuthors() {
        String[] authors = {"Alex Flores"};
        document.authors(authors);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(authors, document.getAuthors());
    }

    @Test
    public void buildFormats() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        Formats[] formats = {Formats.PRINTED};
        document.formats(formats);
        library.buildDocument();
        assertEquals(formats,document.getFormats());
    }

    @Test
    public void buildLanguages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        Languages[] languages = {Languages.ES};
        document.languages(languages);
        library.buildDocument();
        assertEquals(languages,document.getLanguages());
    }

    @Test
    public void categories() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.categories(CategoriesI.PHYSICS),"The Category is: PHYSICS");
    }

    @Test
    public void buildIsbn() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"12332");
    }
}