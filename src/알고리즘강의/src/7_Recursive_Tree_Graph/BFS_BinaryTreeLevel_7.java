import java.util.LinkedList;
import java.util.Queue;

public class BFS_BinaryTreeLevel_7{
    Node root;
    public void BFS(Node root){
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;    //레벨(루트 레벨=0)
        while(!Q.isEmpty()){
            int len = Q.size(); //L 레벨의 원소의 개수!
            System.out.print(L+" : ");
            for(int i=0; i<len; i++){ //L레벨의 원소들 돌면서 하나 빼고 그 자식들 다 넣고 반복
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);   //cur노드와 연결된 왼,오 자식들 큐에 넣음(자식이 있다면!)
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;    //레벨증가 -> 아까 넣은 자식들을 순회하게 된다
            System.out.println();
        }
    }

    public static void main(String args[]) {
        BFS_BinaryTreeLevel_7 tree=new BFS_BinaryTreeLevel_7();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root);
    }
}
