package Map_Set_Stream;

class Person {
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    
    public String getAgeGroup() {
        if (age < 18) return "JOVEM";
        else if (age < 60) return "ADULTO";
        else return "IDOSO";
    }
}

class Transaction {
    private String category;
    private double amount;
    
    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
    
    // getters
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
}