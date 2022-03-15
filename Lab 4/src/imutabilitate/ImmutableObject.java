package imutabilitate;

/**
 * To make a class immutable it must:
 * 1. be final
 * 2. fields private and final
 * 3. no setters
 * 4. getters should return clones of mutable fields
 * 5. constructor should store clones of mutable parameters
 * */

public final class ImmutableObject {

    private final int i;
    private final InnerObject innerObject;

    public ImmutableObject(int i, InnerObject innerObject) {
        this.i=i;
        this.innerObject = new InnerObject(innerObject.getSomeField()); // creates a new object with same value
    }

    public int getI() {
        return i;
    }

    public InnerObject getInnerObject() {
        return new InnerObject(innerObject.getSomeField()); // returns a clone
    }
}

class InnerObject {
    private int someField;

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }

    public InnerObject(int someField) {
        this.someField = someField;
    }
}
