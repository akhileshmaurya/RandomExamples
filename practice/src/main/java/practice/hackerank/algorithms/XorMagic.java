package practice.hackerank.algorithms;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;

public class XorMagic {

	public static void main(String[] args) throws Exception {
		Reader br = new Reader();

		int n = br.nextInt();
		long m = br.nextLong();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.nextInt();
		}
		findMthRow(arr, m);
	}

	private static void findMthRow(int[] arr, long m) {
		if (arr.length == 1) {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[0]);
		} else {
			int k;
			if (m > arr.length)
				k = arr.length;
			else
				k = (int) m;
			boolean status[] = new boolean[k];
			// System.out.println("1:");
			makingBooleanArry(m, status);
			// System.out.println("2:");
			for (int i = 0; i < arr.length; i++) {
				// System.out.println("3:");
				long value = 0;
				for (int j = 0; j < k; j++) {
					// System.out.println("4:");
					int p = i + j;
					while (p >= arr.length)
						p = p - arr.length;
					if (status[j])
						value = value ^ arr[p];

				}
				System.out.print(value + " ");
			}
		}
	}

	private static void makingBooleanArry(long row, boolean[] status) {
		long i, limit, l;
		limit = row;
		BigInteger previous = new BigInteger("1");
		status[0] = true;
		boolean isAllow = false;
		for (i = 1; i < limit; i++) {
			// System.out.println("b1:");
			isAllow = false;
			previous = (previous.multiply(new BigInteger(String.valueOf((row - i)))))
					.divide(new BigInteger(String.valueOf(i)));

			if (previous.mod(new BigInteger("2")).intValue() != 0)
				isAllow = true;
			l = i;
			while (l >= status.length) {
				l = l - status.length;
				// System.out.println("b2:");
			}
			if (status[(int) l] == isAllow)
				status[(int) l] = false;
			else
				status[(int) l] = true;

		}
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}
