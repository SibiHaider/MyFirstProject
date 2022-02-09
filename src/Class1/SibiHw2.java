package Class1;

public class SibiHw2 {
    public static void main(String[] args) {

        // HomeWork 1

        String student1 = "Smith";
        int Math1Marks = 30, English1Marks = 45;
        String student2 = "Jack";
        int Math2Marks = 100, English2Marks = 80;
        String finalResult1 = Math1Marks + English1Marks >= 80 || Math1Marks + English1Marks <= 70 ? "Excellent" : "Good";
        String finalResult2 = Math2Marks + English2Marks > 100 || Math2Marks + English2Marks < 90 ? "Excellent" : "Good";
        System.out.println("\n" + student1 + "'s Result : " + finalResult1 + "\n"+ "\n"+ student2 + "'s Result : " + finalResult2);

        // HomeWork 2
        String sentence_2 = "We all ARe GOod ProgrAMmer";
        String NewSentence_2 = sentence_2.replaceAll("[R,r]", "F");
        System.out.println("\n"+NewSentence_2);

        // The way to replace multiple at once is to use [] inside the string quotes "".


    }
}