package study.daydayup.hello.io.nio;

import java.nio.ByteBuffer;
import study.daydayup.hello.utils.PrintUtils;

public class HelloByteBuffer {
    /**
     * things you need to know about buffer
     * 1. two ways to initialize ByteBuffer
     *      1.1. ByteBuffer.allocateDirect(capacity)
     *          -> DirectByteBuffer : memory not in jvm
     *      1.2. ByteBuffer.allocate(capacity)
     *          -> HeapByteBuffer : memory in jvm
     *      1.3 clear the buffer
     *          -> buffer.clear()
     * 2. three attributes of ByteBuffer
     *      2.1 capacity
     *      2.2 position: current write/read position
     *      2.3 limit:
     * 3. put/get and flip
     *      3.1 flip: switch write/read mode
     *      3.2 putXXXX /getXXXX
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        initByteBuffer();

        showAttributes();

        readAndWrite();
    }

    /**
     * two ways to initialize ByteBuffer
     * 1. ByteBuffer.allocateDirect(capacity)
     *      -> DirectByteBuffer : memory not in jvm
     * 2. ByteBuffer.allocate(capacity)
     *      -> HeapByteBuffer : memory in jvm
     * 3. clear the buffer
     *      -> buffer.clear()
     */
    private static void initByteBuffer() {
        // DirectByteBuffer -> memory not in jvm
        ByteBuffer directByteBuffer = ByteBuffer.allocateDirect(1024 * 2);
        directByteBuffer.clear();

        // HeapByteBuffer -> memory in jvm
        ByteBuffer heapByteBuffer = ByteBuffer.allocate(1024 * 2);
        heapByteBuffer.clear();
    }

    /**
     * three attributes of ByteBuffer
     * 1 capacity
     * 2 position: current write/read position
     * 3 limit:
     *      3.1 equals capacity in write mode
     *      3.2 max readable length in read mode
     */
    public static void showAttributes() {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        PrintUtils.starLine("buffer attribute");
        System.out.println("buffer capacity: " + buffer.capacity());
        System.out.println("buffer position: " + buffer.position());
        System.out.println("buffer limit: " + buffer.limit());
    }

    /**
     * read, write and flip
     * 1. flip: switch write/read mode
     * 2. putXXXX /getXXXX
     */
    private static void readAndWrite() {
        PrintUtils.starLine("heap buffer demo");
        ByteBuffer buffer = ByteBuffer.allocate(1024);
    }
}
