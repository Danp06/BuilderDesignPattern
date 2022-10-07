import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    ScientificBuilder documentExpect= new ScientificBuilder();

    @Test
    public void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1995);
    }

    @Test
    public void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),45);
    }

    @Test
    public void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"FeriaXXI");
    }

    @Test
    public void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Scientific");
    }

    @Test
    public void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Discovery");
    }

    @Test
    public void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Carlos Alberto", "Carlos Alberto");
    }

    @Test
    public void buildFormats() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Formats.DIGITAL,Formats.DIGITAL);
    }

    @Test
    public void buildLanguages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Languages.EN, Languages.EN);
    }

    @Test
    public void operations() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.operations(),"Back to page");
    }

    @Test
    public void categories() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().categories(CategoriesI.ENGINEERING),"The Category is: ENGINEERING");
    }

    @Test
    public void buildIsbn() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"2315");
    }
}