package day_03;

import java.util.ArrayList;

public class numberPartition {
    static ArrayList<ArrayList<Integer> >
    uniquePartitions(int n)
    {

        ArrayList<ArrayList<Integer> > ans
            = new ArrayList<>();

        // Stores current partition
        int[] p = new int[n];

        // Current partition size
        int k = 0;

        // First partition is the number itself
        p[k] = n;

        while (true) {

            // Store current partition
            ArrayList<Integer> curr = new ArrayList<>();
            for (int i = 0; i <= k; i++) {
                curr.add(p[i]);
            }
            ans.add(curr);

            // Stores sum of trailing ones
            int remVal = 0;

            // Find the rightmost element greater than 1
            while (k >= 0 && p[k] == 1) {
                remVal += p[k];
                k--;
            }

            // All partitions have been generated
            if (k < 0)
                break;

            // Decrease current value
            p[k]--;
            remVal++;

            // Divide remaining value into equal parts
            while (remVal > p[k]) {
                p[k + 1] = p[k];
                remVal -= p[k];
                k++;
            }

            // Store remaining value
            p[k + 1] = remVal;
            k++;
        }

        return ans;
    }

    public static void main(String[] args)
    {

        int n = 4;

        ArrayList<ArrayList<Integer> > res
            = uniquePartitions(n);

        System.out.print("[");

        for (int i = 0; i < res.size(); i++) {
            System.out.print("[");

            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j));

                if (j + 1 < res.get(i).size())
                    System.out.print(", ");
            }

            System.out.print("]");

            if (i + 1 < res.size())
                System.out.print(", ");
        }

        System.out.print("]");
    }
}
