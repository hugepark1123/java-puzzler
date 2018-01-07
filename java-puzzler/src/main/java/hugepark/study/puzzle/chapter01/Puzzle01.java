package hugepark.study.puzzle.chapter01;

import java.util.function.Predicate;

public class Puzzle01 {
	public static Predicate<Integer> bad = (Integer i) -> i.intValue() % 2 == 1;
	public static Predicate<Integer> good = (Integer i) -> i.intValue() % 2 != 0;
	public static Predicate<Integer> better = (Integer i) -> (i.intValue() & 1) != 0;
}
