import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra07 {
    public void Regra07(Document doc, ArrayList<String> listaErros) {
//        Conteúdo intermitente
//        Os elementos de piscada e letreiro não devem ser usados. Texto intermitente e em movimento são problemas de acessibilidade para pessoas com epilepsia fotossensitiva e deficiências visuais.

        Elements cintermitentes = doc.select("area[alt]");

        for (Element cintermitente: cintermitentes){
            System.out.println("blink: "+cintermitente.text());

        }

        Elements marquees = doc.select("marquee");

        for (Element marquee: marquees){
            System.out.println("blink: "+marquee.text());

        }

    }
}
