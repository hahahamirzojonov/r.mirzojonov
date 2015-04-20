package ru.kpfu.itis.group11408.mirzojonov.graphs;

import java.util.*;

/**
 * Created by World on 21.04.2015.
 */
public class MyGraph<T> implements Graph<T> {
    private Map<Vedge<T>, List<Vedge<T>>> vedges;
    public MyGraph(){
        vedges = new HashMap<>();
    }

    @Override
    public void addVedge(Vedge<T> vedge) {
        if(!vedges.containsKey(vedge))
            vedges.put(vedge, new ArrayList<Vedge<T>>());
    }

    @Override
    public boolean link(Vedge<T> v1, Vedge<T> v2) {
        if(vedges.containsKey(v1) && vedges.containsKey(v2)){
            vedges.get(v1).add(v2);
            vedges.get(v2).add(v1);
            return true;
        }
        return false;
    }

    @Override
    public boolean unlink(Vedge<T> v1, Vedge<T> v2) {
        if(vedges.containsKey(v1) && vedges.containsKey(v2)) {
            vedges.get(v1).remove(v2);
            vedges.get(v2).remove(v1);
            return true;
        }
        return false;
    }

    @Override
    public void removeVedge(Vedge<T> vedge) {
        vedges.remove(vedge);
    }

    @Override
    public boolean hasLinked(Vedge<T> v1, Vedge<T> v2) {
        if(vedges.containsKey(v1) && vedges.containsKey(v2)){
            return (vedges.get(v1).contains(v2) && vedges.get(v2).contains(v1));
        }
        return false;
    }

    @Override
    public Collection<Vedge<T>> getLinkedVedges(Vedge<T> vedge) {
        if(vedges.containsKey(vedge))
            return vedges.get(vedge);
        return null;
    }
}
