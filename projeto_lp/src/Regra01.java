import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra01 {
    public void Regra01(Document doc, ArrayList<String> listaErros) {
//             Título  <title></title>
//             O elemento do título da página não deve estar vazio ou ausente
//             Não deve haver mais de um título de página

        Elements titles = doc.select("title");

        int count = titles.size();
        System.out.println("QTD DE TÍTULOS: " + count);

        for (Element title : titles) {
            System.out.println("Título: " + title);
        }

        if (titles.isEmpty()){
            listaErros.add("FALHA Regra de acessibilidade 01 - Título da página está faltando para a página da Web ");

        }
        else {
            if (count > 1) {
                listaErros.add("FALHA Regra de acessibilidade 01 - Mais de um Título de Página encontrado ");
            }
        }

    }
}
