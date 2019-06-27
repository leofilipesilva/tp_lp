import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra08 {
    public void Regra08(Document doc, ArrayList<String> listaErros) {

//        Formulários
//        <form><textarea id='area' rows='3' cols='3'></textarea><label for='area'/></form>
//        Cada elemento do formulário deve ter um rótulo correspondente (o atributo 'rótulo' deve corresponder ao atributo 'id' do campo de formulário)
//        <form><input id='in' type='text' value="input_value"/></form>
//        Os elementos de entrada de formulário do tipo submit | reset | button não devem ter rótulos, em vez disso, têm um atributo 'value' não vazio
//        <label for="label1">Label 1</label><label for="label2">Label 2</label>
//        Rótulos para controles de formulário devem ter texto não vazio
//        <legend>Legend 1</legend>
//        Legendas especificadas para conjuntos de campos ou de outra forma devem ter texto não vazio
//        <button type="button">Button 1</button>
//         Botões devem ter texto não vazio

        Elements forms = doc.select("form");

        for (Element form: forms){
            System.out.println("LABEL: "+form.attr("label"));
            System.out.println("ALT: "+form.attr("alt"));

        }

    }
}
