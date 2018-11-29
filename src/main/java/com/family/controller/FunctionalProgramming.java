package com.family.controller;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:13 2018/11/27
 */
public class FunctionalProgramming {

    private Set<String> NON_WORDS=new HashSet<String>(){{
        add("w");
        add("sale");
        add("welcome");
        add("as");
    }};
    private List<String> regexToList(String words, String regex){
        List wordList=new ArrayList();
        Matcher matcher= Pattern.compile(regex).matcher(words);
        while (matcher.find())
            wordList.add(matcher.group());
        System.out.println(wordList.toString());
        return wordList;
    }


    public Map wordFreq(String words){
        TreeMap<String,Integer> wordMap=new TreeMap<>();
        regexToList(words,"\\w+").stream()
                .map(w->w.toLowerCase())
        .filter(w->!NON_WORDS.contains(w))
                .forEach(w->wordMap.put(w,wordMap.getOrDefault(w,0)+1));
        return wordMap;
    }


    public String cleanNames(List<String> names){
        if(names==null) return "";
        return names.stream().filter(name->name.length()>1)
                .map(name->capitalize(name))
                .collect(Collectors.joining(","));
    }

    private String capitalize(String name) {
        String a= name.substring(0,1).toUpperCase()+name.substring(1, name.length());
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        FunctionalProgramming f=new FunctionalProgramming();
        /*
        System.out.println(f.wordFreq("word is a world as welcome word"));*/
        List<String> names=new ArrayList<>();
        names.add("b");
        names.add("did");
        System.out.println(f.cleanNames(names));
    }
}
