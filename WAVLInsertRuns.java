import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class WAVLInsertRuns {
    static public void main(String[] args){
        Random r = new Random();
        int[] insertOperations = new int[10];
        int[] deleteOperations = new int[10];
        double[] av_insertOperations = new double[10];
        double[] av_deleteOperations = new double[10];
        int[] max_insertOperations = new int[10];
        int[] max_deleteOperations = new int[10];
        int insertOp = 0;
        int deleteOp = 0;
        int max_insertOp = 0;
        int max_deleteOp = 0;
        int op = 0;
        for (int i=1; i<11; i++){
            insertOp = 0;
            deleteOp = 0;
            max_insertOp = 0;
            max_deleteOp = 0;
            Set<Integer> integers = new HashSet<>();
            while (integers.size()<i*10000){
                integers.add(r.nextInt());
            }
            WAVLTree tree = new WAVLTree();
            for (int integer : integers){
                op = tree.insert(integer, null);
                insertOp += op;
                if (op>max_insertOp){
                    max_insertOp=op;
                }
            }
            while (!tree.empty()){
                int m = tree.minKey();
                op = tree.delete(m);
                deleteOp += op;
                if (op>max_deleteOp){
                    max_deleteOp = op;
                }
            }
            insertOperations[i-1] = insertOp;
            deleteOperations[i-1] = deleteOp;
            av_insertOperations[i-1] = (double)insertOp/(i*10000);
            av_deleteOperations[i-1] = (double)deleteOp/(i*10000);
            max_insertOperations[i-1] = max_insertOp;
            max_deleteOperations[i-1] = max_deleteOp;
        }
        System.out.println("Insert: " + Arrays.toString(insertOperations));
        System.out.println("Delete: " + Arrays.toString(deleteOperations));
        System.out.println("Average Insert: " + Arrays.toString(av_insertOperations));
        System.out.println("Average Delete: " + Arrays.toString(av_deleteOperations));
        System.out.println("Max Insert: " + Arrays.toString(max_insertOperations));
        System.out.println("Max Delete: " + Arrays.toString(max_deleteOperations));

    }
//TODO add this function to WAVLTree
//    public int minKey() {
//        if (empty()) return -1;
//        WAVLNode temp = root;
//        while (temp.children[0] != external) {
//            temp = temp.children[0];
//        }
//        return temp.getKey();
//    }
}
