# ScrollLayout

Scrollable Layouts for Vaadin Flow

## How to install
coming up..

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
