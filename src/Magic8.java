public class Magic8 {

    public static void main(String[] args) {
        int randomNumber = (int)((Math.random()*(20))+1);
        System.out.println(randomNumber);

        switch (randomNumber) {
            case 1 -> System.out.println("It is certain.");
            case 2 -> System.out.println("It is decidedly so.");
            case 3 -> System.out.println("Without a doubt.");
            case 4 -> System.out.println("Yes definitely.");
            case 5 -> System.out.println("You may rely on it.");
            case 6 -> System.out.println("As I see it, yes.");
            case 7 -> System.out.println("Most likely.");
            case 8 -> System.out.println("Outlook good.");
            case 9 -> System.out.println("Yes.");
            case 10 -> System.out.println("Signs point to yes.");
            case 11 -> System.out.println("Reply hazy, try again.");
            case 12 -> System.out.println("Ask again later.");
            case 13 -> System.out.println("Better not tell you now.");
            case 14 -> System.out.println("Cannot predict now.");
            case 15 -> System.out.println("Concentrate and ask again.");
            case 16 -> System.out.println("Don't count on it.");
            case 17 -> System.out.println("My reply is no.");
            case 18 -> System.out.println("My sources say no.");
            case 19 -> System.out.println("Outlook not so good.");
            case 20 -> System.out.println("Very doubtful.");
            default -> System.out.println("An error occurred.");
        }
    }
}
