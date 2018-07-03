package com.agapovp.epam.fundamentals.ht1.ex6;

/**
 * Main function class.
 *
 * @author Paul Agapov
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        NotePad notePad = new NotePad(2);

        notePad.printNotes();

        notePad.addNote("To Do", "-Do dishes\n-Buy milk");
        notePad.addNote("Insurance number", "325-5123-4564");
        notePad.addNote("Insurance number", "325-5123-4564");

        notePad.printNotes();

        notePad.editNote(-1, "Test", "Test");
        notePad.editNote(0, "Test", "Test");
        notePad.editNote(1, "Test", "Test");
        notePad.editNote(2, "Test", "Test");

        notePad.printNotes();

        notePad.removeNote();
        notePad.removeNote();
        notePad.removeNote();

        notePad.printNotes();
    }
}
