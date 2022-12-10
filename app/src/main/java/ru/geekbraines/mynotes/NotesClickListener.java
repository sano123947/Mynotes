package ru.geekbraines.mynotes;

import androidx.cardview.widget.CardView;

import ru.geekbraines.mynotes.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

    void onLongCLick(Notes notes, CardView cardView);
}