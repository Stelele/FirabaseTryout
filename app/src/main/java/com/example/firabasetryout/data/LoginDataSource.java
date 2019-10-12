package com.example.firabasetryout.data;

import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.firabasetryout.data.model.LoggedInUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Users");


    public Result<LoggedInUser> login(String username, String password) {


        try {
            // TODO: handle loggedInUser authentication
            String id = java.util.UUID.randomUUID().toString();
            LoggedInUser fakeUser =

                    new LoggedInUser(
                            id,
                            "Jane Doe");

            myRef.child(id).setValue(fakeUser);

            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    LoggedInUser testUser = dataSnapshot.getValue(LoggedInUser.class);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
