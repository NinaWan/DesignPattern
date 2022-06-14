# 工厂模式比较

## 概述

简单工厂：

* 一个工厂类
* 一个抽象产品类，多个产品子类
* 工厂类可以创建多个不同的产品子类

工厂方法：

* 一个抽象工厂类，多个工厂子类
* 一个抽象产品类，多个产品子类
* 每个工厂子类可以创建一个特定的产品子类

抽象工厂：

* 一个抽象工厂类，多个工厂子类
* 多个抽象产品类，每个抽象产品类有多个产品子类
* 每个工厂子类可以创建一系列产品子类，同种产品类型中只能创建其中一个特定的产品子类

可以看出，三者是层层递进的，每一种模式都解决了上一种模式无法解决的问题。

## 演化过程

### 开始

将对象实例化的过程放在Client类里处理。

#### Product

```java
public abstract class Product {
    void method();
}

public class ConcreteProduct1 extends Product {
    @Override
    void method() {
    }
}

public class ConcreteProduct2 extends Product {
    @Override
    void method() {
    }
}
```

#### Client

```java
public class Client {
    public void method(String type) {
        Product product = null;
        switch (type) {
            case "1":
                product = new ConcreteProduct1();
            case "2":
                product = new ConcreteProduct2();
        }
        product.method();
    }
}
```

### 简单工厂

将对象实例化的代码从Client类里抽取出来放到一个单独的工厂类里，做到Client类与对象创建过程解耦。
这样，当产品类发生变化时，Client类无需进行修改。

#### Factory

```java
public class Factory {
    public static Product createProduct(String type) {
        if (type.equals("1")) {
            return new ConcreteProduct1();
        } else if (type.equals("2")) {
            return new ConcreteProduct2();
        }
        return null;
    }
}
```

#### Client

```java
public class Client {
    public void method(String type) {
        Product product = Factory.createProduct(type);
        assert product != null;
        product.method();
    }
}
```

### 工厂方法

在简单工厂的基础上，工厂类转化为抽象工厂类，将对象实例化的过程放到工厂方法里处理，并由工厂子类去决定具体实现细节。
这样，将工厂类与对象实例化过程解耦，当增减产品类时，无需修改工厂类，只需要增减相应的工厂子类即可。

#### Creator

Client与Factory的结合，也可以分开实现。

```java
public abstract class Creator {
    abstract Product createProduct(); // factory method

    public void method() {
        Product product = createProduct();
        product.method();
    }
}

public class ConcreteCreator1 extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProduct1();
    }
}

public class ConcreteCreator2 extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProduct2();
    }
}
```

### 抽象工厂

在工厂方法的基础上，拥有了多个抽象产品类，每个工厂子类都可以创建一系列不同类型的产品子类，解决了工厂方法中只有一种类型的产品类且每个工厂子类只能创建一个特定的产品子类的问题。

#### Product

* ProductA

```java
public abstract class ProductA {
    public abstract void method();
}

public class ConcreteProductA1 extends ProductA {
    @Override
    public void method() {
        System.out.println("ConcreteProductA1::method");
    }
}

public class ConcreteProductA2 extends ProductA {
    @Override
    public void method() {
        System.out.println("ConcreteProductA2::method");
    }
}
```

* ProductB

```java
public abstract class ProductB {
    public abstract void method();
}

public class ConcreteProductB1 extends ProductB {
    @Override
    public void method() {
        System.out.println("ConcreteProductB1::method");
    }
}

public class ConcreteProductB2 extends ProductB {
    @Override
    public void method() {
        System.out.println("ConcreteProductB2::method");
    }
}
```

#### Factory

```java
public abstract class Factory {
    public abstract ProductA createProductA();

    public abstract ProductB createProductB();
}

public class ConcreteFactory1 extends Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

public class ConcreteFactory2 extends Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
```

#### Client

```java
public class Client {
    public void method1() {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.method();
        productB.method();
    }

    public void method2() {
        Factory factory = new ConcreteFactory2();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.method();
        productB.method();
    }
}
```