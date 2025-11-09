package o00OOOoO;

import OoooOOO.o0O00000;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;
import kotlin.jvm.internal.OooOo;
import o000oo00.Oooo000;
import o00OOoo.Oooo0;
import o00OOoo.o000oOoO;
import o00OOoo.o00Oo0;
import o00Oo0oo.o00oO0o;

/* loaded from: classes3.dex */
public final class o00O000o extends o0000O {

    /* renamed from: OooO0o0 */
    public static final o000O0Oo f32606OooO0o0;

    /* renamed from: OooO0O0 */
    public final o000O0Oo f32607OooO0O0;

    /* renamed from: OooO0OO */
    public final o000O00 f32608OooO0OO;

    /* renamed from: OooO0Oo */
    public final LinkedHashMap f32609OooO0Oo;

    static {
        String str = o000O0Oo.f32579OooOo0o;
        f32606OooO0o0 = o0O00000.OooO("/", false);
    }

    public o00O000o(o000O0Oo o000o0oo2, o000O00 fileSystem, LinkedHashMap linkedHashMap) {
        OooOo.OooO0o0(fileSystem, "fileSystem");
        this.f32607OooO0O0 = o000o0oo2;
        this.f32608OooO0OO = fileSystem;
        this.f32609OooO0Oo = linkedHashMap;
    }

    @Override // o00OOOoO.o0000O
    public final void OooO00o(o000O0Oo o000o0oo2, o000O0Oo target) throws IOException {
        OooOo.OooO0o0(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0O0(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0OO(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // o00OOOoO.o0000O
    public final o000Oo0 OooO0o(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override // o00OOOoO.o0000O
    public final Oooo000 OooO0o0(o000O0Oo path) throws Throwable {
        o000O0O0 o000o0o0OooO00o;
        OooOo.OooO0o0(path, "path");
        o000O0Oo o000o0oo2 = f32606OooO0o0;
        o000o0oo2.getClass();
        o00Oo0 o00oo0 = (o00Oo0) this.f32609OooO0Oo.get(Oooo0.OooO0O0(o000o0oo2, path, true));
        Throwable th = null;
        if (o00oo0 == null) {
            return null;
        }
        boolean z = o00oo0.f32623OooO0O0;
        Oooo000 oooo000 = new Oooo000(!z, z, z ? null : Long.valueOf(o00oo0.f32625OooO0Oo), null, o00oo0.f32626OooO0o, null);
        long j = o00oo0.f32628OooO0oO;
        if (j == -1) {
            return oooo000;
        }
        o000Oo0 o000oo0OooO0oo = this.f32608OooO0OO.OooO0oo(this.f32607OooO0O0);
        try {
            o000o0o0OooO00o = o00oO0o.OooO00o(o000oo0OooO0oo.OooO0OO(j));
            try {
                o000oo0OooO0oo.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                o000oo0OooO0oo.close();
            } catch (Throwable th4) {
                o0OO0O0.OooO00o(th3, th4);
            }
            o000o0o0OooO00o = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(o000o0o0OooO00o);
        Oooo000 oooo000OooO0o = o00OOoo.Oooo000.OooO0o(o000o0o0OooO00o, oooo000);
        OooOo.OooO0O0(oooo000OooO0o);
        return oooo000OooO0o;
    }

    @Override // o00OOOoO.o0000O
    public final o0O0ooO OooO0oO(o000O0Oo file) throws Throwable {
        Throwable th;
        o000O0O0 o000o0o0OooO00o;
        OooOo.OooO0o0(file, "file");
        o000O0Oo o000o0oo2 = f32606OooO0o0;
        o000o0oo2.getClass();
        o00Oo0 o00oo0 = (o00Oo0) this.f32609OooO0Oo.get(Oooo0.OooO0O0(o000o0oo2, file, true));
        if (o00oo0 == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        o000Oo0 o000oo0OooO0oo = this.f32608OooO0OO.OooO0oo(this.f32607OooO0O0);
        try {
            o000o0o0OooO00o = o00oO0o.OooO00o(o000oo0OooO0oo.OooO0OO(o00oo0.f32628OooO0oO));
            try {
                o000oo0OooO0oo.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                o000oo0OooO0oo.close();
            } catch (Throwable th4) {
                o0OO0O0.OooO00o(th3, th4);
            }
            th = th3;
            o000o0o0OooO00o = null;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(o000o0o0OooO00o);
        o00OOoo.Oooo000.OooO0o(o000o0o0OooO00o, null);
        int i = o00oo0.f32627OooO0o0;
        long j = o00oo0.f32625OooO0Oo;
        if (i == 0) {
            return new o000oOoO(o000o0o0OooO00o, j, true);
        }
        return new o000oOoO(new o000O0o(o00oO0o.OooO00o(new o000oOoO(o000o0o0OooO00o, o00oo0.f32624OooO0OO, true)), new Inflater(true)), j, false);
    }
}
