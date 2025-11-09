package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ez0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oO000OOo implements Cloneable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ooOOOOoo f26682OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public ooOOOOoo f26683OooOo0o;

    public oO000OOo(ooOOOOoo oooooooo) {
        this.f26682OooOo0O = oooooooo;
        if (oooooooo.OooO0o0()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f26683OooOo0o = (ooOOOOoo) oooooooo.OooOOOO(4);
    }

    public static void OooO00o(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void OooO0O0() {
        if (this.f26683OooOo0o.OooO0o0()) {
            return;
        }
        ooOOOOoo oooooooo = (ooOOOOoo) this.f26682OooOo0O.OooOOOO(4);
        oOo000Oo.f26877OooO0OO.OooO00o(oooooooo.getClass()).OooO0oO(oooooooo, this.f26683OooOo0o);
        this.f26683OooOo0o = oooooooo;
    }

    /* renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final oO000OOo clone() {
        oO000OOo oo000ooo = (oO000OOo) this.f26682OooOo0O.OooOOOO(5);
        oo000ooo.f26683OooOo0o = OooO0Oo();
        return oo000ooo;
    }

    public final ooOOOOoo OooO0Oo() {
        if (!this.f26683OooOo0o.OooO0o0()) {
            return this.f26683OooOo0o;
        }
        this.f26683OooOo0o.OooO0oO();
        return this.f26683OooOo0o;
    }

    public final void OooO0o(ooOOOOoo oooooooo) {
        ooOOOOoo oooooooo2 = this.f26682OooOo0O;
        if (oooooooo2.equals(oooooooo)) {
            return;
        }
        if (!this.f26683OooOo0o.OooO0o0()) {
            ooOOOOoo oooooooo3 = (ooOOOOoo) oooooooo2.OooOOOO(4);
            oOo000Oo.f26877OooO0OO.OooO00o(oooooooo3.getClass()).OooO0oO(oooooooo3, this.f26683OooOo0o);
            this.f26683OooOo0o = oooooooo3;
        }
        ooOOOOoo oooooooo4 = this.f26683OooOo0o;
        oOo000Oo.f26877OooO0OO.OooO00o(oooooooo4.getClass()).OooO0oO(oooooooo4, oooooooo);
    }

    public final ooOOOOoo OooO0o0() {
        ooOOOOoo ooooooooOooO0Oo = OooO0Oo();
        ooooooooOooO0Oo.getClass();
        boolean zOooO0OO = true;
        byte bByteValue = ((Byte) ooooooooOooO0Oo.OooOOOO(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zOooO0OO = false;
            } else {
                zOooO0OO = oOo000Oo.f26877OooO0OO.OooO00o(ooooooooOooO0Oo.getClass()).OooO0OO(ooooooooOooO0Oo);
                ooooooooOooO0Oo.OooOOOO(2);
            }
        }
        if (zOooO0OO) {
            return ooooooooOooO0Oo;
        }
        throw new OooOOO0.OooO00o("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void OooO0oO(byte[] bArr, int i, oO000O0O oo000o0o) throws oO00O0oO {
        if (!this.f26683OooOo0o.OooO0o0()) {
            ooOOOOoo oooooooo = (ooOOOOoo) this.f26682OooOo0O.OooOOOO(4);
            oOo000Oo.f26877OooO0OO.OooO00o(oooooooo.getClass()).OooO0oO(oooooooo, this.f26683OooOo0o);
            this.f26683OooOo0o = oooooooo;
        }
        try {
            oO0 oo0OooO00o = oOo000Oo.f26877OooO0OO.OooO00o(this.f26683OooOo0o.getClass());
            ooOOOOoo oooooooo2 = this.f26683OooOo0o;
            ez0 ez0Var = new ez0();
            oo000o0o.getClass();
            oo0OooO00o.OooOO0(oooooooo2, bArr, 0, i, ez0Var);
        } catch (oO00O0oO e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new oO00O0oO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
