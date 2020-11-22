package ru.mirea.lab16;

public final class Customer {
    private final String name;
    private final String secondName;
    private final int age;
    private final Address address;

    public final Customer MATURE_UNKNOWN_CUSTOMER  = new Customer(null, null, 40, null);
    public final Customer NON_MATURE_UNKNOWN_CUSTOMER  = new Customer(null, null, 14, null);

    public Customer(String name, String secondName, int age, Address address) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
