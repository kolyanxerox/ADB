package o000Oo0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class OooOo implements Closeable, AutoCloseable {

    /* renamed from: OooOoo0 */
    public static final Logger f30352OooOoo0 = Logger.getLogger(OooOo.class.getName());

    /* renamed from: OooOo */
    public int f30353OooOo;

    /* renamed from: OooOo0O */
    public final RandomAccessFile f30354OooOo0O;

    /* renamed from: OooOo0o */
    public int f30355OooOo0o;

    /* renamed from: OooOoO */
    public OooOOO f30356OooOoO;

    /* renamed from: OooOoO0 */
    public OooOOO f30357OooOoO0;

    /* renamed from: OooOoOO */
    public final byte[] f30358OooOoOO;

    public OooOo(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f30358OooOoOO = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    OooOOOo(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f30354OooOo0O = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iOooO0o = OooO0o(0, bArr);
        this.f30355OooOo0o = iOooO0o;
        if (iOooO0o > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f30355OooOo0o + ", Actual length: " + randomAccessFile2.length());
        }
        this.f30353OooOo = OooO0o(4, bArr);
        int iOooO0o2 = OooO0o(8, bArr);
        int iOooO0o3 = OooO0o(12, bArr);
        this.f30357OooOoO0 = OooO0o0(iOooO0o2);
        this.f30356OooOoO = OooO0o0(iOooO0o3);
    }

    public static int OooO0o(int i, byte[] bArr) {
        return ((bArr[i] & ForkServer.ERROR) << 24) + ((bArr[i + 1] & ForkServer.ERROR) << 16) + ((bArr[i + 2] & ForkServer.ERROR) << 8) + (bArr[i + 3] & ForkServer.ERROR);
    }

    public static void OooOOOo(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void OooO(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iOooOOO = OooOOO(i);
        int i4 = iOooOOO + i3;
        int i5 = this.f30355OooOo0o;
        RandomAccessFile randomAccessFile = this.f30354OooOo0O;
        if (i4 <= i5) {
            randomAccessFile.seek(iOooOOO);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iOooOOO;
        randomAccessFile.seek(iOooOOO);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void OooO00o(byte[] bArr) {
        int iOooOOO;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    OooO0O0(length);
                    boolean zOooO0Oo = OooO0Oo();
                    if (zOooO0Oo) {
                        iOooOOO = 16;
                    } else {
                        OooOOO oooOOO = this.f30356OooOoO;
                        iOooOOO = OooOOO(oooOOO.f30345OooO00o + 4 + oooOOO.f30346OooO0O0);
                    }
                    OooOOO oooOOO2 = new OooOOO(iOooOOO, length);
                    OooOOOo(this.f30358OooOoOO, 0, length);
                    OooOO0O(this.f30358OooOoOO, iOooOOO, 4);
                    OooOO0O(bArr, iOooOOO + 4, length);
                    OooOOOO(this.f30355OooOo0o, this.f30353OooOo + 1, zOooO0Oo ? iOooOOO : this.f30357OooOoO0.f30345OooO00o, iOooOOO);
                    this.f30356OooOoO = oooOOO2;
                    this.f30353OooOo++;
                    if (zOooO0Oo) {
                        this.f30357OooOoO0 = oooOOO2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void OooO0O0(int i) throws IOException {
        int i2 = i + 4;
        int iOooOOO0 = this.f30355OooOo0o - OooOOO0();
        if (iOooOOO0 >= i2) {
            return;
        }
        int i3 = this.f30355OooOo0o;
        do {
            iOooOOO0 += i3;
            i3 <<= 1;
        } while (iOooOOO0 < i2);
        RandomAccessFile randomAccessFile = this.f30354OooOo0O;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        OooOOO oooOOO = this.f30356OooOoO;
        int iOooOOO = OooOOO(oooOOO.f30345OooO00o + 4 + oooOOO.f30346OooO0O0);
        if (iOooOOO < this.f30357OooOoO0.f30345OooO00o) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f30355OooOo0o);
            long j = iOooOOO - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f30356OooOoO.f30345OooO00o;
        int i5 = this.f30357OooOoO0.f30345OooO00o;
        if (i4 < i5) {
            int i6 = (this.f30355OooOo0o + i4) - 16;
            OooOOOO(i3, this.f30353OooOo, i5, i6);
            this.f30356OooOoO = new OooOOO(i6, this.f30356OooOoO.f30346OooO0O0);
        } else {
            OooOOOO(i3, this.f30353OooOo, i5, i4);
        }
        this.f30355OooOo0o = i3;
    }

    public final synchronized void OooO0OO(OooOo00 oooOo00) {
        int iOooOOO = this.f30357OooOoO0.f30345OooO00o;
        for (int i = 0; i < this.f30353OooOo; i++) {
            OooOOO oooOOOOooO0o0 = OooO0o0(iOooOOO);
            oooOo00.OooO00o(new OooOOOO(this, oooOOOOooO0o0), oooOOOOooO0o0.f30346OooO0O0);
            iOooOOO = OooOOO(oooOOOOooO0o0.f30345OooO00o + 4 + oooOOOOooO0o0.f30346OooO0O0);
        }
    }

    public final synchronized boolean OooO0Oo() {
        return this.f30353OooOo == 0;
    }

    public final OooOOO OooO0o0(int i) throws IOException {
        if (i == 0) {
            return OooOOO.f30344OooO0OO;
        }
        RandomAccessFile randomAccessFile = this.f30354OooOo0O;
        randomAccessFile.seek(i);
        return new OooOOO(i, randomAccessFile.readInt());
    }

    public final synchronized void OooO0oo() {
        if (OooO0Oo()) {
            throw new NoSuchElementException();
        }
        if (this.f30353OooOo == 1) {
            synchronized (this) {
                OooOOOO(4096, 0, 0, 0);
                this.f30353OooOo = 0;
                OooOOO oooOOO = OooOOO.f30344OooO0OO;
                this.f30357OooOoO0 = oooOOO;
                this.f30356OooOoO = oooOOO;
                if (this.f30355OooOo0o > 4096) {
                    RandomAccessFile randomAccessFile = this.f30354OooOo0O;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f30355OooOo0o = 4096;
            }
        } else {
            OooOOO oooOOO2 = this.f30357OooOoO0;
            int iOooOOO = OooOOO(oooOOO2.f30345OooO00o + 4 + oooOOO2.f30346OooO0O0);
            OooO(iOooOOO, this.f30358OooOoOO, 0, 4);
            int iOooO0o = OooO0o(0, this.f30358OooOoOO);
            OooOOOO(this.f30355OooOo0o, this.f30353OooOo - 1, iOooOOO, this.f30356OooOoO.f30345OooO00o);
            this.f30353OooOo--;
            this.f30357OooOoO0 = new OooOOO(iOooOOO, iOooO0o);
        }
    }

    public final void OooOO0O(byte[] bArr, int i, int i2) throws IOException {
        int iOooOOO = OooOOO(i);
        int i3 = iOooOOO + i2;
        int i4 = this.f30355OooOo0o;
        RandomAccessFile randomAccessFile = this.f30354OooOo0O;
        if (i3 <= i4) {
            randomAccessFile.seek(iOooOOO);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iOooOOO;
        randomAccessFile.seek(iOooOOO);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int OooOOO(int i) {
        int i2 = this.f30355OooOo0o;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final int OooOOO0() {
        if (this.f30353OooOo == 0) {
            return 16;
        }
        OooOOO oooOOO = this.f30356OooOoO;
        int i = oooOOO.f30345OooO00o;
        int i2 = this.f30357OooOoO0.f30345OooO00o;
        return i >= i2 ? (i - i2) + 4 + oooOOO.f30346OooO0O0 + 16 : (((i + 4) + oooOOO.f30346OooO0O0) + this.f30355OooOo0o) - i2;
    }

    public final void OooOOOO(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.f30358OooOoOO;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            OooOOOo(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.f30354OooOo0O;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f30354OooOo0O.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooOo.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f30355OooOo0o);
        sb.append(", size=");
        sb.append(this.f30353OooOo);
        sb.append(", first=");
        sb.append(this.f30357OooOoO0);
        sb.append(", last=");
        sb.append(this.f30356OooOoO);
        sb.append(", element lengths=[");
        try {
            OooO0OO(new OooO0oO.Oooo000(sb));
        } catch (IOException e) {
            f30352OooOoo0.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
