import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra14 {
    public void Regra14(Document doc, ArrayList<String> listaErros) {
//             Título  <title></title>
//             O elemento do título da página não deve estar vazio ou ausente
//             Não deve haver mais de um título de página

        listaErros.add(" passou regra 1 ");
        listaErros.add(" passou regra 2 ");

        Elements titles = doc.select("title");

        int count = titles.size();
        System.out.println("TAMANHO" + count);

        for (Element title : titles) {

            System.out.println("Título: " + title);

            if (title != null) {
                System.out.println("Título: " + title);

                if (count > 1) {
                    System.out.println(count);
                    //listaErros.add(" FAILURE Accessbility Rule 5 - More than one Page Title found - ");
                    //System.out.println(" FAILURE Accessbility Rule 5 - More than one Page Title found - ");
                }

            } else {
                System.out.println(" Regra de acessibilidade 02 - O idioma principal de uma página deve ser declarado no atributo html lang " +
                        " - não se aplica a esta página ");
            }
        }
    }

}
