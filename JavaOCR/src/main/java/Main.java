import net.sourceforge.tess4j.*;
import java.io.File;

public class Main {
    private static final String WORKING_DIRECTORY = "";

    public static void main(String[] args) {
        // ImageIO.scanForPlugins(); // for server environment
        File imageFile = new File(WORKING_DIRECTORY + "data\\test.tiff");
        ITesseract instance = new Tesseract(); // JNA Interface Mapping
        //ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath(WORKING_DIRECTORY + "data\\Tess4J-3.4.8-src\\tessdata"); // replace <parentPath> with path to parent directory of tessdata
        instance.setLanguage("eng");

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}