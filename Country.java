import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class to represent a Country object
 */
public class Country implements Comparable<Country>{
    // data members
    public String code;
    private String name;
    private double area;
    // Linkedlist of pairs (year, population count)
    private LinkedList<MapEntry<Integer,Integer>> population;
    
    // Hashtable of pairs (year, carbon emissions in tons). year is the key
    private HashMapSC<Integer,Double> emission;
   
    /**
     *  Constructor with three parameters
     * @param c the country code
     * @param n the country name
     * @param a the country area
     *  */ 
    public Country(String c, String n, double a){
        code = c;
        name = n;
        area = a;
        population = new LinkedList<>();
        emission = new HashMapSC<>();
    }
    /**
     * Getter for the country code
     * @return the country code
     */
    public String getCode(){ return code;}
    /**
     * Getter for the country name
     * @return the country name
     */
    public String getName(){ return name;}
    /**
     * Getter for the area
     * @return the country area
     */
    public double getArea(){ return area;}
    /**
     * toString()
     * @return formatted string with the country attributes (code, name, and area)
     */
    public String toString(){
        return String.format("%-10s\t%-32s\t%-10.2f", code, name, area);
    }
    /**
     * Setter for the country code
     * @param c the country code
     */
    public void setCode(String c){ code = c;}
    /**
     * Setter for the name
     * @param n the country name
     */
    public void setName(String n){ name = n;}
    /**
     * Setter for te area
     * @param a the country area
     */
    public void setArea(double a){ area = a;}
    /**
     * Method to add a pair (year, count) to the linkedlist population
     * @param year
     * @param population count for year
     */
    public void addPopulation(int year, int count){
        population.add(new MapEntry<>(year, count));
    }
    /**
     * Method to get the population count for a given year
     * @paran the given year
     * @return the population for the given year if the year is found, 0 otherwise
     */
    public int getPopulation(int year){
        if(populationData.isEmpty()) {
            return -1; 
        }
        int left = 0;
        int right = populationData.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            PopulationEntry entry = populationData.get(mid);
            if (entry.getYear() == year) {
                return entry.getPopulation();
            }
            else if (entry.getYear() > year) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
        }
    }
    /**
     * Method o add a pair (year, carbon emission) to the hashmap emission
     * @param year the key of the new entry in the hash table
     * @param emissiony the value of the new entry in the hash table
     */
    public void addEmission(int year, double emissiony){
        emission.put(year, emissiony);
    }
    /**
     * Method to get the carbon emission of a given year
     * @param year
     * @return the carbon emission for the given year
     */
    public Double getEmission(int year){
        return emission.get(year);
    }
    /**
     * Method compareTo to define the natural ordering
     * @param c the country compared to this country
     * @return 0 if the two countries have the same country code
     *         >0 if this country has a code greater than the code of country c
     *         <0 if this country has a code less than the code of country c
     */
    public int compareTo(Country c){
        return this.countryCode.compareTo(c.countryCode);
    }
    /*public Country getExtremeEmission(TreeMap<String,Country> tm, int year, boolean maxmin){
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }
        T min = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(min) < 0) {
                // If current element is less than current min, update min
                min = current;
            }
        }
        return min;
    }
    */
}