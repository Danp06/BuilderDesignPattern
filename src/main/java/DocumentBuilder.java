public abstract class DocumentBuilder {
    protected Document document;
    protected Formats[] formats;

    public void CreateNewDocument(){
        document = new Document(formats);
    }

    @Override
    public String toString() {
        return "DocumentBuilder{" +
                "document=" + document +
                '}';
    }

    public Document getDocument(){
        return document;
    }

    public abstract void buildYear();
    public abstract void buildPages();
    public abstract void buildEdition();
    public abstract void buildEditorial();
    public abstract void buildIsbn();
    public abstract void buildTitle();
    public abstract void buildAuthors();
    public abstract void buildFormats();
    public abstract void buildLanguages();
}
