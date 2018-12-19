package ch.carnet.kasparscherrer;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        add(new H4("VerticalScrollLayout"));
        VerticalScrollLayout verticalScrollLayout = new VerticalScrollLayout();
        for(int i = 0; i < 30;){
            TextField textField = new TextField("Test "+ ++i);
            textField.setWidth("100%");
            verticalScrollLayout.add(textField);
        }
        verticalScrollLayout.setHeight("300px");
        add(verticalScrollLayout);

        add(new H4("HorizontalScrollLayout"));
        HorizontalScrollLayout horizontalScrollLayout = new HorizontalScrollLayout();
        for(int i = 0; i < 30;){
            horizontalScrollLayout.add(new TextField("Test "+ ++i));
        }
        horizontalScrollLayout.setHeight("100px");
        add(horizontalScrollLayout);
    }
}
