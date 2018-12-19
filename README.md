# ScrollLayout

Scrollable Layouts for Vaadin Flow: **VerticalScrollLayout** and **HorizontalScrollLayout**

## How to install (maven)
````
<dependency>
   <groupId>ch.carnet.kasparscherrer</groupId>
   <artifactId>scrolllayout</artifactId>
   <version>2.0.0</version>  <!-- for Vaadin 10: use version 1.0.0 -->
</dependency>
````
````
<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>

````

## How to use
Use the classes just the same as you would use a VerticalLayout / HorizontalLayout:
````
VerticalScrollLayout scrollable = new VerticalScrollLayout(new TextField("one"), new TextField("two"), new TextField("three"));

// or

VerticalScrollLayout scrollable = new VerticalScrollLayout();
scrollable.add(new TextField("one"), new TextField("two"), new TextField("three"));

// or

VerticalScrollLayout scrollable = new VerticalScrollLayout();
scrollable.add(new TextField("one"));
scrollable.add(new TextField("two"));
scrollable.add(new TextField("three"));

// or 

@Route(value="myview", layout=MainView.class)
public class MyView extends VerticalScrollLayout {
    ...
}
````
