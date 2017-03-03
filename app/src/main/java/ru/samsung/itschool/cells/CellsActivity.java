package ru.samsung.itschool.cells;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.GridLayout;



public class CellsActivity extends Activity implements OnClickListener,
		OnLongClickListener {


	int WIDTH = 6;
	int HEIGHT = 2;

	Button[][] cell;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.cells);

		generate();

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
		if (tappedX==0&&tappedY==0)
		{

			builder.setTitle("Литий")
					.setMessage("")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==1&&tappedY==0)
		{
			builder.setTitle("Бериллий")
					.setMessage("Бериллий - элемент второй группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==2&&tappedY==0)
		{
			builder.setTitle("Натрий")
					.setMessage("Натрий — элемент первой группы, третьего периода периодической" +
							" системы химических элементов Д. И. Менделеева, с атомным номером 11."+
							" Обозначается символом Na.\n\nПОЛУЧЕНИЕ\n" +
							"\n"+"Первым промышленным способом " +
							"получения натрия была реакция восстановления карбоната натрия" +
							" углем при нагревании тесной смеси этих веществ в железной" +
							" ёмкости до 1000 °C (способ Девилля)[13]:\n" +
							"\n" +
							"Na2CO3+2C=>2Na+3CO.\n\n" +
							"Вместо угля могут быть использованы карбид кальция, алюминий, " +
							"кремний, ферросилиций, силикоалюминий[14][15].\n" +
							"С появлением электроэнергетики более практичным стал другой с" +
							"пособ получения натрия — электролиз расплава едкого натра или " +
							"хлорида натрия. В настоящее время электролиз — основной" +
							" способ получения натрия.\n" +
							"Натрий также можно получить цирконийтермическим " +
							"методом или термическим разложением азида натрия. \n" +
							"\nФИЗИЧЕСКИЕ СВОЙСТВА\n" +
							"\nНатрий — серебристо-белый металл, в тонких слоях с фиолетовым отт" +
							"енком, пластичен, даже мягок (легко режется ножом), свежий срез натр" +
							"ия блестит. Величины электропроводности и теплопроводно" +
							"сти натрия достаточно высоки, плотность равна 0,96842 г/см³ (при " +
							"19,7 °C), температура плавления 97,86 °C, температура кипен" +
							"ия 883,15 °C.\n"+
							"Под давлением становится прозрачным и красным, как рубин[16]." +
							"\n" +
							"При температуре −268 °С (5 К) натрий переходит в гексагональн" +
							"ую фазу, пространственная группа P 63/mmc, параметры ячей" +
							"ки a = 0,3767 нм, c = 0,6154 нм, Z = 2.")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==3&&tappedY==0)
		{
			builder.setTitle("Магний")
					.setMessage("Магний - элемент второй группы, третьего периода периодической" +
							" системы химических элементов Д. И. Менделеева, с атомным номером " +
							"12. Обозначается символом Mg.\n\n" +
							"ФИЗИЧЕСКИЕ СВОЙСТВА\n" +
							"Магний — металл серебристо-белого цвета с гексагональной " +
							"решёткой, обладает металлическим блеском; пространственная группа" +
							" P 63/mmc, параметры решётки a = 0,32029 нм, c = 0,52000 нм, Z = 2." +
							" При обычных условиях поверхность магния покрыта прочной защитной" +
							" плёнкой оксида магния MgO, которая разрушается при нагреве на" +
							" воздухе до примерно 600 °C, после чего металл сгорает с ослепительно"+
							" белым пламенем с образованием оксида и нитрида магния Mg3N2. " +
							"Скорость воспламенения магния намного выше скорости одёргивания " +
							"руки, поэтому при поджоге магния человек не успевает одёрнуть руку" +
							" и получает ожог. На горящий магний желательно смотреть только через" +
							" темные очки или стекло, т.к. в противном случае есть риск получить " +
							"световой ожог сетчатки и на время ослепнуть. Плотность магния при " +
							"20 °C — 1,738 г/см³, температура плавления металла tпл = 650 °C, " +
							"температура кипения tкип = 1090 °C[2], теплопроводность при 20 °C " +
							"— 156 Вт/(м·К).\n" +
							"\n" +
							"Магний высокой чистоты пластичен, хорошо прессуется, прокатывается " +
							"и поддаётся обработке резанием.\n\n" +
							"ХИМИЧЕСКИЕ СВОЙСТВА\n" +
							"При нагревании на воздухе магний сгорает с образованием оксида и" +
							" небольшого количества нитрида. При этом выделяется большое кол" +
							"ичество теплоты и световой энергии:\n"+
							"2Mg+O2=>2MgO\n" +
							"{3Mg+N2=>Mg3N2\n" +
							"Магний может гореть даже в углекислом газе:\n" +
							"2Mg+CO2=>2MgO+C\n" +
							"Раскаленный магний энергично реагирует с водой, вследствие чего " +
							"горящий магний нельзя тушить водой:\n" +
							"Mg+H2O=>MgO+H2\n" +
							"Возможна также реакция:\n" +
							"\n" +
							"Mg+2H2O=>Mg(OH)2+H2\n" +
							"Щелочи на магний не действуют, в кислотах он растворяется с бурным " +
							"выделением водорода:\n" +
							"Mg+2HCl=>MgCl2+H2\n" +
							"Магний со взрывом реагирует с сильными окислителями типа порошк" +
							"ового перманганата калия.")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==4&&tappedY==0)
		{
			builder.setTitle("Калий")
					.setMessage("Калий - элемент первой группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==5&&tappedY==0)
		{
			builder.setTitle("Кальций")
					.setMessage("Кальций - элемент второй группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==0&&tappedY==1)
		{
			builder.setTitle("Рубидий")
					.setMessage("Рубидий - элемент первой группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==1&&tappedY==1)
		{
			builder.setTitle("Стронций")
					.setMessage("Стронций - элемент второй группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==2&&tappedY==1)
		{
			builder.setTitle("Цезий")
					.setMessage("Цезий - элемент первой группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==3&&tappedY==1)
		{
			builder.setTitle("Барий")
					.setMessage("Барий - элемент второй группы основной подгруппы")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
		if (tappedX==4&&tappedY==1)
		{
			builder.setTitle("Hint")
					.setMessage("Нажмите на любой элемент. Нажатие на элемент приведет к" +
							" появлению информации о данном элементе. Для того, чтобы закончить" +
							" изучение данного элемента, нажмите на кнопку ПРОДОЛЖИТЬ ИЗУЧЕНИЕ")
					.setIcon(R.drawable.ic_launcher)
					.setCancelable(false)
					.setNegativeButton("Продолжить изучение",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			alert.show();
		}
	}

	int getX(View v)
	{
		return Integer.parseInt(((String)v.getTag()).split(",")[1]);
	}

	int getY(View v)
	{
		return Integer.parseInt(((String)v.getTag()).split(",")[0]);
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
				cell[i][j].setTag(i+","+j);
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





}