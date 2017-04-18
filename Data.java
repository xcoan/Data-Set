import java.util.ArrayList;

public class Data {
  // Declare ArrayList
  ArrayList<Double> dataSet;

  public Data(ArrayList<Double> dataSet) {
    this.dataSet = dataSet;
  }

  /**
   * @method setList();
   * @params dataSet, an arrayList of Double values
   * */
   protected void setList(ArrayList<Double> dataSet) {
     this.dataSet = dataSet;
   }

   /**
    * @method getList();
    * @returns dataSet, an arrayList of Double values
    * */
    protected ArrayList<Double> getList() {
      return this.dataSet;
    }


  /**
   * @method getSum();
   * @returns total, the sum of all Doubles
   * */
  protected double getSum() {
    double total = 0;
    for (int i = 0; i < this.dataSet.size(); i++) {
      total += this.dataSet.get(i);
    }
    return total;
  }

  /**
   * @method getAverage();
   * @returns average, a Double of the average of all values
   * */
  protected double getAverage() {
    Double total = this.getSum();
    return (total/this.dataSet.size());
  }

  /**
   * @method getMinimum();
   * @returns minimum, a Double of the lowest of all values
   * */
  protected double getMinimum() {
    double minimum = this.dataSet.get(0);
    for (int i = 1; i < this.dataSet.size(); i++) {
      if (this.dataSet.get(i) < minimum)
        minimum = this.dataSet.get(i);
    }
    return minimum;
  }

  /**
   * @method getMaximum();
   * @returns maximum, a Double of the lowest of all values
   * */
  protected double getMaximum() {
    double maximum = this.dataSet.get(0);
    for (int i = 1; i < this.dataSet.size(); i++) {
      if (this.dataSet.get(i) > maximum)
        maximum = this.dataSet.get(i);
    }
    return maximum;
  }

  /**
   * @method getRange();
   * @returns range, a Double of the highest of all values - the lowest of all values
   * */
  protected double getRange() {
    return (this.getMaximum() - this.getMinimum());
  }
}
