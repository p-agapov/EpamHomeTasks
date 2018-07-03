package com.agapovp.epam.fundamentals.ht1.ex6;

/**
 * Class describing simple notepad.
 *
 * @author Paul Agapov
 * @version 1.0
 */
public class NotePad {
    /**
     * Total count of existing notes.
     */
    private static int noteCount = 0;

    /**
     * Maximum of notes.
     */
    private int capacity;

    /**
     * Array of notes.
     */
    private Note[] notes;

    /**
     * Constructor - creates new notepad with size of capacity.
     *
     * @param capacity initial capacity of new notepad.
     */
    public NotePad(int capacity) {
        this.capacity = capacity;

        notes = new Note[capacity];
    }

    /**
     * Getter
     *
     * @return total count of existing notes.
     */
    public static int getNoteCount() {
        return noteCount;
    }

    /**
     * Getter
     *
     * @return capacity of current notepad.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method - adds new note to the end of a notepad.
     *
     * @param title title of new note.
     * @param text text of new note.
     */
    public void addNote(String title, String text) {
        if (noteCount < capacity) {
            notes[noteCount++] = Note.getInstance(title, text);
            System.out.println(String.format("Note was created. Total count of notes in notepad is: %d" +
                    "\nYou can create at least: %d note(s)", getNoteCount(), getCapacity() - getNoteCount()));
        } else {
            System.out.println("The NotePad is full, impossible to create one more note.");
        }
    }

    /**
     * Method - removes last note from a notepad.
     */
    public void removeNote() {
        if (noteCount > 0) {
            notes[--noteCount] = null;
            System.out.println(String.format("Note was deleted. Total count of notes in notepad is: %d", getNoteCount()));
        } else {
            System.out.println("The NotePad is empty, nothing to delete.");
        }
    }

    /**
     * Method - replace chosen note with a new one.
     *
     * @param index index of editable note.
     * @param title new title of current note.
     * @param text new text of current note.
     */
    public void editNote(int index, String title, String text) {
        if (index < noteCount && index >= 0) {
            notes[index] = Note.getInstance(title, text);
        } else {
            System.out.println("There is no such note, nothing to edit.");
        }
    }

    /**
     * Method - prints all notes to console.
     */
    public void printNotes() {
        if (noteCount > 0) {
            System.out.println("\n\n==============================");
            for (Note note : notes) {
                System.out.println(String.format("%s\n------------------------------\n", note));
            }
            System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVV\n\n");
        } else {
            System.out.println("The NotePad is empty, nothing to print.");
        }
    }
}
