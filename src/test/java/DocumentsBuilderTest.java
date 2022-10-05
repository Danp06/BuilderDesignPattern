import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentsBuilderTest {

    @Test
    void setAnno() {
        System.out.println("setYear");
        int Year = 100;
        ConstructBook instance = new ConstructBook();
        instance.setAnno(Year);
        assertEquals(100, Year);
    }
}