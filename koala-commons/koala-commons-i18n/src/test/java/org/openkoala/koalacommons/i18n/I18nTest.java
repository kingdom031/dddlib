package org.openkoala.koalacommons.i18n;

import org.junit.Assert;
import org.junit.Test;
import org.openkoala.framework.i18n.I18NManager;

/**
 * 国际化测试
 * @author lingen
 *
 */
public class I18nTest {

	@Test
	public void shouldUsingDefaultLocale(){
		String value = I18NManager.getMessage("name");
		Assert.assertTrue(value.equals("考拉"));
	}
	
	@Test
	public void shouldUsingENLocale(){
		String value = I18NManager.getMessage("name","en");
		Assert.assertTrue("Koala".equals(value));
	}
}