package ru.kpfu.itis.group11408.mirzojonov.graphs;


import java.util.Collection;

/**
 * Created by World on 18.04.2015.
 */
public interface Graph<T> {
    public void addVedge(Vedge<T> vedge);
    public boolean link(Vedge<T> v1, Vedge<T> v2);
    public boolean unlink(Vedge<T> v1, Vedge<T> v2);
    public void removeVedge(Vedge<T> vedge);
    public boolean hasLinked(Vedge<T> v1, Vedge<T> v2);
    public Collection<Vedge<T>> getLinkedVedges(Vedge<T> vedge);
}
