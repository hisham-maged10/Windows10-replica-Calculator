/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
package scientific_calculators;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator_main {
	
	public static double number;
	public static double answer;
	public final int DECIMALPLACES=9;
	public static int operation;
	public boolean delete;
	public static double numberconv;
	public static double answerconv;
	public static StringBuilder Historytxt=new StringBuilder();
	public static StringBuilder Historylbl=new StringBuilder();
	public static int countertxt=0;
	public static int counterlbl=0;
	public static int ifpresslbl=0;
	public static int ifpresstxt=0;
	public static int comboboxIndex;
	public static int comboboxIndexA;
	public static int comboboxIndexV;
	public static int comboboxIndexT;
	public static int comboboxIndexW;
	public static int combobox_1Index;
	public static int combobox_1IndexA;
	public static int combobox_1IndexV;
	public static int combobox_1IndexT;
	public static int combobox_1IndexW;
	public static int MaincomboboxIndex;
	public static boolean numericalconversiondone;
	public static double keepnumber;
	public static double numberconvnumerical;
	public int getoperation()
	{
		return operation;
	}
	public void setoperation(int value)
	{
		operation=value;
	}
	public static long factorial(int number) {
        long result = 1;

        for (int factor = 1; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
	public void operations()
	{
		switch(operation)
		{		
		case 1: answer=number+Double.parseDouble(Calculator.textField.getText());
		Calculator.calculation.setText(number+" + ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;	
		case 2:answer=number-Double.parseDouble(Calculator.textField.getText());
		Calculator.calculation.setText(number+" - ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break; 
		case 3:answer=number*Double.parseDouble(Calculator.textField.getText());
		Calculator.calculation.setText(number+" x ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;	
		case 4:answer=number/Double.parseDouble(Calculator.textField.getText());
		Calculator.calculation.setText(number+" ÷ ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;	
		case 5:answer=Math.pow(number, 2);
		Calculator.calculation.setText(number+" ^2 ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 6:answer=Math.sqrt(number);
		Calculator.calculation.setText("Sqrt("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 7:answer=1/number;
		Calculator.calculation.setText("1/"+number);
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 8:answer=number%Double.parseDouble(Calculator.textField.getText());
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 9:answer=number*-1;
		Calculator.calculation.setText("Negate("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 10:answer=Math.log10(number);
		Calculator.calculation.setText("Log("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 11:number=Math.toRadians(number);
			answer=Math.sin(number);
			Calculator.calculation.setText("Sin("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 12:number=Math.toRadians(number);
			answer=Math.sinh(number);
			Calculator.calculation.setText("Sinh("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 13:number=Math.toRadians(number);
			answer=Math.asin(number);
			Calculator.calculation.setText("SinInverse("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 14:number=Math.toRadians(number);
		answer=Math.cos(number);
		Calculator.calculation.setText("Cos("+Math.toDegrees(number)+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 15:number=Math.toRadians(number);
			answer=Math.cosh(number);
			Calculator.calculation.setText("Cosh("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 16:number=Math.toRadians(number);
			answer=Math.acos(number);
			Calculator.calculation.setText("CosInverse("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 17:number=Math.toRadians(number);
			answer=Math.tan(number);
			Calculator.calculation.setText("Tan("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 18:number=Math.toRadians(number);
			answer=Math.tanh(number);
			Calculator.calculation.setText("Tanh("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 19:number=Math.toRadians(number);
			answer=Math.atan(number);
			Calculator.calculation.setText("TanInverse("+Math.toDegrees(number)+")");
			History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 20:answer=Math.abs(number);
		Calculator.calculation.setText("Mod("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 21:answer=Math.log(number);
		Calculator.calculation.setText("Ln("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 22:answer=Math.pow(number,Double.parseDouble(Calculator.textField.getText()));
		Calculator.calculation.setText(number+" ^ ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 23:answer=Math.pow(number, 3);
		Calculator.calculation.setText(number+" ^3 ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 24:answer=Math.pow(number, 4);
		Calculator.calculation.setText(number+" ^4 ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 25:answer=Math.PI;
		Calculator.calculation.setText("PI");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 26:answer=2*Math.PI;
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		break;
		case 27:
		if(numericalconversiondone)
		{
			Calculator.textField.setText(toBinary(keepnumber,DECIMALPLACES));
			Calculator.calculation.setText("Binary("+keepnumber+")");
		}
		else
		{
			Calculator.textField.setText(toBinary(number,DECIMALPLACES));
		Calculator.calculation.setText("Binary("+number+")");
		keepnumber=number;
		numericalconversiondone=true;
		}
		History();
		operation=0;
		
		break;
		case 28:
		if(numericalconversiondone)
		{
		Calculator.textField.setText(toOct(keepnumber,DECIMALPLACES));
		Calculator.calculation.setText("Octal("+keepnumber+")");
		}
		else
		{
			Calculator.textField.setText(toOct(number,DECIMALPLACES));
			Calculator.calculation.setText("Octal("+number+")");
			keepnumber=number;
			numericalconversiondone=true;
		}
		History();
		operation=0;
		break;
		case 29:
		if(numericalconversiondone)
		{
		Calculator.textField.setText(toHex(keepnumber,DECIMALPLACES));
		Calculator.calculation.setText("HexaDecimal("+keepnumber+")");
		
		}
		else
		{
			Calculator.textField.setText(toHex(number,DECIMALPLACES));
			Calculator.calculation.setText("HexaDecimal("+number+")");
			keepnumber=number;
			numericalconversiondone=true;
		}
		History();
		operation=0;
		break;
		case 30:answer=Math.cbrt(number);
		Calculator.calculation.setText("Cbrt("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 31:answer=Math.ceil(number);
		Calculator.calculation.setText("Ceil("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 32:answer=factorial((int)number);
		Calculator.calculation.setText(number+" ! ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 33:answer=Math.floor(number);
		Calculator.calculation.setText("Floor("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 34:answer=Math.E;
		Calculator.calculation.setText("E");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 35:answer=Math.exp(number);
		Calculator.calculation.setText("e^"+number);
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 36:answer=Math.toDegrees(number);
		Calculator.calculation.setText("Degree("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 37:answer=Math.toRadians(number);
		Calculator.calculation.setText("Radians("+number+")");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 38:answer=And(number,Double.parseDouble(Calculator.textField.getText()));
		Calculator.calculation.setText(number+" && ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 39:answer=Or(number,Double.parseDouble(Calculator.textField.getText()));
		Calculator.calculation.setText(number+" || ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		case 40:answer=XoR(number,Double.parseDouble(Calculator.textField.getText()));
		Calculator.calculation.setText(number+" ^^ ");
		History();
		Calculator.textField.setText(Double.toString(answer));
		operation=0;
		numericalconversiondone=false;
		break;
		}
	}
	public void Conversion()
	{
		getComboIndex();
		getCombo_1Index();
		switch(comboboxIndex)
		{
		//nano
		case 0: SwitchComboFromNano();
		break;
		case 1:SwitchComboFromMelli();
		break;
		case 2: SwitchComboFromCenti();
		break;
		case 3:SwitchComboFromMeter();
		break;
		case 4:SwitchComboFromKilo();
		break;
		
		}
	}
	public void SwitchComboFromNano()
	{
		switch(combobox_1Index)
		{
		case 0:answerconv=numberconv;
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*Math.pow(10,-6);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		case 2:answerconv=numberconv*Math.pow(10,-7);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		case 3:answerconv=numberconv*Math.pow(10,-9);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		case 4:answerconv=numberconv*Math.pow(10,-12);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	public void SwitchComboFromMelli()
	{
		switch(combobox_1Index)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,6);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv;
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10,-1);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-3);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-6);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}		
	
	public void SwitchComboFromCenti()
	{
		switch(combobox_1Index)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,7);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 1);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv;
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-2);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-5);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromMeter()
	{
		switch(combobox_1Index)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,9);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 3);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 2);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv;
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-3);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromKilo()
	{
		
		switch(combobox_1Index)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,12);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 6);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 5);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,3);
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv;
		Calculator.convertedLbl.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}
	
	public void ConversionA()
	{
		getComboIndexA();
		getCombo_1IndexA();
		switch(comboboxIndexA)
		{
		//nano
		case 0: SwitchComboFromNanoA();
		break;
		case 1:SwitchComboFromMelliA();
		break;
		case 2: SwitchComboFromCentiA();
		break;
		case 3:SwitchComboFromMeterA();
		break;
		case 4:SwitchComboFromKiloA();
		break;
		
		}
	}
	public void SwitchComboFromNanoA()
	{
		switch(combobox_1IndexA)
		{
		case 0:answerconv=numberconv;
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*Math.pow(10,-12);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		case 2:answerconv=numberconv*Math.pow(10,-14);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		case 3:answerconv=numberconv*Math.pow(10,-18);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		case 4:answerconv=numberconv*Math.pow(10,-24);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	public void SwitchComboFromMelliA()
	{
		switch(combobox_1IndexA)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,12);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv;
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10,-2);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-6);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-12);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}		
	
	public void SwitchComboFromCentiA()
	{
		switch(combobox_1IndexA)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,14);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 2);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv;
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-4);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-10);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromMeterA()
	{
		switch(combobox_1IndexA)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,18);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 6);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 4);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv;
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-6);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromKiloA()
	{
		
		switch(combobox_1IndexA)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,24);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 12);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 10);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,6);
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv;
		Calculator.convertedLbl2.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}
	public void ConversionT()
	{
		getComboIndexT();
		getCombo_1IndexT();
		switch(comboboxIndexT)
		{
		//nano
		case 0: SwitchComboFromMilliT();
		break;
		case 1:SwitchComboFromSecondsT();
		break;
		case 2: SwitchComboFromMinuteT();
		break;
		case 3:SwitchComboFromHourT();
		break;
		
		}
	}
	public void SwitchComboFromMilliT()
	{
		switch(combobox_1IndexT)
		{
		case 0:answerconv=numberconv;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*Math.pow(10,-3);
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 2:answerconv=numberconv*1.6667*Math.pow(10,-5);
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 3:answerconv=numberconv*2.7778*Math.pow(10,-7);
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	public void SwitchComboFromSecondsT()
	{
		switch(combobox_1IndexT)
		{
		case 0:answerconv=numberconv*Math.pow(10,3);
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*0.0166667;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*0.00027777833333;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		
		
		
		}
		
	}		
	
	public void SwitchComboFromMinuteT()
	{
		switch(combobox_1IndexT)
		{
		case 0:answerconv=numberconv*60000;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*60;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*0.0166667;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		
		
		
		}
		
		
	}
	
	public void SwitchComboFromHourT()
	{
		switch(combobox_1IndexT)
		{
		case 0:answerconv=numberconv*3.6*Math.pow(10,6);
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*3600;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 2:answerconv=numberconv*60;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		case 3:answerconv=numberconv;
		Calculator.convertedLbl4.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}

	public void ConversionW()
	{
		getComboIndexW();
		getCombo_1IndexW();
		switch(comboboxIndexW)
		{
		//nano
		case 0: SwitchComboFromGramW();
		break;
		case 1:SwitchComboFromKiloW();
		break;
		
		}
	}
	public void SwitchComboFromGramW()
	{
		switch(combobox_1IndexW)
		{
		case 0:answerconv=numberconv;
		Calculator.convertedLbl5.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*Math.pow(10,-3);
		Calculator.convertedLbl5.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	public void SwitchComboFromKiloW()
	{
		switch(combobox_1IndexW)
		{
		case 0:answerconv=numberconv*Math.pow(10,3);
		Calculator.convertedLbl5.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv;
		Calculator.convertedLbl5.setText(Double.toString(answerconv));
		break;
		}
		
	}		
	
	public void ConversionV()
	{
		getComboIndexV();
		getCombo_1IndexV();
		switch(comboboxIndexV)
		{
		//nano
		case 0: SwitchComboFromNanoV();
		break;
		case 1:SwitchComboFromMelliV();
		break;
		case 2: SwitchComboFromCentiV();
		break;
		case 3:SwitchComboFromMeterV();
		break;
		case 4:SwitchComboFromKiloV();
		break;
		
		}
	}
	public void SwitchComboFromNanoV()
	{
		switch(combobox_1IndexV)
		{
		case 0:answerconv=numberconv;
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		case 1:answerconv=numberconv*Math.pow(10,-18);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		case 2:answerconv=numberconv*Math.pow(10,-21);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		case 3:answerconv=numberconv*Math.pow(10,-27);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		case 4:answerconv=numberconv*Math.pow(10,-36);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	public void SwitchComboFromMelliV()
	{
		switch(combobox_1IndexV)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,18);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv;
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10,-3);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-9);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-18);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}		
	
	public void SwitchComboFromCentiV()
	{
		switch(combobox_1IndexV)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,21);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 3);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv;
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,-6);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-15);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromMeterV()
	{
		switch(combobox_1IndexV)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,27);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 9);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 6);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv;
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv*Math.pow(10,-9);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		
		
		}
		
		
	}
	
	public void SwitchComboFromKiloV()
	{
		
		switch(combobox_1IndexV)
		{
		//from kza to nano
		case 0:answerconv=numberconv*Math.pow(10,36);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meilli
		case 1:answerconv=numberconv*Math.pow(10, 18);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to centi
		case 2:answerconv=numberconv*Math.pow(10, 15);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to meter
		case 3:answerconv=numberconv*Math.pow(10,9);
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		//from kza to kilo
		case 4:answerconv=numberconv;
		Calculator.convertedLbl3.setText(Double.toString(answerconv));
		break;
		
		
		}
		
	}
	
	public static String NoFractionToBinary(int noFractionbin)
	{
		return Integer.toBinaryString(noFractionbin);
	}
	public static String FractionToBinary(double Fractionbin,int decimalpoints)
	{
		StringBuilder FracToBin=new StringBuilder();
		while(FracToBin.length() < decimalpoints && Fractionbin>0)
			{
			Fractionbin*=2;
			if(Fractionbin>=1)
			{
				FracToBin.append(1);
				Fractionbin-=1;
			}
			else
			{
				FracToBin.append(0);
			}
		}
		return FracToBin.toString();
	}
	public static String toBinary(double num,int decimalpoint)
	{
		int noFraction=(int) num;
		return NoFractionToBinary(noFraction)+((num-noFraction!=0)?".":"")+FractionToBinary(num-noFraction,decimalpoint);
		
	}
	public static String toHex(double num,int decimalpoints)
	{
		int noFraction=(int)num;
		return NoFractionToHex(noFraction)+((num-noFraction!=0)?".":"")+FractionToHex(num-noFraction,decimalpoints);
	}
	public static String NoFractionToHex(int noFraction)
	{
		StringBuilder noFractionhex=new StringBuilder();
		int rem;
		while(noFraction != 0)
		{
		rem=noFraction%16;
		noFraction/=16;
			if(rem>9)
			{
				switch(rem)
				{
				case 10:noFractionhex.append('A');
				break;
				case 11:noFractionhex.append('B');
				break;
				case 12:noFractionhex.append('C');
				break;
				case 13:noFractionhex.append('D');
				break;
				case 14:noFractionhex.append('E');
				break;
				case 15:noFractionhex.append('F');
				break;
				}
			}
			else
			{
			noFractionhex.append(rem);
			}
		}
		return noFractionhex.reverse().toString();
	}
	
	public static String FractionToHex(double fraction,int decimalpoints)
	{
		StringBuilder FracHex=new StringBuilder();
		while(fraction >0 && FracHex.length()< decimalpoints)
		{
			
			fraction*=16;
			if(fraction>=1)
			{
				FracHex.append((int)(Math.floor(fraction)));
				fraction-=(int)(Math.floor(fraction));
			}
			else
			{
				FracHex.append(0);
			}
		}		
		return FracHex.toString();
	}
	public static String toOct(double num,int decimalpoints)
	{
		int noFraction=(int)num;
		return NoFractionToOct(noFraction)+((num-noFraction!=0)?".":"")+FractionToOct(num-noFraction,decimalpoints);
	}
	public static String NoFractionToOct(int noFractionOct)
	{
		return Integer.toOctalString(noFractionOct);
	}
	public static String FractionToOct(double fraction,int decimalpoints)
	{
		StringBuilder FracOct=new StringBuilder();
		while(fraction >0 && FracOct.length()< decimalpoints)
		{
			
			fraction*=8;
			if(fraction>=1)
			{
				FracOct.append((int)(Math.floor(fraction)));
				fraction-=(int)(Math.floor(fraction));
			}
			else
			{
				FracOct.append(0);
			}
		}		
		return FracOct.toString();
	}
	public static Double And(double val1,double val2)
	{
		if(val1>0.0 && val2>0.0)
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	public static Double Or(double val1,double val2)
	{
		if(val1>0 || val2>0)
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	public static Double XoR(double val1,double val2)
		{
			if((val1>0 && val2<=0) || (val1<=0 && val2>0))
			{
				return 1.0;
			}
			else
			{
				return 0.0;
			}
	}
	
	public static void Historytext()
	{
		Historytxt.append(Double.toString(answer));
		countertxt++;
		ifpresstxt=countertxt;
		Historytxt.append(",");
	}
	public static void Historylabel()
	{
		String converted;
		if(!(operation>0 && operation<5) 
				&& !(operation==8) 
				&& !(operation==22) 
				&& !(operation>37 && operation<41) 
				)
		{
		 converted=Calculator.calculation.getText();
		}
		else
		{
		converted=Calculator.calculation.getText()+Calculator.textField.getText()+".0";
		}
		Historylbl.append(converted);
		counterlbl++;
		ifpresslbl=counterlbl;
		Historylbl.append(",");
		
	}
	public static void History()
	{
		Historytext();
		Historylabel();
	}
	public static void getComboIndex()
	{
		String check=Calculator.comboBox.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer":comboboxIndex=0;
		break;
		case "Millimeter":comboboxIndex=1;
		break;
		case "Centimeter":comboboxIndex=2;
		break;
		case "Meter":comboboxIndex=3;
		break;
		case "Kilometer":comboboxIndex=4;
		break;
		
		}
	}
	public static void getCombo_1Index()
	{
		String check=Calculator.comboBox_1.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer":combobox_1Index=0;
		break;
		case "Millimeter":combobox_1Index=1;
		break;
		case "Centimeter":combobox_1Index=2;
		break;
		case "Meter":combobox_1Index=3;
		break;
		case "Kilometer":combobox_1Index=4;
		break;
		
		}
	}
	public static void getComboIndexA()
	{
		String check=Calculator.comboBox_3.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer Squared":comboboxIndexA=0;
		break;
		case "Millimeter Squared":comboboxIndexA=1;
		break;
		case "Centimeter Squared":comboboxIndexA=2;
		break;
		case "Meter Squared":comboboxIndexA=3;
		break;
		case "Kilometer Squared":comboboxIndexA=4;
		break;
		
		}
	}
	public static void getCombo_1IndexA()
	{
		String check=Calculator.comboBox_4.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer Squared":combobox_1IndexA=0;
		break;
		case "Millimeter Squared":combobox_1IndexA=1;
		break;
		case "Centimeter Squared":combobox_1IndexA=2;
		break;
		case "Meter Squared":combobox_1IndexA=3;
		break;
		case "Kilometer Squared":combobox_1IndexA=4;
		break;
		
		}
	}
	public static void getComboIndexV()
	{
		String check=Calculator.comboBox_5.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer Cubed":comboboxIndexV=0;
		break;
		case "Millimeter Cubed":comboboxIndexV=1;
		break;
		case "Centimeter Cubed":comboboxIndexV=2;
		break;
		case "Meter Cubed":comboboxIndexV=3;
		break;
		case "Kilometer Cubed":comboboxIndexV=4;
		break;
		
		}
	}
	public static void getCombo_1IndexV()
	{
		String check=Calculator.comboBox_6.getSelectedItem().toString();
		switch(check)
		{
		case "Nanometer Cubed":combobox_1IndexV=0;
		break;
		case "Millimeter Cubed":combobox_1IndexV=1;
		break;
		case "Centimeter Cubed":combobox_1IndexV=2;
		break;
		case "Meter Cubed":combobox_1IndexV=3;
		break;
		case "Kilometer Cubed":combobox_1IndexV=4;
		break;
		
		}
	}
	public static void getComboIndexT()
	{
		String check=Calculator.comboBox_7.getSelectedItem().toString();
		switch(check)
		{
		case "Milliseconds":comboboxIndexT=0;
		break;
		case "Seconds":comboboxIndexT=1;
		break;
		case "Minutes":comboboxIndexT=2;
		break;
		case "Hours":comboboxIndexT=3;
		break;
		
		}
	}
	public static void getCombo_1IndexT()
	{
		String check=Calculator.comboBox_8.getSelectedItem().toString();
		switch(check)
		{
		case "Milliseconds":combobox_1IndexT=0;
		break;
		case "Seconds":combobox_1IndexT=1;
		break;
		case "Minutes":combobox_1IndexT=2;
		break;
		case "Hours":combobox_1IndexT=3;
		break;
		
		}
	}
	public static void getComboIndexW()
	{
		String check=Calculator.comboBox_9.getSelectedItem().toString();
		switch(check)
		{
		case "Grams":comboboxIndexW=0;
		break;
		case "Kilograms":comboboxIndexW=1;
		break;
		
		}
	}
	public static void getCombo_1IndexW()
	{
		String check=Calculator.comboBox_10.getSelectedItem().toString();
		switch(check)
		{
		case "Grams":combobox_1IndexW=0;
		break;
		case "Kilograms":combobox_1IndexW=1;
		break;
		
		}
	}
	public static void getMainComboIndex()
	{
		String check=Calculator.comboBox_2.getSelectedItem().toString();
		switch(check)
		{
		case "Length":MaincomboboxIndex=0;
		break;
		case "Area":MaincomboboxIndex=1;
		break;
		case "Volume":MaincomboboxIndex=2;
		break;
		case "Time":MaincomboboxIndex=3;
		break;
		case "Weight":MaincomboboxIndex=4;
		}
	}
}
