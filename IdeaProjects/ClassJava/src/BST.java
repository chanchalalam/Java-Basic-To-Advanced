//public class BST {
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    static class BinaryTree {
//        static int idx = -1;
//
//        public static Node buildTree(int[] nodes) {
//            idx++;
//            if (idx >= nodes.length || nodes[idx] == -1) {
//                return null;
//            }
//            Node newNode = new Node(nodes[idx]);
//            newNode.left = buildTree(nodes);
//            newNode.right = buildTree(nodes);
//            return newNode;
//        }
//
//        public static void preorder(Node root) {
//            if (root == null) {
//                return;
//            }
//            System.out.print(root.data + " ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//
//        public static void postorder(Node root) {
//            if (root == null) {
//                return;
//            }
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.data + " ");
//        }
//
//        public static void inorder(Node root) {
//            if (root == null) {
//                return;
//            }
//            inorder(root.left);
//            System.out.print(root.data + " ");
//            inorder(root.right);
//        }
//
//        public static int countOfNodes(Node root) {
//
//            if (root == null) {
//                return 0;
//            }
//
//            int leftNodes = countOfNodes(root.left);
//            int rightNodes = countOfNodes(root.right);
//
//            return leftNodes + rightNodes + 1;
//        }
//
//        public static boolean isFullNode(Node node) {
//            if (node == null) {
//                return false;
//            }
//            return node.left != null && node.right != null;
//        }
//        public static int countFullNodes(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int countFullNodes = countFullNodes(root.left) + countLeafNodes(root.right) + 1;
//            return countFullNodes;
//        }
//
//        public static int countLeafNodes(Node root) {
//            if (root == null) {
//                return 0;
//            }
//
//            if (root.left == null && root.right == null) {
//                return 1;
//            }
//
//            int leftLeafCount = countLeafNodes(root.left);
//            int rightLeafCount = countLeafNodes(root.right);
//
//            return leftLeafCount + rightLeafCount;
//        }
//
//        public static int height(Node root){
//            if (root == null) {
//                return 0;
//            }
//            int leftHeight = height(root.left);
//            int rightHeight = height(root.right);
//
//            int myHeight = Math.max(leftHeight,rightHeight) + 1;
//
//            return myHeight;
//        }
//
//        public static int BST_MAX(Node root) {
//            if (root == null) {
//                return 0;
//            }
//
//            Node current = root;
//            while (current.left != null) {
//                current = current.left;
//            }
//            return current.data;
//        }
//
//        public static int BST_MIN(Node root) {
//            if (root == null) {
//                return 0;
//            }
//
//            Node current = root;
//            while (current.right != null) {
//                current = current.right;
//            }
//            return current.data;
//        }
//
//
//        public static void main(String[] args) {
//            int[] nodes = {1, 2, 3, 4, 5, 6, 7};
//
//            Node root = BinaryTree.buildTree(nodes);
//
//            System.out.println("Preorder traversal:");
//            preorder(root);
//
//            System.out.println("\nPostorder traversal:");
//            postorder(root);
//
//            System.out.println("\nInorder traversal:");
//            inorder(root);
//
//            System.out.println("\nNumber of nodes: " + countOfNodes(root));
//
//            System.out.println("\nNumber of leaf nodes: " + countLeafNodes(root));
//
//            System.out.println("\nFull nodes:" + countFullNodes(root));
//
//            System.out.println("\nHeight of Tree:" + height(root));
//
//            System.out.println("\nBST of Minimum:" + BST_MIN(root));
//
//            System.out.println("\nBST of Maximum:" + BST_MAX(root));
//
//            int dataToDelete = 4;  // Example of data to delete
//            int deletedData = dataToDelete;  // Store the data before deletion
//            bst.root = bst.deleteNode(bst.root, dataToDelete);  // Call deleteNode
//
//            System.out.println("\nDeleting of Node: " + deletedData);
//        }
//    }
//}

public class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

     public BST() {
        root = null;
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public void insert(int data) {
        root = insert(root, data);
    }


    public void printTree(Node root, int level) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(root.data);
        printTree(root.left, level + 1);
        printTree(root.right, level + 1);
    }


    public static int BST_MAX(Node root) {
            if (root == null) {
                return 0;
            }

            Node current = root;
            while (current.left != null) {
                current = current.left;
            }
            return current.data;
        }

        public static int BST_MIN(Node root) {
            if (root == null) {
                return 0;
            }

            Node current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        }

    public static Node deleteNode(Node root, int data) {
        if (root == null) {
            return root;  // Node not found
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // Node to be deleted found

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;  // Simply remove the node
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;  // Replace with right subtree
            } else if (root.right == null) {
                return root.left;  // Replace with left subtree
            }

            // Case 3: Two children
            // Find inorder successor (smallest in right subtree)
            int inorderSuccessorData = BST_MIN(root.right);
            root.data = inorderSuccessorData;  // Copy successor's data to current node
            root.right = deleteNode(root.right, inorderSuccessorData);  // Delete successor
        }

        return root;
    }

    public boolean isCompleteBST(Node root, int index, int totalNodes) {
        if (root == null) {
            return index == totalNodes; // Empty leaf node at right position is valid
        }

        if (index >= totalNodes) {
            return false; // Node present beyond total nodes count is invalid
        }

        return isCompleteBST(root.left, 2 * index + 1, totalNodes) &&
                isCompleteBST(root.right, 2 * index + 2, totalNodes);
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);


       // bst.printTree(bst.root, 0);

        int dataToDelete = 40;
           int deletedData = dataToDelete;  // Store the data before deletion
           bst.root = bst.deleteNode(bst.root, dataToDelete);  // Call deleteNode

           System.out.println("\nDeleting of Node: " + deletedData);

        //bst.printTree(bst.root, 0);  // Print the data after deletion
//
//        int totalNodes = countOfNodes(root);  // Assuming a method to count nodes
//        boolean isComplete = isCompleteBST(root, 0, totalNodes);
//        System.out.println("\nComplete BST: " + isComplete);

    }
}