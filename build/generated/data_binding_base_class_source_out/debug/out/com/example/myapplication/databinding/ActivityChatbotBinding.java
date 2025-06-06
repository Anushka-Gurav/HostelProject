// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatbotBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView chatRecyclerView;

  @NonNull
  public final Button sendButton;

  @NonNull
  public final EditText userInputEditText;

  private ActivityChatbotBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView chatRecyclerView, @NonNull Button sendButton,
      @NonNull EditText userInputEditText) {
    this.rootView = rootView;
    this.chatRecyclerView = chatRecyclerView;
    this.sendButton = sendButton;
    this.userInputEditText = userInputEditText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatbotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatbotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chatbot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatbotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chatRecyclerView;
      RecyclerView chatRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (chatRecyclerView == null) {
        break missingId;
      }

      id = R.id.sendButton;
      Button sendButton = ViewBindings.findChildViewById(rootView, id);
      if (sendButton == null) {
        break missingId;
      }

      id = R.id.userInputEditText;
      EditText userInputEditText = ViewBindings.findChildViewById(rootView, id);
      if (userInputEditText == null) {
        break missingId;
      }

      return new ActivityChatbotBinding((LinearLayout) rootView, chatRecyclerView, sendButton,
          userInputEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
