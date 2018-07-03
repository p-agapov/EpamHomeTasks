package com.agapovp.epam.fundamentals.ht1.ex6;

/**
 * Class describing note in notepad.
 *
 * @author Paul Agapov
 * @version 1.0
 */
public class Note {
    /**
     * Title of note.
     */
    String title;
    /**
     * Text of note.
     */
    String text;

    /**
     * Private constructor.
     */
    private Note() {
    }

    /**
     * Method - generate new instance of note.
     *
     * @param title title of new note.
     * @param text text of new note.
     * @return new instance of note.
     */
    static Note getInstance(String title, String text) {
        Note instance = new Note();

        instance.title = title;
        instance.text = text;

        return instance;
    }

    @Override
    public String toString() {
        return String.format("[%s]\n---------------\n%s"
                , title.toUpperCase(), text);
    }
}
