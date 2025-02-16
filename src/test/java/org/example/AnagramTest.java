package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram anag;
    @BeforeEach
    void ang() {
        anag= new Anagram();
    }



    @Test
    void testFirst_est_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "oklm"));
    }
    @Test
    void testSecond_est_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("Chihab", null));
    }
    @Test
    public void testNot_meme_Length() {
        assertFalse(anag.isAnagram("Chihab", "math"));
    }
    @Test
    public void test_est_Anagram() {
        assertEquals(true, anag.isAnagram("Amraoui", "Amraoui"));
    }

    @Test
    void test_les_deux_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }


    @Test
    public void test_No_Anagram() {
        assertFalse(anag.isAnagram("azertyui", "azerttttttt"));
    }




}