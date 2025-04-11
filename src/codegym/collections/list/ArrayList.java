package codegym.collections.list;

public class ArrayList <G> implements List<G> {

    private G[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList(){
        array = (G[])new Object[10];
    }

    public void add(G data){
        if(array.length == size){  //NullPointerException
            increaseArrayCapacity();
        }
        array[size] = data;
        size++;
    }

    public G remove(int index){

        G value = array[index];

        for(int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }

        size--;

        return value;
    }

    public G get(int index){
        return array[index];
    }

    public void set(int index, G data){
        array[index] = data;
    }

    public int size(){
        return size;
    }

    @SuppressWarnings("unchecked")
    private void increaseArrayCapacity(){
        G []newArray = (G[])new Object[(int)(array.length * 1.5)]; //cast

        System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;
    }
}
