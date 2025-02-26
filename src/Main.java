//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // let's go

        // task 1: cat & dog carring papers
            // initiating variables
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            // print all of them
            System.out.println("        TASK 1 ");
            System.out.println("dog =  " + dog);
            System.out.println("cat =  " + cat);
            System.out.println("paper =  " + paper);
            System.out.println();
        // end task 1

        // task 2: cat & dog are growing
        // increment variables
        dog += 4;
        cat += 4;
        paper += 4;
        // print all of them
        System.out.println("        TASK 2 ");
        System.out.println("new dog =  " + dog);
        System.out.println("new cat =  " + cat);
        System.out.println("new paper =  " + paper);
        System.out.println();
        // end task 2

        // task 3: cat & dog reducing
        // decrement variables
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        // print all of them
        System.out.println("        TASK 3 ");
        System.out.println("finite dog =  " + dog);
        System.out.println("finite cat =  " + cat);
        System.out.println("finite paper =  " + paper);
        System.out.println();
        // end task 3

        // task 4: we will be friend
        System.out.println("        TASK 4 ");
        // some doing... lazy to write
        var friend = 19;
        System.out.println("friend =  " + friend);
        friend -= 2;
        System.out.println("less friend =  " + friend);
        friend /= 7;
        System.out.println("even less friend =  " + friend);
        System.out.println();
        // end task 4

        // task 5: crazy frog
        // some doing... lazy to write
        System.out.println("        TASK 5 ");
        var frog = 3.5;
        System.out.println("frog =  " + frog);
        frog *= 10;
        System.out.println("more frogs =  " + frog);
        frog /= 3.5;
        System.out.println("less frogs =  " + frog);
        frog += 4;
        System.out.println("some more frogs =  " + frog);
        System.out.println();
        // end task 5

        // task 6: let's get ready for the rumble
        System.out.println("        TASK 6 ");
        // initiating variable
        var boxMass_1 = 78.2;
        var boxMass_2 = 82.7;
        var netto = boxMass_1 + boxMass_2;
        var brutto = Math.abs(boxMass_1 - boxMass_2);
        // print all of them
        //System.out.println("Boxer 1 weight = " + boxMass_1 + " kg");
        //System.out.println("Boxer 2 weight = " + boxMass_2 + " kg");
        System.out.println("Common weight = " + netto + " kg");
        System.out.println("Difference in weights = " + brutto + " kg");
        System.out.println();
        // end task 6


        // task 7: Holyfiled ear
        System.out.println("        TASK 7 ");
        // initiating variable
        var pieceMass = boxMass_2 % boxMass_1;
        // print it
        System.out.println("Remainder = " + pieceMass + " kg");
        System.out.println();
        // end task 7


        // task 8: office galley
        System.out.println("        TASK 8 ");
        // initiating variable
        var curTimeFund = 640;
        var oneSlaveTime = 8;
        var numSlave = curTimeFund / oneSlaveTime;
        var moreSlave = 94;
        var desSlave = numSlave + moreSlave;
        var newTimeFund = desSlave * oneSlaveTime;
        // print all of them
        System.out.println("Всего работников в компании - " + numSlave + " человек");
        System.out.println("Если в компании работает " + desSlave + " человек,");
        System.out.println("то всего " + newTimeFund + " часов работы может быть поделено между сотрудниками");
        System.out.println();
        // end task 8


        //System.out.println("/done ");
    }
}