/**
 * Copyright 2018 Kaspar Scherrer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.carnet.kasparscherrer;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class HorizontalScrollLayout extends HorizontalLayout {
    private HorizontalLayout content;

    public HorizontalScrollLayout(){
        super();
        preparePanel();
    }

    public HorizontalScrollLayout(Component... children){
        super();
        preparePanel();
        this.add(children);
    }

    private void preparePanel() {
        setWidth("100%");
        setHeight("100%");
        getStyle().set("overflow", "auto");

        content = new HorizontalLayout();
        content.setWidth(null);
        content.setHeight("100%");
        content.setPadding(false);
        super.add(content);
    }

    public HorizontalLayout getContent(){
        return content;
    }

    @Override
    public void add(Component... components){
        content.add(components);
    }

    @Override
    public void remove(Component... components){
        content.remove(components);
    }

    @Override
    public void removeAll(){
        content.removeAll();
    }

    /*
    // doesn't exist in Vaadin 10.0.8 yet
    @Override
    public void addComponentAsFirst(Component component) {
        content.addComponentAtIndex(0, component);
    }*/
}
