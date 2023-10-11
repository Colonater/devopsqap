package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SuggestionEngineTest {

    @Test
    public void testGenerateSuggestionsCorrectWord() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        assertEquals("", suggestionEngine.generateSuggestions("correct"));
    }

    @Test
    public void testGenerateSuggestionsIncorrectWord() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String suggestions = suggestionEngine.generateSuggestions("incorrct");
        assertNotNull(suggestions);
        assertTrue(suggestions.contains("correct")); // Adjust based on your expected results
    }

    @Test
    public void testGenerateSuggestionsEmptyInput() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        assertEquals("", suggestionEngine.generateSuggestions(""));
    }
}
