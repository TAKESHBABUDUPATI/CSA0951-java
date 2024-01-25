public class ReversArray {
    public static void main(String[] args) {

        int a[] = {5, 6, 7, 8, 9},i;
        for (i = 0; i < a.length; i++) {
            System.out.println(+a[a.length - i - 1]);
        }

    }
}