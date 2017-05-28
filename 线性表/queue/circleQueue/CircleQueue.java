package queue.circleQueue;

import java.util.Arrays;

/**循环队列
 * 环形缓冲
 * Created by 张志鹏 on 2017/5/2.
 */
public class CircleQueue {
    /**
     * 循环队列 （数组）默认大小
     */
    private final int DEFAULT_SIZE = 1000;

    /**
     * (循环队列)数组的容量
     */
    public int capacity;

    /**
     * 数组：保存循环队列的元素
     */
    public Object[] elementData;

    /**
     * 队头(先见先出)
     */
    public int head = 0;

    /**
     * 队尾
     */
    public int tail = 0;

    /**
     * 以循环队列 默认大小创建空循环队列
     */
    public CircleQueue() {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    /**
     * 以指定长度的数组来创建循环队列
     *
     * @param initSize
     */
    public CircleQueue(final int initSize) {
        capacity = initSize;
        elementData = new Object[capacity];
    }

    /**
     * 获取循环队列的大小(包含元素的个数)
     */
    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (isFull()) {
            return capacity;
        } else {
            return tail + 1;
        }
    }

    /**
     * 插入队尾一个元素
     */
    public void add(final Object element) {
        if (isEmpty()) {
            elementData[0] = element;
        } else if (isFull()) {
            elementData[head] = element;
            head++;
            tail++;
            head = head == capacity ? 0 : head;
            tail = tail == capacity ? 0 : tail;
        } else {
            elementData[tail + 1] = element;
            tail++;
        }
    }
    //判空
    public boolean isEmpty() {
        return tail == head && tail == 0 && elementData[tail] == null;
    }
    //判断队列是否已满
    public boolean isFull() {
        return head != 0 && head - tail == 1 || head == 0 && tail == capacity - 1;
    }

    public void clear() {
        Arrays.fill(elementData, null);
        head = 0;
        tail = 0;
    }

    /**
     * @return 取 循环队列里的值（先进的index=0）
     */
    public Object[] getQueue() {
        final Object[] elementDataSort = new Object[capacity];
        final Object[] elementDataCopy = elementData.clone();
        if (isEmpty()) {
            System.out.println("该队列为空！");
        } else {
            // elementDataSort = elementDataCopy;//用这行代码代替下面的循环，在队列刚满时候会出错
            for (int i = 0; i < tail; i++) {
                elementDataSort[i] = elementDataCopy[i];
            }
        }
        return elementDataSort;
    }
}
