import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {

    private List<String> list = new ArrayList<>();
    private Integer maxSize;

    public Queue() {
        this.list = list;

    }
    public Queue(int maxSize){
        this.maxSize = maxSize;
    }

    public boolean add(String str){
        if (maxSize != null && list.size() == maxSize){
            throw new IllegalStateException();
        }
        list.add(0, str);
        return true;
    }
    public String element(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(list.size() - 1);
    }
    public boolean offer(String str){
            if (maxSize != null && list.size() == maxSize){
                return false;
            }
        list.add(0, str);
        return true;

    }
    public String peek(){
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }
    public String poll(){
        if(list.isEmpty()){
            return null;
        }
        String str = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return str;
    }
    public String remove(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        String str = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return str;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "list=" + list +
                '}';
    }
}
