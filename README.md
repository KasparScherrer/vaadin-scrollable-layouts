# ScrollLayout

Scrollable Layouts for Vaadin Flow

## How to install
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
````
// Vertical
VerticalScrollLayout verticalScrollLayout = new VerticalScrollLayout();
for(int i = 0; i < 30;){
    TextField textField = new TextField("Test "+ ++i);
    textField.setWidth("100%");
    verticalScrollLayout.add(textField);
}
verticalScrollLayout.setHeight("300px");

// Horizontal
HorizontalScrollLayout horizontalScrollLayout = new HorizontalScrollLayout();
for(int i = 0; i < 30;){
    horizontalScrollLayout.add(new TextField("Test "+ ++i));
}
horizontalScrollLayout.setHeight("100px");
````
