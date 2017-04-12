package hello.mapper;

/**
 * Created by olya on 08.04.2017.
 */

public interface Mapper<D, E> {

    D parserToDTO(E e);

    E parserToEntity(D d);
}
