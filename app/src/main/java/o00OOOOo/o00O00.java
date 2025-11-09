package o00OOooO;

import androidx.emoji2.text.flatbuffer.OooO00o;
import androidx.emoji2.text.flatbuffer.OooO0O0;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class o00O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f32641OooO00o;

    static {
        char c = File.separatorChar;
        f32641OooO00o = new byte[0];
        System.lineSeparator();
        o00O00O.f32644OooOo0o.getClass();
        o00O00O.f32643OooOo0O.getClass();
        new OooO0O0(new OooO00o(1), 1);
        new OooO0O0(new OooO00o(2), 2);
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int OooO0O0(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                break;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }
}
