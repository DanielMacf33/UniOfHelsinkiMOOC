
public class HealthStation {
    private int weighings;


    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person){
       int currentFat = person.getWeight();
       currentFat++;
       
       person.setWeight(currentFat);          
    }
    
    public int weighings(){
        return weighings;
    }

}
