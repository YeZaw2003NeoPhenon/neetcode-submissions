class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;
    
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        int lastEle = arr[size - 1];
        if(size > 0){
            size--;
        }
        return lastEle;
    }

    private void resize() {
        int[] new_arr = new int[capacity * 2];

        for(int i = 0; i < size; ++i){
            new_arr[i] = arr[i];
        }
        arr = new_arr;
        capacity *= 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
