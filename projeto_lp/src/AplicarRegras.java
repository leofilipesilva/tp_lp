import org.jsoup.nodes.Document;

import java.util.ArrayList;

public class AplicarRegras {
    private Regra01 regra01;
    private Regra02 regra02;
    private Regra03 regra03;
    private Regra04 regra04;
    private Regra05 regra05;
    private Regra06 regra06;
    private Regra07 regra07;
    private Regra08 regra08;
    private Regra09 regra09;
    private Regra10 regra10;

    private Regra14 regra14;



    public AplicarRegras() {
        this.regra01 = new Regra01();
        this.regra02 = new Regra02();
        this.regra03 = new Regra03();
        this.regra04 = new Regra04();
        this.regra05 = new Regra05();
        this.regra06 = new Regra06();
        this.regra07 = new Regra07();
        this.regra08 = new Regra08();
        this.regra09 = new Regra09();
        this.regra10 = new Regra10();



        this.regra14 = new Regra14();

    }

    public void AplicarRegras(Document doc, ArrayList<String> listaErros) {
        System.out.println("REGRA 01==========================================================");
        regra01.Regra01(doc, listaErros);

        System.out.println("REGRA 02==========================================================");
        regra02.Regra02(doc, listaErros);

        System.out.println("REGRA 03==========================================================");
        regra03.Regra03(doc, listaErros);

        System.out.println("REGRA 04==========================================================");
        regra04.Regra04(doc, listaErros);

        System.out.println("REGRA 05==========================================================");
        regra05.Regra05(doc, listaErros);

        System.out.println("REGRA 06==========================================================");
        regra06.Regra06(doc, listaErros);

        System.out.println("REGRA 07==========================================================");
        regra07.Regra07(doc, listaErros);

        System.out.println("REGRA 08==========================================================");
        regra08.Regra08(doc, listaErros);

        System.out.println("REGRA 09==========================================================");
        regra09.Regra09(doc, listaErros);

        System.out.println("REGRA 10==========================================================");
        regra10.Regra10(doc, listaErros);

        System.out.println("REGRA 14==========================================================");
        regra14.Regra14(doc, listaErros);


    }
}
