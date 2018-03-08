package demo;

import citizens.*;
import court.Case;
import court.Court;
import jurists.*;

import java.util.HashSet;

/**
 * Created by Philip on 2/22/2018.
 */
public class Test {

    public static void main(String[] args) {


        Jurist j = new Judge("Judge 1", 12, 13);
        Jurist jj = new Judge("Judge 2", 11, 15);
        Jurist jjj = new Judge("Judge 3", 16, 18);

        Jurist j10 = new Juryman("Juryman 1", 14, 15);
        Jurist j11 = new Juryman("Juryman 2", 14, 15);
        Jurist j12 = new Juryman("Juryman 3", 14, 15);
        Jurist j13 = new Juryman("Juryman 4", 14, 15);
        Jurist j14 = new Juryman("Juryman 5", 14, 15);
        Jurist j15 = new Juryman("Juryman 6", 14, 15);
        Jurist j16 = new Juryman("Juryman 7", 14, 15);


        Jurist j20 = new Lawyer("Lawyer 1", 16, 17);
        Jurist j21 = new Lawyer("Lawyer 2", 16, 17);
        Jurist j22 = new Lawyer("Lawyer 3", 16, 17);
        Jurist j23 = new Lawyer("Lawyer 4", 16, 17);
        Jurist j24 = new Lawyer("Lawyer 5", 16, 17);

        Jurist j30 = new Prosecutor("Prosecutor 1", 13, 81);
        Jurist j31 = new Prosecutor("Prosecutor 2", 13, 81);


        HashSet<Jurist> jurists = new HashSet<>();
        jurists.add(j);
//        jurists.add(jj);
//        jurists.add(jjj);
        jurists.add(j10);
//        jurists.add(j11);
//        jurists.add(j12);
//        jurists.add(j13);
//        jurists.add(j14);
//        jurists.add(j15);
//        jurists.add(j16);
//        jurists.add(j20);
        jurists.add(j21);
//        jurists.add(j22);
//        jurists.add(j23);
//        jurists.add(j24);
//        jurists.add(j30);
//        jurists.add(j31);




        Court c = new Court("VELIKO TARNOVO", jurists);

        AccusingCitizen citizen0 = new AccuserCitizen("ACCUSING1", "ADDRESS", 1);
        AccusingCitizen citizen1 = new AccuserCitizen("ACCUSING2", "ADDRESS", 2);
        AccusingCitizen citizen2 = new AccuserCitizen("ACCUSING3", "ADDRESS", 3);
        AccusingCitizen citizen3 = new AccuserCitizen("ACCUSING4", "ADDRESS", 4);
        AccusingCitizen citizen4 = new AccuserCitizen("ACCUSING5", "ADDRESS", 5);

        AccusingCitizen citizen5 = new AccusedCitizen("accused1", "address", 2);
        AccusingCitizen citizen6 = new AccusedCitizen("accused2", "address", 2);
        AccusingCitizen citizen7 = new AccusedCitizen("accused3", "address", 2);
        AccusingCitizen citizen8 = new AccusedCitizen("accused4", "address", 2);
        AccusingCitizen citizen9 = new AccusedCitizen("accused5", "address", 2);

        Witness witness= new Witness("WITNESS1", "aADreRess", 3);
        Witness witness1= new Witness("WITNESS2", "aADreRess", 3);
        Witness witness2= new Witness("WITNESS3", "aADreRess", 3);
        Witness witness3= new Witness("WITNESS4", "aADreRess", 3);
        Witness witness4= new Witness("WITNESS5", "aADreRess", 3);
        Witness witness5= new Witness("WITNESS6", "aADreRess", 3);
        Witness witness7= new Witness("WITNESS7", "aADreRess", 3);
        Witness witness6= new Witness("WITNESS8", "aADreRess", 3);
        Witness witness8= new Witness("WITNESS9", "aADreRess", 3);
        Witness witness9= new Witness("WITNESS10", "aADreRess", 3);

        HashSet<Witness> witnesses = new HashSet<>();
        witnesses.add(witness);
        witnesses.add(witness1);
        witnesses.add(witness2);
        witnesses.add(witness3);
        witnesses.add(witness4);
        witnesses.add(witness5);
        witnesses.add(witness6);
        witnesses.add(witness7);
        witnesses.add(witness8);
        witnesses.add(witness9);

        c.showInfo();

        Case case1 = new Case(Case.Type.CIVIL, (Judge)j, jurists, (AccusedCitizen)citizen5, witnesses);

        case1.perform();
        c.showInfo();



    }
}
