package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class or0 implements vp0, bf0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final or0 f23086OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final or0 f23087OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final or0 f23088OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final or0 f23089OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final or0 f23090OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final or0 f23091OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final or0 f23092OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final or0 f23093OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final or0 f23094Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final or0 f23095Oooo00O;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23096OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public String f23097OooOo0o;

    static {
        int i = 0;
        f23086OooOo = new or0("SHA1", i);
        f23088OooOoO0 = new or0("SHA224", i);
        f23087OooOoO = new or0("SHA256", i);
        f23089OooOoOO = new or0("SHA384", i);
        f23091OooOoo0 = new or0("SHA512", i);
        int i2 = 1;
        f23090OooOoo = new or0("TINK", i2);
        f23092OooOooO = new or0("CRUNCHY", i2);
        f23093OooOooo = new or0("NO_PREFIX", i2);
        int i3 = 2;
        f23094Oooo000 = new or0("TINK", i3);
        f23095Oooo00O = new or0("NO_PREFIX", i3);
    }

    public static String OooO0o0(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + C3034d9.i.f8179e;
            }
        }
        return OooO0oO.OooOo.OooOoo(str, " : ", str2);
    }

    public void OooO00o(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", OooO0o0(this.f23097OooOo0o, str, objArr));
        }
    }

    public void OooO0O0(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", OooO0o0(this.f23097OooOo0o, str, objArr), remoteException);
        }
    }

    public void OooO0OO(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", OooO0o0(this.f23097OooOo0o, str, objArr));
        }
    }

    public void OooO0Oo(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", OooO0o0(this.f23097OooOo0o, str, objArr));
        }
    }

    public String toString() {
        switch (this.f23096OooOo0O) {
            case 0:
                return this.f23097OooOo0o;
            case 1:
                return this.f23097OooOo0o;
            case 2:
                return this.f23097OooOo0o;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f23097OooOo0o, Integer.toString(0)});
        return null;
    }

    public /* synthetic */ or0(String str, int i) {
        this.f23096OooOo0O = i;
        this.f23097OooOo0o = str;
    }

    public or0(String str) {
        this.f23096OooOo0O = 6;
        this.f23097OooOo0o = OooO0oO.OooOo.OooO("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzv.zzp().OooO0oO(this.f23097OooOo0o, th);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
    }
}
