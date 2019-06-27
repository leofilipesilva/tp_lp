import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra06 {
    public void Regra06(Document doc, ArrayList<String> listaErros) {
//        <img...
//        Elementos da imagem devem ter atributos alt


        Elements imagens = doc.select("img");

//        for (Element link : imagens) {
//            System.out.println("SRC: " + link.attr("src"));
//            System.out.println("ALT: " + link.attr("alt"));
//        }

        int contimgalt = 0;

        for (Element link : imagens) {

            System.out.println("SRC: " + link.attr("src"));
            System.out.println("ALT: " + link.attr("alt"));
            if (link.attr("alt").isEmpty()) {
                contimgalt = +1;
            }

        }
        if (contimgalt > 0) {
            listaErros.add("FALHA Regra de acessibilidade 06 - Elementos da imagem devem ter atributos alt");
        }


    }
}
