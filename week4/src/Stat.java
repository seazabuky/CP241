public class Stat implements StatADT{
    protected double[] number = new double[100];
    private int total = 0;
    @Override
    public void setTotal(int t){
        total = t;
    }
    @Override
    public double getData(int element){
        return number[element];
    }
    @Override
    public int getTotal(){
        return total;
    }
    @Override
    public double getMean(){
        double sum;
        sum=0;
        for(int i = 0;i<total;i++){
            sum=sum+number[i];
        }
        return sum/(double)total;
    }
    @Override
    public double getSD() {
        double sum = 0;
        double mean = getMean();
        for(int i = 0;i<total;i++){
            sum += Math.pow((number[i] - mean),2);
        }
        total = total-1;
        return (double)Math.sqrt(sum / (double)total);
    }
    @Override
    public double getMax() {
        double max = number[0];
        for(int i = 0;i<total;i++){
            if(max<number[i]){
                max=number[i];
            }
        }
        return max;
    }
    @Override
    public double getMin() {
        double min = number[0];
        for(int i = 0;i<total;i++){
            if(min>number[i]){
                min=number[i];
            }
        }
        return min;
    }
    @Override
    public void setData(double input){
        number[total] = input;
        total++;
    }
}