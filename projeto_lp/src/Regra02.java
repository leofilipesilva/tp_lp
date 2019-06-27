import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra02 {
    public void Regra02(Document doc, ArrayList<String> listaErros) {

//            HTML lang
//            <html lang='en'></html>
//            Você deve declarar o idioma principal de uma página com o atributo html lang

        Elements idioma = doc.select("html[lang]");
        System.out.println("Idioma: " + idioma.attr("lang"));

        if (idioma.isEmpty()) {
            listaErros.add("FALHA Regra de acessibilidade 02 - Idioma Primário de uma Página deve ser declarado dentro do atributo <html lang='idioma'></html> ");
        } else {
            System.out.println("Regra de acessibilidade 02 - O idioma principal de uma página deve ser declarado no atributo html lang " +
                    " - não se aplica a esta página ");
        }
    }
}
