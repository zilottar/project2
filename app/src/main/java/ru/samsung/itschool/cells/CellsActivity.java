package ru.samsung.itschool.cells;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.GridLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.*;


public class CellsActivity extends Activity implements OnClickListener,
		OnLongClickListener {


	int WIDTH = 6;
	int HEIGHT = 2;

	Button[][] cell;
	/**
	 * ATTENTION: This was auto-generated to implement the App Indexing API.
	 * See https://g.co/AppIndexing/AndroidStudio for more information.
	 */

	private DatabaseHelper mDBHelper;
	private SQLiteDatabase mDb;

	private GoogleApiClient client;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.cells);

		generate();
		mDBHelper = new DatabaseHelper(this);

		try {
			mDBHelper.updateDataBase();
		} catch (IOException mIOException) {
			throw new Error("UnableToUpdateDatabase");
		}

		try {
			mDb = mDBHelper.getWritableDatabase();
		} catch (SQLException mSQLException) {
			throw mSQLException;
		}
		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
	}

	void generate() {


		makeCells();

		for (int i = 0; i < HEIGHT; i++)
			for (int j = 0; j < WIDTH; j++) {
			}
	}

	@Override
	public boolean onLongClick(View v) {
		return false;
	}

	public void onClick(View v) {

		Button tappedCell = (Button) v;

		AlertDialog.Builder builder = new AlertDialog.Builder(CellsActivity.this);

		int tappedX = getX(tappedCell);
		int tappedY = getY(tappedCell);
		if (tappedX == 0 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Литий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 1 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Бериллий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 2 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Натрий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 3 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Магний")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 4 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Калий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 5 && tappedY == 0) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Кальций")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 0 && tappedY == 1) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Рубидий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 1 && tappedY == 1) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Стронций")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 2 && tappedY == 1) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Цезий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 3 && tappedY == 1) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);
			builder.setTitle("Барий")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
		if (tappedX == 4 && tappedY == 1) {
			Cursor cursor = mDb.rawQuery("SELECT desc FROM base where  elements='"+tappedCell.getText()+"'", null);

			String a = "hint";
			builder.setTitle("Hint")
					.setMessage(cursor.getString(0))
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
			cursor.close();
		}
	}

	int getX(View v) {
		return Integer.parseInt(((String) v.getTag()).split(",")[1]);
	}

	int getY(View v) {
		return Integer.parseInt(((String) v.getTag()).split(",")[0]);
	}

	void makeCells() {
		cell = new Button[HEIGHT][WIDTH];
		GridLayout cellsLayout = (GridLayout) findViewById(R.id.CellsLayout);
		cellsLayout.removeAllViews();
		cellsLayout.setColumnCount(HEIGHT);
		for (int i = 0; i < HEIGHT; i++)
			for (int j = 0; j < WIDTH; j++) {
				LayoutInflater inflater = (LayoutInflater) getApplicationContext()
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				cell[i][j] = (Button) inflater.inflate(R.layout.cell, cellsLayout, false);
				cell[i][j].setOnClickListener(this);
				cell[i][j].setOnLongClickListener(this);
				cell[i][j].setTag(i + "," + j);
				cellsLayout.addView(cell[i][j]);
			}
		cell[0][0].setText("Li");
		cell[0][1].setText("Be");
		cell[0][2].setText("Na");
		cell[0][3].setText("Mg");
		cell[0][4].setText("K");
		cell[0][5].setText("Ca");
		cell[1][0].setText("Rb");
		cell[1][1].setText("Sr");
		cell[1][2].setText("Cs");
		cell[1][3].setText("Ba");
		cell[1][4].setText("??");

	}


	@Override
	public void onStart() {
		super.onStart();

		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		client.connect();
		Action viewAction = Action.newAction(
				Action.TYPE_VIEW, // TODO: choose an action type.
				"Cells Page", // TODO: Define a title for the content shown.
				// TODO: If you have web page content that matches this app activity's content,
				// make sure this auto-generated web page URL is correct.
				// Otherwise, set the URL to null.
				Uri.parse("http://host/path"),
				// TODO: Make sure this auto-generated app URL is correct.
				Uri.parse("android-app://ru.samsung.itschool.cells/http/host/path")
		);
		AppIndex.AppIndexApi.start(client, viewAction);
	}

	@Override
	public void onStop() {
		super.onStop();

		// ATTENTION: This was auto-generated to implement the App Indexing API.
		// See https://g.co/AppIndexing/AndroidStudio for more information.
		Action viewAction = Action.newAction(
				Action.TYPE_VIEW, // TODO: choose an action type.
				"Cells Page", // TODO: Define a title for the content shown.
				// TODO: If you have web page content that matches this app activity's content,
				// make sure this auto-generated web page URL is correct.
				// Otherwise, set the URL to null.
				Uri.parse("http://host/path"),
				// TODO: Make sure this auto-generated app URL is correct.
				Uri.parse("android-app://ru.samsung.itschool.cells/http/host/path")
		);
		AppIndex.AppIndexApi.end(client, viewAction);
		client.disconnect();
	}
}