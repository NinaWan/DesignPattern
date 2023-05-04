package GoF.behavioral.iterator.src;

public class Client {
    private Aggregate<Integer> nums;
    private Aggregate<String> strs;

    public Client(Aggregate<Integer> nums, Aggregate<String> strs) {
        this.nums = nums;
        this.strs = strs;
    }

    public void printElements() {
        System.out.println("nums--------");
        printElements(nums.createIterator());
        System.out.println("strs--------");
        printElements(strs.createIterator());
    }

    private void printElements(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
