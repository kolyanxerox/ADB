package OoooOOO;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0O00o00 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicReference f14383OooO0O0 = new AtomicReference();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference f14384OooO0OO = new AtomicReference();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final AtomicReference f14385OooO0Oo = new AtomicReference();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OO000o f14386OooO00o;

    public o0O00o00(o0OO000o o0oo000o) {
        this.f14386OooO00o = o0oo000o;
    }

    public static final String OooO0oO(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        o000000O.OooO0oo(atomicReference);
        o000000O.OooO0O0(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        return !this.f14386OooO00o.OooO0O0() ? str : OooO0oO(str, oO0000O.f14616OooO0OO, oO0000O.f14614OooO00o, f14383OooO0O0);
    }

    public final String OooO0O0(String str) {
        if (str == null) {
            return null;
        }
        return !this.f14386OooO00o.OooO0O0() ? str : OooO0oO(str, oO0000O.f14618OooO0o, oO0000O.f14619OooO0o0, f14384OooO0OO);
    }

    public final String OooO0OO(String str) {
        if (str == null) {
            return null;
        }
        return !this.f14386OooO00o.OooO0O0() ? str : str.startsWith("_exp_") ? OooOo.OooOO0O("experiment_id(", str, ")") : OooO0oO(str, oO0000O.f14622OooOO0, oO0000O.f14613OooO, f14385OooO0Oo);
    }

    public final String OooO0Oo(o00OOOOo o00ooooo) {
        o0OO000o o0oo000o = this.f14386OooO00o;
        if (!o0oo000o.OooO0O0()) {
            return o00ooooo.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(o00ooooo.zzc);
        sb.append(",name=");
        sb.append(OooO00o(o00ooooo.zza));
        sb.append(",params=");
        o00OOOO0 o00oooo0 = o00ooooo.zzb;
        sb.append(o00oooo0 == null ? null : !o0oo000o.OooO0O0() ? o00oooo0.toString() : OooO0o0(o00oooo0.OooOO0O()));
        return sb.toString();
    }

    public final String OooO0o(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbOooOo0O = OooOo.OooOo0O(C3034d9.i.f8177d);
        for (Object obj : objArr) {
            String strOooO0o0 = obj instanceof Bundle ? OooO0o0((Bundle) obj) : String.valueOf(obj);
            if (strOooO0o0 != null) {
                if (sbOooOo0O.length() != 1) {
                    sbOooOo0O.append(", ");
                }
                sbOooOo0O.append(strOooO0o0);
            }
        }
        sbOooOo0O.append(C3034d9.i.f8179e);
        return sbOooOo0O.toString();
    }

    public final String OooO0o0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f14386OooO00o.OooO0O0()) {
            return bundle.toString();
        }
        StringBuilder sbOooOo0O = OooOo.OooOo0O("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbOooOo0O.length() != 8) {
                sbOooOo0O.append(", ");
            }
            sbOooOo0O.append(OooO0O0(str));
            sbOooOo0O.append(C3034d9.i.f8173b);
            Object obj = bundle.get(str);
            sbOooOo0O.append(obj instanceof Bundle ? OooO0o(new Object[]{obj}) : obj instanceof Object[] ? OooO0o((Object[]) obj) : obj instanceof ArrayList ? OooO0o(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbOooOo0O.append("}]");
        return sbOooOo0O.toString();
    }
}
