package study.daydayup.hello.io.nio;

import java.nio.ByteBuffer;
import study.daydayup.hello.utils.PrintUtils;

public class HelloByteBuffer {

    public static void main(String[] args) {
        //two ways to initialize ByteBuffer
        //1. ByteBuffer.allocateDirect() -> DirectByteBuffer
        //2. ByteBuffer.allocate() -> HeapByteBuffer



        helloDirectBuffer();
        helloHeapBuffer();
    }

    /**
     * DirectByteBuffer demo
     */
    public static void helloDirectBuffer() {
        PrintUtils.starLine("direct buffer demo");
        PrintUtils.blankLine(2);
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        PrintUtils.starLine("buffer attribute");
        System.out.println("buffer capacity: " + buffer.capacity());
        System.out.println("buffer position: " + buffer.position());
        System.out.println("buffer limit: " + buffer.limit());
    }

    /**
     * HeapByteBuffer demo
     */
    private static void helloHeapBuffer() {
        PrintUtils.starLine("heap buffer demo");
        ByteBuffer buffer = ByteBuffer.allocate(1024);
    }
}
