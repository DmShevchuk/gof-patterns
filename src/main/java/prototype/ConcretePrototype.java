package prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class ConcretePrototype implements Prototype {
    private String name;
    private int age;

    public ConcretePrototype(ConcretePrototype concretePrototype) {
        this.name = concretePrototype.getName();
        this.age = concretePrototype.getAge();
    }

    public ConcretePrototype(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}