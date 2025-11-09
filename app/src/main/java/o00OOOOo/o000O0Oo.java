package o00OOOoO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOo;
import o00OOoo.Oooo0;

/* loaded from: classes3.dex */
public final class o000O0Oo implements Comparable {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final String f32579OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0000O0 f32580OooOo0O;

    static {
        String separator = File.separator;
        OooOo.OooO0Oo(separator, "separator");
        f32579OooOo0o = separator;
    }

    public o000O0Oo(o0000O0 bytes) {
        OooOo.OooO0o0(bytes, "bytes");
        this.f32580OooOo0O = bytes;
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        int iOooO00o = Oooo0.OooO00o(this);
        o0000O0 o0000o02 = this.f32580OooOo0O;
        if (iOooO00o == -1) {
            iOooO00o = 0;
        } else if (iOooO00o < o0000o02.OooO0o0() && o0000o02.OooOO0(iOooO00o) == 92) {
            iOooO00o++;
        }
        int iOooO0o0 = o0000o02.OooO0o0();
        int i = iOooO00o;
        while (iOooO00o < iOooO0o0) {
            if (o0000o02.OooOO0(iOooO00o) == 47 || o0000o02.OooOO0(iOooO00o) == 92) {
                arrayList.add(o0000o02.OooOOOo(i, iOooO00o));
                i = iOooO00o + 1;
            }
            iOooO00o++;
        }
        if (i < o0000o02.OooO0o0()) {
            arrayList.add(o0000o02.OooOOOo(i, o0000o02.OooO0o0()));
        }
        return arrayList;
    }

    public final String OooO0O0() {
        o0000O0 o0000o02 = Oooo0.f32611OooO00o;
        o0000O0 o0000o03 = Oooo0.f32611OooO00o;
        o0000O0 o0000o0OooOOo0 = this.f32580OooOo0O;
        int iOooOO0o = o0000O0.OooOO0o(o0000o0OooOOo0, o0000o03);
        if (iOooOO0o == -1) {
            iOooOO0o = o0000O0.OooOO0o(o0000o0OooOOo0, Oooo0.f32612OooO0O0);
        }
        if (iOooOO0o != -1) {
            o0000o0OooOOo0 = o0000O0.OooOOo0(o0000o0OooOOo0, iOooOO0o + 1, 0, 2);
        } else if (OooO0oO() != null && o0000o0OooOOo0.OooO0o0() == 2) {
            o0000o0OooOOo0 = o0000O0.f32553OooOoO0;
        }
        return o0000o0OooOOo0.OooOOoo();
    }

    public final o000O0Oo OooO0OO() {
        o0000O0 o0000o02 = Oooo0.f32614OooO0Oo;
        o0000O0 o0000o03 = this.f32580OooOo0O;
        if (OooOo.OooO00o(o0000o03, o0000o02)) {
            return null;
        }
        o0000O0 o0000o04 = Oooo0.f32611OooO00o;
        if (OooOo.OooO00o(o0000o03, o0000o04)) {
            return null;
        }
        o0000O0 prefix = Oooo0.f32612OooO0O0;
        if (OooOo.OooO00o(o0000o03, prefix)) {
            return null;
        }
        o0000O0 suffix = Oooo0.f32615OooO0o0;
        o0000o03.getClass();
        OooOo.OooO0o0(suffix, "suffix");
        int iOooO0o0 = o0000o03.OooO0o0();
        byte[] bArr = suffix.f32555OooOo0O;
        if (o0000o03.OooOOO(iOooO0o0 - bArr.length, suffix, bArr.length) && (o0000o03.OooO0o0() == 2 || o0000o03.OooOOO(o0000o03.OooO0o0() - 3, o0000o04, 1) || o0000o03.OooOOO(o0000o03.OooO0o0() - 3, prefix, 1))) {
            return null;
        }
        int iOooOO0o = o0000O0.OooOO0o(o0000o03, o0000o04);
        if (iOooOO0o == -1) {
            iOooOO0o = o0000O0.OooOO0o(o0000o03, prefix);
        }
        if (iOooOO0o == 2 && OooO0oO() != null) {
            if (o0000o03.OooO0o0() == 3) {
                return null;
            }
            return new o000O0Oo(o0000O0.OooOOo0(o0000o03, 0, 3, 1));
        }
        if (iOooOO0o == 1) {
            OooOo.OooO0o0(prefix, "prefix");
            if (o0000o03.OooOOO(0, prefix, prefix.f32555OooOo0O.length)) {
                return null;
            }
        }
        if (iOooOO0o != -1 || OooO0oO() == null) {
            return iOooOO0o == -1 ? new o000O0Oo(o0000o02) : iOooOO0o == 0 ? new o000O0Oo(o0000O0.OooOOo0(o0000o03, 0, 1, 1)) : new o000O0Oo(o0000O0.OooOOo0(o0000o03, 0, iOooOO0o, 1));
        }
        if (o0000o03.OooO0o0() == 2) {
            return null;
        }
        return new o000O0Oo(o0000O0.OooOOo0(o0000o03, 0, 2, 1));
    }

    public final o000O0Oo OooO0Oo(String child) {
        OooOo.OooO0o0(child, "child");
        o0000 o0000Var = new o0000();
        o0000Var.OooOOOO(child);
        return Oooo0.OooO0O0(this, Oooo0.OooO0Oo(o0000Var, false), false);
    }

    public final Path OooO0o() {
        Path path = Paths.get(this.f32580OooOo0O.OooOOoo(), new String[0]);
        OooOo.OooO0Oo(path, "get(toString())");
        return path;
    }

    public final File OooO0o0() {
        return new File(this.f32580OooOo0O.OooOOoo());
    }

    public final Character OooO0oO() {
        o0000O0 o0000o02 = Oooo0.f32611OooO00o;
        o0000O0 o0000o03 = this.f32580OooOo0O;
        if (o0000O0.OooO0oo(o0000o03, o0000o02) != -1 || o0000o03.OooO0o0() < 2 || o0000o03.OooOO0(1) != 58) {
            return null;
        }
        char cOooOO0 = (char) o0000o03.OooOO0(0);
        if (('a' > cOooOO0 || cOooOO0 >= '{') && ('A' > cOooOO0 || cOooOO0 >= '[')) {
            return null;
        }
        return Character.valueOf(cOooOO0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o000O0Oo other = (o000O0Oo) obj;
        OooOo.OooO0o0(other, "other");
        return this.f32580OooOo0O.compareTo(other.f32580OooOo0O);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o000O0Oo) && OooOo.OooO00o(((o000O0Oo) obj).f32580OooOo0O, this.f32580OooOo0O);
    }

    public final int hashCode() {
        return this.f32580OooOo0O.hashCode();
    }

    public final String toString() {
        return this.f32580OooOo0O.OooOOoo();
    }
}
