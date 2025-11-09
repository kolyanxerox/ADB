package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jk */
/* loaded from: classes2.dex */
public final class C1718jk implements InterfaceC1792lk {
    public static final List OooOO0o = Collections.synchronizedList(new ArrayList());

    /* renamed from: OooO00o */
    public final z11 f20318OooO00o;

    /* renamed from: OooO0O0 */
    public final LinkedHashMap f20319OooO0O0;

    /* renamed from: OooO0o */
    public boolean f20322OooO0o;

    /* renamed from: OooO0o0 */
    public final Context f20323OooO0o0;

    /* renamed from: OooO0oO */
    public final C1755kk f20324OooO0oO;

    /* renamed from: OooO0OO */
    public final ArrayList f20320OooO0OO = new ArrayList();

    /* renamed from: OooO0Oo */
    public final ArrayList f20321OooO0Oo = new ArrayList();

    /* renamed from: OooO0oo */
    public final Object f20325OooO0oo = new Object();

    /* renamed from: OooO */
    public final HashSet f20317OooO = new HashSet();

    /* renamed from: OooOO0 */
    public boolean f20326OooOO0 = false;

    /* renamed from: OooOO0O */
    public boolean f20327OooOO0O = false;

    public C1718jk(Context context, VersionInfoParcel versionInfoParcel, C1755kk c1755kk, String str) {
        this.f20323OooO0o0 = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f20319OooO0O0 = new LinkedHashMap();
        this.f20324OooO0oO = c1755kk;
        Iterator it = c1755kk.zze.iterator();
        while (it.hasNext()) {
            this.f20317OooO.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f20317OooO.remove("cookie".toLowerCase(Locale.ENGLISH));
        z11 z11VarOooOo0o = a31.OooOo0o();
        z11VarOooOo0o.OooO0Oo();
        a31.Oooo0OO((a31) z11VarOooOo0o.f25822OooOo0o, 9);
        z11VarOooOo0o.OooO0Oo();
        a31.Oooo0O0((a31) z11VarOooOo0o.f25822OooOo0o, str);
        z11VarOooOo0o.OooO0Oo();
        a31.Oooo00o((a31) z11VarOooOo0o.f25822OooOo0o, str);
        a21 a21VarOooOo0o = b21.OooOo0o();
        String str2 = this.f20324OooO0oO.zza;
        if (str2 != null) {
            a21VarOooOo0o.OooO0Oo();
            b21.OooOo((b21) a21VarOooOo0o.f25822OooOo0o, str2);
        }
        b21 b21Var = (b21) a21VarOooOo0o.OooO0O0();
        z11VarOooOo0o.OooO0Oo();
        a31.Oooo00O((a31) z11VarOooOo0o.f25822OooOo0o, b21Var);
        w21 w21VarOooOo0o = x21.OooOo0o();
        boolean zOooO0Oo = Oooo0o0.OooOO0.OooO00o(this.f20323OooO0o0).OooO0Oo();
        w21VarOooOo0o.OooO0Oo();
        x21.OooOoO((x21) w21VarOooOo0o.f25822OooOo0o, zOooO0Oo);
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            w21VarOooOo0o.OooO0Oo();
            x21.OooOo((x21) w21VarOooOo0o.f25822OooOo0o, str3);
        }
        OooOooo.o000O0Oo o000o0oo2 = OooOooo.o000O0Oo.f13671OooO0O0;
        Context context2 = this.f20323OooO0o0;
        o000o0oo2.getClass();
        long jOooO00o = OooOooo.o000O0Oo.OooO00o(context2);
        if (jOooO00o > 0) {
            w21VarOooOo0o.OooO0Oo();
            x21.OooOoO0((x21) w21VarOooOo0o.f25822OooOo0o, jOooO00o);
        }
        x21 x21Var = (x21) w21VarOooOo0o.OooO0O0();
        z11VarOooOo0o.OooO0Oo();
        a31.Oooo000((a31) z11VarOooOo0o.f25822OooOo0o, x21Var);
        this.f20318OooO00o = z11VarOooOo0o;
    }

    public final void OooO00o(String str, int i, Map map) {
        synchronized (this.f20325OooO0oo) {
            if (i == 3) {
                try {
                    this.f20327OooOO0O = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f20319OooO0O0.containsKey(str)) {
                if (i == 3) {
                    u21 u21Var = (u21) this.f20319OooO0O0.get(str);
                    u21Var.OooO0Oo();
                    v21.OooOooO((v21) u21Var.f25822OooOo0o, 4);
                }
                return;
            }
            u21 u21VarOooOo = v21.OooOo();
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i2 != 0) {
                u21VarOooOo.OooO0Oo();
                v21.OooOooO((v21) u21VarOooOo.f25822OooOo0o, i2);
            }
            int size = this.f20319OooO0O0.size();
            u21VarOooOo.OooO0Oo();
            v21.OooOoOO((v21) u21VarOooOo.f25822OooOo0o, size);
            u21VarOooOo.OooO0Oo();
            v21.OooOoo((v21) u21VarOooOo.f25822OooOo0o, str);
            h21 h21VarOooOo0o = j21.OooOo0o();
            if (!this.f20317OooO.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f20317OooO.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        f21 f21VarOooOo0o = g21.OooOo0o();
                        Charset charset = i01.f19888OooO00o;
                        hz0 hz0Var = new hz0(str2.getBytes(charset));
                        f21VarOooOo0o.OooO0Oo();
                        g21.OooOo((g21) f21VarOooOo0o.f25822OooOo0o, hz0Var);
                        hz0 hz0Var2 = new hz0(str3.getBytes(charset));
                        f21VarOooOo0o.OooO0Oo();
                        g21.OooOoO0((g21) f21VarOooOo0o.f25822OooOo0o, hz0Var2);
                        g21 g21Var = (g21) f21VarOooOo0o.OooO0O0();
                        h21VarOooOo0o.OooO0Oo();
                        j21.OooOo((j21) h21VarOooOo0o.f25822OooOo0o, g21Var);
                    }
                }
            }
            j21 j21Var = (j21) h21VarOooOo0o.OooO0O0();
            u21VarOooOo.OooO0Oo();
            v21.OooOoo0((v21) u21VarOooOo.f25822OooOo0o, j21Var);
            this.f20319OooO0O0.put(str, u21VarOooOo);
        }
    }

    public final void OooO0O0(String str) {
        synchronized (this.f20325OooO0oo) {
            try {
                if (str == null) {
                    z11 z11Var = this.f20318OooO00o;
                    z11Var.OooO0Oo();
                    a31.OooOooO((a31) z11Var.f25822OooOo0o);
                } else {
                    z11 z11Var2 = this.f20318OooO00o;
                    z11Var2.OooO0Oo();
                    a31.OooOooo((a31) z11Var2.f25822OooOo0o, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
