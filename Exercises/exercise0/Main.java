import java.util.Random;
class Candy {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;
    private Wrapper wrapper;
    private Filling filling;

    public Candy(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Candy instance: " + this.name);
    }

    public void addWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void addFilling(Filling filling) {
        this.filling = filling;
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public class Wrapper {
        private String name;
        private int size;

        public Wrapper(String name, int size) {
            this.name = name;
            this.size = size;
            System.out.println("Add some wrapper " + name + " to candy");
        }
    }

    public class Filling {
        private String name;
        private int size;

        public Filling(String name, int size) {
            this.name = name;
            this.size = size;
            System.out.println("Add some filling " + name + " to candy");
        }
    }
}

class Banana {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Banana(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Banana instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Banana");
    }

    public void method2() {
        System.out.println("Method2 in Banana");
    }

    public void method3() {
        System.out.println("Method3 in Banana");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class OrangeJuice {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public OrangeJuice(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created OrangeJuice instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in OrangeJuice");
    }

    public void method2() {
        System.out.println("Method2 in OrangeJuice");
    }

    public void method3() {
        System.out.println("Method3 in OrangeJuice");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Bread {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Bread(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Bread instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Bread");
    }

    public void method2() {
        System.out.println("Method2 in Bread");
    }

    public void method3() {
        System.out.println("Method3 in Bread");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Pie {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Pie(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Pie instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Pie");
    }

    public void method2() {
        System.out.println("Method2 in Pie");
    }

    public void method3() {
        System.out.println("Method3 in Pie");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Yogurt {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Yogurt(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Yogurt instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Yogurt");
    }

    public void method2() {
        System.out.println("Method2 in Yogurt");
    }

    public void method3() {
        System.out.println("Method3 in Yogurt");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Jam {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Jam(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Jam instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Jam");
    }

    public void method2() {
        System.out.println("Method2 in Jam");
    }

    public void method3() {
        System.out.println("Method3 in Jam");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Pancake {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Pancake(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Pancake instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Pancake");
    }

    public void method2() {
        System.out.println("Method2 in Pancake");
    }

    public void method3() {
        System.out.println("Method3 in Pancake");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Bagel {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Bagel(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Bagel instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Bagel");
    }

    public void method2() {
        System.out.println("Method2 in Bagel");
    }

    public void method3() {
        System.out.println("Method3 in Bagel");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

class Sandwich {
    private int id;
    private String name;
    private double weight;
    private int size;
    private boolean isEdible;
    private String expireDate;
    private String batch;
    private String ingredient;

    public Sandwich(String name) {
        this.id = generateId();
        this.name = name;
        System.out.println("Created Sandwich instance: " + this.name);
    }

    public void method1() {
        System.out.println("Method1 in Sandwich");
    }

    public void method2() {
        System.out.println("Method2 in Sandwich");
    }

    public void method3() {
        System.out.println("Method3 in Sandwich");
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("candy1");

        Candy.Wrapper wrapper = candy.new Wrapper("white", 1);
        Candy.Filling filling = candy.new Filling("sweet", 2);

        candy.addWrapper(wrapper);
        candy.addFilling(filling);

        Candy candy2 = new Candy("candy2");
        Candy candy3 = new Candy("candy3");

        Banana bananaA = new Banana("BananaA");
        Banana bananaB = new Banana("BananaB");
        Banana bananaC = new Banana("BananaC");

        OrangeJuice orangeJuiceA = new OrangeJuice("OrangeJuiceA");
        OrangeJuice orangeJuiceB = new OrangeJuice("OrangeJuiceB");
        OrangeJuice orangeJuiceC = new OrangeJuice("OrangeJuiceC");

        Bread breadA = new Bread("BreadA");
        Bread breadB = new Bread("BreadB");
        Bread breadC = new Bread("BreadC");

        Pie pieA = new Pie("PieA");
        Pie pieB = new Pie("PieB");
        Pie pieC = new Pie("PieC");

        Yogurt yogurtA = new Yogurt("YogurtA");
        Yogurt yogurtB = new Yogurt("YogurtB");
        Yogurt yogurtC = new Yogurt("YogurtC");

        Jam jamA = new Jam("JamA");
        Jam jamB = new Jam("JamB");
        Jam jamC = new Jam("JamC");

        Pancake pancakeA = new Pancake("PancakeA");
        Pancake pancakeB = new Pancake("PancakeB");
        Pancake pancakeC = new Pancake("PancakeC");

        Bagel bagelA = new Bagel("BagelA");
        Bagel bagelB = new Bagel("BagelB");
        Bagel bagelC = new Bagel("BagelC");

        Sandwich sandwichA = new Sandwich("SandwichA");
        Sandwich sandwichB = new Sandwich("SandwichB");
        Sandwich sandwichC = new Sandwich("SandwichC");
    }
}