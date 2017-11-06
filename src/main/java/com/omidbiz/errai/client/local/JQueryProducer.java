package com.omidbiz.errai.client.local;

import javax.enterprise.inject.Produces;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import org.jboss.errai.common.client.dom.Element;
import org.jboss.errai.common.client.dom.HTMLElement;


@JsType(isNative = true)
public abstract class JQueryProducer
{

    @JsFunction
    @FunctionalInterface
    public static interface JQuery
    {
        JQueryElement wrap(Element element);
    }

    @JsType(isNative = true)
    public static interface JQueryElement extends HTMLElement
    {
        void after(HTMLElement element);

        void before(HTMLElement element);

        JQueryArray children();

        JQueryArray children(String selector);
    }

    @JsType(isNative = true)
    public static interface JQueryArray
    {
        JQueryElement first();

        JQueryElement get(int index);
    }

    @Produces
    @JsProperty(name = "$", namespace = JsPackage.GLOBAL)
    public static native JQuery get();

}