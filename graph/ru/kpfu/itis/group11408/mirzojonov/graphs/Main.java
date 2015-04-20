package ru.kpfu.itis.group11408.mirzojonov.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by World on 18.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        MyGraph<String> myGraph = new MyGraph<>();
        List<Vedge<String>> vedges = new ArrayList<Vedge<String>>(){{
            add(new Vedge<>("Hello"));
            add(new Vedge<>("World"));
            add(new Vedge<>("From"));
            add(new Vedge<>("ITIS"));
        }};

        myGraph.addVedge(vedges.get(0));
        myGraph.addVedge(vedges.get(1));
        myGraph.addVedge(vedges.get(2));
        myGraph.addVedge(vedges.get(3));
        myGraph.link(vedges.get(0), vedges.get(1));

        System.out.println("Vedge0 is linked to Vedge1? :" + myGraph.hasLinked(vedges.get(0), vedges.get(1)));
        System.out.println("Vedge2 is linked to Vedge3? :" + myGraph.hasLinked(vedges.get(2), vedges.get(3)));
        myGraph.unlink(vedges.get(0), vedges.get(1));
        System.out.println("Vedge0 and Vedge1 unlinked!");
        System.out.println("Vedge1 is linked to Vedge2? :" + myGraph.hasLinked(vedges.get(0), vedges.get(1)));
        myGraph.link(vedges.get(0), vedges.get(1));
        myGraph.removeVedge(vedges.get(0));

        System.out.println("Vedge0 was removed!");
        System.out.println("Vedge1 is linked to Vedge2? :" + myGraph.hasLinked(vedges.get(0), vedges.get(1)));
    }
}
