class LinkedList {
private ArrayList<Integer> array;

    public LinkedList() {
        this.array = new ArrayList<>();
    }

    public int get(int index) {
        if (index < 0 || index >= array.size()) {
            return -1;
        }

        return array.get(index);
    }

    public void insertHead(int val) {
        array.add(0, val);
    }

    public void insertTail(int val) {
        array.add(val);
    }

    public boolean remove(int index) {
        if(index < 0 || index >= array.size()){
            return false;
        }

        array.remove(index);
        return true;
    }

    public ArrayList<Integer> getValues() {
        return array;
    }
}
