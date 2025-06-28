public class BinaryTree06 {
    Node06 root;   

    public BinaryTree06() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRecursive(Mahasiswa06 mhs) {
        Node06 newNode = new Node06(mhs);
        root = addHelper(root, newNode);
    }

    public Node06 addHelper(Node06 root, Node06 node) {
        if (root == null) {
            root = node;
            return root;
        }

        if (node.mhs.ipk < root.mhs.ipk) {
            root.left = addHelper(root.left, node);
        } else {
            root.right = addHelper(root.right, node);
        }

        return root;
    }

    public void add (Mahasiswa06 mhs) {
        Node06 newNode = new Node06(mhs);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node06 current = root;
            Node06 parent = null;
            while (true) {
                parent = current;
                if (mhs.ipk < current.mhs.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else if (mhs.ipk > current.mhs.ipk) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    Mahasiswa06 cariMinIpk() {
        Node06 current = root;

        while (current.left != null) {
            current = current.left;
        }
        
        return current.mhs;
    }

    Mahasiswa06 cariMaxIpk() {
        Node06 current = root;

        while (current.right != null) {
            current = current.right;
        }
        
        return current.mhs;
    }

    boolean find(double ipk) {
        boolean result = false;
        Node06 current = root;

        while (current != null) {
            if (current.mhs.ipk == ipk) {
                return true;
            } else if (ipk > current.mhs.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node06 node) {
        if (node == null) {
            return;
        }

        node.mhs.tampilInformasi();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }

    void traverseInOrder(Node06 node) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.left);
        node.mhs.tampilInformasi();
        traverseInOrder(node.right);
    }

    void traversePostOrder(Node06 node) {
        if (node == null) {
            return;
        }

        traversePostOrder(node.left);
        traversePostOrder(node.right);
        node.mhs.tampilInformasi();
    }

    void traverseIpk(Node06 node, double ipkBatas) {
        if (node == null) {
            return;
        }
        
        if (node.mhs.ipk >= ipkBatas) {
        traverseIpk(node.left, ipkBatas);
        node.mhs.tampilInformasi();
        }
    
        traverseIpk(node.right, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan ipk di atas " + ipkBatas + " : ");
        traverseIpk(root, ipkBatas);
    }

    Node06 getSuccessor(Node06 node) {
        Node06 successor = node.right;
        Node06 successorParent = node;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != node.right) {
            successorParent.left = successor.right;
            successor.right = node.right;

        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node06 parent = root;
        Node06 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mhs.ipk == ipk) {
                break;
            } else if (ipk < current.mhs.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.left;
                }
            }
        } else if(current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node06 successor = getSuccessor(current);
            System.out.println("Jika 2 anak, current = ");
            successor.mhs.tampilInformasi();
            if (current == root) {
                root = successor;
            } else {
                if(isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left; 
        }
        } 
    }
}

