/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Lezione04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String txt=concatenaCSV("Mario", "Andretti"); //passo alla funzione concatena due stringhe che vengono incatenate separate dal punto e vrigola
        //myout(concatenaCSV("Mario", "Andretti"));
        String sris="";
        int poscomma=0;
        int posstart=0;
        myout(txt.length());
          //posso passare più parametri per indexof
        //int poscomma=txt.indexOf(";",0);
        
        poscomma=txt.indexOf(";",posstart); //posso passare più parametri per indexof
        sris=txt.substring(posstart, poscomma);
        myout(sris);
      
        
        sris=txt.substring(0, poscomma);//trova la posizione del ;
        //sris=txt.substring(0, 5);//prende dalla prima fino alla 5
        myout(sris);
               
        float fbase = 2;
        int iesp = 3;
        //int ris=mypow(fbase, iesp);//chiama mypow e gli passa il valore di fabase e il valore di iesp, mypow fa quello per cui è previsto cioè elevazione di potenza
        //myout(String.valueOf(ris));     è uguale a quello subito sotto
        myout(mypow(fbase, iesp));


//array list permette di avere una lista che è più dinamico dell'array, che permette di aggiungere e togliere
        ArrayList<String> arlist= new ArrayList<String>();
        String sin="";
        sin=myin("chi sei");
        arlist.add(sin);
        sin=myin("chi sei");
        arlist.add(sin);
        sin=myin("chi sei");
        arlist.add(sin);
        sin=myin("chi sei");
        arlist.add(sin);
        
        
    }///fine main
public static String myin(String titolo){
    return JOptionPane.showInputDialog(titolo);
}
    
    /**
     * funzione per visualizzare un testo String in una finestra di dialogo
     *
     * @param msg parametro che deve contenere il testo da visualizzare
     */
    //lavora con una stringa
    public static void myout(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    //lavora con un intero

    public static void myout(int msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    /**
     * funzione per concatenare in csv due stringhe di testo separate da ;
     *
     * @param msg1 prima stringa
     * @param msg2 seconda stringa
     * @return ritorna una stringa di testo come somma delle due precedenti
     */
    public static String concatenaCSV(String msg1, String msg2) {
        //dichiarazione variabile di ritorno e inizializzazione stringa vuota
        String ris = "";
        //assegnazione alla variabile ris del valore di string1+string2
        ris = msg1 + ";" + msg2 + ";\n";
        //ritorno la stringa concatenata
        return ris;
    }

    public static int mypow(int base, int esponente) {

        int ris = 0;
        // nelle funzioni matematiche si usa il double per convenzione
        double dris = Math.pow(base, esponente);

        ris = (int) dris;

        return ris;

    }

    public static int mypow(float base, int esponente) {
        float ris = base;
        for (int i = 1; i < esponente; i++) {//i=1 altrimenti parte da 0 e poi il calolo viene aumentato per il doppio
            ris = ris * base;
        }
        return (int) ris;
    }

}
