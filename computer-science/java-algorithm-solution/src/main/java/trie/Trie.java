package trie;
//탐색 트리의 일종
//동적 집합, 연관 배열을 저장하는데 주로 사용
//위치와 연관된 키, 값을 저장하고 노드는 연관된 접두사(prefix)를 갖는다.
//참고 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=1ilsang&logNo=221612962217
public class Trie {
    private final int ALPABET_SIZE=26;
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            int curIdx = word.charAt(i) - 'a';
            if(node.next[curIdx] == null) {
                node.next[curIdx] = new Node();
            }
            node = node.next[curIdx];
        }
        node.hit = true;
    }

    public boolean search(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            int curIdx = word.charAt(i)-'a';
            if(node.next[curIdx] == null){
                return false;
            }
            node = node.next[curIdx];
        }
        return node.hit;
    }

    public boolean startsWith(String prefix) {
        Node cur = root;
        int len = prefix.length();

        for(int i = 0; i < len; i++) {
            int curIdx = prefix.charAt(i) - 'a';
            if(cur.next[curIdx] == null) return false;
            cur = cur.next[curIdx];
        }
        return true;
    }

    private class Node{
        Node[] next;
        boolean hit;
        Node(){
            next = new Node[ALPABET_SIZE];
        }
    }
}
