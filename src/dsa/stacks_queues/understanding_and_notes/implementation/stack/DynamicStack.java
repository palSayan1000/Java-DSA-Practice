package dsa.stacks_queues.understanding_and_notes.implementation.stack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // it will call the custom stack
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {
        // this thing takes care of the data array being full
        if (this.isFull()) {
            // double the array size;
            int[] temp = new int[data.length * 2];

            // copy all the items in the new data;
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }

        // insert item
        // so here i know the data is not full
        return super.push(item);
    }
}
