package node_mania;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution{
    public static Integer searchKFromEnd(Node linkedList, int k){
        if (linkedList == null) return null;
        List<Integer> values = new ArrayList<>();
        boolean endWhile = false;
        Node presentNode = linkedList;
        while (!endWhile) {
            values.add(presentNode.data);
            if (Optional.ofNullable(presentNode.next).isPresent()) {
                presentNode = presentNode.next;
            } else {
                break;
            }
        }
        return k > values.size() ? null : values.get(values.size() - k);
    }
}
