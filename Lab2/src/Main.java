public class Main {
    public static void main(String[] args) {
        Box smallBox = new Box();
        Box mediumBox = new Box(2);
        Box bigBox = new Box(3,4,5);
        Queue<Integer> integerQueue = new Queue<>(2);
        Queue<String> stringQueue = new Queue<>();
        integerQueue.push(1);
        integerQueue.push(2);
        integerQueue.push(3);
        stringQueue.push("one");
        stringQueue.push("two");
        stringQueue.push("three");
        System.out.println(integerQueue.isFull());
        System.out.println(stringQueue.isEmpty());
        System.out.println(integerQueue.front());
        System.out.println(stringQueue.front());
        System.out.println(bigBox.getVolume());
        System.out.println(bigBox.getArea());
    }
}
