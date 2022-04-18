package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;          //Turtle je třída objektů- je to nadefinované, co může dělat, a jméno želvy jsou ty objekty, které jsem si vyvolala

        zofka = new Turtle();


        nakresliPrasatko(zofka);



    }

    private void nakresliPrasatko(Turtle zelva) {
        //tělo
        zelva.move(100);
        zelva.turnLeft(90);
        zelva.move(170);
        zelva.turnLeft(90);
        zelva.move(100);
        zelva.turnLeft(90);
        zelva.move(170);
        //zadní nohy
        zelva.turnRight(60);
        zelva.move(50);
        zelva.penUp();
        zelva.turnLeft(180);
        zelva.move(50);
        zelva.penDown();
        zelva.turnLeft(120);
        zelva.move(50);
        zelva.turnRight(180);
        zelva.move(50);
        //přesun na přední nohy
        zelva.turnLeft(120);
        zelva.move(170);
        //přední nohy
        zelva.turnLeft(60);
        zelva.move(50);
        zelva.penUp();
        zelva.turnRight(180);
        zelva.move(50);
        zelva.penDown();
        zelva.turnRight(120);
        zelva.move(50);
        zelva.turnLeft(180);
        zelva.move(50);
        //hlavička
        zelva.turnLeft(30);
        zelva.move(100);
        zelva.turnRight(120);
        zelva.move(100);
    }


}
