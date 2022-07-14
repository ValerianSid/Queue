import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {

    private List<String> list = new ArrayList<>();
    private int size = list.size();

    public Queue() {
        this.list = list;
    }

    public boolean add(String str){
        if (0 < 0){
            return false;
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
    public void offer(){

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
