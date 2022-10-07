import java.util.Scanner;

public class Client {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        DocumentBuilder document = null;

        System.out.println("TYPES OF DOCUMENTS\n1.Book\n2.Magazine\n3.Thesis\n4.Scientific\n" +
                "Select the type of document you want to build:");
        int type = sc.nextInt();

        switch (type){
            case 1: document = new BookBuilder();
            break;
            case 2: document = new MagazineBuilder();
            break;
            case 3: document = new ThesisBuilder();
            break;
            case 4: document = new ScientificBuilder();
            break;
            default:break;
        }

        library.setDocumentBuilder(document);
        library.buildDocument();
        System.out.println(library.getDocument());
        System.out.println(library.getDocument().categories(CategoriesI.CIVIL_LAW));
    }
}
