package io.github.vincentnull.util;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;
import java.util.Set;

/**
 * bean复制转换工具类
 * @author lifei
 * @date 2025-10-20
 */
public class BeanUtil {

    private static MapperFacade mapper = null;

    static {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
    }

    /**
     * 基于Dozer转换对象的类型.
     */
    public static <S, D> D map(S source, Class<D> destinationClass) {
        return mapper.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public static <S, D> List<D> mapList(Iterable<S> sourceList, Class<D> destinationClass) {
        return sourceList != null ? mapper.mapAsList(sourceList, destinationClass) : null;
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public static <S, D> Set<D> mapSet(Iterable<S> sourceList, Class<D> destinationClass) {
        return sourceList != null ? mapper.mapAsSet(sourceList, destinationClass) : null;
    }

    /**
     * 将source复制到dest
     *
     * @param source 源对象
     * @param dest 拷贝到目标对象
     * @param <S> 源对象类型
     * @param <D> 目标对象类型
     */
    public static <S, D> void map(S source, D dest) {
        if (source != null && dest != null) {
            mapper.map(source, dest);
        }
    }

}
