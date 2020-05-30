
public class PrintTree {
    public static void main(String[] args) {
        WAVLTree tree = new WAVLTree();
        tree.insert(100, null);
        tree.insert(50, null);
        tree.insert(150, null);
        tree.insert(30, null);
        tree.insert(70, null);
        tree.insert(130, null);
        tree.insert(170, null);
        tree.insert(10, null);
        tree.insert(120, null);
        tree.insert(140, null);
        tree.delete(10);
        tree.delete(70);
        tree.delete(30);
        tree.display(tree);

//		WAVLTree Atree = new WAVLTree();
//		tree.insert(50, null);
//		tree.insert(40, null);
//		tree.insert(100, null);
//		tree.insert(30, null);
//		tree.insert(70, null);
//		tree.insert(120, null);
//		tree.insert(80, null);
//		tree.insert(150, null);
//		tree.delete(120);
//		tree.delete(80);
//		tree.delete(30);
//		tree.display(Atree);

        //		WAVLTree tree = new WAVLTree();
//		tree.insert(3, null);
//		tree.insert(2, null);
//		tree.insert(4, null);
//
//		tree.insert(5, null);
//		tree.insert(1, null);
//		tree.delete(1);
//		tree.display(tree);

    }

}
