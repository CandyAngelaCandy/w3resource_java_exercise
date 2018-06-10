package com.twu.Numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersExercise5 {

    static Map<BigInteger, Tuple> cache = new HashMap<>();

    static class Tuple {
        final Boolean flag;
        final BigInteger bi;

        Tuple(boolean f, BigInteger b) {
            flag = f;
            bi = b;
        }
    }

    static BigInteger rev(BigInteger bi) {
        String s = new StringBuilder(bi.toString()).reverse().toString();
        return new BigInteger(s);
    }
    static Tuple lychrel(BigInteger n) {
        Tuple res;
        if ((res = cache.get(n)) != null)
            return res;

        BigInteger r = rev(n);
        res = new Tuple(true, n);//对res初始化，参数f为true表示为lychrel数
        List<BigInteger> seen = new ArrayList<>();//seen的作用：
        for (int i = 0; i < 500; i++) {
            n = n.add(r);
            r = rev(n);

            if (n.equals(r)) { // n为回文数
                res = new Tuple(false, BigInteger.ZERO);
                break;
            }
            if (cache.containsKey(n)) {//cache的作用，保存这个过程中无法产生回文数
                res = cache.get(n);
                break;
            }
            seen.add(n);
        }
        for (BigInteger bi : seen)
            cache.put(bi, res);
        return res;
    }
    public static void main(String[] args) {
        List<BigInteger> seeds = new ArrayList<>();
        List<BigInteger> related = new ArrayList<>();
        List<BigInteger> palin = new ArrayList<>();

        for (int i = 1; i <= 10_000; i++) {
            BigInteger n = BigInteger.valueOf(i);
            Tuple t = lychrel(n);
            if (!t.flag)//最后结果是回文数，不是lychrel数
                continue;

            if (n.equals(t.bi))
                seeds.add(t.bi);
            else
                related.add(t.bi);

            if (n.equals(t.bi))
                palin.add(t.bi);
        }
        System.out.printf("%d Lychrel seeds: %s%n", seeds.size(), seeds);
        System.out.printf("%d Lychrel related%n", related.size());
        System.out.printf("%d Lychrel palindromes: %s%n", palin.size(), palin);
    }
}
