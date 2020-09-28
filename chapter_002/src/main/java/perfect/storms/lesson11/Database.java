package perfect.storms.lesson11;

public class Database<E, M, T> {

   private E[] e;
   private M[] m;
   private T[] t;

    public Database(E[] e, M[] m, T[] t) {
        this.e = e;
        this.m = m;
        this.t = t;
    }

    public E printE(int index) {
        if (index < this.e.length && index >= 0) {
            return this.e[index];
        }
        return null;
    }

    public M printM(int index) {
        if (index < this.m.length && index >= 0) {
            return this.m[index];
        }
        return null;
    }

    public T printT(int index) {
        if (index < this.t.length && index >= 0) {
            return this.t[index];
        }
        return null;
    }
}

/*
1. How do you understand why we use Generics? - This is the ability to set the type for the container.
2. What is wildcards? - Used to indicate an unknown type. Same as T extends Object.
3. Name the types of bounded wildcards and explain the difference between them. - extends - This container contains only a specific class and its descendants.
super - uses a specific class or classes that are its parent.
 */
