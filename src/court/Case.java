package court;

import citizens.*;
import jurists.Judge;
import jurists.Jurist;
import jurists.Juryman;
import jurists.Lawyer;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Philip on 2/22/2018.
 */
public class Case {

    public static final int LAWYER_QUESTIONS = 3;
    public static final int PROSECUTOR_QUESTIONS = 5;

    public enum Type{ CIVIL, CRIMINAL};
    private Type type;
    private Judge j;
    private HashSet<Jurist> jurists;
    private AccusingCitizen accused;
    private String accuser;
    private HashSet<Witness> witnesses;

    public Case(Type type, Judge j, HashSet<Jurist> jurists, AccusedCitizen accused,  HashSet<Witness> witnesses) {
        this.type = type;
        this.j = j;
        validateJurymen(jurists);
        this.accused = accused;

        this.witnesses = witnesses;
    }

    public void validateJurymen(HashSet<Jurist> jurists){
        if(this.type == Type.CIVIL){
            if(jurists.size() == 3){
                this.jurists = jurists;

            }
            else {
                System.out.println("INVALID NUMBER FOR JURYMEN FOR A CIVIL CASE.");
            }
        }
        else if(this.type == Type.CRIMINAL){
            if(jurists.size() == 13){
                this.jurists = jurists;

            }
            else {
                System.out.println("INVALID NUMBER FOR JURYMEN FOR A CRIMINAL CASE.");
            }
        }
    }
    public void setAccuser(){
        if(this.type == Type.CIVIL){
            this.accuser = "CITIZEN";
        }
        else if(this.type == Type.CRIMINAL){
            this.accuser = "PROSECUTOR";
        }
    }

    public void perform(){
        //increment all jurists cases with one
        for(Jurist j: jurists){
            j.setCases(j.getCases()+1);
        }

        //asking questions
        if(this.type == Type.CIVIL) {
            for (Jurist j : jurists) {
                if (j.isLawyer()) {
                    for (int i = 0; i < LAWYER_QUESTIONS; i++) {
                        j.askQuestion(accused);

                    }
                    for (Witness w : witnesses) {
                        for (int i = 0; i < 2; i++) {
                            j.askQuestion(w);
                        }

                    }

                }
            }
        }
        else if(this.type == Type.CRIMINAL){
            for(Jurist j: jurists){
                if(j.isProsecutor()){
                    for (int i = 0; i < PROSECUTOR_QUESTIONS; i++) {
                        j.askQuestion(accused);
                    }
                    for(Witness w: witnesses){
                        j.askQuestion(w);
                        //lawyer of the accused asking questions
                        for(Lawyer l: accused.getLawyers()){
                            l.askQuestion(w);
                        }
                    }
                }
            }

        }

        //juryman prosecutions
        boolean guilty = false;
        for(Jurist j: jurists){
            if(j.isJuryman()) {
                int chance = new Random().nextInt(100) + 1;
                if (chance < 50) {
                    System.out.println("GUILTY");
                    guilty = true;
                } else {
                    System.out.println("NOT GUILTY");
                    guilty = false;
                }
            }
        }
        //JUDGE ACTIVITY
        if(guilty){
            System.out.println("CONVICTED TO "+ (new Random().nextInt(37)+3)+" YEARS OF PRISON.");
        }

    }

}
