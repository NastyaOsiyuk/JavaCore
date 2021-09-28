package lesson3;

public class Main {
    public static void main(String[] args){

        String[] a = { " хочу "," знать "," Java "," в "," совершенстве "," пока "," не получается(( "};
        for (String s : a) {
            System.out.print(s);
        }
        System.out.println();

        int n = a.length;
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (String s : a) {
            System.out.print(s);
        }
    }
}
