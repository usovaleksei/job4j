package stream;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Class easy stream without Stream API
 * @author Aleksei Usov
 * @since 25/11/2020
 */

public class EasyStream {

    private Iterator<Integer> data;

    //inner class to build stream

    private static class EasyStreamBuilder {

        private final EasyStream easyStream;

        public EasyStreamBuilder() {
            this.easyStream = new EasyStream();
        }

        public EasyStream build(List<Integer> source) {
            this.easyStream.data = source.iterator();
            return this.easyStream;
        }

    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStreamBuilder().build(source);

    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> list = new LinkedList<>();

        while (data.hasNext()) {
            list.add(fun.apply(data.next()));
        }

        return EasyStream.of(list);

    }

    public EasyStream filter(Predicate<Integer> fun) {

        List<Integer> filteredList = new LinkedList<>();

        while (data.hasNext()) {
            Integer i = data.next();
            if (fun.test(i))  {
                filteredList.add(i);
            }
        }

        return  EasyStream.of(filteredList);
    }

    public List<Integer> collect() {
        List<Integer> list = new LinkedList<>();

        while (data.hasNext()) {
            list.add(data.next());
        }

        return list;
    }
}
