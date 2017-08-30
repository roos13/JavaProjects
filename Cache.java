import org.omg.CORBA.*;
import org.omg.CORBA.Object;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by Rustam Borzov on 6/23/2017.
 */
public class Cache<K, V> extends LinkedHashMap<K, V> {

    private int hitCount;
    private int missCount;
    private int currentSize;

    public Cache(int capacity) {
        super(capacity);
        currentSize = 0;
        hitCount = 0;
        missCount = 0;

    }


    public V put(K key, V value) {
        if (currentSize == super.size()) {
            K lastElement = null;
            while (super.keySet().iterator().hasNext()) {
                lastElement = super.keySet().iterator().next();
            }
            super.remove(lastElement);
        }
        V result = super.put(key, value);
        return result;
    }


    public V get(Object key) {
        V value = super.get(key);
        if (value != null) {
            super.remove(key);
            put((K) key, value); //
            hitCount++;
        } else {
            missCount++;
        }
        return value;
    }

    @Override
    public void clear() {
        try {
            super.clear();
        } catch (Exception e) {
            throw e;
        }
    }

    public double getHitRatio() {
        double hitRatio = ((double) hitCount / (hitCount + missCount));
        return hitRatio;
    }

    //Just to test it
    /*
    public static void main(String[] args) {
        Cache myCache = new Cache(10);
        myCache.put(1, 25);
        myCache.put(2, 20);
        System.out.println(myCache.get(1));
        System.out.println(myCache.get(2));
        myCache.clear();
        System.out.println(myCache.get(1));
    }
    */
}