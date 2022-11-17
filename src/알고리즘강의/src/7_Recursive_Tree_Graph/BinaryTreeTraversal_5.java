class Node{
    int data;
    Node lt, rt;    //왼쪽, 오른쪽 자식 노드의 "주소"를 저장하는 변수
    public Node(int val) {
        data=val;
        lt=rt=null; //객체 생성시 왼,오 자식 노드의 주소는 null로 초기화
    }
}

public class BinaryTreeTraversal_5{
    Node root;
    public void DFS(Node root){
        if(root==null)
            return;
        else{
            DFS(root.lt);
            System.out.print(root.data+" ");    //중위순회
            DFS(root.rt);
        }
    }

    public static void main(String args[]) {
        BinaryTreeTraversal_5 tree=new BinaryTreeTraversal_5();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}
