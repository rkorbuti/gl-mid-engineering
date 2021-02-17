package com.training;

public class Task1 {

    public static void main(String[] args) {

        com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean)
                java.lang.management.ManagementFactory.getOperatingSystemMXBean();

        System.out.println("Maximum amount of memory that the Java virtual machine will attempt to use (bytes): " +
                String.format("%,d", Runtime.getRuntime().maxMemory()));  // 3,817,865,216

        System.out.println("Max size of single block available in heap to allocate (bytes): " +
                String.format("%,d", maxAllocatedBlockSize()));  // 2,864,709,632

        System.out.println("Physical memory (bytes): " +
                String.format("%,d", os.getTotalPhysicalMemorySize())); // 17,179,869,184

    }

    private static long maxAllocatedBlockSize() {
        int mb_step = 1024 * 1024;
        int i = 0;

        try {
            while (true) {
                int[] arr = new int[i];
                i = i + mb_step;
            }
        } catch (OutOfMemoryError e) {
        }

        return (long) i * 4;
    }

}
