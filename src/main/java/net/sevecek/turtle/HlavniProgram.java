package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;          //Turtle je třída objektů- je to nadefinované, co může dělat, a jméno želvy jsou ty objekty, které jsem si vyvolala

        zofka = new Turtle();
        zofka.setSpeed(200);
        //přesun žofky dolů, aby se vešli obrázky  teď se kreslí prasátko
        zofka.penUp();

        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

          nakresliPrasatko(zofka);

        //přesun nahoru na sluníčko a kolečko
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(300);
        zofka.penDown();

        //kreslení kolečka
        //nakresliKolecko(zofka);

         nakresliSlunicko(zofka);

         //přesun na domečky
         zofka.penUp();
         zofka.turnLeft(180);
         zofka.move(200);
         zofka.turnRight(90);
         zofka.move(300);
         zofka.penDown();

         //kreslení domečků






        // nakresliOsmisten(zofka);                 //vyvolám metodu a během toho ji píši    je v poznámce, protože není na finálním obrázku

    }

    private void nakresliPrasatko(Turtle zelva) {
        //tělo
        zelva.move(60);
        zelva.turnLeft(90);
        zelva.move(100);
        zelva.turnLeft(90);
        zelva.move(60);
        zelva.turnLeft(90);
        zelva.move(100);
        //zadní nohy
        zelva.turnRight(60);
        zelva.move(30);
        zelva.penUp();
        zelva.turnLeft(180);
        zelva.move(30);
        zelva.penDown();
        zelva.turnLeft(120);
        zelva.move(30);
        zelva.turnRight(180);
        zelva.move(30);
        //přesun na přední nohy
        zelva.turnLeft(120);
        zelva.move(100);
        //přední nohy
        zelva.turnLeft(60);
        zelva.move(30);
        zelva.penUp();
        zelva.turnRight(180);
        zelva.move(30);
        zelva.penDown();
        zelva.turnRight(120);
        zelva.move(30);
        zelva.turnLeft(180);
        zelva.move(30);
        //hlavička
        zelva.turnLeft(30);
        zelva.move(60);
        zelva.turnRight(120);
        zelva.move(60);
    }

    private void nakresliOsmisten(Turtle zelva){                 //vytvoření metody napsáním, nikoliv refatkorováním jako bylo výše
        /* vytvožení metody osmistěn pomocí opakovacích pokynů - spousta řádků, zbytečné
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);
        zelva.move(45);
        zelva.turnRight(45);    */

        for (int i = 0; i < 8; i++) {         //vyvoláním fori - nadefinováním i - 8 je proto, že máme programátorskou jedničku
            zelva.move(45);
            zelva.turnRight(45);
        }




    }
    private void nakresliKolecko(Turtle zelva) {
        for (int i = 0; i < 20; i++) {
            zelva.turnRight(20);
            zelva.move(10);

        }
    }

    private void nakresliSlunicko(Turtle zelva) {
        for (int i = 0; i < 24; i++) {
            // okraj
            zelva.turnRight(15);
            zelva.move(10);
            // paprsek

        }
            for (int j = 0; j < 24; j++) {
                zelva.turnRight(15);
                zelva.move(10);

                zelva.turnLeft(90);
                zelva.move(30);
                zelva.turnLeft(180);
                zelva.move(30);
                zelva.turnLeft(90);

                if (zelva.isPenDrawing()) {          //střídání cyklů, aby se ob jeden paprsek nenakreslil a vznilko jich 12 a ne stejně jako je dílců kolečka
                    zelva.penUp();
                } else {
                    zelva.penDown();
                }
            }
        }

    }
