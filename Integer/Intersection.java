package Integer;
class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 4, 6, 8};
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++; j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
