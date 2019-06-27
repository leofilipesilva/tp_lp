import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Regra03 {
    public void Regra03(Document doc, ArrayList<String> listaErros) {

//        Cabeçalhos
//        <body><p><h1>Heading 1</h1><h2>Heading 2</h2><p><h3>Heading 3</h3></p></body>
//        A página deve conter pelo menos um elemento h1
//        O elemento h1 deve ter texto não vazio
//        Elementos de título que seguem o elemento h1 devem ser aninhados corretamente
//        Todos os subtítulos (h2..h6) devem ter texto não vazio

        Elements cab1 = doc.select("h1");

        for (Element h1: cab1){
            System.out.println("H1: "+h1.text());
        }

        int countcab1 = cab1.size();
        System.out.println("QTD DE H1: " + countcab1);

        if (cab1.isEmpty()){
            listaErros.add("FALHA Regra de acessibilidade 03 - A página deve conter pelo menos um elemento h1 <h1>Heading 1</h1> ");
        }
        else {
            int conth1 = 0;
            for (Element h1: cab1){
                if (h1.hasText()) {
                    //System.out.println("H1: "+h1.text());
                } else {
                    conth1=+1;
                }
            }
            if (conth1>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h1 deve ter texto não vazio <h1>Heading 1</h1> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------
        Elements cab2 = doc.select("h2");

        for (Element link: cab2){
            System.out.println("H2: "+link.text());
        }
        if(cab2.isEmpty()) {
            System.out.println("Não temos H2");
        }
        else{
            int conth2 = 0;
            for (Element h2: cab2){
                if (h2.hasText()) {
                    //System.out.println("H2: "+h2.text());
                } else {
                    conth2=+1;
                }
            }
            if (conth2>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h2 deve ter texto não vazio <h2>Heading 2</h2> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------
        Elements cab3 = doc.select("h3");

        for (Element link: cab3){
            System.out.println("H3: "+link.text());
        }
        if(cab3.isEmpty()) {
            System.out.println("Não temos H3");
        }
        else{
            int conth3 = 0;
            for (Element h3: cab3){
                if (h3.hasText()) {
                    //System.out.println("H3: "+h3.text());
                } else {
                    conth3=+1;
                }
            }
            if (conth3>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h3 deve ter texto não vazio <h3>Heading 3</h3> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------
        Elements cab4 = doc.select("h4");

        for (Element link: cab4){
            System.out.println("H4: "+link.text());
        }
        if(cab4.isEmpty()) {
            System.out.println("Não temos H4");
        }
        else{
            int conth4 = 0;
            for (Element h4: cab4){
                if (h4.hasText()) {
                    //System.out.println("H4: "+h4.text());
                } else {
                    conth4=+1;
                }
            }
            if (conth4>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h4 deve ter texto não vazio <h4>Heading 4</h4> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------
        Elements cab5 = doc.select("h5");

        for (Element link: cab5){
            System.out.println("H5: "+link.text());
        }
        if(cab5.isEmpty()) {
            System.out.println("Não temos H5");
        }
        else{
            int conth5 = 0;
            for (Element h5: cab5){
                if (h5.hasText()) {
                    //System.out.println("H5: "+h5.text());
                } else {
                    conth5=+1;
                }
            }
            if (conth5>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h5 deve ter texto não vazio <h5>Heading 5</h5> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------
        Elements cab6 = doc.select("h6");

        for (Element link: cab6){
            System.out.println("H6: "+link.text());
        }
        if(cab6.isEmpty()) {
            System.out.println("Não temos H6");
        }
        else{
            int conth6 = 0;
            for (Element h6: cab6){
                if (h6.hasText()) {
                    //System.out.println("H6: "+h6.text());
                } else {
                    conth6=+1;
                }
            }
            if (conth6>0) {
                listaErros.add("FALHA Regra de acessibilidade 03 - O elemento h6 deve ter texto não vazio <h6>Heading 6</h6> ");
            }
        }
//--------------------------------------------------------------------------------------------------------------

    }
}
