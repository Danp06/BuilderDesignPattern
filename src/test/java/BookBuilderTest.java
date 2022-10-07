import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookBuilderTest {
    Document document = new Document(null);
    Library library = new Library();
    DocumentBuilder documentBuilder = null;
    BookBuilder documentExpect= new BookBuilder();

    @Test
    public void buildYear() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1999);
    }

    @Test
    public void buildPages() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),150);
    }

    @Test
    public void buildEdition() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"4ta");
    }

    @Test
    public void buildEditorial() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Debolsillo");
    }

    @Test
    public void buildTitle() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"The little Prince");
    }

    @Test
    public void buildAuthors() {
        documentBuilder = documentExpect;
        String[] authors = {"Antoine de Saint-Exupery"};
        document.authors(authors);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(authors, document.getAuthors());
    }

    @Test
    public void buildFormats() {
        documentBuilder = documentExpect;
        Formats[] formats = {Formats.PRINTED};
        document.formats(formats);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(formats,document.getFormats());
    }

    @Test
    public void buildLanguages() {
        documentBuilder = documentExpect;
        Languages[] languages = {Languages.ES};
        document.languages(languages);
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(languages,document.getLanguages());
    }

    @Test
    public void operations() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.operations(),"Turning the page");
    }

    @Test
    public void categories() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.categories(CategoriesI.ART),"The Category is: ART");
    }
    @Test
    public void buildIsbn() {
        library.setDocumentBuilder(documentBuilder = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"1352");
    }
}