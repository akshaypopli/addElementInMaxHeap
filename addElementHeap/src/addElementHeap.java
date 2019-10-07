import java.util.ArrayList;

public class addElementHeap {

    public static ArrayList<Integer> addElement(ArrayList<Integer> heap, int value){

        heap.add(value);
        int i = heap.size();
        while(i != 1){
            int compare = heap.get((int) Math.floor(i/2)-1);
            if(compare <  value){
                int temp;
                temp = compare;
                heap.set((int) Math.floor(i/2)-1, value);
                heap.set(i-1, temp);
            }
            i = (int) Math.floor(i/2);
        }
        return heap;
    }

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(70); //1
        heap.add(65); //2
        heap.add(55); //3
        heap.add(50); //4
        heap.add(27); //5
        heap.add(26); //6
        heap.add(42); //7
        heap.add(35); //8
        heap.add(12); //9
        heap.add(19); //10
        //80   //11  // 80 is the new integer which is going to add at right index

        addElement(heap, 80);
        for(int number: heap){
            System.out.print(number + ",");
        }

        addElement(heap, 75);
        System.out.println("\n");
        for(int number: heap){
            System.out.print(number + ",");
        }
    }
}
