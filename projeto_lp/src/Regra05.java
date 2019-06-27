import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra05 {
    public void Regra05(Document doc, ArrayList<String> listaErros) {
//        Imagens
//        <input type='image'...
//        Elementos de entradas de imagem devem ter atributos alt
//        Elementos de entradas de imagem não devem ter atributos alt vazios

        Elements inputimagens = doc.select("input");

        int continputalt =0;

        for (Element link : inputimagens) {
            if (link.attr("type").equals("image")) {
                System.out.println("SRC: " + link.attr("src"));
                System.out.println("ALT: " + link.attr("alt"));
                if(link.attr("alt").isEmpty()){
                    continputalt=+1;
                }
            }
        }
        if (continputalt>0){
            listaErros.add("FALHA Regra de acessibilidade 05 - Elementos de entradas de imagem devem ter atributos alt");
        }
    }
}
