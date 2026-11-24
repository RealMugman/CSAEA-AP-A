package ApQuestions;
public class WeatherData {
    // Daily high temperatures, in order. Never null, no null elements.
    private ArrayList<Double> temps;


    public void cleanData(double low, double high)  {
        for (int i = temps.size() -1; i >= 0; i--) {
            if (temps[i] >= high || temps[i] <= low) {
                temps.remove(i);
            }
        }
    }

    public int longestHotStreak(double limit) {
        int current = 0;
        int longest = 0;
        for (int i = 0; i <= temps.size(); i++) {
            if (temps[i] >= limit) {
                current ++;
            } else{
                current = 0;
            }
            if (current < longest) {
                return longest;
            }
            
        }
     }
     return longest;
}

