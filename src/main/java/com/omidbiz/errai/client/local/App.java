package com.omidbiz.errai.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.EntryPoint;

import com.omidbiz.errai.client.local.JQueryProducer.JQuery;

import elemental2.dom.HTMLDocument;

@EntryPoint
public class App
{


    @Inject
    private JQuery $;
    
    @Inject
    WelcomePage page;
    
    @Inject
    HTMLDocument doc;

    @PostConstruct
    public void init()
    {
//        RootPanel.get("rootPanel").add(page.getElement());
        doc.appendChild(page.getElement());
    }

}