public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 9;
        int registrationYear = 2017;
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double) likesCount / (currentYear - registrationYear+1); //+1 если мы зарегились в  2018 то нужно доб 1
        // или после первого или после второго дабл ставить нужно
        System.out.println(likesPerYear + " likes / year");
    }
}

