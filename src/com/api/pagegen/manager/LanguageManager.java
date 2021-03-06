package com.api.pagegen.manager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.api.pagegen.dataloader.LanguageDataFileLoader;
import com.api.pagegen.model.Language;

public class LanguageManager {
    private static LanguageManager instance;
    private LinkedList<Language> languageList;
    private HashMap<String, Language> languageMap;
    
    private LanguageManager() {
        this.languageList = new LinkedList<Language>();
        this.languageMap = new HashMap<String, Language>();
    }
    
    @SuppressWarnings("unchecked")
    private void initialize() {
        // Load language data from json file
        LanguageDataFileLoader languageLoader = new LanguageDataFileLoader();
        this.languageList = (LinkedList<Language>)languageLoader.loadData();
        
        for (Language language : this.languageList) {
            this.languageMap.put(language.getName(), language);
        }
    }
    
    public static LanguageManager getInstance() {
        if (instance == null)
        {
            instance = new LanguageManager();
            instance.initialize();
        }
        
        return instance;
    }
    
    public List<Language> getAllLanguageDefinitions() {
        return this.languageList;
    }
    
    public Language getLanguageDefinition(String languageName) {
        return this.languageMap.get(languageName);
    }
    
    public void printAllLanguageDefinitions() {
        List<Language> languages = this.getAllLanguageDefinitions();
        
        for (Language language: languages) {
            System.out.println();
            System.out.println(language.getName());
            System.out.println(language.getPackageManager());
            System.out.println(language.getPackageManagerUrl());
        }
    }
}
