import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookBuilderTest {

    Library library = new Library();
    DocumentBuilder document = null;
    BookBuilder documentExpect= new BookBuilder();

    @Test
    public void buildYear() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(library.getDocument().getYear(),1999);
    }

    @Test
    public void buildPages() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getPages(),150);
    }

    @Test
    public void buildEdition() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEdition(),"4ta");
    }

    @Test
    public void buildEditorial() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getEditorial(),"Debolsillo");
    }

    @Test
    public void buildTitle() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.getDocument().getTitle(),"The little Prince");
    }

    @Test
    public void buildAuthors() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals("Antoine de Saint-Exupery", "Antoine de Saint-Exupery");
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
    public void operations() {
        document = documentExpect;
        library.setDocumentBuilder(document = documentExpect);
        library.buildDocument();
        assertEquals(documentExpect.operations(),"Turning the page");
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
        assertEquals(library.getDocument().getIsbn(),"1352");
    }
}