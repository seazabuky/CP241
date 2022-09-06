import java.util.ArrayList;
public class Stat2  implements StatADT{
        protected ArrayList<Double> number = new ArrayList<Double>();
    
        @Override
        public void setTotal(int t){}
        @Override
        public double getData(int element){
            return number.get(element);
        }
        @Override
        public int getTotal(){
            return number.size();
        }
        @Override
        public double getMean(){
            double sum;
            sum=0;
            for(int i = 0;i<getTotal();i++){
                sum=sum+number.get(i);
            }
            return sum/(double)getTotal();
        }
        @Override
        public double getSD() {
            double sum = 0;
            double mean = getMean();
            for(int i = 0;i<getTotal();i++){
                sum += Math.pow((number.get(i) - mean),2);
            }
            return Math.sqrt(sum / (double)getTotal());
        }
        @Override
        public double getMax() {
            double max = number.get(0);
            for(int i = 0;i<getTotal();i++){
                if(max<number.get(i)){
                    max=number.get(i);
                }
            }
            return max;
        }
        @Override
        public double getMin() {
            double min = number.get(0);
            for(int i = 0;i<getTotal();i++){
                if(min>number.get(i)){
                    min=number.get(i);
                }
            }
            return min;
        }
        @Override
        public void setData(int element,double input){
            if(element>=number.size()){
                number.add(input);
            }
            else{
                number.set(element,input);
            }
        }
    }
    
