import java.util.Scanner;

public class Client {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library director = new Library();

        DocumentBuilder constructor = null;

        System.out.println("Ingrese que quiere construir");
        String type = sc.nextLine();


        if(type.equals("Book"))

        {

            constructor = new BookBuilder();

        }

        else if(type.equals("Magazine"))

        {

            constructor = new MagazineBuilder();

        }

        else if(type.equals("Thesis"))

        {

            constructor = new ThesisBuilder();

        }

        else if(type.equals("Scientific"))

        {

            constructor = new ScientificBuilder();

        }

        director.setDocumentBuilder(constructor);

        director.buildDocument();

        Document producto = director.getDocument();
        System.out.println(producto);
    }
}
