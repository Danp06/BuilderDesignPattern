public class Library {
    private DocumentBuilder documentBuilder;

    public void setDocumentBuilder(DocumentBuilder cc) {
        this.documentBuilder = cc;
    }

    public Document getDocument() {
        return documentBuilder.getDocument();
    }

    public void buildDocument() {
        documentBuilder.CreateNewDocument();
        documentBuilder.buildAuthors();
        documentBuilder.buildEdition();
        documentBuilder.buildFormats();
        documentBuilder.buildPages();
        documentBuilder.buildTitle();
        documentBuilder.buildEditorial();
        documentBuilder.buildIsbn();
        documentBuilder.buildLanguages();
        documentBuilder.buildYear();
    }
}
