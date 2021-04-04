package LinkedList.Exercise1;

import java.util.Objects;

public class Towns implements Comparable<Towns> {

    private String townName;
    private int distance;

    public Towns(String town, int distance) {
        this.townName = town;
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Towns towns = (Towns) o;
        return
                Objects.equals(townName, towns.townName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(townName, distance);
    }

    @Override
    public int compareTo(Towns o) {
        if(o.distance < this.distance) {
            return 1;
        } else if(o.distance == this.distance){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return  townName + " " + distance;
    }
}



