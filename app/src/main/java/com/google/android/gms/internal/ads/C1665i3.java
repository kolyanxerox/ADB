package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.i3 */
/* loaded from: classes2.dex */
public final class C1665i3 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f19902OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f19903OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f19904OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f19905OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o0O00O f19906OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0oO.Oooo0 f19907OooO0o0;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f19912OooOOO;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Object f19908OooO0oO = new Object();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f19909OooO0oo = new ArrayList();

    /* renamed from: OooO, reason: collision with root package name */
    public final ArrayList f19901OooO = new ArrayList();

    /* renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f19910OooOO0 = new ArrayList();

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f19911OooOO0O = 0;
    public int OooOO0o = 0;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f19913OooOOO0 = 0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public String f19914OooOOOO = "";

    /* renamed from: OooOOOo, reason: collision with root package name */
    public String f19915OooOOOo = "";

    /* renamed from: OooOOo0, reason: collision with root package name */
    public String f19916OooOOo0 = "";

    public C1665i3(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f19902OooO00o = i;
        this.f19903OooO0O0 = i2;
        this.f19904OooO0OO = i3;
        this.f19905OooO0Oo = z;
        this.f19907OooO0o0 = new OooO0oO.Oooo0(i4, 3);
        o0O00O o0o00o = new o0O00O();
        o0o00o.f21879OooOo0O = i5;
        i6 = (i6 > 64 || i6 < 0) ? 64 : i6;
        if (i7 <= 0) {
            o0o00o.f21880OooOo0o = 1;
        } else {
            o0o00o.f21880OooOo0o = i7;
        }
        o0o00o.f21878OooOo = new C1997r3(i6);
        this.f19906OooO0o = o0o00o;
    }

    public static final String OooO0Oo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void OooO00o(String str, boolean z, float f, float f2, float f3, float f4) {
        OooO0OO(str, z, f, f2, f3, f4);
        synchronized (this.f19908OooO0oO) {
            try {
                if (this.f19913OooOOO0 < 0) {
                    zzo.zze("ActivityContent: negative number of WebViews.");
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0() {
        synchronized (this.f19908OooO0oO) {
            try {
                int i = this.f19911OooOO0O;
                int i2 = this.OooOO0o;
                boolean z = this.f19905OooO0Oo;
                int i3 = this.f19903OooO0O0;
                if (!z) {
                    i3 = (i2 * i3) + (i * this.f19902OooO00o);
                }
                if (i3 > this.f19912OooOOO) {
                    this.f19912OooOOO = i3;
                    if (!zzv.zzp().OooO0Oo().zzK()) {
                        this.f19914OooOOOO = this.f19907OooO0o0.OooO(this.f19909OooO0oo);
                        this.f19915OooOOOo = this.f19907OooO0o0.OooO(this.f19901OooO);
                    }
                    if (!zzv.zzp().OooO0Oo().zzL()) {
                        this.f19916OooOOo0 = this.f19906OooO0o.OooO00o(this.f19901OooO, this.f19910OooOO0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.f19904OooO0OO) {
                return;
            }
            synchronized (this.f19908OooO0oO) {
                try {
                    this.f19909OooO0oo.add(str);
                    this.f19911OooOO0O += str.length();
                    if (z) {
                        this.f19901OooO.add(str);
                        this.f19910OooOO0.add(new C1886o3(f, f2, f3, f4, this.f19901OooO.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1665i3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C1665i3) obj).f19914OooOOOO;
        return str != null && str.equals(this.f19914OooOOOO);
    }

    public final int hashCode() {
        return this.f19914OooOOOO.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f19909OooO0oo;
        int i = this.OooOO0o;
        int i2 = this.f19912OooOOO;
        int i3 = this.f19911OooOO0O;
        String strOooO0Oo = OooO0Oo(arrayList);
        String strOooO0Oo2 = OooO0Oo(this.f19901OooO);
        String str = this.f19914OooOOOO;
        String str2 = this.f19915OooOOOo;
        String str3 = this.f19916OooOOo0;
        StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("ActivityContent fetchId: ", i, " score:", i2, " total_length:");
        sbOooOo0o.append(i3);
        sbOooOo0o.append("\n text: ");
        sbOooOo0o.append(strOooO0Oo);
        sbOooOo0o.append("\n viewableText");
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sbOooOo0o, strOooO0Oo2, "\n signture: ", str, "\n viewableSignture: ");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(sbOooOo0o, str2, "\n viewableSignatureForVertical: ", str3);
    }
}
