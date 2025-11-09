package OoooOOO;

import OooO0oO.OooOo;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0OO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f14402OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f14403OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object f14404OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Object f14405OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f14406OooO0o0;

    public o0O0OO0(long j, Bundle bundle, String str, String str2) {
        this.f14404OooO0OO = str;
        this.f14405OooO0Oo = str2;
        this.f14406OooO0o0 = bundle;
        this.f14403OooO0O0 = j;
    }

    public static o0O0OO0 OooO00o(o00OOOOo o00ooooo) {
        String str = o00ooooo.zza;
        String str2 = o00ooooo.zzc;
        return new o0O0OO0(o00ooooo.zzd, o00ooooo.zzb.OooOO0O(), str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100 A[PHI: r9 r16 r17
  0x0100: PHI (r9v2 android.database.Cursor) = (r9v3 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r16v3 com.google.android.gms.internal.measurement.o0O00OO) = 
  (r16v5 com.google.android.gms.internal.measurement.o0O00OO)
  (r16v10 com.google.android.gms.internal.measurement.o0O00OO)
 binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.measurement.o0O00OO OooO0O0(com.google.android.gms.internal.measurement.o0O00OO r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0O0OO0.OooO0O0(com.google.android.gms.internal.measurement.o0O00OO, java.lang.String):com.google.android.gms.internal.measurement.o0O00OO");
    }

    public o00OOOOo OooO0OO() {
        o00OOOO0 o00oooo0 = new o00OOOO0(new Bundle((Bundle) this.f14406OooO0o0));
        return new o00OOOOo((String) this.f14404OooO0OO, o00oooo0, (String) this.f14405OooO0Oo, this.f14403OooO0O0);
    }

    public String toString() {
        switch (this.f14402OooO00o) {
            case 0:
                String string = ((Bundle) this.f14406OooO0o0).toString();
                String str = (String) this.f14405OooO0Oo;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f14404OooO0OO;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                OooO00o.OooOooO(sb, "origin=", str, ",name=", str2);
                return OooOo.OooOOOo(sb, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o0O0OO0(o00O0O0 o00o0o0) {
        Objects.requireNonNull(o00o0o0);
        this.f14406OooO0o0 = o00o0o0;
    }
}
