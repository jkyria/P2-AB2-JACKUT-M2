package br.ufal.ic.p2.jackut;

import easyaccept.EasyAccept;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        try {
            // Configura encoding ISO-8859-1 para compatibilidade com os testes
            System.setOut(new PrintStream(System.out, true, "ISO-8859-1"));
            System.setErr(new PrintStream(System.err, true, "ISO-8859-1"));

            String basePath = "P2-2023.1-JACKUT/tests/";

            // Testes das user stories 1 a 9
            for (int i = 1; i <= 9; i++) {
                // Verifica se existe o primeiro arquivo de teste (usX_1.txt)
                String testFile1 = basePath + "us" + i + "_1.txt";
                if (new java.io.File(testFile1).exists()) {
                    String[] args1 = {
                            "br.ufal.ic.p2.jackut.models.Facade",
                            testFile1
                    };
                    EasyAccept.main(args1);
                }

                // Verifica se existe o segundo arquivo de teste (usX_2.txt)
                String testFile2 = basePath + "us" + i + "_2.txt";
                if (new java.io.File(testFile2).exists()) {
                    String[] args2 = {
                            "br.ufal.ic.p2.jackut.models.Facade",
                            testFile2
                    };
                    EasyAccept.main(args2);
                }
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}