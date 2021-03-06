package com.cold.spring.beans;

/**
 * bean的内容及元数据，保存在BeanFactory中
 * 包括bean的名称、属性、方法等属性
 * Created by faker on 2017/3/15.
 */
public class BeanDefinition {

    private String beanClassName;

    private Object bean;

    private Class beanClass;

    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition() {
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
