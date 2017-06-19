package deltaDebug;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
    public static void main(String[] args) {
       // String url = "https://support.mozilla.org/";
        String url = "file:///E:/thesis/demo.html";
       // File htmlFile = new File("E:" + File.separator + "thesis"  + File.separator + "demo.html");
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            
            try {
            	//File htmlFile = new File(url);
            	//Desktop.getDesktop().browse(htmlFile.toURI());
                desktop.browse(new URI(url));
                
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}