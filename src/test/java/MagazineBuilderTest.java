import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagazineBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    MagazineBuilder documentExpect= new MagazineBuilder();

    @Test
    public void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),2015);
    }

    @Test
    public void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),12);
    }

    @Test
    public void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"Sports");
    }

    @Test
    public void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Ford");
    }

    @Test
    public void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"Cars");
    }

    @Test
    public void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Alex Flores", "Alex Flores");
    }

    @Test
    public void buildFormats() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Formats.PRINTED,Formats.PRINTED);
    }

    @Test
    public void buildLanguages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(Languages.ES, Languages.ES);
    }

    @Test
    public void categories() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().categories(CategoriesI.ART),"The Category is: ART");
    }

    @Test
    public void buildIsbn() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getIsbn(),"12332");
    }
}