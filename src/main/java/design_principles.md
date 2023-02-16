# Design Principles

## Single Responsibility Principle <br> 单一责任原则

> “A class should have one, and only one reason to change.” -- Robert C. Martin

一个类只承担一项职责，符合“高内聚，低耦合”的思想。

## Open Closed Principle <br> 开闭原则

> "A software artifact - such as a class or a component - should be open for extension but closed for modification." --
> Robert C. Martin

对扩展开放，对修改关闭。意思是应该通过扩展的方式来实现软件的新功能/变化，而不是通过修改原有代码。

## Liskov Substitution Principle <br> 里氏替换原则

> "Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S
> is a subtype of T." -- Barbara Liskov in 1987

里氏替换原则是对继承关系中子类的约束，以保证任何使用父类引用的地方都可以使用其子类的对象而不会导致异常。

* 子类可以重写父类的抽象方法，但不能重写父类的非抽象方法；
* 子类重写父类的方法时，可以扩大参数类型的范围，但不能缩小；
* 子类重写父类的方法时，可以缩小返回类型的范围，但不能扩大；
* 子类可以定义自己特有的方法。

## Interface Segregation Principle <br> 接口分离原则

> “Clients should not be forced to depend upon interfaces that they do not use.” — Robert C. Martin

接口分离原则是对接口的约束。

不应将不相关的方法都放入到一个接口中，否则会导致实现类必须去实现一些其自身并不会用到的方法；并且一旦接口中的某个方法发生结构变化，所有的实现类都必须进行相应的修改，即使实现类并不会用到这个方法。

简单来说，就是要在合理的范围内，尽可能地精简接口。

## Dependency Inversion Principle <br> 依赖倒置原则

> “A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
> B. Abstractions should not depend on details. Details should depend on abstractions.” — Robert C. Martin

依赖倒置原则约束的是高层模块与底层模块的依赖关系，其核心思想是面向接口编程。

一个模块不应该依赖于另一个模块的具体实现，而是应该依赖于它的抽象，而抽象并不依赖于具体实现。这样，即使一个模块中的具体实现发生变化，也并不会导致其抽象发生变化，因而也不会导致依赖于它的其他模块发生变化。

## Law of Demeter <br> 迪米特法则/最少知识原则

> “Talk only to your immediate friends and not to strangers.”

迪米特法则，又称最少知识原则 (The Least Knowledge Principle)，其核心思想是降低类之间的耦合。

一个类不应该直接调用非朋友类的方法，避免形如objectA.getObjectB().getObjectC().invokeMethod()的链式调用。

`朋友类的定义:`

1. 当前对象本身 (this)
2. 以参数形式传入的对象
3. 直接引用的对象
4. 当前对象所创建的对象

## Composite Reuse Principle <br> 合成复用原则

> “Classes should achieve polymorphic behavior and code reuse by their composition rather than inheritance from a base
> or parent class.”

合成复用原则又称composition over inheritance，规定只有在两个类间存在明确的“is-a”关系时，才使用继承来实现代码复用，否则应该使用组合/聚合来实现。

## SOLID defined by Robert C. Martin

* <u>S</u>ingle Responsibility Principle
* <u>O</u>pen Closed Principle
* <u>L</u>iskov Substitution Principle
* <u>I</u>nterface Segregation Principle
* <u>D</u>ependency Inversion Principle
