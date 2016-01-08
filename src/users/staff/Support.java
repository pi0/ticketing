package users.staff;

import models.Note;

public abstract class Support extends Staff{

    public abstract void addNote();
    public abstract void forwardTicket();
    public abstract Note[] accessNotes();


}
