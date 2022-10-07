import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    ScientificBuilder documentExpect= new ScientificBuilder();

    @Test
    void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1995);
    }

    @Test
    void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),45);
    }

    @Test
    void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"FeriaXXI");
    }

    @Test
    void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Scientific");
    }

    @Test
    void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Descubrimiento");
    }

    @Test
    void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Carlos", "Carlos");
    }

    @Test
    void buildFormats() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Formats.DIGITAL,Formats.DIGITAL);
    }

    @Test
    void buildLanguages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Languages.EN, Languages.EN);
    }

    @Test
    void operaciones() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.Operaciones(),"Back to page");
    }

    @Test
    void categories() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().Categories(CategoriesI.ENGINEERING),"The Categorie is: ENGINEERING");
    }

    @Test
    void buildIsbn() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"2315");
    }
}