public class Link {
    int id;
    int marks;
    Link next;

    public Link(int id, int marks){
        this.id=id;
        this.marks=marks;
        this.next=null;
    }
    public void displayLink(){
        System.out.println("ID: "+id+" Marks: "+marks);
    }
}
class LinkedList{
    private Link first;

    public LinkedList(){
        first=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertFirst(int id, int marks){
        Link newLink=new Link(id,marks);
        newLink.next=first;
        first=newLink;
    }
    public Link find(int key){
        Link current=first;
        while(current!=null&&current.id!=key){
            current=current.next;
        }
        return current;
    }
    public void insertAfter(int key, int id,int marks){
        Link current =find(key);
        if(current != null){
            Link newLink=new Link(id, marks);
            newLink.next=current.next;
            current.next=newLink;
        }else{
            System.out.println("ID "+key+" not found.");
        }
    }
    public Link deleteFirst() {
        if (isEmpty()) return null;
        Link temp = first;
        first = first.next;
        return temp;
    }
    public boolean delete(int key) {
        if(isEmpty()) return false;
        if(first.id==key){
            first=first.next;
            return true;
        }
        Link current = first;
        Link previous = null;
        while(current!=null&&current.id!=key){
            previous=current;
            current=current.next;
        }
        if(current==null)
            return false;
        previous.next=current.next;
        return true;
    }
    public void displayList(){
        Link current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
    }
}
