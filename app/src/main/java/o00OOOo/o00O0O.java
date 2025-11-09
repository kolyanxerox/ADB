package o00OOoo;

import OoooOOO.C0001o0;
import OoooOOO.o0O00000;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o00OOOoO.o0000;
import o00OOOoO.o0000O;
import o00OOOoO.o0000O0;
import o00OOOoO.o000O0Oo;
import o00OOOoO.o000Oo0;
import o00OOOoO.o0O0ooO;
import oo00o.OooOO0;
import oo00o.OooOOOO;

/* loaded from: classes3.dex */
public final class o00O0O extends o0000O {

    /* renamed from: OooO0OO */
    public static final o000O0Oo f32620OooO0OO;

    /* renamed from: OooO0O0 */
    public final OooOOOO f32621OooO0O0;

    static {
        String str = o000O0Oo.f32579OooOo0o;
        f32620OooO0OO = o0O00000.OooO("/", false);
    }

    public o00O0O(ClassLoader classLoader) {
        this.f32621OooO0O0 = o0OOO0.OooO0oo(new o0OoOo0(classLoader));
    }

    public static String OooO0oo(o000O0Oo child) throws EOFException {
        o000O0Oo o000o0ooOooO0Oo;
        o000O0Oo o000o0oo2 = f32620OooO0OO;
        o000o0oo2.getClass();
        kotlin.jvm.internal.OooOo.OooO0o0(child, "child");
        o000O0Oo o000o0ooOooO0O0 = Oooo0.OooO0O0(o000o0oo2, child, true);
        int iOooO00o = Oooo0.OooO00o(o000o0ooOooO0O0);
        o0000O0 o0000o02 = o000o0ooOooO0O0.f32580OooOo0O;
        o000O0Oo o000o0oo3 = iOooO00o == -1 ? null : new o000O0Oo(o0000o02.OooOOOo(0, iOooO00o));
        int iOooO00o2 = Oooo0.OooO00o(o000o0oo2);
        o0000O0 o0000o03 = o000o0oo2.f32580OooOo0O;
        if (!kotlin.jvm.internal.OooOo.OooO00o(o000o0oo3, iOooO00o2 != -1 ? new o000O0Oo(o0000o03.OooOOOo(0, iOooO00o2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + o000o0ooOooO0O0 + " and " + o000o0oo2).toString());
        }
        ArrayList arrayListOooO00o = o000o0ooOooO0O0.OooO00o();
        ArrayList arrayListOooO00o2 = o000o0oo2.OooO00o();
        int iMin = Math.min(arrayListOooO00o.size(), arrayListOooO00o2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.OooOo.OooO00o(arrayListOooO00o.get(i), arrayListOooO00o2.get(i))) {
            i++;
        }
        if (i == iMin && o0000o02.OooO0o0() == o0000o03.OooO0o0()) {
            String str = o000O0Oo.f32579OooOo0o;
            o000o0ooOooO0Oo = o0O00000.OooO(".", false);
        } else {
            if (arrayListOooO00o2.subList(i, arrayListOooO00o2.size()).indexOf(Oooo0.f32615OooO0o0) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + o000o0ooOooO0O0 + " and " + o000o0oo2).toString());
            }
            o0000 o0000Var = new o0000();
            o0000O0 o0000o0OooO0OO = Oooo0.OooO0OO(o000o0oo2);
            if (o0000o0OooO0OO == null && (o0000o0OooO0OO = Oooo0.OooO0OO(o000o0ooOooO0O0)) == null) {
                o0000o0OooO0OO = Oooo0.OooO0o(o000O0Oo.f32579OooOo0o);
            }
            int size = arrayListOooO00o2.size();
            for (int i2 = i; i2 < size; i2++) {
                o0000Var.OooO0o(Oooo0.f32615OooO0o0);
                o0000Var.OooO0o(o0000o0OooO0OO);
            }
            int size2 = arrayListOooO00o.size();
            while (i < size2) {
                o0000Var.OooO0o((o0000O0) arrayListOooO00o.get(i));
                o0000Var.OooO0o(o0000o0OooO0OO);
                i++;
            }
            o000o0ooOooO0Oo = Oooo0.OooO0Oo(o0000Var, false);
        }
        return o000o0ooOooO0Oo.f32580OooOo0O.OooOOoo();
    }

    @Override // o00OOOoO.o0000O
    public final void OooO00o(o000O0Oo o000o0oo2, o000O0Oo target) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0O0(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // o00OOOoO.o0000O
    public final void OooO0OO(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // o00OOOoO.o0000O
    public final o000Oo0 OooO0o(o000O0Oo o000o0oo2) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // o00OOOoO.o0000O
    public final o000oo00.Oooo000 OooO0o0(o000O0Oo path) throws EOFException {
        kotlin.jvm.internal.OooOo.OooO0o0(path, "path");
        if (!C0001o0.OooO0oo(path)) {
            return null;
        }
        String strOooO0oo = OooO0oo(path);
        for (OooOO0 oooOO0 : (List) this.f32621OooO0O0.getValue()) {
            o000oo00.Oooo000 oooo000OooO0o0 = ((o0000O) oooOO0.f33185OooOo0O).OooO0o0(((o000O0Oo) oooOO0.f33186OooOo0o).OooO0Oo(strOooO0oo));
            if (oooo000OooO0o0 != null) {
                return oooo000OooO0o0;
            }
        }
        return null;
    }

    @Override // o00OOOoO.o0000O
    public final o0O0ooO OooO0oO(o000O0Oo file) throws EOFException, FileNotFoundException {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        if (!C0001o0.OooO0oo(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strOooO0oo = OooO0oo(file);
        for (OooOO0 oooOO0 : (List) this.f32621OooO0O0.getValue()) {
            try {
                return ((o0000O) oooOO0.f33185OooOo0O).OooO0oO(((o000O0Oo) oooOO0.f33186OooOo0o).OooO0Oo(strOooO0oo));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
