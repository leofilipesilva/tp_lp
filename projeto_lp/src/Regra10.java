import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra10 {
    public void Regra10(Document doc, ArrayList<String> listaErros) {
//        Área
//        <area shape='rect' coords='0,0,82,126' href='sun.htm' alt='Sun'>
//        Elementos da área devem ter um atributo alt
//        O atributo alt do elemento de área não pode estar vazio

        Elements areas = doc.select("area");

        int contintgalt = 0;

        for (Element area : areas) {
            System.out.println("HiperLink: " + area.attr("href"));
            System.out.println("ALT: " + area.attr("alt"));
            if (area.attr("alt").isEmpty()) {
                contintgalt = +1;
            }

        }
        if (contintgalt > 0) {
            listaErros.add("FALHA Regra de acessibilidade 10 - Elementos da área devem ter um atributo alt");
        }

    }
}
