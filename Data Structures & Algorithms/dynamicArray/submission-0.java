class DynamicArray {

    int capacity;
    int[] arr;
    int size;
    public DynamicArray(int capacity) {
         arr=new int[capacity];
        this.capacity=capacity;
        size=0;
    }

    public int get(int i) {
        //assume i is alawys valid  as mentioned in PS
        return arr[i];
    }

    public void set(int i, int n) {
        // i is always valid  as mentioned in PS
        // was doign mistake set is not insert that we have to move the elements
        arr[i]=n;

    }

    public void pushback(int n) {
        if(size==capacity){
            resize();
        }
        // size will point to array index next to last filled index
        arr[size++]=n;
    }

    public int popback() {
            // assuming array is non empty as mentioned in problem statement 
            // size -1 last filled element
            int temp=arr[size-1];
            arr[size-1]=0;
            size--;
            return temp;
    }

    private void resize() {
       int newCapacity=2 * capacity;
        int[] temp=new int[newCapacity];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        capacity=newCapacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
