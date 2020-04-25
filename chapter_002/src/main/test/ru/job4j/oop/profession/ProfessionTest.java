package ru.job4j.oop.profession;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProfessionTest {

    @Test
    public void getDiagnose() {
        String diagnoseTitle = "Appendicite";
        Doctor firstdoc = new Doctor();
        Diagnose firstdiagnose = new Diagnose();
        firstdiagnose.setDiagnoseTitle(diagnoseTitle);
        firstdoc.setDiagnose(firstdiagnose);
        assertEquals(diagnoseTitle, firstdoc.getDiagnose().getDiagnoseTitle());
    }

    @Test
    public void getLanguage() {
        String languageTitle = "JAVA";
        Programmer firstprogrammer = new Programmer();
        Language firstlanguage = new Language();
        firstlanguage.setLanguageTitle(languageTitle);
        firstprogrammer.setLanguage(firstlanguage);
        assertEquals(languageTitle, firstprogrammer.getLanguage().getLanguageTitle());
    }

    @Test
    public void getName() {
        String name = "BOB";
        Builder foreman = new Builder();
        foreman.setName(name);
        assertEquals(name, foreman.getName());
    }
}
