public abstract class Animal implements Countable {
    protected int count;

    public Animal() {
        count = 0;
    }

    // implement the countable interface
    @Override
    public String getCountString() {
        return count + " ";
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

}

