package com.family.tools;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/16 下午2:12
 * @modified By:
 */
public class GuavaTest {
    //连接器
    private static final Joiner joiner=Joiner.on(",").skipNulls();
    //分割器
    private static final Splitter splitter=Splitter.on(",").trimResults().omitEmptyStrings();

    //匹配器
    private static final CharMatcher charMatcherDigit=CharMatcher.digit();

    private static final CharMatcher charMatcherAny=CharMatcher.any();

    public static void main(String[] args) {
        String joinStr=joiner.join(Lists.newArrayList("a","b","d",null,""));
        //System.out.println("joinStr="+joinStr);

        for (String tempStr:splitter.split("a,b,c")){
            System.out.println(tempStr);
        }

        System.out.println("匹配数字，保存匹配项："+charMatcherDigit.retainFrom("abcdefm9787-"));
        System.out.println("匹配数字，移除匹配项："+charMatcherDigit.removeFrom("abcdefm9787-"));

        System.out.println("匹配范围，移除匹配项："+charMatcherAny.inRange('a','f').replaceFrom("abcdefm9787-","*"));
    }
}
