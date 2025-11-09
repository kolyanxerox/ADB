package OoooO0O;

import android.os.HandlerThread;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.C1595g7;
import com.google.android.gms.internal.ads.C1658hx;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.f60;
import com.google.android.gms.internal.ads.fj0;
import com.google.android.gms.internal.ads.oO000O0O;
import com.google.android.gms.internal.ads.xg0;
import com.google.android.gms.internal.ads.yg0;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.internal.ads.zg0;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.UUID;
import o00OoO00.OooOOO0;

/* loaded from: classes2.dex */
public final class o0000O0O implements o000oo0.o0OOO0o {

    /* renamed from: OooO00o */
    public String f13931OooO00o;

    /* renamed from: OooO0O0 */
    public Serializable f13932OooO0O0;

    /* renamed from: OooO0OO */
    public Serializable f13933OooO0OO;

    /* renamed from: OooO0Oo */
    public int f13934OooO0Oo;

    /* renamed from: OooO0o */
    public Object f13935OooO0o;

    /* renamed from: OooO0o0 */
    public int f13936OooO0o0;

    /* renamed from: OooO0oO */
    public Object f13937OooO0oO;

    public o0000O0O(int i, int i2) {
        this.f13932OooO0O0 = new LinkedList();
        this.f13933OooO0OO = new HashSet();
        this.f13935OooO0o = new HashSet();
        this.f13937OooO0oO = new HashMap();
        this.f13931OooO00o = "Sqflite";
        this.f13934OooO0Oo = i;
        this.f13936OooO0o0 = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static OoooO0O.o0000O0O OooO(android.util.JsonReader r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooO0O.o0000O0O.OooO(android.util.JsonReader):OoooO0O.o0000O0O");
    }

    @Override // o000oo0.o0OOO0o
    public synchronized void OooO0O0(o000oo0.o00oO0o o00oo0o) {
        ((LinkedList) this.f13932OooO0O0).add(o00oo0o);
        Iterator it = new HashSet((HashSet) this.f13933OooO0OO).iterator();
        while (it.hasNext()) {
            OooO0oo((o000oo0.o0ooOOo) it.next());
        }
    }

    @Override // o000oo0.o0OOO0o
    public synchronized void OooO0OO() {
        try {
            Iterator it = ((HashSet) this.f13933OooO0OO).iterator();
            while (it.hasNext()) {
                o000oo0.o0ooOOo o0ooooo = (o000oo0.o0ooOOo) it.next();
                synchronized (o0ooooo) {
                    HandlerThread handlerThread = o0ooooo.f31057OooO0OO;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        o0ooooo.f31057OooO0OO = null;
                        o0ooooo.f31058OooO0Oo = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f13935OooO0o).iterator();
            while (it2.hasNext()) {
                o000oo0.o0ooOOo o0ooooo2 = (o000oo0.o0ooOOo) it2.next();
                synchronized (o0ooooo2) {
                    HandlerThread handlerThread2 = o0ooooo2.f31057OooO0OO;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        o0ooooo2.f31057OooO0OO = null;
                        o0ooooo2.f31058OooO0Oo = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void OooO0Oo(o0000oo0.oo0o0Oo oo0o0oo) {
        if (((HashSet) this.f13932OooO0O0).contains(oo0o0oo.f29693OooO00o)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f13933OooO0OO).add(oo0o0oo);
    }

    public void OooO0o() {
        if (!(this.f13934OooO0Oo == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f13934OooO0Oo = 2;
    }

    public o0000oo0.o00Oo0 OooO0o0() {
        if (((o0000oo0.o00oO0o) this.f13935OooO0o) != null) {
            return new o0000oo0.o00Oo0(this.f13931OooO00o, new HashSet((HashSet) this.f13932OooO0O0), new HashSet((HashSet) this.f13933OooO0OO), this.f13934OooO0Oo, this.f13936OooO0o0, (o0000oo0.o00oO0o) this.f13935OooO0o, (HashSet) this.f13937OooO0oO);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized o000oo0.o00oO0o OooO0oO(o000oo0.o0ooOOo o0ooooo) {
        o000oo0.o00oO0o o00oo0o;
        o000oo0.o0ooOOo o0ooooo2;
        try {
            ListIterator listIterator = ((LinkedList) this.f13932OooO0O0).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                o00oo0o = (o000oo0.o00oO0o) listIterator.next();
                o0ooooo2 = o00oo0o.OooO00o() != null ? (o000oo0.o0ooOOo) ((HashMap) this.f13937OooO0oO).get(o00oo0o.OooO00o()) : null;
                if (o0ooooo2 == null) {
                    break;
                }
            } while (o0ooooo2 != o0ooooo);
            listIterator.remove();
            return o00oo0o;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void OooO0oo(o000oo0.o0ooOOo o0ooooo) {
        try {
            o000oo0.o00oO0o o00oo0oOooO0oO = OooO0oO(o0ooooo);
            if (o00oo0oOooO0oO != null) {
                ((HashSet) this.f13935OooO0o).add(o0ooooo);
                ((HashSet) this.f13933OooO0OO).remove(o0ooooo);
                if (o00oo0oOooO0oO.OooO00o() != null) {
                    ((HashMap) this.f13937OooO0oO).put(o00oo0oOooO0oO.OooO00o(), o0ooooo);
                }
                o0ooooo.f31058OooO0Oo.post(new OooOOOO(13, o0ooooo, o00oo0oOooO0oO));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object OooOO0() {
        C1595g7 c1595g7OooO00o = C1595g7.OooO00o(this.f13931OooO00o, (String) this.f13932OooO0O0);
        eh0 eh0VarOooOOOO = C1658hx.OooOOOO("javascript");
        String str = (String) this.f13933OooO0OO;
        eh0 eh0VarOooOOOO2 = C1658hx.OooOOOO(str);
        int i = this.f13934OooO0Oo;
        zg0 zg0VarOooOOO0 = C1658hx.OooOOO0(AbstractC2183w4.OooO0o0(i));
        eh0 eh0Var = eh0.NONE;
        if (eh0VarOooOOOO == eh0Var) {
            zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zg0VarOooOOO0 == null) {
            zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(AbstractC2183w4.OooOoo(i)));
            return null;
        }
        if (zg0VarOooOOO0 == zg0.VIDEO && eh0VarOooOOOO2 == eh0Var) {
            zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str)));
            return null;
        }
        oO000O0O oo000o0o = new oO000O0O(c1595g7OooO00o, (WebView) this.f13935OooO0o, (String) this.f13937OooO0oO, "", xg0.JAVASCRIPT);
        fj0 fj0VarOooO00o = fj0.OooO00o(zg0VarOooOOO0, C1658hx.OooOOO(AbstractC2183w4.OooO0o(this.f13936OooO0o0)), eh0VarOooOOOO, eh0VarOooOOOO2, true);
        if (ze0.f26157OooO0Oo.f29577OooOo0o) {
            return new f60(new yg0(fj0VarOooO00o, oo000o0o, UUID.randomUUID().toString()), oo000o0o);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // o000oo0.o0OOO0o
    public synchronized void start() {
        for (int i = 0; i < this.f13934OooO0Oo; i++) {
            o000oo0.o0ooOOo o0ooooo = new o000oo0.o0ooOOo(this.f13931OooO00o + i, this.f13936OooO0o0);
            o0ooooo.OooO00o(new OooOOOO(14, this, o0ooooo));
            ((HashSet) this.f13933OooO0OO).add(o0ooooo);
        }
    }

    public o0000O0O(Class cls, Class[] clsArr) {
        this.f13931OooO00o = null;
        HashSet hashSet = new HashSet();
        this.f13932OooO0O0 = hashSet;
        this.f13933OooO0OO = new HashSet();
        this.f13934OooO0Oo = 0;
        this.f13936OooO0o0 = 0;
        this.f13937OooO0oO = new HashSet();
        hashSet.add(o0000oo0.o00000OO.OooO00o(cls));
        for (Class cls2 : clsArr) {
            OooOOO0.OooO0o0(cls2, "Null interface");
            ((HashSet) this.f13932OooO0O0).add(o0000oo0.o00000OO.OooO00o(cls2));
        }
    }
}
