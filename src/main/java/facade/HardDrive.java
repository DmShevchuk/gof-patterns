package facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive reading from LBA " + lba + " with size " + size);
        return new byte[size];
    }
}
