package cn.edu.jlu.hotelms.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * ��ʶMyBatis��DAO,����{@link org.mybatis.spring.mapper.MapperScannerConfigurer}��ɨ�衣 
 * @author �Կ���
 * @version 2015-12-13
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyBatisDao {
	
}