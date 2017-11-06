package com.omidbiz.errai.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Body;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.omidbiz.errai.client.local.JQueryProducer.JQuery;

@EntryPoint
public class App
{

    @Inject
    private NavigationPanel navPanel;

    @Inject
    private JQuery $;

    @Inject
    private NavigationWrapper navWrapper;

    @PostConstruct
    public void init()
    {
        Document.get().getBody().appendChild(navWrapper.getBody());
    }

}