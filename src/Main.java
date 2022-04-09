public class Main {
    
    public static void main(String[] args) {
        
        try {
            switch (args[0].toLowerCase()) {
                case "v0" -> System.out.println(V0.func(Double.parseDouble(args[1])));
                case "V15" -> System.out.println(V15.compute(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4])));
                case "exit" -> {
                    System.out.println("Vipolnil");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Oshibka(");
        }
    }
}
