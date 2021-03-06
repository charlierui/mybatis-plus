package com.github.mustfun.mybatis.plugin.dom.converter;

import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.ResolvingConverter;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;

/**
 * @author yanglin
 * 继承 ResolvingConverter ，getVariants方法就是候选项
 * 实现Converter 接口，能将任意对象转为string,或相反
 */
public abstract class AbstractConverterAdaptor<T> extends ResolvingConverter<T> {

    @NotNull
    @Override
    public Collection<? extends T> getVariants(ConvertContext context) {
        return Collections.emptyList();
    }

    @Nullable
    @Override
    public String toString(@Nullable T t, ConvertContext context) {
        //throw new UnsupportedOperationException();
        return null;
    }

    @Nullable
    @Override
    public T fromString(@Nullable @NonNls String s, ConvertContext context) {
        return null;
    }
}
