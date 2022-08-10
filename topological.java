import java.util.*;
class topological{

    public static void main(String[] args) {
        int i, j, k, n, a[][], indeg[], flag[], count = 0;

        System.out.println("Enter the no of vertices");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Enter the adjacency matrix");
        a = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        indeg = new int[n];
        flag = new int[n];
        for (i = 0; i < n; i++) {
            indeg[i] = 0;
            flag[i] = 0;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                indeg[i] = indeg[i] + a[j][i];
            }
        }
        System.out.println("The topological order is:");

        while (count < n) {
            for (k = 0; k < n; k++) {
                if ((indeg[k] == 0) && (flag[k] == 0)) {
                    System.out.println(k + 1);
                    flag[k] = 1;
                }

                for (i = 0; i < n; i++) {
                    if (a[i][k] == 1)
                        indeg[k]--;
                }
            }

            count++;
        }

    }
}
