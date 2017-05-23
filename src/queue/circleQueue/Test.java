package queue.circleQueue;

/**
 * Created by 张志鹏 on 2017/5/2.
 */
public class Test {
    public static void main(final String[] args) {
        final CircleQueue queue = new CircleQueue(10);
        for (int i = 0; i < 99; i++) {
            queue.add(i);
    }

        final Object[] queueArray = queue.getQueue();
        System.out.println("按入队列的先后顺序打印出来：");
        for (final Object o : queueArray) {
            System.out.println(o);
        }
        System.out.println("capacity: " + queue.capacity);
        System.out.println("size: " + queue.size());
        System.out.println("head index: " + queue.head);
        System.out.println("tail index: " + queue.tail);

    }
}
