import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra09 {
    public void Regra09(Document doc, ArrayList<String> listaErros) {

//        Tabelas
//        <table summary="summary"><th>Table Heading</th><tr><td>Data 1</td></tr></table>
//        Tabela deve ter um cabeçalho de tabela
//        Tabela deve ter um atributo de resumo não vazio
//        Os cabeçalhos de tabela devem ter um atributo de escopo não vazio, especificando se é para uma linha ou coluna

        Elements tabelas = doc.select("table");

        int contth=0;

        for (Element tabela : tabelas) {
//            System.out.println("TABLE: "+tabela);
            System.out.println("TABLE: " + tabela.text());
            System.out.println("TH: " + tabela.select("th").text());
            System.out.println("TD: " + tabela.select("td").text());

            if (tabela.select("th").text().isEmpty()) {
                contth = +1;
            }
        }
        //verificar se tabela existe e depois jogar nestes ifs
        if (tabelas.isEmpty()){
            System.out.println("Regra de acessibilidade 09 - A página analisada não possui uma Tabela para ser analisada " +
                    " - Regra 09 não se aplica a esta página ");
        } else {
            if (contth == 0) {
                //listaErros.add("FALHA Regra de acessibilidade 09 - Tabela deve ter um cabeçalho de tabela");
            } else if (contth > 0) {
                listaErros.add("FALHA Regra de acessibilidade 09 - Os cabeçalhos de tabela devem ter um atributo de escopo não vazio");
            }
        }
    }

}
