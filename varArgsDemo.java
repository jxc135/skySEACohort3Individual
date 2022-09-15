public class varArgsDemo {

    public static String demoMethod(String...message){

        StringBuilder stringBob = new StringBuilder();
        for(String thingy : message){
            stringBob.append(thingy);
        }

        return stringBob.toString();
    }

    public static void main(String[] args) {
        String[] weirdWords= {"hello ","bellow ","mellow "};

        System.out.println(demoMethod(weirdWords));

        System.out.println(demoMethod());
    }
}
