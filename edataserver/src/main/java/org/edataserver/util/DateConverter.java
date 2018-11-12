package org.edataserver.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DateConverter implements Converter<String,Date> {

    public Date convert(String source) {
        try {
            //1. 定义日期格式
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            //2. 解析日期
            Date date = format.parse(source);

            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
			