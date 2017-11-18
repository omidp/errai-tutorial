/*
 * Copyright (C) 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.omidbiz.errai.client.local;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.ForEvent;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.Window;

import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.MouseEvent;


@Page(role = DefaultPage.class)
@Templated
@ApplicationScoped
public class WelcomePage implements IsElement
{

    
    @Inject
    @DataField("root")
    HTMLDivElement div;
    
    @Inject
    @DataField("txt")
    HTMLInputElement txt;
    
    
    @Inject
    @DataField("btn")
    HTMLButtonElement btn;
    
    
    @Override
    public HTMLElement getElement()
    {
        return div;
    }
    
    @EventHandler("btn")
    public void onBtnClick(final @ForEvent("click") MouseEvent event)
    {
        Window.alert(txt.value);
    }

}
