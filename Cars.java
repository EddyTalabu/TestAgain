
package cars;
import java.util.*;
public class Cars implements Comparable<Cars>{
    String carName;
    @Override
    public int compareTo(Cars o) {
        return this.carName.compareTo(o.carName)*-1;
    }
    
    @Override
    public String toString(){
        return carName;
    }
    public Cars(String carName){
        this.carName=carName;
    }
        
    public static void main(String[] args) {
        List<Cars> mota= new ArrayList<>();
        mota.add(new Cars("Hilux"));
        mota.add(new Cars("Toyota Corolla"));
        mota.add(new Cars("A250 AMG"));
        mota.add(new Cars("G63"));
        mota.add(new Cars("Evoque"));
        
        System.out.println("Cars before sorting :" + mota);
        System.out.println("New version 3.1");
        Collections.sort(mota);
        System.out.println("\nCars after sorting, in descending order :" + mota);
    }

    
}
