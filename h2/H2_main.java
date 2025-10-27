public class H2_main {

    public static void main(String[] args) {
        int i = 13;
        int j = 11;
        int k = 15;
        int min = 1;
        int max = 15;

        if (i > j && i >k) {
            max = i;
            if (j>k) {
                min = k;
            }
            else{
                min = j;
            }
        }
        else if (j > i && j >k) {
            max = j;
            if (i>k) {
                min = i;
            }
            else{
                min = k;
            }
        }
        else if (k>i && k>j) {
            max = k;
            if (j>i) {
                min = i;
            }
            else{
                min = j;
            }
        }
        System.out.println("min: " + min + " max: " + max);

    }
}
