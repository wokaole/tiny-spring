package com.cold.spring.xml;

import com.cold.spring.BeanDefinition;
import com.cold.spring.io.URLResourceLoader;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Created by faker on 2017/3/18.
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void testLoadBeanDefinitions() throws Exception {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(new URLResourceLoader());
        reader.loadBeanDefinitions("bean.xml");
        Map<String, BeanDefinition> register = reader.getRegister();
        Assert.assertTrue(register.size() > 0);
    }

}