package com.example.ErrorRecreate.Config

import org.springframework.core.convert.converter.Converter
import org.springframework.expression.Expression
import org.springframework.expression.ExpressionParser
import org.springframework.expression.spel.standard.SpelExpressionParser

/**
 * Created by z001txk on 7/6/18.
 */
class StringToExpressionConverter implements Converter<String,Expression> {

    @Override
    Expression convert(String from) {
        ExpressionParser parser = new SpelExpressionParser()
        Expression exp = parser.parseExpression(from)
        return exp
    }
}
