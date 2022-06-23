package com.den.Exercism;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParangramTest {
    private Parangram pangramChecker;
    @Before
    public void setup() {
        pangramChecker = new Parangram();
    }
    @Test
    public void emptySentenceIsNotPangram() {
        assertFalse(pangramChecker.isPangram(""));
    }
    @Test
    public void perfectLowerCasePhraseIsPangram() {
        assertTrue(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }
    //@Ignore("Remove to run test")
    @Test
    public void phraseWithOnlyLowerCaseIsPangram() {
        assertTrue(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
    }
    //@Ignore("Remove to run test")
    @Test
    public void phraseMissingCharacterXIsNotPangram() {
        assertFalse(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }
    //@Ignore("Remove to run test")
    @Test
    public void phraseMissingCharacterHIsNotPangram() {
        assertFalse(pangramChecker.isPangram("five boxing wizards jump quickly at it"));
    }
    //@Ignore("Remove to run test")
    @Test
    public void phraseWithUnderscoresIsPangram() {
        assertTrue(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }
   // @Ignore("Remove to run test")
    @Test
    public void phraseWithNumbersIsPangram() {
        assertTrue(pangramChecker.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }
    //@Ignore("Remove to run test")
    @Test
    public void phraseWithMissingLettersReplacedByNumbersIsNotPangram() {
        assertFalse(pangramChecker.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog"));
    }
   // @Ignore("Remove to run test")
    @Test
    public void phraseWithMixedCaseAndPunctuationIsPangram() {
        assertTrue(pangramChecker.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
    }
    //@Ignore("Remove to run test")

    @Test
    public void caseInsensitivePhraseIsNotPangram() {
        assertFalse(pangramChecker.isPangram("the quick brown fox jumps over with lazy FX"));
    }


//    @Test
//    public void caseInsensitivePhraseIsNotPangram() {
//        assertThrows(UnsupportedOperationException.class,()->{
//
//        });
    }

