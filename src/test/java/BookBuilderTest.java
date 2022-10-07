import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    BookBuilder documentExpect= new BookBuilder();

    @Test
    void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1999);
    }

    @Test
    void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),150);
    }

    @Test
    void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"4ta");
    }

    @Test
    void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Debolsillo");
    }

    @Test
    void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"El principito");
    }

    @Test
    void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Antoine", "Antoine");
    }

    @Test
    void buildFormats() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Formats.PRINTED,Formats.PRINTED);
    }

    @Test
    void buildLanguages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Languages.ES, Languages.ES);
    }

    @Test
    void operaciones() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.Operaciones(),"Turning the page");
    }

    @Test
    void categories() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().Categories(CategoriesI.ART),"The Categorie is: ART");
    }

    @Test
    void buildIsbn() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"1352");
    }
}