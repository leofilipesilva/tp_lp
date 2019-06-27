import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            //String urlanalisar = JOptionPane.showInputDialog(null);

            System.out.println("VERIFICANDO ACESSIBILIDADE!");

            AplicarRegras teste01 = new AplicarRegras();

            Document doc = null;

            String fileName = "C://Users/ALCANCE/Desktop/projeto_lp/src/teste.html";

            //doc = Jsoup.connect(urlanalisar).get();

            //doc = Jsoup.connect("https://americanliterature.com/short-stories-for-children").get();
            doc = Jsoup.parse(new File(fileName), "utf-8");

            ArrayList<String> listaErros = new ArrayList<String>();

            teste01.AplicarRegras(doc, listaErros);

            for (String erro: listaErros) {
                System.out.println(erro);
            }

            String todoserros = "";

            for (String erro: listaErros) {
                todoserros = todoserros +"\n"+erro+"\n";
            }
            if (todoserros == ""){
                JOptionPane.showMessageDialog(null, "Não houve erros de acessibilidade ");
            } else {
                JOptionPane.showMessageDialog(null, todoserros);
            }
            // Exibe todo o conteúdo da string em uma só janela

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
