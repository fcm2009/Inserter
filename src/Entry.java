import java.io.Serializable;

/**
 * Created by Mohammed Alshehry on 12/23/14.
 */
public class Entry<T extends Comparable<T>> implements Comparable, Serializable {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object obj) {
        if(obj != null) {
            if(obj instanceof Entry) {
                Entry<T> entry = (Entry<T>) obj;
                return this.value.compareTo(entry.getValue());
            }
            else
                throw new ClassCastException();
        }
        else
            throw new NullPointerException();
    }

    @Override
    public boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }

    @Override
    public String toString() {
        return value.toString();
    }
    
}
