package h3;
public class H3_main {
public static void main(String[] args) {
    int i = 1;
    int j = 4;
    int k = 5;

    k = -10;

    if (i > j && i>200 == false && j>100 == false) {
        k = 1;
    }
    else if ( i> j && i>200 && j>100 == false) {
        k = 2;
    }
    else if (i>j && i>200 && j>100) {
        k = 3;
    }
    else if (i>j == false && i>200 == false && j>200 == false) {
        k = 4;
    }
    else{
        k = -10;
    }
    System.out.println(k);
}
}
