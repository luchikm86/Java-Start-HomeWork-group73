public class BytesConverter {

    public static void main(String[] args) {
        long totalBytes = 3181608;

        long gigaBytes = (totalBytes / 1073741824) % 1024;
        long megaBytes = (totalBytes / 1048576) % 1024;
        long kiloBytes = (totalBytes / 1024) % 1024;
        long bytes = totalBytes % 1024; //

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");

    }

}
