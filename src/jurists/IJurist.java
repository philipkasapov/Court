package jurists;

import citizens.Citizen;

/**
 * Created by Philip on 2/22/2018.
 */
public interface IJurist {
    void askQuestion(Citizen c);
    void takeNotes(Citizen c);
}
