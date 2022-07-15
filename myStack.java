
public class myStack<T> {

    private static final int INITIAL_LENGTH = 4;
    private Object[] array;
    private int currentLength;
    private int logicalLength;

    public myStack(){
        this(INITIAL_LENGTH);
    }
    public myStack(int initialLength){
        currentLength = 0;
        logicalLength = initialLength;
        array = new Object[logicalLength];
    }

    public void push(T obj){
        if(currentLength >= logicalLength){
            logicalLength *= 2;
            Object[] newArray = new Object[logicalLength];
            System.arraycopy(array, 0, newArray, 0, currentLength);
            array = newArray;
        }

        array[currentLength] = obj;
        currentLength++;
    }


    public T pop(){
        if(currentLength == 0)
            throw new RuntimeException("Stack is empty");
        T obj = (T) array[currentLength-1];
        currentLength--;
        return obj;
    }
    /*
        Time Complexity: O(1)
     */
    public T peek(){
        if(currentLength == 0)
            throw new RuntimeException("Stack is empty");
        T obj = (T) array[currentLength-1];
        return obj;
    }

    public int size(){
        return currentLength;
    }

    public boolean isEmpty(){
        return size() == 0;
    }
}