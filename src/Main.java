public class Main {
    
    public static void main(String[] args) {
        
        try {
            switch (args[0].toLowerCase()) {
                case "v0" -> System.out.println(V0.func(Double.parseDouble(args[1])));
                case "v2" -> System.out.println(V2.compute(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4])));
                case "V4" -> System.out.println(V4.function(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
                case "v6" -> System.out.println(V6.function(Double.parseDouble(args[1])));
                case "v10" -> System.out.println(V10.compute(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]);
                case "exit" -> {
                    System.out.println("Done");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
