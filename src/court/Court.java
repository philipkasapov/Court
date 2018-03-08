package court;

import jurists.Jurist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Philip on 2/22/2018.
 */
public class Court {
    private String name;
    private HashSet<Jurist> jurists;
    public Court(String name, HashSet<Jurist> jurists){
        this.name = name;
        this.jurists = jurists;
    }

    public void showInfo(){
        ArrayList<Jurist> list = new ArrayList<>(jurists);

        Collections.sort(list, (j1, j2)->j1.getName().compareTo(j2.getName()));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " - " + list.get(i).getCases() + " cases.");
        }
    }

    @Override
    public String toString() {
        return "Court{" +
                "name='" + name + '\'' +
                '}';
    }
}
