package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public abstract class oOOO00o0 implements Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f22826OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final oOOo0000 f22827OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f22828OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Object f22829OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f22830OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final oOOO0OO0 f22831OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public oOOO0O0o f22832OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public Integer f22833OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f22834OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public oOO0O0O f22835OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public C2051sk f22836Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final oOO0OOO f22837Oooo00O;

    public oOOO00o0(int i, String str, oOOO0OO0 oooo0oo0) {
        Uri uri;
        String host;
        this.f22827OooOo0O = oOOo0000.f22852OooO0OO ? new oOOo0000() : null;
        this.f22829OooOoO = new Object();
        int iHashCode = 0;
        this.f22834OooOooO = false;
        this.f22835OooOooo = null;
        this.f22828OooOo0o = i;
        this.f22826OooOo = str;
        this.f22831OooOoOO = oooo0oo0;
        oOO0OOO ooo0ooo = new oOO0OOO();
        ooo0ooo.f22815OooO00o = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL;
        this.f22837Oooo00O = ooo0ooo;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f22830OooOoO0 = iHashCode;
    }

    public abstract OoooOOO.o0O0oo00 OooO00o(oOOO00 oooo00);

    public abstract void OooO0O0(Object obj);

    public final void OooO0OO(String str) {
        oOOO0O0o oooo0o0o = this.f22832OooOoo;
        if (oooo0o0o != null) {
            synchronized (oooo0o0o.f22840OooO0O0) {
                oooo0o0o.f22840OooO0O0.remove(this);
            }
            synchronized (oooo0o0o.f22838OooO) {
                Iterator it = oooo0o0o.f22838OooO.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            oooo0o0o.OooO0O0();
        }
        if (oOOo0000.f22852OooO0OO) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new OoooOOO.oOOoOOO0(this, str, id));
            } else {
                this.f22827OooOo0O.OooO00o(id, str);
                this.f22827OooOo0O.OooO0O0(toString());
            }
        }
    }

    public final void OooO0Oo() {
        C2051sk c2051sk;
        synchronized (this.f22829OooOoO) {
            c2051sk = this.f22836Oooo000;
        }
        if (c2051sk != null) {
            c2051sk.OooO(this);
        }
    }

    public final void OooO0o() {
        oOOO0O0o oooo0o0o = this.f22832OooOoo;
        if (oooo0o0o != null) {
            oooo0o0o.OooO0O0();
        }
    }

    public final void OooO0o0(OoooOOO.o0O0oo00 o0o0oo00) {
        C2051sk c2051sk;
        List list;
        synchronized (this.f22829OooOoO) {
            c2051sk = this.f22836Oooo000;
        }
        if (c2051sk != null) {
            oOO0O0O ooo0o0o = (oOO0O0O) o0o0oo00.f14468OooOo;
            if (ooo0o0o != null) {
                if (ooo0o0o.f22805OooO0o0 >= System.currentTimeMillis()) {
                    String strZzj = zzj();
                    synchronized (c2051sk) {
                        list = (List) ((HashMap) c2051sk.f24098OooOo0o).remove(strZzj);
                    }
                    if (list != null) {
                        if (oOOo0O00.f22855OooO00o) {
                            oOOo0O00.OooO0OO("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C1847n1) c2051sk.f24099OooOoO).OooO0OO((oOOO00o0) it.next(), o0o0oo00, null);
                        }
                        return;
                    }
                    return;
                }
            }
            c2051sk.OooO(this);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22833OooOoo0.intValue() - ((oOOO00o0) obj).f22833OooOoo0.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f22830OooOoO0));
        zzw();
        return "[ ] " + this.f22826OooOo + StringUtils.SPACE + "0x".concat(strValueOf) + " NORMAL " + this.f22833OooOoo0;
    }

    public final int zza() {
        return this.f22828OooOo0o;
    }

    public final int zzb() {
        return this.f22837Oooo00O.f22815OooO00o;
    }

    public final int zzc() {
        return this.f22830OooOoO0;
    }

    @Nullable
    public final oOO0O0O zzd() {
        return this.f22835OooOooo;
    }

    public final oOOO00o0 zze(oOO0O0O ooo0o0o) {
        this.f22835OooOooo = ooo0o0o;
        return this;
    }

    public final oOOO00o0 zzf(oOOO0O0o oooo0o0o) {
        this.f22832OooOoo = oooo0o0o;
        return this;
    }

    public final oOOO00o0 zzg(int i) {
        this.f22833OooOoo0 = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        int i = this.f22828OooOo0o;
        String str = this.f22826OooOo;
        return i != 0 ? OooO0oO.OooOo.OooOoo(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.f22826OooOo;
    }

    public Map zzl() throws oOO0O0O0 {
        return Collections.EMPTY_MAP;
    }

    public final void zzm(String str) {
        if (oOOo0000.f22852OooO0OO) {
            this.f22827OooOo0O.OooO00o(Thread.currentThread().getId(), str);
        }
    }

    public final void zzn(oOOOoo00 oooooo00) {
        oOOO0OO0 oooo0oo0;
        synchronized (this.f22829OooOoO) {
            oooo0oo0 = this.f22831OooOoOO;
        }
        oooo0oo0.zza(oooooo00);
    }

    public final void zzq() {
        synchronized (this.f22829OooOoO) {
            this.f22834OooOooO = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.f22829OooOoO) {
            z = this.f22834OooOooO;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.f22829OooOoO) {
        }
        return false;
    }

    public byte[] zzx() throws oOO0O0O0 {
        return null;
    }

    public final oOO0OOO zzy() {
        return this.f22837Oooo00O;
    }
}
