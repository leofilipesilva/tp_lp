import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Regra04 {
    public void Regra04(Document doc, ArrayList<String> listaErros) {

//            Hiperlinks
//            <body><a href="www.google.com">Go to Google</a></body>
//            Os hiperlinks sempre devem ter texto associado a eles
//            Não deve haver texto duplicado para hiperlinks na mesma página

        Elements links = doc.select("a[href]");

        int conttextlink = 0;

        for (Element link: links){
            System.out.println("HiperLink: "+link.attr("href"));
            System.out.println("Texto: "+link.text());

            if (link.text().isEmpty()){
                conttextlink=+1;
            }
        }

        if (conttextlink>0){
            listaErros.add("FALHA Regra de acessibilidade 04 - Os hiperlinks sempre devem ter texto associado a eles ");        }

        Map<String, Integer> contador = new HashMap<String, Integer>();
        for (Element link: links){
            if (!contador.containsKey(link.text())) {
                contador.put(link.text(), 0);
            }
            contador.put(link.text(), contador.get(link.text())+1);
        }

        int contreptext = 0;
        //Exibe os que tiverem mais de 1.
        for (Map.Entry<String, Integer> item : contador.entrySet()) {
            if (item.getValue() >= 2) {
                System.out.println("Item " + item.getKey() + " contém repetições");
                contreptext=+1;
            }
        }

        if (contreptext>0){
            listaErros.add("FALHA Regra de acessibilidade 04 - Não deve haver texto duplicado para hiperlinks na mesma página");
        }

//        System.out.println(conttextdup);
    }
}
