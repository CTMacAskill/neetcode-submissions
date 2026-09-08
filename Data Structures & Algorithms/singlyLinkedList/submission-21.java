class LinkedList {

public class LinkNode{
    int val;
    LinkNode next;
    LinkNode(int val){
        this.val = val;
        this.next = null;
    }
    LinkNode(int val, LinkNode next){
        this.val = val;
        this.next = next;
    }
}

    private LinkNode head;
    private LinkNode tail;
    private int size;

    public LinkedList() {
        this.head = new LinkNode(-1);
        this.tail = this.head;
        this.size = 0;
    }

    public int get(int index) {
        if (index >= size){
            return -1;
        }
        if (index == size){
            return tail.val;
        }
        LinkNode next = this.head;
        for (int i=0; i < index; i++){
            next = next.next;
        }
        if (next == null){
            return this.tail.val;
        }
        return next.val;
    }

    public void insertHead(int val) {
        LinkNode newNode;
        if(this.head.val == -1){
            newNode = new LinkNode(val);
        } else {
            newNode = new LinkNode(val, this.head);
        }
        this.head = newNode;
        if (newNode.next == null){
            this.tail = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        LinkNode newTail = new LinkNode(val);
        this.tail.next = newTail;
        this.tail = newTail;
        if(this.head.val == -1){
            this.head = this.tail;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index >= size){
            return false;
        }
        if (index == 0){
            this.head = this.head.next;
            this.size--;
            return true;
        }
        LinkNode nextLink = this.head;
        for(int i=0; i < (index - 1); i++){
            nextLink = nextLink.next;
        }
        if(nextLink.next == null){
            nextLink.next = null;
            this.tail = nextLink;
        } else {
            nextLink.next = nextLink.next.next;
        }
        this.size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> valuesList = new ArrayList<Integer>();
        LinkNode currentNode = this.head;
        for (int i=0; i < this.size; i++){
            valuesList.add(currentNode.val);
            currentNode = currentNode.next;
        }
        return valuesList;
    }
}
