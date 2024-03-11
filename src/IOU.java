import java.util.HashMap;

public class IOU {
    HashMap<String, Double> iouMap;


    public IOU() {
        iouMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (iouMap.get(toWhom) == null) {
            return 0.00;
        } else {
            return iouMap.get(toWhom);
        }
    }

    public double totalOwed() {
        double total = 0;
        for (double vals : iouMap.values()) {
            total += vals;
        }
        return total;
    }


}
