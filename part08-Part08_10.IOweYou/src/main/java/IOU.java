/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.HashMap;
public class IOU {
    
    private HashMap<String, Double> iou;
    
    public IOU() {
        this.iou = new HashMap();
    }
    
    public void setSum(String who, double amount) {
        this.iou.put(who, amount);
    }
    
    public double howMuchDoIOweTo(String who) {
        return this.iou.getOrDefault(who, 0.0);
    }
    
}
