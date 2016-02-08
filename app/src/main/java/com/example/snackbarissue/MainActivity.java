package com.example.snackbarissue;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

  private Snackbar mSnackbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mSnackbar = Snackbar
        .make(findViewById(R.id.root), "Sample", Snackbar.LENGTH_INDEFINITE)
        .setAction("Restart", this);
    mSnackbar.show();
  }

  @Override
  public void onClick(View v) {
    mSnackbar.show();
  }
}
