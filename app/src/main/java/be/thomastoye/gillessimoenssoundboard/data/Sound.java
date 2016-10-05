package be.thomastoye.gillessimoenssoundboard.data;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import be.thomastoye.gillessimoenssoundboard.R;

public class Sound {
    private String name;
    private int resourceId;

    public Sound(String name, int resourceId) {
        this.name = name;
        this.resourceId = resourceId;
    }

    public Sound() {
        // empty
    }

    public static List<Sound> values() {
        ArrayList<Sound> sounds = new ArrayList<>();

        sounds.add(new Sound("Bedankt", R.raw.bedankt));
        sounds.add(new Sound("Boire", R.raw.boire));
        sounds.add(new Sound("C'est noté", R.raw.cest_note));
        sounds.add(new Sound("Correct Nederlands", R.raw.correct_nederlands));
        sounds.add(new Sound("Daduurekgeirn", R.raw.daduurekgeirn));
        sounds.add(new Sound("Daggoeiendag", R.raw.daggoeindag));
        sounds.add(new Sound("Elaba", R.raw.elaba));
        sounds.add(new Sound("Formidabel", R.raw.formidabel_papaatse));
        sounds.add(new Sound("Frisse neus", R.raw.frisse_neus));
        sounds.add(new Sound("Khoopekikdatte", R.raw.khoopekikdatte));
        sounds.add(new Sound("Leerlingenraad", R.raw.leerlingenraad));
        sounds.add(new Sound("Madamadams", R.raw.madamadams));
        sounds.add(new Sound("Natuurlijk", R.raw.natuurlijk));
        sounds.add(new Sound("Oewest", R.raw.oewest));
        sounds.add(new Sound("Supertrots", R.raw.supertrots));
        sounds.add(new Sound("Sweet Caroline", R.raw.sweet_caroline));
        sounds.add(new Sound("Tistinnerlijkdatelt", R.raw.tistinnerlijkedatelt));
        sounds.add(new Sound("Tot volgende week", R.raw.tot_volgende_week));
        sounds.add(new Sound("Wandelen langs de weg", R.raw.wandelen_langs_de_weg));

        return sounds;
    }

    public String getName() {
        return name;
    }

    public int getResourceId() {
        return resourceId;
    }
}
