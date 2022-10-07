import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagazineBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    MagazineBuilder documentExpect= new MagazineBuilder();

    @Test
    void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),2015);
    }

    @Test
    void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),12);
    }

    @Test
    void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"Sports");
    }

    @Test
    void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Ford");
    }

    @Test
    void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Cars");
    }

    @Test
    void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Alex", "Alex");
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
        assertEquals(library.getDocument().getIsbn(),"12332");
    }
}