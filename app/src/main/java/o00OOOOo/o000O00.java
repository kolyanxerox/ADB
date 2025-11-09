package o00OOOoO;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import kotlin.jvm.internal.OooOo;
import o000oo00.Oooo000;

/* loaded from: classes3.dex */
public class o000O00 extends o0000O {
    @Override // o00OOOoO.o0000O
    public void OooO00o(o000O0Oo o000o0oo2, o000O0Oo target) throws IOException {
        OooOo.OooO0o0(target, "target");
        if (o000o0oo2.OooO0o0().renameTo(target.OooO0o0())) {
            return;
        }
        throw new IOException("failed to move " + o000o0oo2 + " to " + target);
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0O0(o000O0Oo o000o0oo2) throws IOException {
        if (o000o0oo2.OooO0o0().mkdir()) {
            return;
        }
        Oooo000 oooo000OooO0o0 = OooO0o0(o000o0oo2);
        if (oooo000OooO0o0 == null || !oooo000OooO0o0.f31090OooO0OO) {
            throw new IOException("failed to create directory: " + o000o0oo2);
        }
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0OO(o000O0Oo o000o0oo2) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileOooO0o0 = o000o0oo2.OooO0o0();
        if (fileOooO0o0.delete() || !fileOooO0o0.exists()) {
            return;
        }
        throw new IOException("failed to delete " + o000o0oo2);
    }

    @Override // o00OOOoO.o0000O
    public final o000Oo0 OooO0o(o000O0Oo o000o0oo2) {
        return new o000Oo0(true, new RandomAccessFile(o000o0oo2.OooO0o0(), "rw"));
    }

    @Override // o00OOOoO.o0000O
    public Oooo000 OooO0o0(o000O0Oo path) {
        OooOo.OooO0o0(path, "path");
        File fileOooO0o0 = path.OooO0o0();
        boolean zIsFile = fileOooO0o0.isFile();
        boolean zIsDirectory = fileOooO0o0.isDirectory();
        long jLastModified = fileOooO0o0.lastModified();
        long length = fileOooO0o0.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileOooO0o0.exists()) {
            return new Oooo000(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // o00OOOoO.o0000O
    public final o0O0ooO OooO0oO(o000O0Oo file) {
        OooOo.OooO0o0(file, "file");
        File fileOooO0o0 = file.OooO0o0();
        Logger logger = o000O0.f32570OooO00o;
        return new o00000O0(1, new FileInputStream(fileOooO0o0), o00O000.f32601OooO0Oo);
    }

    public final o000Oo0 OooO0oo(o000O0Oo o000o0oo2) {
        return new o000Oo0(false, new RandomAccessFile(o000o0oo2.OooO0o0(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
