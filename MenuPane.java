package summer029;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;

public class MenuPane {
	int [] realNumber = new int[10];
	char [] realChar = new char[10];
	private Button jbSelectionSort = new Button("選擇排序Selection sort");
	private Button jbBubbleSort = new Button("氣泡排序Bubble sort");
	private Button jbLinearSearch = new Button("線性搜尋Linear search");
	private Button jbBinarySearch = new Button("二分搜尋Binary search");
	private Button jbPreviousPage = new Button("上一頁");
	private Button jbExit = new Button("離開");
	TextField jtfind = new TextField("");
	TextArea jtacontent = new TextArea();
	BorderPane borderPane2 = new BorderPane();
	StackPane pane = new StackPane();
	
	SelectionSort SS = new SelectionSort();
	BubbleSort BS = new BubbleSort();
	LinearSearch LS = new LinearSearch();
	BinarySearch BinS = new BinarySearch();
	public MenuPane() {
		// TODO Auto-generated constructor stub
		borderPane2.setTop(new Label("Fuction list"));
		borderPane2.setRight(jtacontent);
		jtacontent.setWrapText(true);//change line
		jtacontent.setEditable(false);
		
		menupane();
		pane.getChildren().addAll(borderPane2);
		jbSelectionSort.setOnAction(e ->{
			jtacontent.setText("請選擇以何種型態進行");
			SelectionPane();
		});
		
		jbBubbleSort.setOnAction(e ->{
			jtacontent.setText("請選擇以何種型態進行");
			BubblePane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			jtacontent.setText("請選擇以何種型態進行");
			LinearPane();
		});
		
		jbBinarySearch.setOnAction(e ->{
			jtacontent.setText("請選擇以何種型態進行");
			BinaryPane();
		});
		
		jbPreviousPage.setOnAction(e ->{
			borderPane2.setLeft(null);
			menupane();
		});
		
		jbExit.setOnAction(e ->{
			System.exit(1);
		});
	}

	
	protected void menupane() {
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbSelectionSort,0,0);
		gridPane1.add(jbBubbleSort,0,1);
		gridPane1.add(jbLinearSearch,0,2);
		gridPane1.add(jbBinarySearch,0,3);
		gridPane1.add(jbExit,0,4);
		
		borderPane2.setLeft(gridPane1);
	}
	
	protected void SelectionPane() {
		Button jbNumber = new Button("整數");
		Button jbChar = new Button("字元");
		Button jbString = new Button("字串");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbNumber,0,0);
		gridPane1.add(jbChar,0,1);
		gridPane1.add(jbString,0,2);
		gridPane1.add(jbPreviousPage,0,3);
		gridPane1.add(jbExit,0,4);
		
		borderPane2.setLeft(gridPane1);
		
		jbNumber.setOnAction(e ->{
			SelectionNumber();
		});
		
		jbChar.setOnAction(e ->{
			SelectionChar();
		});
		
		jbString.setOnAction(e ->{
			
		});
	}
	
	protected void BubblePane() {
		Button jbNumber = new Button("整數");
		Button jbChar = new Button("字元");
		Button jbString = new Button("字串");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbNumber,0,0);
		gridPane1.add(jbChar,0,1);
		gridPane1.add(jbString,0,2);
		gridPane1.add(jbPreviousPage,0,3);
		gridPane1.add(jbExit,0,4);
		
		borderPane2.setLeft(gridPane1);
		
		jbNumber.setOnAction(e ->{
			BubbleNumber();
		});
		
		jbChar.setOnAction(e ->{
			BubbleChar();
		});
		
		jbString.setOnAction(e ->{
			
		});
	}
	
	protected void LinearPane() {
		Button jbNumber = new Button("整數");
		Button jbChar = new Button("字元");
		Button jbString = new Button("字串");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbNumber,0,0);
		gridPane1.add(jbChar,0,1);
		gridPane1.add(jbString,0,2);
		gridPane1.add(jbPreviousPage,0,3);
		gridPane1.add(jbExit,0,4);
		
		borderPane2.setLeft(gridPane1);
		
		jbNumber.setOnAction(e ->{
			LinearNumber();
		});
		
		jbChar.setOnAction(e ->{
			LinearChar();
		});
		
		jbString.setOnAction(e ->{
			
		});
	}
	
	protected void BinaryPane() {
		Button jbNumber = new Button("整數");
		Button jbChar = new Button("字元");
		Button jbString = new Button("字串");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbNumber,0,0);
		gridPane1.add(jbChar,0,1);
		gridPane1.add(jbString,0,2);
		gridPane1.add(jbPreviousPage,0,3);
		gridPane1.add(jbExit,0,4);
		
		borderPane2.setLeft(gridPane1);
		
		jbNumber.setOnAction(e ->{
			BinaryNumber();
		});
		
		jbChar.setOnAction(e ->{
			BinaryChar();
		});
		
		jbString.setOnAction(e ->{
			
		});
	}
	
	
	private void SelectionNumber() {
		
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbBinarySearch,0,4);
		gridPane1.add(jbExit,0,5);
		gridPane1.add(jtfind,0,6);
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			SelectionNumberMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			int [] Number= new int[10];
			for(int i=0;i<10;i++) {
				int a = (int)(Math.random()*100+1);
				Number[i]=a;
			}
			String tempString = Arrays.toString(SS.SelectionSortNumber(Number));
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realNumber[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			SelectionPane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void SelectionNumberMySelf() {
    	TextField jtfNumber = new TextField();

    	Button jbCalculation = new Button("Calculation");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Number: "),0,0);
		gridPane1.add(jtfNumber,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入數字 以間隔空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Selection sort 自行輸入數字");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllNumber = jtfNumber.getText();
			String [] temp = SelectionAllNumber.split("\\s+");
			int  Number [] = new int[temp.length];
			for(int i = 0;i<temp.length;i++) {
				Number[i] = Integer.parseInt(temp[i]);
			}
			String tempString = Arrays.toString(SS.SelectionSortNumber(Number));
			jtacontent.setText(tempString);
			for(int i = 0;i<Number.length&&i<10;i++) {
				realNumber[i]=Number[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }
	
	private void SelectionChar() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbBinarySearch,0,4);
		gridPane1.add(jbExit,0,5);
		gridPane1.add(jtfind,0,6);
		
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			SelectionCharMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			
			char [] Number= new char[10];
			for(int i=0;i<10;i++) {
				int a =  97 +(int)(Math.random() * (122-97+1));
				char b = (char)a;
				Number[i]=b;
			}
			String tempString = Arrays.toString(SS.SelectionSortChar(Number));
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realChar[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			SelectionPane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void SelectionCharMySelf() {
    	TextField jtfChar = new TextField();

    	Button jbCalculation = new Button("Calculation");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Char: "),0,0);
		gridPane1.add(jtfChar,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入字元不需要空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Selection sort 自行輸入字元");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllChar = jtfChar.getText();
			
			char[] chartemp = SelectionAllChar.toCharArray();
			String tempString = Arrays.toString(SS.SelectionSortChar(chartemp));
			jtacontent.setText(tempString);
			for(int i = 0;i<chartemp.length&&i<10;i++) {
				realChar[i]=chartemp[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }

	private void BubbleNumber() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbBinarySearch,0,4);
		gridPane1.add(jbExit,0,5);
		gridPane1.add(jtfind,0,6);
		
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			BubbleNumberMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			int [] Number= new int[10];
			for(int i=0;i<10;i++) {
				int a = (int)(Math.random()*100+1);
				Number[i]=a;
			}
			String tempString = Arrays.toString(BS.BubbleSortNumber(Number));
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realNumber[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			BubblePane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}

	private void BubbleNumberMySelf() {
    	TextField jtfNumber = new TextField();

    	Button jbCalculation = new Button("Calculation");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Number: "),0,0);
		gridPane1.add(jtfNumber,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入數字 以間隔空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Bubble sort 自行輸入數字");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String BubbleAllNumber = jtfNumber.getText();
			String [] temp = BubbleAllNumber.split("\\s+");
			int  Number [] = new int[temp.length];
			for(int i = 0;i<temp.length;i++) {
				Number[i] = Integer.parseInt(temp[i]);
			}
			String tempString = Arrays.toString(BS.BubbleSortNumber(Number));
			jtacontent.setText(tempString);
			for(int i = 0;i<Number.length&&i<10;i++) {
				realNumber[i]=Number[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }
	
	private void BubbleChar() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbBinarySearch,0,4);
		gridPane1.add(jbExit,0,5);
		gridPane1.add(jtfind,0,6);
		
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			BubbleCharMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			char [] Number= new char[10];
			for(int i=0;i<10;i++) {
				int a =  97 +(int)(Math.random() * (122-97+1));
				char b = (char)a;
				Number[i]=b;
			}
			String tempString = Arrays.toString(BS.BubbleSortChar(Number));
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realChar[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			BubblePane();;
		});
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void BubbleCharMySelf() {
    	TextField jtfChar = new TextField();

    	Button jbCalculation = new Button("Calculation");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Char: "),0,0);
		gridPane1.add(jtfChar,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入字元不需要空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Bubble sort 自行輸入字元");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String BubbleAllChar = jtfChar.getText();
			
			char[] chartemp = BubbleAllChar.toCharArray();
			String tempString = Arrays.toString(BS.BubbleSortChar(chartemp));
			jtacontent.setText(tempString);
			for(int i = 0;i<chartemp.length&&i<10;i++) {
				realChar[i]=chartemp[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }
	
	private void LinearNumber() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbExit,0,4);
		gridPane1.add(jtfind,0,5);
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			LinearNumberMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			int [] Number= new int[10];
			for(int i=0;i<10;i++) {
				int a = (int)(Math.random()*100+1);
				Number[i]=a;
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realNumber[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			LinearPane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void LinearNumberMySelf() {
    	TextField jtfNumber = new TextField();

    	Button jbCalculation = new Button("Enter");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Number: "),0,0);
		gridPane1.add(jtfNumber,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入數字 以間隔空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Linear search 自行輸入數字");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllNumber = jtfNumber.getText();
			String [] temp = SelectionAllNumber.split("\\s+");
			int  Number [] = new int[temp.length];
			for(int i = 0;i<temp.length;i++) {
				Number[i] = Integer.parseInt(temp[i]);
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i = 0;i<Number.length&&i<10;i++) {
				realNumber[i]=Number[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }

	private void LinearChar() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbLinearSearch = new Button("線性搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbLinearSearch,0,3);
		gridPane1.add(jbExit,0,4);
		gridPane1.add(jtfind,0,5);
		
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			LinearCharMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			
			char [] Number= new char[10];
			for(int i=0;i<10;i++) {
				int a =  97 +(int)(Math.random() * (122-97+1));
				char b = (char)a;
				Number[i]=b;
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realChar[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			LinearPane();
		});
		
		jbLinearSearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+LS.linearSearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void LinearCharMySelf() {
    	TextField jtfChar = new TextField();

    	Button jbCalculation = new Button("Enter");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Char: "),0,0);
		gridPane1.add(jtfChar,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入字元不需要空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Linear search 自行輸入字元");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllChar = jtfChar.getText();
			
			char[] chartemp = SelectionAllChar.toCharArray();
			String tempString = Arrays.toString(chartemp);
			jtacontent.setText(tempString);
			for(int i = 0;i<chartemp.length&&i<10;i++) {
				realChar[i]=chartemp[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }

	private void BinaryNumber() {
		
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbBinarySearch,0,3);
		gridPane1.add(jbExit,0,4);
		gridPane1.add(jtfind,0,5);
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			BinaryNumberMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			int [] Number= new int[10];
			for(int i=0;i<10;i++) {
				int a = (int)(Math.random()*100+1);
				Number[i]=a;
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realNumber[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			BinaryPane();
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				String [] temp = SelectionAllNumber.split("\\s+");
				int  Number [] = new int[temp.length];
				for(int i = 0;i<temp.length;i++) {
					Number[i] = Integer.parseInt(temp[i]);
				}
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchNumber(realNumber, Number[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void BinaryNumberMySelf() {
    	TextField jtfNumber = new TextField();

    	Button jbCalculation = new Button("Enter");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Number: "),0,0);
		gridPane1.add(jtfNumber,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入數字 以間隔空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Binary search 自行輸入數字");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllNumber = jtfNumber.getText();
			String [] temp = SelectionAllNumber.split("\\s+");
			int  Number [] = new int[temp.length];
			for(int i = 0;i<temp.length;i++) {
				Number[i] = Integer.parseInt(temp[i]);
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i = 0;i<Number.length&&i<10;i++) {
				realNumber[i]=Number[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }

	private void BinaryChar() {
		Button jbMySelf = new Button("自行輸入");
		Button jbRandom = new Button("亂數產生");
		Button jbPreviousPage = new Button("上一頁");
		Button jbBinarySearch = new Button("二分搜尋");
		
		borderPane2.setLeft(null);
		GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		gridPane1.add(jbMySelf,0,0);
		gridPane1.add(jbRandom,0,1);
		gridPane1.add(jbPreviousPage,0,2);
		gridPane1.add(jbBinarySearch,0,3);
		gridPane1.add(jbExit,0,4);
		gridPane1.add(jtfind,0,5);
		
		borderPane2.setLeft(gridPane1);
		
		jbMySelf.setOnAction(e ->{
			BinaryCharMySelf();
		});
		
		jbRandom.setOnAction(e ->{
			
			char [] Number= new char[10];
			for(int i=0;i<10;i++) {
				int a =  97 +(int)(Math.random() * (122-97+1));
				char b = (char)a;
				Number[i]=b;
			}
			String tempString = Arrays.toString(Number);
			jtacontent.setText(tempString);
			for(int i=0;i<10;i++) {
				realChar[i]=Number[i];
			}
		});
		
		jbPreviousPage.setOnAction(e ->{
			BinaryPane();
		});
		
		jbBinarySearch.setOnAction(e ->{
			try {
				String SelectionAllNumber = jtfind.getText();
				char[] chartemp = SelectionAllNumber.toCharArray();
				
				jtacontent.appendText("\n所求位置為(-1表示不存在):"+BinS.binarySearchChar(realChar, chartemp[0]));
				}catch (Exception ex) {
					jtacontent.setText("請先擁有數列");
				}
		});
	}
	
	private void BinaryCharMySelf() {
    	TextField jtfChar = new TextField();

    	Button jbCalculation = new Button("Enter");
    	Button jbCancel = new Button("Cancel");
    	
    	GridPane gridPane1 = new GridPane();
		gridPane1.setHgap(5);
		gridPane1.setVgap(5);
		
		gridPane1.add(new Label("Char: "),0,0);
		gridPane1.add(jtfChar,1,0);
		
		gridPane1.setAlignment(Pos.CENTER);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setHgap(10);
		gridPane2.setVgap(10);
		
		gridPane2.add(jbCalculation, 0, 0);
		gridPane2.add(jbCancel, 2, 0);
		
		gridPane2.setAlignment(Pos.CENTER);
		
		BorderPane borderPane3 = new BorderPane();
		borderPane3.setTop(new Label("請輸入字元不需要空格"));
		borderPane3.setCenter(gridPane1);
		borderPane3.setBottom(gridPane2);
		
		Scene scene = new Scene(borderPane3,480,270);
		Stage stage = new Stage();
		stage.setTitle("Binary search 自行輸入字元");
		stage.setScene(scene);
		stage.show();
		
		jbCalculation.setOnAction(e ->{
			String SelectionAllChar = jtfChar.getText();
			
			char[] chartemp = SelectionAllChar.toCharArray();
			String tempString = Arrays.toString(chartemp);
			jtacontent.setText(tempString);
			for(int i = 0;i<chartemp.length&&i<10;i++) {
				realChar[i]=chartemp[i];
			}
			stage.close();
		});
		
		jbCancel.setOnAction(e ->{
			stage.close();
		});
    }
}
