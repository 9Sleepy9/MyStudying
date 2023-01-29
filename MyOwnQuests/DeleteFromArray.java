package MyOwnQuests;



public class DeleteFromArray {


    int[] DeleteInt (int[] x, int n) {

        int d = 0;
        int c = x.length;

        for (int k : x) {
            if (k == n) c--;
        }

        int [] z = new int[c];

        /*for (int i = 0; i < z.length; i++) {
            for (int j = d; j < x.length; j++){
                if (x[j] != n) {
                    z[i] = x[j];
                    d = j+1;
                    break;
                }
            }
        }*/

        for(int i = 0; i < x.length; i++){
            if(x[i] == n){
                d++;
            } else {
                z[i - d] = x[i];
            }
        }

        return z;
    }


    public static void main(String [] args) {

        int [] s = { 1, 2, 5, 2, 7, 9, 2, 3, 4};
        int [] z;

        DeleteFromArray M = new DeleteFromArray();

        z = M.DeleteInt(s, 2);

        for (int k : z)
            System.out.println(k);

    }

}
