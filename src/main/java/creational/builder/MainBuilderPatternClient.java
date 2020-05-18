package creational.builder;

public class MainBuilderPatternClient {
    public static void main(String[] args) {
        PcBuilderDirector director = new PcBuilderDirector();
        IPcBuilder pcBuilder = new OfficePcBuilder();
        director.build(pcBuilder);
        System.out.println(pcBuilder.getPc().toString());

        pcBuilder = new GamingPcBuilder();
        director.build(pcBuilder);
        System.out.println(pcBuilder.getPc().toString());

        pcBuilder = new ServerPcBuilder();
        director.build(pcBuilder);
        System.out.println(pcBuilder.getPc().toString());
    }

}
