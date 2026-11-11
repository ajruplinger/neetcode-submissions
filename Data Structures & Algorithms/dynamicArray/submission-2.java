class DynamicArray {
    private int[] numbers;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.numbers = new int[capacity];
    }

    public int get(int i) {
        return numbers[i];
    }

    public void set(int i, int n) {
        numbers[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        numbers[size] = n;
        size ++;
    }

    public int popback() {
        size--;
        return get(size);
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = numbers[i];
        }
        numbers = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
