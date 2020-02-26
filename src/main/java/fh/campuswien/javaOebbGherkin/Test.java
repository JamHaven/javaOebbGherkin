package fh.campuswien.javaOebbGherkin;

public class Test {

    public static void main(String[] args){
        GherkinParser gherking = new GherkinParser();
        System.out.println(gherking.parseFeatureFile("features/test.feature",true));
    }
}
