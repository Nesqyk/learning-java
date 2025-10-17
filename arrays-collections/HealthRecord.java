

public class HealthRecord {
    
    public static void main(String[] args) {
        // senior males=80
        // junior males=100
        // senior females=100
        // junior females=120

        // (dele ko sure diri)
        // senior healthy= .25
        // senior sick= .30
        // senior carrier=.15

        // junior healthy=.25
        // junior sick=.45
        // junior carrier=.50

        int seniorMale = 80;
        int juniorMale = 100;
        
        int seniorFemale = 100;
        int juniorFemale = 120;

        double[] juniorWeight = {25.0, 45.0, 50.0};
        double[] seniorWeight = {25.0, 30.0, 15.0};

        int[] resultMale = new int[3];
        int[] resultFemale = new int[3];

        for (int i = 0; i < 3; i++) {
            resultMale[i] = (int)(juniorMale * (juniorWeight[i] / 100));
            resultMale[i] += (int)(seniorMale * (seniorWeight[i] / 100));

            resultFemale[i] = (int)(juniorFemale * (juniorWeight[i] / 100));
            resultFemale[i] += (int)(seniorFemale * (seniorWeight[i] / 100));
        }

        // print result here

        for (int resMale : resultMale) {
            System.out.println(resMale);
        }

        for (int resFemale : resultFemale) {
            System.out.println(resFemale);
        }
    }
}