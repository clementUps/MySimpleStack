package dcll.ccar;

import java.util.ArrayList;

/**
 * Created by 20901927 on 13/02/2015.
 */
public class MySimpleStack implements SimpleStack {
    private ArrayList<Item> items;
    private int nb;
    public MySimpleStack(){
        items = new ArrayList<Item>();
    }
    @Override
    public boolean isEmpty() {
        if(nb == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return nb;
    }

    @Override
    public void push(Item item) {
        items.add(item);
        nb++;

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item i = items.get(nb);
        items.remove(nb);
        nb--;
        return i;
    }
}
