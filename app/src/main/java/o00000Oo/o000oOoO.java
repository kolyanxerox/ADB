package o00000oo;

import OoooOOO.o0o0000;
import com.google.crypto.tink.shaded.protobuf.OooO00o;
import com.google.crypto.tink.shaded.protobuf.OooOO0O;
import com.google.crypto.tink.shaded.protobuf.OooOOO0;
import com.google.crypto.tink.shaded.protobuf.o000OOo;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import o0000OOo.o00O0;
import o0000OOo.o00O00;
import o0000OOo.o00O000;
import o0000OOo.o00O000o;
import o0000OOo.o00O00OO;
import o0000OOo.o00O0O0;
import o0000OOo.o00O0O00;
import o0000OOo.o00OO0OO;
import o0000OOo.oo00o;
import o000OO.OooO;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000oOoO f29288OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000oOoO f29289OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o000oOoO f29290OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29291OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f29292OooO0O0;

    static {
        int i = 0;
        f29288OooO0OO = new o000oOoO("ENABLED", i);
        f29289OooO0Oo = new o000oOoO("DISABLED", i);
        f29290OooO0o0 = new o000oOoO("DESTROYED", i);
    }

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f29291OooO00o = i;
        this.f29292OooO0O0 = obj;
    }

    public synchronized void OooO00o(o00O00OO o00o00oo) {
        o00O0O00 o00o0o00OooO0O0;
        synchronized (this) {
            o00o0o00OooO0O0 = OooO0O0(o0OOO0o.OooO0Oo(o00o00oo), o00o00oo.OooOoO());
        }
        oo00o oo00oVar = (oo00o) this.f29292OooO0O0;
        oo00oVar.OooO0Oo();
        o00O0O0.OooOo0o((o00O0O0) oo00oVar.f28132OooOo0o, o00o0o00OooO0O0);
    }

    public synchronized o00O0O00 OooO0O0(o00O00 o00o00, o00OO0OO o00oo0oo) {
        int iOooO00o;
        synchronized (this) {
            iOooO00o = o000OO.o00oO0o.OooO00o();
            while (OooO0Oo(iOooO00o)) {
                iOooO00o = o000OO.o00oO0o.OooO00o();
            }
        }
        return (o00O0O00) o00o0OooOooo.OooO00o();
        if (o00oo0oo == o00OO0OO.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        o00O0 o00o0OooOooo = o00O0O00.OooOooo();
        o00o0OooOooo.OooO0Oo();
        o00O0O00.OooOo0O((o00O0O00) o00o0OooOooo.f28132OooOo0o, o00o00);
        o00o0OooOooo.OooO0Oo();
        o00O0O00.OooOoO0((o00O0O00) o00o0OooOooo.f28132OooOo0o, iOooO00o);
        o00o0OooOooo.OooO0Oo();
        o00O0O00.OooOo((o00O0O00) o00o0OooOooo.f28132OooOo0o);
        o00o0OooOooo.OooO0Oo();
        o00O0O00.OooOo0o((o00O0O00) o00o0OooOooo.f28132OooOo0o, o00oo0oo);
        return (o00O0O00) o00o0OooOooo.OooO00o();
    }

    public synchronized Oooo.OooOo00 OooO0OO() {
        return Oooo.OooOo00.OooOO0o((o00O0O0) ((oo00o) this.f29292OooO0O0).OooO00o());
    }

    public synchronized boolean OooO0Oo(int i) {
        Iterator it = Collections.unmodifiableList(((o00O0O0) ((oo00o) this.f29292OooO0O0).f28132OooOo0o).OooOoO()).iterator();
        while (it.hasNext()) {
            if (((o00O0O00) it.next()).OooOoOO() == i) {
                return true;
            }
        }
        return false;
    }

    public o00O00 OooO0o0(OooOOO0 oooOOO0) throws GeneralSecurityException {
        OooO oooO = (OooO) this.f29292OooO0O0;
        try {
            o0o0000 o0o0000VarOooO0Oo = oooO.OooO0Oo();
            OooO00o oooO00oOooO = o0o0000VarOooO0Oo.OooO(oooOOO0);
            o0o0000VarOooO0Oo.OooOO0(oooO00oOooO);
            OooO00o oooO00oOooO0oO = o0o0000VarOooO0Oo.OooO0oO(oooO00oOooO);
            o00O000 o00o000OooOoo = o00O00.OooOoo();
            String strOooO0O0 = oooO.OooO0O0();
            o00o000OooOoo.OooO0Oo();
            o00O00.OooOo0O((o00O00) o00o000OooOoo.f28132OooOo0o, strOooO0O0);
            try {
                int iOooO00o = ((com.google.crypto.tink.shaded.protobuf.o0ooOOo) oooO00oOooO0oO).OooO00o(null);
                byte[] bArr = new byte[iOooO00o];
                com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00 = new com.google.crypto.tink.shaded.protobuf.OooOo00(bArr, iOooO00o);
                oooO00oOooO0oO.OooO0o0(oooOo00);
                if (oooOo00.f28040OooO0o0 - oooOo00.f28039OooO0o != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                OooOO0O oooOO0O = new OooOO0O(bArr);
                o00o000OooOoo.OooO0Oo();
                o00O00.OooOo0o((o00O00) o00o000OooOoo.f28132OooOo0o, oooOO0O);
                o00O000o o00o000oOooO0o0 = oooO.OooO0o0();
                o00o000OooOoo.OooO0Oo();
                o00O00.OooOo((o00O00) o00o000OooOoo.f28132OooOo0o, o00o000oOooO0o0);
                return (o00O00) o00o000OooOoo.OooO00o();
            } catch (IOException e) {
                throw new RuntimeException(oooO00oOooO0oO.OooO0O0("ByteString"), e);
            }
        } catch (o000OOo e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public String toString() {
        switch (this.f29291OooO00o) {
            case 0:
                return (String) this.f29292OooO0O0;
            default:
                return super.toString();
        }
    }

    public o000oOoO(OooO oooO, Class cls) {
        this.f29291OooO00o = 2;
        if (!oooO.f30156OooO0O0.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Given internalKeyMananger ", oooO.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f29292OooO0O0 = oooO;
    }
}
