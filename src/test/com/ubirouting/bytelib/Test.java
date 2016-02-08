package test.com.ubirouting.bytelib;

import java.util.Arrays;

import com.ubirouting.bytelib.ByteUtils;
import com.ubirouting.bytelib.ToByteComplieException;
import com.ubirouting.bytelib.ToBytes;

public class Test implements ToBytes {

	private int aa;
	private int mHaha;
	private float f = 123.456f;
	private double d = 34567;
	private short s = 123;
	private long l = 1234567890;

	public Test() {
		aa = 1;
		mHaha = 48;
	}

	@Override
	public String format() {
		return "i[getAA]i[getHaha]z[getBoolean]f[getF]d[getD]s[getS]j[getL]";
	}

	public int getAA() {
		return aa;
	}

	private int getHaha() {
		return mHaha;
	}

	public boolean getBoolean() {
		return true;
	}

	public float getF() {
		return f;
	}

	public double getD() {
		return d;
	}

	public short getS() {
		return s;
	}

	public long getL() {
		return l;
	}

	public static void main(String[] args) {
		Test t = new Test();
		try {
			byte[] b = ByteUtils.getInstance().toBytes(t);
			System.out.println(Arrays.toString(b));
		} catch (ToByteComplieException e) {
			e.printStackTrace();
		}
	}
}
